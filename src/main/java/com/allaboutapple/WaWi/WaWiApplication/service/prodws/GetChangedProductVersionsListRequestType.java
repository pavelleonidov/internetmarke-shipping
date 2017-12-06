
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request-Datentyp der Methode getChangedProductVersionsList
 * 
 * <p>Java-Klasse für getChangedProductVersionsListRequestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getChangedProductVersionsListRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mandantID" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen20"/>
 *         &lt;element name="subMandantID" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen20" minOccurs="0"/>
 *         &lt;element name="dedicatedProducts" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="responseMode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getChangedProductVersionsListRequestType", propOrder = {
    "mandantID",
    "subMandantID",
    "dedicatedProducts",
    "responseMode"
})
public class GetChangedProductVersionsListRequestType {

    @XmlElement(required = true)
    protected String mandantID;
    protected String subMandantID;
    protected boolean dedicatedProducts;
    @XmlElement(required = true)
    protected BigInteger responseMode;

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
     * Ruft den Wert der subMandantID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubMandantID() {
        return subMandantID;
    }

    /**
     * Legt den Wert der subMandantID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubMandantID(String value) {
        this.subMandantID = value;
    }

    /**
     * Ruft den Wert der dedicatedProducts-Eigenschaft ab.
     * 
     */
    public boolean isDedicatedProducts() {
        return dedicatedProducts;
    }

    /**
     * Legt den Wert der dedicatedProducts-Eigenschaft fest.
     * 
     */
    public void setDedicatedProducts(boolean value) {
        this.dedicatedProducts = value;
    }

    /**
     * Ruft den Wert der responseMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResponseMode() {
        return responseMode;
    }

    /**
     * Legt den Wert der responseMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResponseMode(BigInteger value) {
        this.responseMode = value;
    }

}
