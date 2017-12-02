package com.allaboutapple.WaWi.WaWiApplication.model.prodws.list;

import com.allaboutapple.WaWi.WaWiApplication.model.prodws.types.NumericValueType;

public class DimensionList {
    protected NumericValueType length;
    protected NumericValueType width;
    protected NumericValueType height;
    protected NumericValueType diameter;
    protected NumericValueType girth;
    protected NumericValueType addedEdgeLength;

    public NumericValueType getLength() {
        return length;
    }

    public void setLength(NumericValueType length) {
        this.length = length;
    }

    public NumericValueType getWidth() {
        return width;
    }

    public void setWidth(NumericValueType width) {
        this.width = width;
    }

    public NumericValueType getHeight() {
        return height;
    }

    public void setHeight(NumericValueType height) {
        this.height = height;
    }

    public NumericValueType getDiameter() {
        return diameter;
    }

    public void setDiameter(NumericValueType diameter) {
        this.diameter = diameter;
    }

    public NumericValueType getGirth() {
        return girth;
    }

    public void setGirth(NumericValueType girth) {
        this.girth = girth;
    }

    public NumericValueType getAddedEdgeLength() {
        return addedEdgeLength;
    }

    public void setAddedEdgeLength(NumericValueType addedEdgeLength) {
        this.addedEdgeLength = addedEdgeLength;
    }
}
