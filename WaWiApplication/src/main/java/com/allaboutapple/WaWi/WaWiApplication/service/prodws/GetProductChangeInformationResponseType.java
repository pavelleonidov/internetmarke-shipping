
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Response-Datentyp der Methode getProductChangeInformation
 * 
 * <p>Java-Klasse für getProductChangeInformationResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getProductChangeInformationResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="changesAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="providingDate" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}timestampType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProductChangeInformationResponseType", propOrder = {
    "changesAvailable",
    "providingDate"
})
public class GetProductChangeInformationResponseType {

    protected boolean changesAvailable;
    protected TimestampType providingDate;

    /**
     * Ruft den Wert der changesAvailable-Eigenschaft ab.
     * 
     */
    public boolean isChangesAvailable() {
        return changesAvailable;
    }

    /**
     * Legt den Wert der changesAvailable-Eigenschaft fest.
     * 
     */
    public void setChangesAvailable(boolean value) {
        this.changesAvailable = value;
    }

    /**
     * Ruft den Wert der providingDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimestampType }
     *     
     */
    public TimestampType getProvidingDate() {
        return providingDate;
    }

    /**
     * Legt den Wert der providingDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimestampType }
     *     
     */
    public void setProvidingDate(TimestampType value) {
        this.providingDate = value;
    }

}
