
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Komplexer Datentyp zur Abbildung eines Sonstigen Services
 * 
 * <p>Java-Klasse für specialServiceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="specialServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extendedIdentifier" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}extendedIdentifierType"/>
 *         &lt;element name="condition" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen1000" minOccurs="0"/>
 *         &lt;element name="priceDefinition" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}unitPriceType"/>
 *         &lt;element name="slidingPriceList" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}slidingPriceListType" minOccurs="0"/>
 *         &lt;element name="propertyList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="property" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}propertyType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="groupedPropertyList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="groupedProperty" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}groupedPropertyType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="serviceDayList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="serviceDay" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}dayType" maxOccurs="7"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="exclusionDayList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="exclusionDay" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}specialDayType" maxOccurs="unbounded"/>
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
@XmlType(name = "specialServiceType", propOrder = {
    "extendedIdentifier",
    "condition",
    "priceDefinition",
    "slidingPriceList",
    "propertyList",
    "groupedPropertyList",
    "serviceDayList",
    "exclusionDayList"
})
public class SpecialServiceType {

    @XmlElement(required = true)
    protected ExtendedIdentifierType extendedIdentifier;
    protected String condition;
    @XmlElement(required = true)
    protected UnitPriceType priceDefinition;
    protected SlidingPriceListType slidingPriceList;
    protected PropertyList propertyList;
    protected GroupedPropertyList groupedPropertyList;
    protected ServiceDayList serviceDayList;
    protected ExclusionDayList exclusionDayList;

    /**
     * Ruft den Wert der extendedIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedIdentifierType }
     *     
     */
    public ExtendedIdentifierType getExtendedIdentifier() {
        return extendedIdentifier;
    }

    /**
     * Legt den Wert der extendedIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedIdentifierType }
     *     
     */
    public void setExtendedIdentifier(ExtendedIdentifierType value) {
        this.extendedIdentifier = value;
    }

    /**
     * Ruft den Wert der condition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Legt den Wert der condition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * Ruft den Wert der priceDefinition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UnitPriceType }
     *     
     */
    public UnitPriceType getPriceDefinition() {
        return priceDefinition;
    }

    /**
     * Legt den Wert der priceDefinition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPriceType }
     *     
     */
    public void setPriceDefinition(UnitPriceType value) {
        this.priceDefinition = value;
    }

    /**
     * Ruft den Wert der slidingPriceList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SlidingPriceListType }
     *     
     */
    public SlidingPriceListType getSlidingPriceList() {
        return slidingPriceList;
    }

    /**
     * Legt den Wert der slidingPriceList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SlidingPriceListType }
     *     
     */
    public void setSlidingPriceList(SlidingPriceListType value) {
        this.slidingPriceList = value;
    }

    /**
     * Ruft den Wert der propertyList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PropertyList }
     *     
     */
    public PropertyList getPropertyList() {
        return propertyList;
    }

    /**
     * Legt den Wert der propertyList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyList }
     *     
     */
    public void setPropertyList(PropertyList value) {
        this.propertyList = value;
    }

    /**
     * Ruft den Wert der groupedPropertyList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupedPropertyList }
     *     
     */
    public GroupedPropertyList getGroupedPropertyList() {
        return groupedPropertyList;
    }

    /**
     * Legt den Wert der groupedPropertyList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupedPropertyList }
     *     
     */
    public void setGroupedPropertyList(GroupedPropertyList value) {
        this.groupedPropertyList = value;
    }

    /**
     * Ruft den Wert der serviceDayList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDayList }
     *     
     */
    public ServiceDayList getServiceDayList() {
        return serviceDayList;
    }

    /**
     * Legt den Wert der serviceDayList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDayList }
     *     
     */
    public void setServiceDayList(ServiceDayList value) {
        this.serviceDayList = value;
    }

    /**
     * Ruft den Wert der exclusionDayList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExclusionDayList }
     *     
     */
    public ExclusionDayList getExclusionDayList() {
        return exclusionDayList;
    }

    /**
     * Legt den Wert der exclusionDayList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExclusionDayList }
     *     
     */
    public void setExclusionDayList(ExclusionDayList value) {
        this.exclusionDayList = value;
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
     *         &lt;element name="exclusionDay" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}specialDayType" maxOccurs="unbounded"/>
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
        "exclusionDay"
    })
    public static class ExclusionDayList {

        @XmlElement(required = true)
        protected List<SpecialDayType> exclusionDay;

        /**
         * Gets the value of the exclusionDay property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the exclusionDay property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExclusionDay().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpecialDayType }
         * 
         * 
         */
        public List<SpecialDayType> getExclusionDay() {
            if (exclusionDay == null) {
                exclusionDay = new ArrayList<SpecialDayType>();
            }
            return this.exclusionDay;
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
     *         &lt;element name="groupedProperty" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}groupedPropertyType" maxOccurs="unbounded"/>
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
        "groupedProperty"
    })
    public static class GroupedPropertyList {

        @XmlElement(required = true)
        protected List<GroupedPropertyType> groupedProperty;

        /**
         * Gets the value of the groupedProperty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the groupedProperty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGroupedProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GroupedPropertyType }
         * 
         * 
         */
        public List<GroupedPropertyType> getGroupedProperty() {
            if (groupedProperty == null) {
                groupedProperty = new ArrayList<GroupedPropertyType>();
            }
            return this.groupedProperty;
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
     *         &lt;element name="property" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}propertyType" maxOccurs="unbounded"/>
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
        "property"
    })
    public static class PropertyList {

        @XmlElement(required = true)
        protected List<PropertyType> property;

        /**
         * Gets the value of the property property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the property property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PropertyType }
         * 
         * 
         */
        public List<PropertyType> getProperty() {
            if (property == null) {
                property = new ArrayList<PropertyType>();
            }
            return this.property;
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
     *         &lt;element name="serviceDay" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}dayType" maxOccurs="7"/>
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
        "serviceDay"
    })
    public static class ServiceDayList {

        @XmlElement(required = true)
        protected List<DayType> serviceDay;

        /**
         * Gets the value of the serviceDay property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceDay property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceDay().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DayType }
         * 
         * 
         */
        public List<DayType> getServiceDay() {
            if (serviceDay == null) {
                serviceDay = new ArrayList<DayType>();
            }
            return this.serviceDay;
        }

    }

}
