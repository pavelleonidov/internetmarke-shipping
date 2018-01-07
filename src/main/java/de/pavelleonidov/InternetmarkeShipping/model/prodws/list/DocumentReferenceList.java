package de.pavelleonidov.InternetmarkeShipping.model.prodws.list;


import de.pavelleonidov.InternetmarkeShipping.model.prodws.types.DocumentReferenceType;
import de.pavelleonidov.InternetmarkeShipping.model.prodws.types.DocumentReferenceType;

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
