
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Komplexer Datentyp zur Abbildung eines Verkaufsproduktes in kurzer, flacher Hierarchie
 * 
 * <p>Java-Klasse für shortSalesProductType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="shortSalesProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProdWS-ID" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50"/>
 *         &lt;element name="externIdentifier" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}externIdentifierType"/>
 *         &lt;element name="name" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen250"/>
 *         &lt;element name="destination">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="national"/>
 *               &lt;pattern value="international"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="validFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="validTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="priceDefinition">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="commercialGrossPrice" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}currencyAmountType"/>
 *                   &lt;element name="priceValidity" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}validityType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="length" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
 *         &lt;element name="width" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
 *         &lt;element name="height" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
 *         &lt;element name="diameter" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
 *         &lt;element name="girth" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
 *         &lt;element name="addedEdgeLength" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
 *         &lt;element name="weight" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shortSalesProductType", propOrder = {
    "prodWSID",
    "externIdentifier",
    "name",
    "destination",
    "validFrom",
    "validTo",
    "priceDefinition",
    "length",
    "width",
    "height",
    "diameter",
    "girth",
    "addedEdgeLength",
    "weight"
})
public class ShortSalesProductType {

    @XmlElement(name = "ProdWS-ID", required = true)
    protected String prodWSID;
    @XmlElement(required = true)
    protected ExternIdentifierType externIdentifier;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String destination;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validTo;
    @XmlElement(required = true)
    protected PriceDefinition priceDefinition;
    protected NumericValueType length;
    protected NumericValueType width;
    protected NumericValueType height;
    protected NumericValueType diameter;
    protected NumericValueType girth;
    protected NumericValueType addedEdgeLength;
    protected NumericValueType weight;

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
     * Ruft den Wert der externIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExternIdentifierType }
     *     
     */
    public ExternIdentifierType getExternIdentifier() {
        return externIdentifier;
    }

    /**
     * Legt den Wert der externIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternIdentifierType }
     *     
     */
    public void setExternIdentifier(ExternIdentifierType value) {
        this.externIdentifier = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der destination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Legt den Wert der destination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Ruft den Wert der validFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    /**
     * Legt den Wert der validFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFrom(XMLGregorianCalendar value) {
        this.validFrom = value;
    }

    /**
     * Ruft den Wert der validTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidTo() {
        return validTo;
    }

    /**
     * Legt den Wert der validTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidTo(XMLGregorianCalendar value) {
        this.validTo = value;
    }

    /**
     * Ruft den Wert der priceDefinition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PriceDefinition }
     *     
     */
    public PriceDefinition getPriceDefinition() {
        return priceDefinition;
    }

    /**
     * Legt den Wert der priceDefinition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceDefinition }
     *     
     */
    public void setPriceDefinition(PriceDefinition value) {
        this.priceDefinition = value;
    }

    /**
     * Ruft den Wert der length-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NumericValueType }
     *     
     */
    public NumericValueType getLength() {
        return length;
    }

    /**
     * Legt den Wert der length-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericValueType }
     *     
     */
    public void setLength(NumericValueType value) {
        this.length = value;
    }

    /**
     * Ruft den Wert der width-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NumericValueType }
     *     
     */
    public NumericValueType getWidth() {
        return width;
    }

    /**
     * Legt den Wert der width-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericValueType }
     *     
     */
    public void setWidth(NumericValueType value) {
        this.width = value;
    }

    /**
     * Ruft den Wert der height-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NumericValueType }
     *     
     */
    public NumericValueType getHeight() {
        return height;
    }

    /**
     * Legt den Wert der height-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericValueType }
     *     
     */
    public void setHeight(NumericValueType value) {
        this.height = value;
    }

    /**
     * Ruft den Wert der diameter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NumericValueType }
     *     
     */
    public NumericValueType getDiameter() {
        return diameter;
    }

    /**
     * Legt den Wert der diameter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericValueType }
     *     
     */
    public void setDiameter(NumericValueType value) {
        this.diameter = value;
    }

    /**
     * Ruft den Wert der girth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NumericValueType }
     *     
     */
    public NumericValueType getGirth() {
        return girth;
    }

    /**
     * Legt den Wert der girth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericValueType }
     *     
     */
    public void setGirth(NumericValueType value) {
        this.girth = value;
    }

    /**
     * Ruft den Wert der addedEdgeLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NumericValueType }
     *     
     */
    public NumericValueType getAddedEdgeLength() {
        return addedEdgeLength;
    }

    /**
     * Legt den Wert der addedEdgeLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericValueType }
     *     
     */
    public void setAddedEdgeLength(NumericValueType value) {
        this.addedEdgeLength = value;
    }

    /**
     * Ruft den Wert der weight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NumericValueType }
     *     
     */
    public NumericValueType getWeight() {
        return weight;
    }

    /**
     * Legt den Wert der weight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericValueType }
     *     
     */
    public void setWeight(NumericValueType value) {
        this.weight = value;
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
    @XmlType(name = "", propOrder = {
        "commercialGrossPrice",
        "priceValidity"
    })
    public static class PriceDefinition {

        @XmlElement(required = true)
        protected CurrencyAmountType commercialGrossPrice;
        protected ValidityType priceValidity;

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

}
