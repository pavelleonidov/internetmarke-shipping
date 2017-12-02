
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für alphanumericOperatorType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="alphanumericOperatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IS"/>
 *     &lt;enumeration value="IS NOT"/>
 *     &lt;enumeration value="INCLUDE"/>
 *     &lt;enumeration value="INCLUDE NOT"/>
 *     &lt;enumeration value="STARTED WITH"/>
 *     &lt;enumeration value="ENDED WITH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "alphanumericOperatorType")
@XmlEnum
public enum AlphanumericOperatorType {

    IS("IS"),
    @XmlEnumValue("IS NOT")
    IS_NOT("IS NOT"),
    INCLUDE("INCLUDE"),
    @XmlEnumValue("INCLUDE NOT")
    INCLUDE_NOT("INCLUDE NOT"),
    @XmlEnumValue("STARTED WITH")
    STARTED_WITH("STARTED WITH"),
    @XmlEnumValue("ENDED WITH")
    ENDED_WITH("ENDED WITH");
    private final String value;

    AlphanumericOperatorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlphanumericOperatorType fromValue(String v) {
        for (AlphanumericOperatorType c: AlphanumericOperatorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
