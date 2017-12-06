
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Request-Datentyp der Methode registerEMailAdress
 * 
 * <p>Java-Klasse für registerEMailAdressRequestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="registerEMailAdressRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mandantID" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen20"/>
 *         &lt;element name="eMailAdress" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="subMandant" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="subMandantID" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen20" minOccurs="0"/>
 *                   &lt;element name="subMandantName" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50" minOccurs="0"/>
 *                   &lt;element name="subMandantEMailAdress" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="10"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="overwrite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registerEMailAdressRequestType", propOrder = {
    "mandantID",
    "eMailAdress",
    "subMandant"
})
public class RegisterEMailAdressRequestType {

    @XmlElement(required = true)
    protected String mandantID;
    @XmlSchemaType(name = "anyURI")
    protected List<String> eMailAdress;
    protected SubMandant subMandant;
    @XmlAttribute
    protected Boolean overwrite;

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
     * Gets the value of the eMailAdress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eMailAdress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEMailAdress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEMailAdress() {
        if (eMailAdress == null) {
            eMailAdress = new ArrayList<String>();
        }
        return this.eMailAdress;
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
     * Ruft den Wert der overwrite-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverwrite() {
        return overwrite;
    }

    /**
     * Legt den Wert der overwrite-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverwrite(Boolean value) {
        this.overwrite = value;
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
     *         &lt;element name="subMandantEMailAdress" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="10"/>
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
        "subMandantEMailAdress"
    })
    public static class SubMandant {

        protected String subMandantID;
        protected String subMandantName;
        @XmlElement(required = true)
        @XmlSchemaType(name = "anyURI")
        protected List<String> subMandantEMailAdress;

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
         * Gets the value of the subMandantEMailAdress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subMandantEMailAdress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubMandantEMailAdress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSubMandantEMailAdress() {
            if (subMandantEMailAdress == null) {
                subMandantEMailAdress = new ArrayList<String>();
            }
            return this.subMandantEMailAdress;
        }

    }

}
