
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Komplexer Datentyp zur Abbildung eines Verkaufsproduktes
 * 
 * <p>Java-Klasse für salesProductType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="salesProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extendedIdentifier" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}extendedIdentifierType"/>
 *         &lt;element name="priceDefinition" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}priceDefinitionType"/>
 *         &lt;element name="dimensionList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="length" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
 *                   &lt;element name="width" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
 *                   &lt;element name="height" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
 *                   &lt;element name="diameter" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
 *                   &lt;element name="girth" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
 *                   &lt;element name="addedEdgeLength" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="weight" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
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
 *         &lt;element name="countrySpecificPropertyList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="countrySpecificProperty" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}countrySpecificPropertyType" maxOccurs="unbounded"/>
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
 *         &lt;element name="destinationArea" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}destinationAreaType" minOccurs="0"/>
 *         &lt;element name="usageList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="usage" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}groupedPropertyType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="categoryList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="category" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}groupedPropertyType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="stampTypeList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="stampType" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}groupedPropertyType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="documentReferenceList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="documentReference" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}documentReferenceType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="referenceTextList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="referenceText" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}formatedTextType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="accountProductReferenceList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="accountProductReference" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}accountProdReferenceType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="accountServiceReferenceList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="accountServiceReference" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}accountProdReferenceType" maxOccurs="unbounded"/>
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
@XmlType(name = "salesProductType", propOrder = {
    "extendedIdentifier",
    "priceDefinition",
    "dimensionList",
    "weight",
    "propertyList",
    "countrySpecificPropertyList",
    "groupedPropertyList",
    "destinationArea",
    "usageList",
    "categoryList",
    "stampTypeList",
    "documentReferenceList",
    "referenceTextList",
    "accountProductReferenceList",
    "accountServiceReferenceList"
})
public class SalesProductType {

    @XmlElement(required = true)
    protected ExtendedIdentifierType extendedIdentifier;
    @XmlElement(required = true)
    protected PriceDefinitionType priceDefinition;
    protected DimensionList dimensionList;
    protected NumericValueType weight;
    protected PropertyList propertyList;
    protected CountrySpecificPropertyList countrySpecificPropertyList;
    protected GroupedPropertyList groupedPropertyList;
    protected DestinationAreaType destinationArea;
    protected UsageList usageList;
    protected CategoryList categoryList;
    protected StampTypeList stampTypeList;
    protected DocumentReferenceList documentReferenceList;
    protected ReferenceTextList referenceTextList;
    @XmlElement(required = true)
    protected AccountProductReferenceList accountProductReferenceList;
    protected AccountServiceReferenceList accountServiceReferenceList;

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
     * Ruft den Wert der priceDefinition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PriceDefinitionType }
     *     
     */
    public PriceDefinitionType getPriceDefinition() {
        return priceDefinition;
    }

    /**
     * Legt den Wert der priceDefinition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceDefinitionType }
     *     
     */
    public void setPriceDefinition(PriceDefinitionType value) {
        this.priceDefinition = value;
    }

    /**
     * Ruft den Wert der dimensionList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DimensionList }
     *     
     */
    public DimensionList getDimensionList() {
        return dimensionList;
    }

    /**
     * Legt den Wert der dimensionList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionList }
     *     
     */
    public void setDimensionList(DimensionList value) {
        this.dimensionList = value;
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
     * Ruft den Wert der countrySpecificPropertyList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CountrySpecificPropertyList }
     *     
     */
    public CountrySpecificPropertyList getCountrySpecificPropertyList() {
        return countrySpecificPropertyList;
    }

    /**
     * Legt den Wert der countrySpecificPropertyList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySpecificPropertyList }
     *     
     */
    public void setCountrySpecificPropertyList(CountrySpecificPropertyList value) {
        this.countrySpecificPropertyList = value;
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
     * Ruft den Wert der destinationArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DestinationAreaType }
     *     
     */
    public DestinationAreaType getDestinationArea() {
        return destinationArea;
    }

    /**
     * Legt den Wert der destinationArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationAreaType }
     *     
     */
    public void setDestinationArea(DestinationAreaType value) {
        this.destinationArea = value;
    }

    /**
     * Ruft den Wert der usageList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UsageList }
     *     
     */
    public UsageList getUsageList() {
        return usageList;
    }

    /**
     * Legt den Wert der usageList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageList }
     *     
     */
    public void setUsageList(UsageList value) {
        this.usageList = value;
    }

    /**
     * Ruft den Wert der categoryList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CategoryList }
     *     
     */
    public CategoryList getCategoryList() {
        return categoryList;
    }

    /**
     * Legt den Wert der categoryList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryList }
     *     
     */
    public void setCategoryList(CategoryList value) {
        this.categoryList = value;
    }

    /**
     * Ruft den Wert der stampTypeList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StampTypeList }
     *     
     */
    public StampTypeList getStampTypeList() {
        return stampTypeList;
    }

    /**
     * Legt den Wert der stampTypeList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StampTypeList }
     *     
     */
    public void setStampTypeList(StampTypeList value) {
        this.stampTypeList = value;
    }

    /**
     * Ruft den Wert der documentReferenceList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceList }
     *     
     */
    public DocumentReferenceList getDocumentReferenceList() {
        return documentReferenceList;
    }

    /**
     * Legt den Wert der documentReferenceList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceList }
     *     
     */
    public void setDocumentReferenceList(DocumentReferenceList value) {
        this.documentReferenceList = value;
    }

    /**
     * Ruft den Wert der referenceTextList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceTextList }
     *     
     */
    public ReferenceTextList getReferenceTextList() {
        return referenceTextList;
    }

    /**
     * Legt den Wert der referenceTextList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceTextList }
     *     
     */
    public void setReferenceTextList(ReferenceTextList value) {
        this.referenceTextList = value;
    }

    /**
     * Ruft den Wert der accountProductReferenceList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccountProductReferenceList }
     *     
     */
    public AccountProductReferenceList getAccountProductReferenceList() {
        return accountProductReferenceList;
    }

    /**
     * Legt den Wert der accountProductReferenceList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountProductReferenceList }
     *     
     */
    public void setAccountProductReferenceList(AccountProductReferenceList value) {
        this.accountProductReferenceList = value;
    }

    /**
     * Ruft den Wert der accountServiceReferenceList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccountServiceReferenceList }
     *     
     */
    public AccountServiceReferenceList getAccountServiceReferenceList() {
        return accountServiceReferenceList;
    }

    /**
     * Legt den Wert der accountServiceReferenceList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountServiceReferenceList }
     *     
     */
    public void setAccountServiceReferenceList(AccountServiceReferenceList value) {
        this.accountServiceReferenceList = value;
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
     *         &lt;element name="accountProductReference" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}accountProdReferenceType" maxOccurs="unbounded"/>
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
        "accountProductReference"
    })
    public static class AccountProductReferenceList {

        @XmlElement(required = true)
        protected List<AccountProdReferenceType> accountProductReference;

        /**
         * Gets the value of the accountProductReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accountProductReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccountProductReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AccountProdReferenceType }
         * 
         * 
         */
        public List<AccountProdReferenceType> getAccountProductReference() {
            if (accountProductReference == null) {
                accountProductReference = new ArrayList<AccountProdReferenceType>();
            }
            return this.accountProductReference;
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
     *         &lt;element name="accountServiceReference" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}accountProdReferenceType" maxOccurs="unbounded"/>
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
        "accountServiceReference"
    })
    public static class AccountServiceReferenceList {

        @XmlElement(required = true)
        protected List<AccountProdReferenceType> accountServiceReference;

        /**
         * Gets the value of the accountServiceReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accountServiceReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccountServiceReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AccountProdReferenceType }
         * 
         * 
         */
        public List<AccountProdReferenceType> getAccountServiceReference() {
            if (accountServiceReference == null) {
                accountServiceReference = new ArrayList<AccountProdReferenceType>();
            }
            return this.accountServiceReference;
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
     *         &lt;element name="category" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}groupedPropertyType" maxOccurs="unbounded"/>
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
        "category"
    })
    public static class CategoryList {

        @XmlElement(required = true)
        protected List<GroupedPropertyType> category;

        /**
         * Gets the value of the category property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the category property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCategory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GroupedPropertyType }
         * 
         * 
         */
        public List<GroupedPropertyType> getCategory() {
            if (category == null) {
                category = new ArrayList<GroupedPropertyType>();
            }
            return this.category;
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
     *         &lt;element name="countrySpecificProperty" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}countrySpecificPropertyType" maxOccurs="unbounded"/>
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
        "countrySpecificProperty"
    })
    public static class CountrySpecificPropertyList {

        @XmlElement(required = true)
        protected List<CountrySpecificPropertyType> countrySpecificProperty;

        /**
         * Gets the value of the countrySpecificProperty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the countrySpecificProperty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCountrySpecificProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CountrySpecificPropertyType }
         * 
         * 
         */
        public List<CountrySpecificPropertyType> getCountrySpecificProperty() {
            if (countrySpecificProperty == null) {
                countrySpecificProperty = new ArrayList<CountrySpecificPropertyType>();
            }
            return this.countrySpecificProperty;
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
     *         &lt;element name="length" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
     *         &lt;element name="width" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
     *         &lt;element name="height" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
     *         &lt;element name="diameter" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
     *         &lt;element name="girth" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
     *         &lt;element name="addedEdgeLength" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
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
        "length",
        "width",
        "height",
        "diameter",
        "girth",
        "addedEdgeLength"
    })
    public static class DimensionList {

        protected NumericValueType length;
        protected NumericValueType width;
        protected NumericValueType height;
        protected NumericValueType diameter;
        protected NumericValueType girth;
        protected NumericValueType addedEdgeLength;

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
     *         &lt;element name="documentReference" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}documentReferenceType" maxOccurs="unbounded"/>
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
        "documentReference"
    })
    public static class DocumentReferenceList {

        @XmlElement(required = true)
        protected List<DocumentReferenceType> documentReference;

        /**
         * Gets the value of the documentReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documentReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumentReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocumentReferenceType }
         * 
         * 
         */
        public List<DocumentReferenceType> getDocumentReference() {
            if (documentReference == null) {
                documentReference = new ArrayList<DocumentReferenceType>();
            }
            return this.documentReference;
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
     *         &lt;element name="referenceText" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}formatedTextType" maxOccurs="unbounded"/>
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
        "referenceText"
    })
    public static class ReferenceTextList {

        @XmlElement(required = true)
        protected List<FormatedTextType> referenceText;

        /**
         * Gets the value of the referenceText property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the referenceText property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReferenceText().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FormatedTextType }
         * 
         * 
         */
        public List<FormatedTextType> getReferenceText() {
            if (referenceText == null) {
                referenceText = new ArrayList<FormatedTextType>();
            }
            return this.referenceText;
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
     *         &lt;element name="stampType" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}groupedPropertyType" maxOccurs="unbounded"/>
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
        "stampType"
    })
    public static class StampTypeList {

        @XmlElement(required = true)
        protected List<GroupedPropertyType> stampType;

        /**
         * Gets the value of the stampType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the stampType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStampType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GroupedPropertyType }
         * 
         * 
         */
        public List<GroupedPropertyType> getStampType() {
            if (stampType == null) {
                stampType = new ArrayList<GroupedPropertyType>();
            }
            return this.stampType;
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
     *         &lt;element name="usage" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}groupedPropertyType" maxOccurs="unbounded"/>
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
        "usage"
    })
    public static class UsageList {

        @XmlElement(required = true)
        protected List<GroupedPropertyType> usage;

        /**
         * Gets the value of the usage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the usage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUsage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GroupedPropertyType }
         * 
         * 
         */
        public List<GroupedPropertyType> getUsage() {
            if (usage == null) {
                usage = new ArrayList<GroupedPropertyType>();
            }
            return this.usage;
        }

    }

}
