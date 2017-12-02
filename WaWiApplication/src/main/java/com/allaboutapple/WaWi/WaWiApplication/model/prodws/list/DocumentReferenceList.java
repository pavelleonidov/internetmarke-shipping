package com.allaboutapple.WaWi.WaWiApplication.model.prodws.list;


import com.allaboutapple.WaWi.WaWiApplication.model.prodws.types.DocumentReferenceType;

import java.util.ArrayList;
import java.util.List;

public class DocumentReferenceList {

    protected List<DocumentReferenceType> documentReference;


    public List<DocumentReferenceType> getDocumentReference() {
        if (documentReference == null) {
            documentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.documentReference;
    }
}
