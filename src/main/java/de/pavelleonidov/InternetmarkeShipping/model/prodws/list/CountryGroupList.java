package de.pavelleonidov.InternetmarkeShipping.model.prodws.list;

import de.pavelleonidov.InternetmarkeShipping.model.prodws.types.CountryGroupType;
import de.pavelleonidov.InternetmarkeShipping.model.prodws.types.CountryGroupType;

import java.util.ArrayList;
import java.util.List;

public class CountryGroupList {

    protected List<CountryGroupType> countryGroup;

    public List<CountryGroupType> getCountryGroup() {
        if (countryGroup == null) {
            countryGroup = new ArrayList<CountryGroupType>();
        }
        return this.countryGroup;
    }
}
