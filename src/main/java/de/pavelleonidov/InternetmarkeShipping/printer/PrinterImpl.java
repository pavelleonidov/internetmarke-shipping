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

package de.pavelleonidov.InternetmarkeShipping.printer;

import java.util.Set;

import javafx.geometry.Rectangle2D;

import de.pavelleonidov.InternetmarkeShipping.printer.JobSettings;
import de.pavelleonidov.InternetmarkeShipping.printer.Printer;
import de.pavelleonidov.InternetmarkeShipping.printer.Collation;
import de.pavelleonidov.InternetmarkeShipping.printer.PageRange;
import de.pavelleonidov.InternetmarkeShipping.printer.Paper;
import de.pavelleonidov.InternetmarkeShipping.printer.PaperSource;
import de.pavelleonidov.InternetmarkeShipping.printer.PrintColor;
import de.pavelleonidov.InternetmarkeShipping.printer.PageOrientation;
import de.pavelleonidov.InternetmarkeShipping.printer.PrintQuality;
import de.pavelleonidov.InternetmarkeShipping.printer.PrintResolution;
import de.pavelleonidov.InternetmarkeShipping.printer.PrintSides;

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
