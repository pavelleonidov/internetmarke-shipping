
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Komplexer Datentyp zur Abbildung eines Produktpreises
 * 
 * <p>Java-Klasse für priceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="priceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calculatedNetPrice" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}currencyAmountType" minOccurs="0"/>
 *         &lt;element name="calculatedGrossPrice" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}currencyAmountType" minOccurs="0"/>
 *         &lt;element name="commercialBalance" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}currencyAmountType" minOccurs="0"/>
 *         &lt;element name="commercialGrossPrice" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}currencyAmountType"/>
 *         &lt;element name="priceValidity" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}validityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priceType", propOrder = {
    "calculatedNetPrice",
    "calculatedGrossPrice",
    "commercialBalance",
    "commercialGrossPrice",
    "priceValidity"
})
public class PriceType {

    protected CurrencyAmountType calculatedNetPrice;
    protected CurrencyAmountType calculatedGrossPrice;
    protected CurrencyAmountType commercialBalance;
    @XmlElement(required = true)
    protected CurrencyAmountType commercialGrossPrice;
    protected ValidityType priceValidity;

    /**
     * Ruft den Wert der calculatedNetPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getCalculatedNetPrice() {
        return calculatedNetPrice;
    }

    /**
     * Legt den Wert der calculatedNetPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setCalculatedNetPrice(CurrencyAmountType value) {
        this.calculatedNetPrice = value;
    }

    /**
     * Ruft den Wert der calculatedGrossPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getCalculatedGrossPrice() {
        return calculatedGrossPrice;
    }

    /**
     * Legt den Wert der calculatedGrossPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setCalculatedGrossPrice(CurrencyAmountType value) {
        this.calculatedGrossPrice = value;
    }

    /**
     * Ruft den Wert der commercialBalance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getCommercialBalance() {
        return commercialBalance;
    }

    /**
     * Legt den Wert der commercialBalance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setCommercialBalance(CurrencyAmountType value) {
        this.commercialBalance = value;
    }

    /**
     * Ruft den Wert der commercialGrossPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getCommercialGrossPrice() {
        return commercialGrossPrice;
    }

    /**
     * Legt den Wert der commercialGrossPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setCommercialGrossPrice(CurrencyAmountType value) {
        this.commercialGrossPrice = value;
    }

    /**
     * Ruft den Wert der priceValidity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValidityType }
     *     
     */
    public ValidityType getPriceValidity() {
        return priceValidity;
    }

    /**
     * Legt den Wert der priceValidity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityType }
     *     
     */
    public void setPriceValidity(ValidityType value) {
        this.priceValidity = value;
    }

}
