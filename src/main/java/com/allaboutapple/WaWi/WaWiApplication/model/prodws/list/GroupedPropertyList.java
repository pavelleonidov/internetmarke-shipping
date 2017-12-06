package com.allaboutapple.WaWi.WaWiApplication.model.prodws.list;

import com.allaboutapple.WaWi.WaWiApplication.model.prodws.types.GroupedPropertyType;

import java.util.ArrayList;
import java.util.List;

public class GroupedPropertyList {

    protected List<GroupedPropertyType> groupedProperty;

    public List<GroupedPropertyType> getGroupedProperty() {
        if (groupedProperty == null) {
            groupedProperty = new ArrayList<GroupedPropertyType>();
        }
        return this.groupedProperty;
    }
}
