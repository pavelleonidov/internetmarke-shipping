
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Request-Datentyp der Methode getProductVersions
 * 
 * <p>Java-Klasse für getProductVersionsRequestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getProductVersionsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mandantID" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen20"/>
 *         &lt;element name="subMandantID" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen20" minOccurs="0"/>
 *         &lt;element name="ProdWS-ID" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50"/>
 *         &lt;element name="dedicatedProducts" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="responseMode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *       &lt;attribute name="onlyChanges" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="referenceDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="shortList" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProductVersionsRequestType", propOrder = {
    "mandantID",
    "subMandantID",
    "prodWSID",
    "dedicatedProducts",
    "responseMode"
})
public class GetProductVersionsRequestType {

    @XmlElement(required = true)
    protected String mandantID;
    protected String subMandantID;
    @XmlElement(name = "ProdWS-ID", required = true)
    protected String prodWSID;
    protected boolean dedicatedProducts;
    @XmlElement(required = true)
    protected BigInteger responseMode;
    @XmlAttribute
    protected Boolean onlyChanges;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar referenceDate;
    @XmlAttribute
    protected Boolean shortList;

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
     * Ruft den Wert der prodWSID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdWSID() {
        return prodWSID;
    }

    /**
     * Legt den Wert der prodWSID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdWSID(String value) {
        this.prodWSID = value;
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

    /**
     * Ruft den Wert der onlyChanges-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlyChanges() {
        return onlyChanges;
    }

    /**
     * Legt den Wert der onlyChanges-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlyChanges(Boolean value) {
        this.onlyChanges = value;
    }

    /**
     * Ruft den Wert der referenceDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReferenceDate() {
        return referenceDate;
    }

    /**
     * Legt den Wert der referenceDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReferenceDate(XMLGregorianCalendar value) {
        this.referenceDate = value;
    }

    /**
     * Ruft den Wert der shortList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShortList() {
        return shortList;
    }

    /**
     * Legt den Wert der shortList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShortList(Boolean value) {
        this.shortList = value;
    }

}
