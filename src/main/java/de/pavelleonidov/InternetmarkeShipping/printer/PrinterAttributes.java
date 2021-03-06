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


import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import static de.pavelleonidov.InternetmarkeShipping.printer.PageOrientation.*;

import de.pavelleonidov.InternetmarkeShipping.printer.*;

/**
 * This class encapsulates the attributes of a printer which
 * relate to its job printing capabilities and other attributes.
 * <p>
 * there are methods to retrieve the default or current value,
 * as well as the set or range of supported values, as appropriate.
 * <p>
 * Instances of this class are delegates of the <code>Printer</code>
 * and must be obtained from the printer. They cannot be mutated by
 * the application as changing settings of a printer is outside the
 * scope of this API.
 *
 * @since JavaFX 8.0
 */

public final class PrinterAttributes {

    private PrinterImpl impl;

    PrinterAttributes(PrinterImpl impl) {
        this.impl = impl;
    }

    /**
     * The default number of copies to print.
     * @return default number of copies
     */
    public int getDefaultCopies() {
        return impl.defaultCopies();
    }

    /**
     * The maximum supported number of copies.
     */
    public int getMaxCopies() {
        return impl.maxCopies();
    }

    /**
     * Reports if page ranges are supported.
     * @return true if page ranges supported.
     */
    public boolean supportsPageRanges() {
        return impl.supportsPageRanges();
    }

    /**
     * The default collation setting.
     * @return default value of <code>Collation</code>
     */
    public Collation getDefaultCollation() {
        return impl.defaultCollation();
    }

    /**
     * Returns an unmodifiable set of the supported collation settings
     * for this printer.
     * @return the supported values of <code>Collation</code>
     */
    public Set<Collation> getSupportedCollations() {
        return impl.supportedCollations();
    }

    /**
     * Returns the default value for duplex settings.
     * @return default value of <code>PrintSides</code>
     */
    public PrintSides getDefaultPrintSides() {
        return impl.defaultSides();
    }

    /**
     * Returns an unmodifiable set of the supported duplex settings
     * for this printer.
     * @return the supported values of <code>PrintSides</code>
     */
    public Set<PrintSides> getSupportedPrintSides() {
        return impl.supportedSides();
    }

    /**
     * Get the default color setting : greyscale or color
     * @return default print color setting.
     */
    public PrintColor getDefaultPrintColor() {
        return impl.defaultPrintColor();
    }

    /**
     * Returns an unmodifiable set of the supported color settings
     * for this printer.
     * @return the supported values of <code>PrintColor</code>
     */
    public Set<PrintColor> getSupportedPrintColors() {
        return impl.supportedPrintColor();
    }


    /**
     * Return the default quality setting
     * @return default print quality setting.
     */
    public PrintQuality getDefaultPrintQuality() {
        return impl.defaultPrintQuality();
    }

    /**
     * Returns an unmodifiable set of the supported quality settings
     * for this printer.
     * @return the supported values of <code>PrintQuality</code>
     */
    public Set<PrintQuality> getSupportedPrintQuality() {
        return impl.supportedPrintQuality();
    }

    /**
     * Return the default print resolution for paper on this printer.
     * @return default paper resolution
     */
    public PrintResolution getDefaultPrintResolution() {
        return impl.defaultPrintResolution();
    }

    /**
     * Returns an unmodifiable set of the supported print resolutions
     * for this printer.
     * @return the supported values of <code>PrintResolution</code>
     */
    public Set<PrintResolution> getSupportedPrintResolutions() {
        return impl.supportedPrintResolution();
    }

   /**
     * Return the default orientation for paper on this printer.
     * @return default paper orientation
     */
    public PageOrientation getDefaultPageOrientation() {
        return impl.defaultOrientation();
    }

    /**
     * Returns an unmodifiable set of the supported orientations
     * for this printer.
     * @return the supported values of <code>PageOrientation</code>
     */
    public Set<PageOrientation> getSupportedPageOrientations() {
        return impl.supportedOrientation();
    }

    /**
     * Return the default paper size used on this printer.
     * @return default Paper
     */
    public Paper getDefaultPaper() {
        return impl.defaultPaper();
    }

    /**
     * Returns an unmodifiable set of the supported paper sizes
     * for this printer.
     * @return the supported values of <code>Paper</code>
     */
    public Set<Paper> getSupportedPapers() {
        return impl.supportedPapers();
    }

    /**
     * Return the default paper input source/tray/
     * @return the default paper input source.
     */
    public PaperSource getDefaultPaperSource() {
        return impl.defaultPaperSource();
    }

    /**
     * Returns an unmodifiable set of the supported paper sources
     * (ie input bins or trays) for this printer.
     * @return the supported paper input sources
     */
    public Set<PaperSource> getSupportedPaperSources() {
        return impl.supportedPaperSources();
    }
}
