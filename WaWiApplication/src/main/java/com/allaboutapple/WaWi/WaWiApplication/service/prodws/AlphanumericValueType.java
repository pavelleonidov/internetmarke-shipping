
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Komplexer Datentyp zur Abbildung von alphanumerischen Einzelwerten oder alphanumerischen Bereichen (z.B. fuer PLZ oder ID's)
 * 
 * <p>Java-Klasse für alphanumericValueType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="alphanumericValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="firstValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fixValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alphanumericValueType")
public class AlphanumericValueType {

    @XmlAttribute
    protected String firstValue;
    @XmlAttribute
    protected String lastValue;
    @XmlAttribute
    protected String fixValue;

    /**
     * Ruft den Wert der firstValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstValue() {
        return firstValue;
    }

    /**
     * Legt den Wert der firstValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstValue(String value) {
        this.firstValue = value;
    }

    /**
     * Ruft den Wert der lastValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastValue() {
        return lastValue;
    }

    /**
     * Legt den Wert der lastValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastValue(String value) {
        this.lastValue = value;
    }

    /**
     * Ruft den Wert der fixValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixValue() {
        return fixValue;
    }

    /**
     * Legt den Wert der fixValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixValue(String value) {
        this.fixValue = value;
    }

}
