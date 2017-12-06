package com.allaboutapple.WaWi.WaWiApplication.model.prodws.list;

import com.allaboutapple.WaWi.WaWiApplication.model.prodws.types.CountryType;

import java.util.ArrayList;
import java.util.List;

public class CountryList {


    protected List<CountryType> country;


    public List<CountryType> getCountry() {
        if (country == null) {
            country = new ArrayList<CountryType>();
        }
        return this.country;
    }

}


