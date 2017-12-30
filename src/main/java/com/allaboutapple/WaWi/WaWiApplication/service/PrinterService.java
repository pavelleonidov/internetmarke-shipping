package com.allaboutapple.WaWi.WaWiApplication.service;

import com.allaboutapple.WaWi.WaWiApplication.controller.SettingsController;
import com.allaboutapple.WaWi.WaWiApplication.model.Settings;
import com.allaboutapple.WaWi.WaWiApplication.printer.PrintHelper;
import javafx.collections.ObservableSet;
import javafx.embed.swing.SwingFXUtils;
import javafx.geometry.Rectangle2D;
import com.allaboutapple.WaWi.WaWiApplication.printer.*;
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
        // Define the Job Status Message

        // Create a printer job for the default printer
        //getCurrentPrinter().createPageLayout(Paper.JAPANESE_POSTCARD, PageOrientation.LANDSCAPE, Printer.MarginType.HARDWARE_MINIMUM);

        Printer printer = getCurrentPrinter();


       // printer.createPageLayout(getCurrentPrinter().getPrinterAttributes().getDefaultPaper(),
       //         getCurrentPrinter().getPrinterAttributes().getDefaultPageOrientation(),
       //         Printer.MarginType.EQUAL);


        PrinterAttributes attributes = printer.getPrinterAttributes();


      //  System.out.printf("\nLabel Size: %g, %g(%s)\n", attributes.getDefaultPaper().getWidth(), attributes.getDefaultPaper().getHeight(), attributes.getDefaultPaper().toString());

         // Paper label = attributes.getDefaultPaper();
     //   Paper label = Paper.MONARCH_ENVELOPE;
        //Paper label = PrintHelper.createPaper("LabelPrinter", 29, 90, Units.MM);


        Paper label = attributes.getDefaultPaper();


     //   System.out.println(label);
        PageOrientation orientation = PageOrientation.LANDSCAPE;

        PageLayout layout = printer.createPageLayout(label, orientation, Printer.MarginType.HARDWARE_MINIMUM);
//        jobSettings.setPageLayout(layout);


        System.out.printf("\nPageLayout: %s\n", layout.toString());
//
       // PrinterJob printerJob = PrinterJob.createPrinterJob();

      //  boolean success = printerJob.printPage(layout, node);


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

    public void printDocument(PDDocument document) {
        PrinterJob job = PrinterJob.createPrinterJob(getCurrentPrinter());

        PDFRenderer pdfRenderer = new PDFRenderer(document);

        Image convertedImage;
        ImageView imageView = new ImageView();

        Printer printer = getCurrentPrinter();


        // printer.createPageLayout(getCurrentPrinter().getPrinterAttributes().getDefaultPaper(),
        //         getCurrentPrinter().getPrinterAttributes().getDefaultPageOrientation(),
        //         Printer.MarginType.EQUAL);


        PrinterAttributes attributes = printer.getPrinterAttributes();


        //  System.out.printf("\nLabel Size: %g, %g(%s)\n", attributes.getDefaultPaper().getWidth(), attributes.getDefaultPaper().getHeight(), attributes.getDefaultPaper().toString());

         Paper label = attributes.getDefaultPaper();
        //   Paper label = Paper.MONARCH_ENVELOPE;
       // Paper label = PrintHelper.createPaper("LabelPrinter", 29, 90, Units.MM);


      //  Paper label = attributes.getDefaultPaper();


        //   System.out.println(label);
        //PageOrientation orientation = attributes.getDefaultPageOrientation();
        PageOrientation orientation = PageOrientation.LANDSCAPE;

        PageLayout layout = printer.createPageLayout(label, orientation, Printer.MarginType.HARDWARE_MINIMUM);


        try {

            BufferedImage image = pdfRenderer.renderImageWithDPI(0, 300, ImageType.RGB);
           // BufferedImage imagePart = image.getSubimage(50,50, (int) label.getWidth(), (int) label.getHeight() );
            System.out.println(image.getWidth());
            BufferedImage imagePart = image.getSubimage(150,350, 1000, 380);

            convertedImage = SwingFXUtils.toFXImage(imagePart, null);

            imageView.setImage(convertedImage);

          //  imageView.setFitWidth(layout.getPrintableWidth());
         //   imageView.setFitHeight(layout.getPrintableHeight());
             double scaleX = layout.getPrintableWidth() / convertedImage.getWidth();
             double scaleY = layout.getPrintableHeight() / convertedImage.getHeight();

             double minimumScale = Math.min(scaleX, scaleY);
             System.out.println(minimumScale);
             imageView.getTransforms().add(new Scale(minimumScale, minimumScale));
            // imageView.setFitWidth(layout.getPrintableWidth());
            // imageView.setFitHeight(layout.getPrintableHeight());


            if (job != null)
            {
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
