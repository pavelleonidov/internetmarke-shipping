
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Komplexer Datentyp zur Abbildung von Produkteigenschaften
 * 
 * <p>Java-Klasse für propertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="propertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="propertyValue" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}propertyValueType"/>
 *         &lt;element name="price" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}unitPriceType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50" />
 *       &lt;attribute name="shortName" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen20" />
 *       &lt;attribute name="description" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen1000" />
 *       &lt;attribute name="annotation" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen1000" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertyType", propOrder = {
    "propertyValue",
    "price"
})
public class PropertyType {

    @XmlElement(required = true)
    protected PropertyValueType propertyValue;
    protected UnitPriceType price;
    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute
    protected String shortName;
    @XmlAttribute
    protected String description;
    @XmlAttribute
    protected String annotation;

    /**
     * Ruft den Wert der propertyValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PropertyValueType }
     *     
     */
    public PropertyValueType getPropertyValue() {
        return propertyValue;
    }

    /**
     * Legt den Wert der propertyValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyValueType }
     *     
     */
    public void setPropertyValue(PropertyValueType value) {
        this.propertyValue = value;
    }

    /**
     * Ruft den Wert der price-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UnitPriceType }
     *     
     */
    public UnitPriceType getPrice() {
        return price;
    }

    /**
     * Legt den Wert der price-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPriceType }
     *     
     */
    public void setPrice(UnitPriceType value) {
        this.price = value;
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
     * Ruft den Wert der shortName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Legt den Wert der shortName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der annotation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotation() {
        return annotation;
    }

    /**
     * Legt den Wert der annotation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotation(String value) {
        this.annotation = value;
    }

}
