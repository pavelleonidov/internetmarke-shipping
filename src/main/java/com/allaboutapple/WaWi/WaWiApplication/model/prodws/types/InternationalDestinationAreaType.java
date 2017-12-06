package com.allaboutapple.WaWi.WaWiApplication.model.prodws.types;

import com.allaboutapple.WaWi.WaWiApplication.model.prodws.list.ChargeZoneList;
import com.allaboutapple.WaWi.WaWiApplication.model.prodws.list.CountryGroupList;
import com.allaboutapple.WaWi.WaWiApplication.model.prodws.list.CountryList;
import com.allaboutapple.WaWi.WaWiApplication.model.prodws.list.CountryNegativList;

public class InternationalDestinationAreaType {
    protected CountryList countryList;
    protected CountryNegativList countryNegativList;
    protected CountryGroupList countryGroupList;
    protected ChargeZoneList chargeZoneList;

    public CountryList getCountryList() {
        return countryList;
    }

    public void setCountryList(CountryList countryList) {
        this.countryList = countryList;
    }

    public CountryNegativList getCountryNegativList() {
        return countryNegativList;
    }

    public void setCountryNegativList(CountryNegativList countryNegativList) {
        this.countryNegativList = countryNegativList;
    }

    public CountryGroupList getCountryGroupList() {
        return countryGroupList;
    }

    public void setCountryGroupList(CountryGroupList countryGroupList) {
        this.countryGroupList = countryGroupList;
    }

    public ChargeZoneList getChargeZoneList() {
        return chargeZoneList;
    }

    public void setChargeZoneList(ChargeZoneList chargeZoneList) {
        this.chargeZoneList = chargeZoneList;
    }
}
