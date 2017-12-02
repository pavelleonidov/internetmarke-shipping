
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Komplexer Datentyp zur Abbildung einer Dokumentenreferenz (Internet- oder Intranetadresse, Dokumentation, Broschuere, Datei mit Serveradresse usw.)
 * 
 * <p>Java-Klasse für documentReferenceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="documentReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="type" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50"/>
 *           &lt;element name="title" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen100"/>
 *           &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *           &lt;element name="description" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen1000" minOccurs="0"/>
 *           &lt;element name="format" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50" minOccurs="0"/>
 *           &lt;element name="materialNumber" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50" minOccurs="0"/>
 *           &lt;element name="publishing" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentReferenceType", propOrder = {
    "type",
    "title",
    "reference",
    "description",
    "format",
    "materialNumber",
    "publishing"
})
public class DocumentReferenceType {

    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String title;
    @XmlSchemaType(name = "anyURI")
    protected String reference;
    protected String description;
    protected String format;
    protected String materialNumber;
    protected String publishing;

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der title-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Legt den Wert der title-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Ruft den Wert der reference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Legt den Wert der reference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
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
     * Ruft den Wert der format-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Legt den Wert der format-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Ruft den Wert der materialNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialNumber() {
        return materialNumber;
    }

    /**
     * Legt den Wert der materialNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialNumber(String value) {
        this.materialNumber = value;
    }

    /**
     * Ruft den Wert der publishing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublishing() {
        return publishing;
    }

    /**
     * Legt den Wert der publishing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishing(String value) {
        this.publishing = value;
    }

}
