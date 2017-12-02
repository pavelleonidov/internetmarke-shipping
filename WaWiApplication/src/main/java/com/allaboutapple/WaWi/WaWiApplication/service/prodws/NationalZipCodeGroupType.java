
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Komplexer Datentyp zur Abbildung einer nationalen PLZ-Gruppe (Leitzone, Leitregion, Leitbereich)
 * 
 * <p>Java-Klasse für nationalZipCodeGroupType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="nationalZipCodeGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50" minOccurs="0"/>
 *         &lt;element name="description" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen1000" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="routeRegion" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}routeRegionType"/>
 *           &lt;element name="routeZone" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}routeZoneType"/>
 *           &lt;element name="nationalZipCodeArea">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="firstZipCode" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}nationalZipCodeType"/>
 *                     &lt;element name="lastZipCode" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}nationalZipCodeType"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nationalZipCodeGroupType", propOrder = {
    "name",
    "description",
    "routeRegion",
    "routeZone",
    "nationalZipCodeArea"
})
public class NationalZipCodeGroupType {

    protected String name;
    protected String description;
    protected String routeRegion;
    protected String routeZone;
    protected NationalZipCodeArea nationalZipCodeArea;

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
     * Ruft den Wert der routeRegion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteRegion() {
        return routeRegion;
    }

    /**
     * Legt den Wert der routeRegion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteRegion(String value) {
        this.routeRegion = value;
    }

    /**
     * Ruft den Wert der routeZone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteZone() {
        return routeZone;
    }

    /**
     * Legt den Wert der routeZone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteZone(String value) {
        this.routeZone = value;
    }

    /**
     * Ruft den Wert der nationalZipCodeArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NationalZipCodeArea }
     *     
     */
    public NationalZipCodeArea getNationalZipCodeArea() {
        return nationalZipCodeArea;
    }

    /**
     * Legt den Wert der nationalZipCodeArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalZipCodeArea }
     *     
     */
    public void setNationalZipCodeArea(NationalZipCodeArea value) {
        this.nationalZipCodeArea = value;
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
     *         &lt;element name="firstZipCode" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}nationalZipCodeType"/>
     *         &lt;element name="lastZipCode" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}nationalZipCodeType"/>
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
        "firstZipCode",
        "lastZipCode"
    })
    public static class NationalZipCodeArea {

        @XmlElement(required = true)
        protected String firstZipCode;
        @XmlElement(required = true)
        protected String lastZipCode;

        /**
         * Ruft den Wert der firstZipCode-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstZipCode() {
            return firstZipCode;
        }

        /**
         * Legt den Wert der firstZipCode-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstZipCode(String value) {
            this.firstZipCode = value;
        }

        /**
         * Ruft den Wert der lastZipCode-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastZipCode() {
            return lastZipCode;
        }

        /**
         * Legt den Wert der lastZipCode-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastZipCode(String value) {
            this.lastZipCode = value;
        }

    }

}
