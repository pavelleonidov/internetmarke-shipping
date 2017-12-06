
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Komplexer Datentyp zur Abbildung von Eigenschaftswerten (sowohl Einzelwerte als auch Wertebereiche) mit den verschiedensten Formaten
 * 
 * <p>Java-Klasse für propertyValueType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="propertyValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="alphanumericValue" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}alphanumericValueType"/>
 *         &lt;element name="numericValue" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType"/>
 *         &lt;element name="booleanValue" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dateValue" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}dateValueType"/>
 *         &lt;element name="currencyValue" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}currencyValueType"/>
 *         &lt;element name="hyperlinkValue" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertyValueType", propOrder = {
    "alphanumericValue",
    "numericValue",
    "booleanValue",
    "dateValue",
    "currencyValue",
    "hyperlinkValue"
})
public class PropertyValueType {

    protected AlphanumericValueType alphanumericValue;
    protected NumericValueType numericValue;
    protected Boolean booleanValue;
    protected DateValueType dateValue;
    protected CurrencyValueType currencyValue;
    @XmlSchemaType(name = "anyURI")
    protected String hyperlinkValue;

    /**
     * Ruft den Wert der alphanumericValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AlphanumericValueType }
     *     
     */
    public AlphanumericValueType getAlphanumericValue() {
        return alphanumericValue;
    }

    /**
     * Legt den Wert der alphanumericValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AlphanumericValueType }
     *     
     */
    public void setAlphanumericValue(AlphanumericValueType value) {
        this.alphanumericValue = value;
    }

    /**
     * Ruft den Wert der numericValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NumericValueType }
     *     
     */
    public NumericValueType getNumericValue() {
        return numericValue;
    }

    /**
     * Legt den Wert der numericValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericValueType }
     *     
     */
    public void setNumericValue(NumericValueType value) {
        this.numericValue = value;
    }

    /**
     * Ruft den Wert der booleanValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBooleanValue() {
        return booleanValue;
    }

    /**
     * Legt den Wert der booleanValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBooleanValue(Boolean value) {
        this.booleanValue = value;
    }

    /**
     * Ruft den Wert der dateValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DateValueType }
     *     
     */
    public DateValueType getDateValue() {
        return dateValue;
    }

    /**
     * Legt den Wert der dateValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DateValueType }
     *     
     */
    public void setDateValue(DateValueType value) {
        this.dateValue = value;
    }

    /**
     * Ruft den Wert der currencyValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyValueType }
     *     
     */
    public CurrencyValueType getCurrencyValue() {
        return currencyValue;
    }

    /**
     * Legt den Wert der currencyValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyValueType }
     *     
     */
    public void setCurrencyValue(CurrencyValueType value) {
        this.currencyValue = value;
    }

    /**
     * Ruft den Wert der hyperlinkValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHyperlinkValue() {
        return hyperlinkValue;
    }

    /**
     * Legt den Wert der hyperlinkValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHyperlinkValue(String value) {
        this.hyperlinkValue = value;
    }

}
