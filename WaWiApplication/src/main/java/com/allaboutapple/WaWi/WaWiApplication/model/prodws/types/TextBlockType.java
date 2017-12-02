package com.allaboutapple.WaWi.WaWiApplication.model.prodws.types;

import java.math.BigDecimal;

public class TextBlockType {
    protected String font;
    protected BigDecimal size;
    protected String style;
    protected Boolean underline;
    protected String text;

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public BigDecimal getSize() {
        return size;
    }

    public void setSize(BigDecimal size) {
        this.size = size;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Boolean getUnderline() {
        return underline;
    }

    public void setUnderline(Boolean underline) {
        this.underline = underline;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }




}
