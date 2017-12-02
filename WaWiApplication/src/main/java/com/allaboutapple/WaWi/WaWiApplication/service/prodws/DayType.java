
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dayType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="dayType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;length value="2"/>
 *     &lt;enumeration value="Mo"/>
 *     &lt;enumeration value="Di"/>
 *     &lt;enumeration value="Mi"/>
 *     &lt;enumeration value="Do"/>
 *     &lt;enumeration value="Fr"/>
 *     &lt;enumeration value="Sa"/>
 *     &lt;enumeration value="So"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dayType")
@XmlEnum
public enum DayType {

    @XmlEnumValue("Mo")
    MO("Mo"),
    @XmlEnumValue("Di")
    DI("Di"),
    @XmlEnumValue("Mi")
    MI("Mi"),
    @XmlEnumValue("Do")
    DO("Do"),
    @XmlEnumValue("Fr")
    FR("Fr"),
    @XmlEnumValue("Sa")
    SA("Sa"),
    @XmlEnumValue("So")
    SO("So");
    private final String value;

    DayType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DayType fromValue(String v) {
        for (DayType c: DayType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
