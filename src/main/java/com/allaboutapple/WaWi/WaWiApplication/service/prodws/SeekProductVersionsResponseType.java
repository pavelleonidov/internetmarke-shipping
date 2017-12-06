
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response-Datentyp der Methode seekProductVersions
 * 
 * <p>Java-Klasse für seekProductVersionsResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="seekProductVersionsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="salesProduct" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="salesProductShortIdentifier" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}shortProductIdentifierType"/>
 *                   &lt;element name="salesProductGrossPrice" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}currencyAmountType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="message" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen1000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seekProductVersionsResponseType", propOrder = {
    "salesProduct",
    "message"
})
public class SeekProductVersionsResponseType {

    protected List<SalesProduct> salesProduct;
    protected String message;

    /**
     * Gets the value of the salesProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesProduct }
     * 
     * 
     */
    public List<SalesProduct> getSalesProduct() {
        if (salesProduct == null) {
            salesProduct = new ArrayList<SalesProduct>();
        }
        return this.salesProduct;
    }

    /**
     * Ruft den Wert der message-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Legt den Wert der message-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
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
     *         &lt;element name="salesProductShortIdentifier" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}shortProductIdentifierType"/>
     *         &lt;element name="salesProductGrossPrice" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}currencyAmountType"/>
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
        "salesProductShortIdentifier",
        "salesProductGrossPrice"
    })
    public static class SalesProduct {

        @XmlElement(required = true)
        protected ShortProductIdentifierType salesProductShortIdentifier;
        @XmlElement(required = true)
        protected CurrencyAmountType salesProductGrossPrice;

        /**
         * Ruft den Wert der salesProductShortIdentifier-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link ShortProductIdentifierType }
         *     
         */
        public ShortProductIdentifierType getSalesProductShortIdentifier() {
            return salesProductShortIdentifier;
        }

        /**
         * Legt den Wert der salesProductShortIdentifier-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link ShortProductIdentifierType }
         *     
         */
        public void setSalesProductShortIdentifier(ShortProductIdentifierType value) {
            this.salesProductShortIdentifier = value;
        }

        /**
         * Ruft den Wert der salesProductGrossPrice-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyAmountType }
         *     
         */
        public CurrencyAmountType getSalesProductGrossPrice() {
            return salesProductGrossPrice;
        }

        /**
         * Legt den Wert der salesProductGrossPrice-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyAmountType }
         *     
         */
        public void setSalesProductGrossPrice(CurrencyAmountType value) {
            this.salesProductGrossPrice = value;
        }

    }

}
