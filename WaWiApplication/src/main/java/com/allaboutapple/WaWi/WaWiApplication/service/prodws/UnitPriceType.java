
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Komplexer Datentyp zur Abbildung eines Einzelpreises
 * 
 * <p>Java-Klasse für unitPriceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="unitPriceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="netPrice" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}currencyAmountType" minOccurs="0"/>
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="grossPrice" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}currencyAmountType"/>
 *         &lt;element name="priceValidity" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}validityType" minOccurs="0"/>
 *         &lt;element name="tempPriceList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tempPrice" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}tempUnitPriceType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unitPriceType", propOrder = {
    "netPrice",
    "rate",
    "grossPrice",
    "priceValidity",
    "tempPriceList"
})
public class UnitPriceType {

    protected CurrencyAmountType netPrice;
    @XmlElement(required = true)
    protected BigDecimal rate;
    @XmlElement(required = true)
    protected CurrencyAmountType grossPrice;
    protected ValidityType priceValidity;
    protected TempPriceList tempPriceList;

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

    /**
     * Ruft den Wert der tempPriceList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TempPriceList }
     *     
     */
    public TempPriceList getTempPriceList() {
        return tempPriceList;
    }

    /**
     * Legt den Wert der tempPriceList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TempPriceList }
     *     
     */
    public void setTempPriceList(TempPriceList value) {
        this.tempPriceList = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="tempPrice" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}tempUnitPriceType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tempPrice"
    })
    public static class TempPriceList {

        @XmlElement(required = true)
        protected List<TempUnitPriceType> tempPrice;

        /**
         * Gets the value of the tempPrice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tempPrice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTempPrice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TempUnitPriceType }
         * 
         * 
         */
        public List<TempUnitPriceType> getTempPrice() {
            if (tempPrice == null) {
                tempPrice = new ArrayList<TempUnitPriceType>();
            }
            return this.tempPrice;
        }

    }

}
