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

import java.util.Set;

import javafx.geometry.Rectangle2D;

import com.allaboutapple.WaWi.WaWiApplication.printer.JobSettings;
import com.allaboutapple.WaWi.WaWiApplication.printer.Printer;
import com.allaboutapple.WaWi.WaWiApplication.printer.Collation;
import com.allaboutapple.WaWi.WaWiApplication.printer.PageRange;
import com.allaboutapple.WaWi.WaWiApplication.printer.Paper;
import com.allaboutapple.WaWi.WaWiApplication.printer.PaperSource;
import com.allaboutapple.WaWi.WaWiApplication.printer.PrintColor;
import com.allaboutapple.WaWi.WaWiApplication.printer.PageOrientation;
import com.allaboutapple.WaWi.WaWiApplication.printer.PrintQuality;
import com.allaboutapple.WaWi.WaWiApplication.printer.PrintResolution;
import com.allaboutapple.WaWi.WaWiApplication.printer.PrintSides;

/*
 * This is called 'PrinterImpl' not because it is a class implementing
 * features of a super class, but because its defines the interfaces
 * required of the delegate implementation class for a Printer.
 * The actual implementation class needs to be discovered at runtime.
 */
public interface PrinterImpl {

    public void setPrinter(Printer printer);

    public String getName();

    public JobSettings getDefaultJobSettings();

    public Rectangle2D printableArea(Paper paper);

    public int defaultCopies();
    public int maxCopies();

    public Collation defaultCollation();
    public Set<Collation> supportedCollations();

    public PrintSides defaultSides();
    public Set<PrintSides> supportedSides();

    public PageRange defaultPageRange();
    public boolean supportsPageRanges();

    public PrintResolution defaultPrintResolution();
    public Set<PrintResolution> supportedPrintResolution();

    public PrintColor defaultPrintColor();
    public Set<PrintColor> supportedPrintColor();

    public PrintQuality defaultPrintQuality();
    public Set<PrintQuality> supportedPrintQuality();

    public PageOrientation defaultOrientation();
    public Set<PageOrientation> supportedOrientation();

    public Paper defaultPaper();
    public Set<Paper> supportedPapers();

    public PaperSource defaultPaperSource();
    public Set<PaperSource> supportedPaperSources();

}
