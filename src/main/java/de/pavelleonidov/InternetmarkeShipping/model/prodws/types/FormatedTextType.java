package de.pavelleonidov.InternetmarkeShipping.model.prodws.types;

import java.util.List;

public class FormatedTextType {
    protected String name;
    protected List<TextRowType> textRow;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TextRowType> getTextRow() {
        return textRow;
    }

    public void setTextRow(List<TextRowType> textRow) {
        this.textRow = textRow;
    }
}
