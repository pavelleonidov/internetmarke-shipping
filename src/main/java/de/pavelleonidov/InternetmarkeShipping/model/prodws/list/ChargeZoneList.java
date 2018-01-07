package de.pavelleonidov.InternetmarkeShipping.model.prodws.list;

import de.pavelleonidov.InternetmarkeShipping.model.prodws.types.ChargeZoneType;
import de.pavelleonidov.InternetmarkeShipping.model.prodws.types.ChargeZoneType;

import java.util.ArrayList;
import java.util.List;

public class ChargeZoneList {

    protected List<ChargeZoneType> chargeZone;

    public List<ChargeZoneType> getChargeZone() {
        if (chargeZone == null) {
            chargeZone = new ArrayList<ChargeZoneType>();
        }
        return this.chargeZone;
    }
}
