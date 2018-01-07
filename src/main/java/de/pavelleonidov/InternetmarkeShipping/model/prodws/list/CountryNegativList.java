package de.pavelleonidov.InternetmarkeShipping.model.prodws.list;

import de.pavelleonidov.InternetmarkeShipping.model.prodws.types.CountryType;
import de.pavelleonidov.InternetmarkeShipping.model.prodws.types.CountryType;

import java.util.ArrayList;
import java.util.List;

public class CountryNegativList {


    protected List<CountryType> country;

    public List<CountryType> getCountry() {
        if (country == null) {
            country = new ArrayList<CountryType>();
        }
        return this.country;
    }
}
