
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Komplexer Datentyp zur Abbildung von Waehrungsbetraegen bzw. Bereichen von Waehrungsbetraegen
 * 
 * <p>Java-Klasse für currencyValueType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="currencyValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="minValue" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}currencyAmountType" minOccurs="0"/>
 *         &lt;element name="maxValue" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}currencyAmountType" minOccurs="0"/>
 *         &lt;element name="fixValue" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}currencyAmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "currencyValueType", propOrder = {
    "minValue",
    "maxValue",
    "fixValue"
})
public class CurrencyValueType {

    protected CurrencyAmountType minValue;
    protected CurrencyAmountType maxValue;
    protected CurrencyAmountType fixValue;

    /**
     * Ruft den Wert der minValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getMinValue() {
        return minValue;
    }

    /**
     * Legt den Wert der minValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setMinValue(CurrencyAmountType value) {
        this.minValue = value;
    }

    /**
     * Ruft den Wert der maxValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getMaxValue() {
        return maxValue;
    }

    /**
     * Legt den Wert der maxValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setMaxValue(CurrencyAmountType value) {
        this.maxValue = value;
    }

    /**
     * Ruft den Wert der fixValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getFixValue() {
        return fixValue;
    }

    /**
     * Legt den Wert der fixValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setFixValue(CurrencyAmountType value) {
        this.fixValue = value;
    }

}
