package com.allaboutapple.WaWi.WaWiApplication.model.prodws.list;

import com.allaboutapple.WaWi.WaWiApplication.model.prodws.types.FormatedTextType;

import java.util.ArrayList;
import java.util.List;

public class FormatedTextList {
    protected List<FormatedTextType> formatedText;

    public List<FormatedTextType> getFormatedText() {
        if (formatedText == null) {
            formatedText = new ArrayList<FormatedTextType>();
        }
        return this.formatedText;
    }
}
