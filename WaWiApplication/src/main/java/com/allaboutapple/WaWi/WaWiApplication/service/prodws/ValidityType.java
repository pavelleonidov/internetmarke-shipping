
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Komplexer Datentyp zur Abbildung einer Gueltigkeit
 * 
 * <p>Java-Klasse für validityType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="validityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="validFrom" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}timestampType"/>
 *         &lt;element name="validTo" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}timestampType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validityType", propOrder = {
    "validFrom",
    "validTo"
})
public class ValidityType {

    @XmlElement(required = true)
    protected TimestampType validFrom;
    protected TimestampType validTo;

    /**
     * Ruft den Wert der validFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimestampType }
     *     
     */
    public TimestampType getValidFrom() {
        return validFrom;
    }

    /**
     * Legt den Wert der validFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimestampType }
     *     
     */
    public void setValidFrom(TimestampType value) {
        this.validFrom = value;
    }

    /**
     * Ruft den Wert der validTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimestampType }
     *     
     */
    public TimestampType getValidTo() {
        return validTo;
    }

    /**
     * Legt den Wert der validTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimestampType }
     *     
     */
    public void setValidTo(TimestampType value) {
        this.validTo = value;
    }

}
