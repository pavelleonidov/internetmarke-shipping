package de.pavelleonidov.InternetmarkeShipping.model.prodws.types;

import java.util.ArrayList;
import java.util.List;

public class NationalDestinationAreaType {
    protected List<NationalZipCodeListType> nationalZipCodeList;
    protected List<NationalZipCodeGroupType> nationalZipCodeGroup;

    public List<NationalZipCodeListType> getNationalZipCodeList() {
        if (nationalZipCodeList == null) {
            nationalZipCodeList = new ArrayList<NationalZipCodeListType>();
        }
        return this.nationalZipCodeList;
    }
    public List<NationalZipCodeGroupType> getNationalZipCodeGroup() {
        if (nationalZipCodeGroup == null) {
            nationalZipCodeGroup = new ArrayList<NationalZipCodeGroupType>();
        }
        return this.nationalZipCodeGroup;
    }

}
