package de.pavelleonidov.InternetmarkeShipping.model.prodws.types;

import java.util.ArrayList;
import java.util.List;

public class TextRowType {

    protected List<TextBlockType> textBlock;


    public List<TextBlockType> getTextBlock() {
        if (textBlock == null) {
            textBlock = new ArrayList<TextBlockType>();
        }
        return this.textBlock;
    }
}
