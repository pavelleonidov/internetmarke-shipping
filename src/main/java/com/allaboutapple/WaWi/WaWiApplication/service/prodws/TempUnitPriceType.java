
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Komplexer Datentyp zur Abbildung eines zeitlich begrenzten Einzelpreises, welcher den eigentlichen Einzelpreis temporaer uebersteuert
 * 
 * <p>Java-Klasse für tempUnitPriceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tempUnitPriceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="netPrice" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}currencyAmountType" minOccurs="0"/>
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="grossPrice" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}currencyAmountType"/>
 *         &lt;element name="validFrom" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}timestampType"/>
 *         &lt;element name="validTo" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}timestampType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tempUnitPriceType", propOrder = {
    "netPrice",
    "rate",
    "grossPrice",
    "validFrom",
    "validTo"
})
public class TempUnitPriceType {

    protected CurrencyAmountType netPrice;
    @XmlElement(required = true)
    protected BigDecimal rate;
    @XmlElement(required = true)
    protected CurrencyAmountType grossPrice;
    @XmlElement(required = true)
    protected TimestampType validFrom;
    @XmlElement(required = true)
    protected TimestampType validTo;

    /**
     * Ruft den Wert der netPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getNetPrice() {
        return netPrice;
    }

    /**
     * Legt den Wert der netPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setNetPrice(CurrencyAmountType value) {
        this.netPrice = value;
    }

    /**
     * Ruft den Wert der rate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Legt den Wert der rate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Ruft den Wert der grossPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getGrossPrice() {
        return grossPrice;
    }

    /**
     * Legt den Wert der grossPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setGrossPrice(CurrencyAmountType value) {
        this.grossPrice = value;
    }

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
