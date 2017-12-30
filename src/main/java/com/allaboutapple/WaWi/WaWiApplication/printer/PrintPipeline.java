/*
 * Copyright (c) 2013, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package com.allaboutapple.WaWi.WaWiApplication.printer;

import java.lang.reflect.Method;
import javafx.collections.ObservableSet;
import com.allaboutapple.WaWi.WaWiApplication.printer.Printer;
import com.allaboutapple.WaWi.WaWiApplication.printer.PrinterJob;

import com.allaboutapple.WaWi.WaWiApplication.printer.Printer;
import com.allaboutapple.WaWi.WaWiApplication.printer.PrinterJobImpl;

public abstract class PrintPipeline {

    private static PrintPipeline ppl = null;

    public static PrintPipeline getPrintPipeline() {
        if (ppl != null) {
            return ppl;
        }
        try {
            String className = "com.allaboutapple.WaWi.WaWiApplication.printer.PrismPrintPipeline";
            Class klass = Class.forName(className);
            Method m = klass.getMethod("getInstance", (Class[])null);
            ppl = (PrintPipeline)m.invoke(null, (Object[])null);
            return ppl;
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public abstract Printer getDefaultPrinter();
    public abstract ObservableSet<Printer> getAllPrinters();
    public abstract PrinterJobImpl createPrinterJob(PrinterJob job);
}
