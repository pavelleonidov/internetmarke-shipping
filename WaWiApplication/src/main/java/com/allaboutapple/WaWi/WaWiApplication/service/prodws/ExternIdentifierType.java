
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Komplexer Datentyp zur Abbildung eines externen Produkt-Identifiers
 * 
 * <p>Java-Klasse für externIdentifierType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="externIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="source" use="required" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50" />
 *       &lt;attribute name="id" use="required" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen100" />
 *       &lt;attribute name="name" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen250" />
 *       &lt;attribute name="description" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen1000" />
 *       &lt;attribute name="annotation" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen1000" />
 *       &lt;attribute name="firstPPLVersion" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="lastPPLVersion" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="actualPPLVersion" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="sapProductType">
 *         &lt;simpleType>
 *           &lt;restriction base="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen10">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "externIdentifierType")
public class ExternIdentifierType {

    @XmlAttribute(required = true)
    protected String source;
    @XmlAttribute(required = true)
    protected String id;
    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected String description;
    @XmlAttribute
    protected String annotation;
    @XmlAttribute
    protected BigInteger firstPPLVersion;
    @XmlAttribute
    protected BigInteger lastPPLVersion;
    @XmlAttribute
    protected BigInteger actualPPLVersion;
    @XmlAttribute
    protected String sapProductType;

    /**
     * Ruft den Wert der source-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Legt den Wert der source-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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

    /**
     * Ruft den Wert der firstPPLVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFirstPPLVersion() {
        return firstPPLVersion;
    }

    /**
     * Legt den Wert der firstPPLVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFirstPPLVersion(BigInteger value) {
        this.firstPPLVersion = value;
    }

    /**
     * Ruft den Wert der lastPPLVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastPPLVersion() {
        return lastPPLVersion;
    }

    /**
     * Legt den Wert der lastPPLVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastPPLVersion(BigInteger value) {
        this.lastPPLVersion = value;
    }

    /**
     * Ruft den Wert der actualPPLVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getActualPPLVersion() {
        return actualPPLVersion;
    }

    /**
     * Legt den Wert der actualPPLVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setActualPPLVersion(BigInteger value) {
        this.actualPPLVersion = value;
    }

    /**
     * Ruft den Wert der sapProductType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSapProductType() {
        return sapProductType;
    }

    /**
     * Legt den Wert der sapProductType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSapProductType(String value) {
        this.sapProductType = value;
    }

}
