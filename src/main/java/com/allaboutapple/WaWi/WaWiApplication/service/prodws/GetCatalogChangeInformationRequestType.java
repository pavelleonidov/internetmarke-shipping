
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request-Datentyp der Methode getCatalogChangeInformation
 * 
 * <p>Java-Klasse für getCatalogChangeInformationRequestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getCatalogChangeInformationRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mandantID" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen20"/>
 *         &lt;element name="submandantID" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen20" minOccurs="0"/>
 *         &lt;element name="lastQueryDate" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}timestampType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCatalogChangeInformationRequestType", propOrder = {
    "mandantID",
    "submandantID",
    "lastQueryDate"
})
public class GetCatalogChangeInformationRequestType {

    @XmlElement(required = true)
    protected String mandantID;
    protected String submandantID;
    @XmlElement(required = true)
    protected TimestampType lastQueryDate;

    /**
     * Ruft den Wert der mandantID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandantID() {
        return mandantID;
    }

    /**
     * Legt den Wert der mandantID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandantID(String value) {
        this.mandantID = value;
    }

    /**
     * Ruft den Wert der submandantID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmandantID() {
        return submandantID;
    }

    /**
     * Legt den Wert der submandantID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmandantID(String value) {
        this.submandantID = value;
    }

    /**
     * Ruft den Wert der lastQueryDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimestampType }
     *     
     */
    public TimestampType getLastQueryDate() {
        return lastQueryDate;
    }

    /**
     * Legt den Wert der lastQueryDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimestampType }
     *     
     */
    public void setLastQueryDate(TimestampType value) {
        this.lastQueryDate = value;
    }

}
