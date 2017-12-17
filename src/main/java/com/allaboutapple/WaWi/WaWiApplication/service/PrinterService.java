package com.allaboutapple.WaWi.WaWiApplication.service;

import com.allaboutapple.WaWi.WaWiApplication.controller.SettingsController;
import com.allaboutapple.WaWi.WaWiApplication.model.Settings;
import javafx.collections.ObservableSet;
import javafx.print.Printer;
import javafx.print.PrinterJob;
import javafx.scene.Node;

import java.util.ArrayList;
import java.util.List;

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
        PrinterJob job = PrinterJob.createPrinterJob(getCurrentPrinter());

        if (job != null)
        {

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

    protected Settings getSettings() {
        return SettingsController.getSettings();
    }

}
