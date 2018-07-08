package de.pavelleonidov.InternetmarkeShipping.service;

import de.pavelleonidov.InternetmarkeShipping.controller.SettingsController;
import de.pavelleonidov.InternetmarkeShipping.model.Settings;
import de.pavelleonidov.InternetmarkeShipping.printer.PrintHelper;
import de.pavelleonidov.InternetmarkeShipping.controller.SettingsController;
import de.pavelleonidov.InternetmarkeShipping.printer.*;
import javafx.collections.ObservableSet;
import javafx.embed.swing.SwingFXUtils;
import javafx.geometry.Rectangle2D;
import de.pavelleonidov.InternetmarkeShipping.printer.*;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Scale;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.printing.PDFPageable;
import org.apache.pdfbox.printing.PDFPrintable;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PrinterService {

    private static final PrinterService OBJ = new PrinterService();
    protected Printer currentPrinter;
    protected List<Printer> availablePrinters;

    public static PrinterService getInstance() {
        return OBJ;
    }

    public PrinterService() {
        availablePrinters = getAllPrinters();
    }

    public List<Printer> getAllPrinters() {
        if(availablePrinters == null) {
            ObservableSet<Printer> printers = Printer.getAllPrinters();
            availablePrinters = new ArrayList<>();
            availablePrinters.addAll(printers);
        }

        return availablePrinters;
    }

    public void setCurrentPrinter(int index) {
        availablePrinters = getAllPrinters();

        currentPrinter = availablePrinters.get(index);
    }

    public Printer getCurrentPrinter() {
        setCurrentPrinter(getSettings().getCurrentPrinter());
        return currentPrinter;
    }

    public void print(Node node) {

        Printer printer = getCurrentPrinter();

        PrinterAttributes attributes = printer.getPrinterAttributes();
        Paper label = attributes.getDefaultPaper();
        PageLayout layout = getCurrentPrinter().getDefaultPageLayout();

        if(getSettings().isLabelPrinter()) {
            PageOrientation orientation = PageOrientation.LANDSCAPE;
            layout = printer.createPageLayout(label, orientation, Printer.MarginType.HARDWARE_MINIMUM);
        }

        PrinterJob job = PrinterJob.createPrinterJob(printer);

       // double scaleX = layout.getPrintableWidth() / node.getBoundsInParent().getWidth();
       // double scaleY = layout.getPrintableHeight() / node.getBoundsInParent().getHeight();
        //System.out.println(layout.getPrintableWidth());
       // node.getTransforms().add(new Scale(scaleX, scaleY));



      //  System.out.println(job.getJobSettings().getPageLayout().getBottomMargin());
        if (job != null)
        {

            job.getJobSettings().setPageLayout(layout);

            // Print the node
            boolean printed = job.printPage(node);

            if (printed)
            {
                // End the printer job
                job.endJob();
            }
            else
            {
                // Write Error Message
                System.out.println("Printing failed");
            }
        }
        else
        {
            // Write Error Message
            System.out.println("Could not create a printer job.");
        }
    }

    public void printDocument(PDDocument document, boolean isInternational, boolean hasCompanyName, String jobName) {


        PrinterJob job = PrinterJob.createPrinterJob(getCurrentPrinter());

        if(jobName == null || jobName.isEmpty()) {
            jobName = "InternetmarkeShipping print job";
        }



        PDFRenderer pdfRenderer = new PDFRenderer(document);

        Image convertedImage;
        ImageView imageView = new ImageView();

        Printer printer = getCurrentPrinter();


        // printer.createPageLayout(getCurrentPrinter().getPrinterAttributes().getDefaultPaper(),
        //         getCurrentPrinter().getPrinterAttributes().getDefaultPageOrientation(),
        //         Printer.MarginType.EQUAL);


        PrinterAttributes attributes = printer.getPrinterAttributes();

        Paper label = attributes.getDefaultPaper();

        PageLayout layout = getCurrentPrinter().getDefaultPageLayout();

        if(getSettings().isLabelPrinter()) {
            PageOrientation orientation = PageOrientation.LANDSCAPE;
            layout = printer.createPageLayout(label, orientation, Printer.MarginType.HARDWARE_MINIMUM);
        }

        try {

            BufferedImage image = pdfRenderer.renderImageWithDPI(0, 300, ImageType.RGB);
           // BufferedImage imagePart = image.getSubimage(50,50, (int) label.getWidth(), (int) label.getHeight() );

            if(getSettings().isLabelPrinter()) {

                int height = 440 + 30 * ((isInternational ? 1 : 0) + (hasCompanyName ? 1 : 0));

                BufferedImage imagePart = image.getSubimage(150,350, 1050, height);
                convertedImage = SwingFXUtils.toFXImage(imagePart, null);

                imageView.setImage(convertedImage);

                double scaleX = layout.getPrintableWidth() / convertedImage.getWidth();
                double scaleY = layout.getPrintableHeight() / convertedImage.getHeight();

                double minimumScale = Math.min(scaleX, scaleY);

                imageView.getTransforms().add(new Scale(minimumScale, minimumScale));
            } else {
                imageView.setImage(SwingFXUtils.toFXImage(image, null));
                imageView.setFitWidth(layout.getPrintableWidth());
                imageView.setFitHeight(layout.getPrintableHeight());
            }




            if (job != null)
            {
                job.getJobSettings().setJobName(jobName);
                job.getJobSettings().setPageLayout(layout);

                // Print the node
                boolean printed = job.printPage(imageView);

                if (printed)
                {
                    // End the printer job
                    job.endJob();
                    document.close();
                }
                else
                {
                    // Write Error Message
                    System.out.println("Printing failed");
                }
            }
            else
            {
                // Write Error Message
                System.out.println("Could not create a printer job.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected Settings getSettings() {
        return SettingsController.getSettings();
    }

}
