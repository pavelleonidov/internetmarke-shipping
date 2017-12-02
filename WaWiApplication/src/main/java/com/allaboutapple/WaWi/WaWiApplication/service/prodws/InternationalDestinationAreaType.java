
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Komplexer Datentyp zur Abbildung der internationalen Zielbereiche
 * 
 * <p>Java-Klasse für internationalDestinationAreaType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="internationalDestinationAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countryList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="country" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}countryType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="countryNegativList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="country" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}countryType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="countryGroupList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="countryGroup" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}countryGroupType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="chargeZoneList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="chargeZone" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}chargeZoneType" maxOccurs="unbounded"/>
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
@XmlType(name = "internationalDestinationAreaType", propOrder = {
    "countryList",
    "countryNegativList",
    "countryGroupList",
    "chargeZoneList"
})
public class InternationalDestinationAreaType {

    protected CountryList countryList;
    protected CountryNegativList countryNegativList;
    protected CountryGroupList countryGroupList;
    protected ChargeZoneList chargeZoneList;

    /**
     * Ruft den Wert der countryList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CountryList }
     *     
     */
    public CountryList getCountryList() {
        return countryList;
    }

    /**
     * Legt den Wert der countryList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryList }
     *     
     */
    public void setCountryList(CountryList value) {
        this.countryList = value;
    }

    /**
     * Ruft den Wert der countryNegativList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CountryNegativList }
     *     
     */
    public CountryNegativList getCountryNegativList() {
        return countryNegativList;
    }

    /**
     * Legt den Wert der countryNegativList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryNegativList }
     *     
     */
    public void setCountryNegativList(CountryNegativList value) {
        this.countryNegativList = value;
    }

    /**
     * Ruft den Wert der countryGroupList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CountryGroupList }
     *     
     */
    public CountryGroupList getCountryGroupList() {
        return countryGroupList;
    }

    /**
     * Legt den Wert der countryGroupList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryGroupList }
     *     
     */
    public void setCountryGroupList(CountryGroupList value) {
        this.countryGroupList = value;
    }

    /**
     * Ruft den Wert der chargeZoneList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ChargeZoneList }
     *     
     */
    public ChargeZoneList getChargeZoneList() {
        return chargeZoneList;
    }

    /**
     * Legt den Wert der chargeZoneList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeZoneList }
     *     
     */
    public void setChargeZoneList(ChargeZoneList value) {
        this.chargeZoneList = value;
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
     *         &lt;element name="chargeZone" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}chargeZoneType" maxOccurs="unbounded"/>
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
        "chargeZone"
    })
    public static class ChargeZoneList {

        @XmlElement(required = true)
        protected List<ChargeZoneType> chargeZone;

        /**
         * Gets the value of the chargeZone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the chargeZone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChargeZone().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ChargeZoneType }
         * 
         * 
         */
        public List<ChargeZoneType> getChargeZone() {
            if (chargeZone == null) {
                chargeZone = new ArrayList<ChargeZoneType>();
            }
            return this.chargeZone;
        }

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
     *         &lt;element name="countryGroup" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}countryGroupType" maxOccurs="unbounded"/>
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
        "countryGroup"
    })
    public static class CountryGroupList {

        @XmlElement(required = true)
        protected List<CountryGroupType> countryGroup;

        /**
         * Gets the value of the countryGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the countryGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCountryGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CountryGroupType }
         * 
         * 
         */
        public List<CountryGroupType> getCountryGroup() {
            if (countryGroup == null) {
                countryGroup = new ArrayList<CountryGroupType>();
            }
            return this.countryGroup;
        }

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
     *         &lt;element name="country" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}countryType" maxOccurs="unbounded"/>
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
        "country"
    })
    public static class CountryList {

        @XmlElement(required = true)
        protected List<CountryType> country;

        /**
         * Gets the value of the country property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the country property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCountry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CountryType }
         * 
         * 
         */
        public List<CountryType> getCountry() {
            if (country == null) {
                country = new ArrayList<CountryType>();
            }
            return this.country;
        }

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
     *         &lt;element name="country" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}countryType" maxOccurs="unbounded"/>
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
        "country"
    })
    public static class CountryNegativList {

        @XmlElement(required = true)
        protected List<CountryType> country;

        /**
         * Gets the value of the country property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the country property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCountry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CountryType }
         * 
         * 
         */
        public List<CountryType> getCountry() {
            if (country == null) {
                country = new ArrayList<CountryType>();
            }
            return this.country;
        }

    }

}
