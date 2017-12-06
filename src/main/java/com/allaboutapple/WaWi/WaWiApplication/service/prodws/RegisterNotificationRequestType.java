
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Request-Datentyp der Methode registerNotification
 * 
 * <p>Java-Klasse für registerNotificationRequestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="registerNotificationRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mandantID" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen20"/>
 *         &lt;element name="subMandant" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="subMandantID" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen20" minOccurs="0"/>
 *                   &lt;element name="subMandantName" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50" minOccurs="0"/>
 *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registerNotificationRequestType", propOrder = {
    "mandantID",
    "subMandant",
    "url"
})
public class RegisterNotificationRequestType {

    @XmlElement(required = true)
    protected String mandantID;
    protected SubMandant subMandant;
    @XmlSchemaType(name = "anyURI")
    protected String url;

    /**
     * Ruft den Wert der mandantID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandantID() {
        return mandantID;
    }

    /**
     * Legt den Wert der mandantID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandantID(String value) {
        this.mandantID = value;
    }

    /**
     * Ruft den Wert der subMandant-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SubMandant }
     *     
     */
    public SubMandant getSubMandant() {
        return subMandant;
    }

    /**
     * Legt den Wert der subMandant-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SubMandant }
     *     
     */
    public void setSubMandant(SubMandant value) {
        this.subMandant = value;
    }

    /**
     * Ruft den Wert der url-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Legt den Wert der url-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
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
     *         &lt;element name="subMandantID" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen20" minOccurs="0"/>
     *         &lt;element name="subMandantName" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50" minOccurs="0"/>
     *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
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
        "subMandantID",
        "subMandantName",
        "url"
    })
    public static class SubMandant {

        protected String subMandantID;
        protected String subMandantName;
        @XmlElement(required = true)
        @XmlSchemaType(name = "anyURI")
        protected String url;

        /**
         * Ruft den Wert der subMandantID-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubMandantID() {
            return subMandantID;
        }

        /**
         * Legt den Wert der subMandantID-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubMandantID(String value) {
            this.subMandantID = value;
        }

        /**
         * Ruft den Wert der subMandantName-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubMandantName() {
            return subMandantName;
        }

        /**
         * Legt den Wert der subMandantName-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubMandantName(String value) {
            this.subMandantName = value;
        }

        /**
         * Ruft den Wert der url-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrl() {
            return url;
        }

        /**
         * Legt den Wert der url-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(String value) {
            this.url = value;
        }

    }

}
