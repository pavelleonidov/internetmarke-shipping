
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für numericOperatorType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="numericOperatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EQUALS"/>
 *     &lt;enumeration value="LESS THEN"/>
 *     &lt;enumeration value="LESS THEN OR EQUALS"/>
 *     &lt;enumeration value="GREATER THEN"/>
 *     &lt;enumeration value="GREATER THEN OR EQUALS"/>
 *     &lt;enumeration value="BETWEEN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "numericOperatorType")
@XmlEnum
public enum NumericOperatorType {

    EQUALS("EQUALS"),
    @XmlEnumValue("LESS THEN")
    LESS_THEN("LESS THEN"),
    @XmlEnumValue("LESS THEN OR EQUALS")
    LESS_THEN_OR_EQUALS("LESS THEN OR EQUALS"),
    @XmlEnumValue("GREATER THEN")
    GREATER_THEN("GREATER THEN"),
    @XmlEnumValue("GREATER THEN OR EQUALS")
    GREATER_THEN_OR_EQUALS("GREATER THEN OR EQUALS"),
    BETWEEN("BETWEEN");
    private final String value;

    NumericOperatorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NumericOperatorType fromValue(String v) {
        for (NumericOperatorType c: NumericOperatorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
