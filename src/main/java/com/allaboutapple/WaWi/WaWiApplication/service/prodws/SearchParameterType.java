
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Komplexer Datentyp zur Abbildung von Suchparametern
 * 
 * <p>Java-Klasse für searchParameterType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="searchParameterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productID" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}alphanumericOperatorType"/>
 *                   &lt;element name="id" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50"/>
 *                   &lt;element name="source" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="productName" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}alphanumericOperatorType"/>
 *                   &lt;element name="name" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen250"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="productPrice" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericOperatorType"/>
 *                   &lt;element name="price1" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}currencyAmountType"/>
 *                   &lt;element name="price2" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}currencyAmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="productValidity" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="timestamp" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}timestampType"/>
 *                   &lt;sequence>
 *                     &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericOperatorType"/>
 *                     &lt;element name="timestamp1" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}timestampType"/>
 *                     &lt;element name="timestamp2" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}timestampType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="productDimensionList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="productDimension" maxOccurs="6">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="Laenge"/>
 *                                   &lt;enumeration value="Breite"/>
 *                                   &lt;enumeration value="Hoehe"/>
 *                                   &lt;enumeration value="Durchmesser"/>
 *                                   &lt;enumeration value="Gurtmass"/>
 *                                   &lt;enumeration value="Laenge+Breite+Hoehe"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="dimension">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericOperatorType"/>
 *                                       &lt;element name="dimension1" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}dimensionType"/>
 *                                       &lt;element name="dimension2" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}dimensionType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="productWeight" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericOperatorType"/>
 *                   &lt;element name="weight1" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}weightType"/>
 *                   &lt;element name="weight2" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}weightType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="productPropertyList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="property" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50"/>
 *                             &lt;element name="value" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}propertyValueType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="productUsage" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}logicalOperatorType" minOccurs="0"/>
 *                   &lt;element name="usage_name" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="productCategory" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}logicalOperatorType" minOccurs="0"/>
 *                   &lt;element name="category_name" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="productStampType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}logicalOperatorType" minOccurs="0"/>
 *                   &lt;element name="stampType_name" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="productGroup" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}logicalOperatorType" minOccurs="0"/>
 *                   &lt;element name="group_name" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="branch" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}logicalOperatorType" minOccurs="0"/>
 *                   &lt;element name="branch_number" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}branchType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="destination" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="national"/>
 *               &lt;enumeration value="international"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="countryGroupList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}logicalOperatorType" minOccurs="0"/>
 *                   &lt;element name="countryGroup_shortName" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen10" maxOccurs="unbounded"/>
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
 *                   &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}logicalOperatorType" minOccurs="0"/>
 *                   &lt;element name="chargeZone_shortName" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen10" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="countryList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}logicalOperatorType" minOccurs="0"/>
 *                   &lt;element name="country_ISOCode" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen10" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="additionalProductList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}logicalOperatorType" minOccurs="0"/>
 *                   &lt;element name="additionalProduct_ProdWS-ID" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50" maxOccurs="unbounded"/>
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
@XmlType(name = "searchParameterType", propOrder = {
    "productID",
    "productName",
    "productPrice",
    "productValidity",
    "productDimensionList",
    "productWeight",
    "productPropertyList",
    "productUsage",
    "productCategory",
    "productStampType",
    "productGroup",
    "branch",
    "destination",
    "countryGroupList",
    "chargeZoneList",
    "countryList",
    "additionalProductList"
})
public class SearchParameterType {

    protected ProductID productID;
    protected ProductName productName;
    protected ProductPrice productPrice;
    protected ProductValidity productValidity;
    protected ProductDimensionList productDimensionList;
    protected ProductWeight productWeight;
    protected ProductPropertyList productPropertyList;
    protected ProductUsage productUsage;
    protected ProductCategory productCategory;
    protected ProductStampType productStampType;
    protected ProductGroup productGroup;
    protected Branch branch;
    protected String destination;
    protected CountryGroupList countryGroupList;
    protected ChargeZoneList chargeZoneList;
    protected CountryList countryList;
    protected AdditionalProductList additionalProductList;

    /**
     * Ruft den Wert der productID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProductID }
     *     
     */
    public ProductID getProductID() {
        return productID;
    }

    /**
     * Legt den Wert der productID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductID }
     *     
     */
    public void setProductID(ProductID value) {
        this.productID = value;
    }

    /**
     * Ruft den Wert der productName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProductName }
     *     
     */
    public ProductName getProductName() {
        return productName;
    }

    /**
     * Legt den Wert der productName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductName }
     *     
     */
    public void setProductName(ProductName value) {
        this.productName = value;
    }

    /**
     * Ruft den Wert der productPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProductPrice }
     *     
     */
    public ProductPrice getProductPrice() {
        return productPrice;
    }

    /**
     * Legt den Wert der productPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPrice }
     *     
     */
    public void setProductPrice(ProductPrice value) {
        this.productPrice = value;
    }

    /**
     * Ruft den Wert der productValidity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProductValidity }
     *     
     */
    public ProductValidity getProductValidity() {
        return productValidity;
    }

    /**
     * Legt den Wert der productValidity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductValidity }
     *     
     */
    public void setProductValidity(ProductValidity value) {
        this.productValidity = value;
    }

    /**
     * Ruft den Wert der productDimensionList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProductDimensionList }
     *     
     */
    public ProductDimensionList getProductDimensionList() {
        return productDimensionList;
    }

    /**
     * Legt den Wert der productDimensionList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDimensionList }
     *     
     */
    public void setProductDimensionList(ProductDimensionList value) {
        this.productDimensionList = value;
    }

    /**
     * Ruft den Wert der productWeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProductWeight }
     *     
     */
    public ProductWeight getProductWeight() {
        return productWeight;
    }

    /**
     * Legt den Wert der productWeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductWeight }
     *     
     */
    public void setProductWeight(ProductWeight value) {
        this.productWeight = value;
    }

    /**
     * Ruft den Wert der productPropertyList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProductPropertyList }
     *     
     */
    public ProductPropertyList getProductPropertyList() {
        return productPropertyList;
    }

    /**
     * Legt den Wert der productPropertyList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPropertyList }
     *     
     */
    public void setProductPropertyList(ProductPropertyList value) {
        this.productPropertyList = value;
    }

    /**
     * Ruft den Wert der productUsage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProductUsage }
     *     
     */
    public ProductUsage getProductUsage() {
        return productUsage;
    }

    /**
     * Legt den Wert der productUsage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductUsage }
     *     
     */
    public void setProductUsage(ProductUsage value) {
        this.productUsage = value;
    }

    /**
     * Ruft den Wert der productCategory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProductCategory }
     *     
     */
    public ProductCategory getProductCategory() {
        return productCategory;
    }

    /**
     * Legt den Wert der productCategory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCategory }
     *     
     */
    public void setProductCategory(ProductCategory value) {
        this.productCategory = value;
    }

    /**
     * Ruft den Wert der productStampType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProductStampType }
     *     
     */
    public ProductStampType getProductStampType() {
        return productStampType;
    }

    /**
     * Legt den Wert der productStampType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductStampType }
     *     
     */
    public void setProductStampType(ProductStampType value) {
        this.productStampType = value;
    }

    /**
     * Ruft den Wert der productGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProductGroup }
     *     
     */
    public ProductGroup getProductGroup() {
        return productGroup;
    }

    /**
     * Legt den Wert der productGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductGroup }
     *     
     */
    public void setProductGroup(ProductGroup value) {
        this.productGroup = value;
    }

    /**
     * Ruft den Wert der branch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Branch }
     *     
     */
    public Branch getBranch() {
        return branch;
    }

    /**
     * Legt den Wert der branch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Branch }
     *     
     */
    public void setBranch(Branch value) {
        this.branch = value;
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
     * Ruft den Wert der additionalProductList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalProductList }
     *     
     */
    public AdditionalProductList getAdditionalProductList() {
        return additionalProductList;
    }

    /**
     * Legt den Wert der additionalProductList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalProductList }
     *     
     */
    public void setAdditionalProductList(AdditionalProductList value) {
        this.additionalProductList = value;
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
     *         &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}logicalOperatorType" minOccurs="0"/>
     *         &lt;element name="additionalProduct_ProdWS-ID" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50" maxOccurs="unbounded"/>
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
        "operator",
        "additionalProductProdWSID"
    })
    public static class AdditionalProductList {

        protected LogicalOperatorType operator;
        @XmlElement(name = "additionalProduct_ProdWS-ID", required = true)
        protected List<String> additionalProductProdWSID;

        /**
         * Ruft den Wert der operator-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link LogicalOperatorType }
         *     
         */
        public LogicalOperatorType getOperator() {
            return operator;
        }

        /**
         * Legt den Wert der operator-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link LogicalOperatorType }
         *     
         */
        public void setOperator(LogicalOperatorType value) {
            this.operator = value;
        }

        /**
         * Gets the value of the additionalProductProdWSID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the additionalProductProdWSID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdditionalProductProdWSID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAdditionalProductProdWSID() {
            if (additionalProductProdWSID == null) {
                additionalProductProdWSID = new ArrayList<String>();
            }
            return this.additionalProductProdWSID;
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
     *         &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}logicalOperatorType" minOccurs="0"/>
     *         &lt;element name="branch_number" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}branchType" maxOccurs="unbounded"/>
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
        "operator",
        "branchNumber"
    })
    public static class Branch {

        protected LogicalOperatorType operator;
        @XmlElement(name = "branch_number", required = true)
        protected List<String> branchNumber;

        /**
         * Ruft den Wert der operator-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link LogicalOperatorType }
         *     
         */
        public LogicalOperatorType getOperator() {
            return operator;
        }

        /**
         * Legt den Wert der operator-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link LogicalOperatorType }
         *     
         */
        public void setOperator(LogicalOperatorType value) {
            this.operator = value;
        }

        /**
         * Gets the value of the branchNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the branchNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBranchNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getBranchNumber() {
            if (branchNumber == null) {
                branchNumber = new ArrayList<String>();
            }
            return this.branchNumber;
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
     *         &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}logicalOperatorType" minOccurs="0"/>
     *         &lt;element name="chargeZone_shortName" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen10" maxOccurs="unbounded"/>
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
        "operator",
        "chargeZoneShortName"
    })
    public static class ChargeZoneList {

        protected LogicalOperatorType operator;
        @XmlElement(name = "chargeZone_shortName", required = true)
        protected List<String> chargeZoneShortName;

        /**
         * Ruft den Wert der operator-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link LogicalOperatorType }
         *     
         */
        public LogicalOperatorType getOperator() {
            return operator;
        }

        /**
         * Legt den Wert der operator-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link LogicalOperatorType }
         *     
         */
        public void setOperator(LogicalOperatorType value) {
            this.operator = value;
        }

        /**
         * Gets the value of the chargeZoneShortName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the chargeZoneShortName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChargeZoneShortName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getChargeZoneShortName() {
            if (chargeZoneShortName == null) {
                chargeZoneShortName = new ArrayList<String>();
            }
            return this.chargeZoneShortName;
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
     *         &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}logicalOperatorType" minOccurs="0"/>
     *         &lt;element name="countryGroup_shortName" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen10" maxOccurs="unbounded"/>
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
        "operator",
        "countryGroupShortName"
    })
    public static class CountryGroupList {

        protected LogicalOperatorType operator;
        @XmlElement(name = "countryGroup_shortName", required = true)
        protected List<String> countryGroupShortName;

        /**
         * Ruft den Wert der operator-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link LogicalOperatorType }
         *     
         */
        public LogicalOperatorType getOperator() {
            return operator;
        }

        /**
         * Legt den Wert der operator-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link LogicalOperatorType }
         *     
         */
        public void setOperator(LogicalOperatorType value) {
            this.operator = value;
        }

        /**
         * Gets the value of the countryGroupShortName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the countryGroupShortName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCountryGroupShortName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCountryGroupShortName() {
            if (countryGroupShortName == null) {
                countryGroupShortName = new ArrayList<String>();
            }
            return this.countryGroupShortName;
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
     *         &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}logicalOperatorType" minOccurs="0"/>
     *         &lt;element name="country_ISOCode" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen10" maxOccurs="unbounded"/>
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
        "operator",
        "countryISOCode"
    })
    public static class CountryList {

        protected LogicalOperatorType operator;
        @XmlElement(name = "country_ISOCode", required = true)
        protected List<String> countryISOCode;

        /**
         * Ruft den Wert der operator-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link LogicalOperatorType }
         *     
         */
        public LogicalOperatorType getOperator() {
            return operator;
        }

        /**
         * Legt den Wert der operator-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link LogicalOperatorType }
         *     
         */
        public void setOperator(LogicalOperatorType value) {
            this.operator = value;
        }

        /**
         * Gets the value of the countryISOCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the countryISOCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCountryISOCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCountryISOCode() {
            if (countryISOCode == null) {
                countryISOCode = new ArrayList<String>();
            }
            return this.countryISOCode;
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
     *         &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}logicalOperatorType" minOccurs="0"/>
     *         &lt;element name="category_name" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50" maxOccurs="unbounded"/>
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
        "operator",
        "categoryName"
    })
    public static class ProductCategory {

        protected LogicalOperatorType operator;
        @XmlElement(name = "category_name", required = true)
        protected List<String> categoryName;

        /**
         * Ruft den Wert der operator-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link LogicalOperatorType }
         *     
         */
        public LogicalOperatorType getOperator() {
            return operator;
        }

        /**
         * Legt den Wert der operator-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link LogicalOperatorType }
         *     
         */
        public void setOperator(LogicalOperatorType value) {
            this.operator = value;
        }

        /**
         * Gets the value of the categoryName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the categoryName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCategoryName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCategoryName() {
            if (categoryName == null) {
                categoryName = new ArrayList<String>();
            }
            return this.categoryName;
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
     *         &lt;element name="productDimension" maxOccurs="6">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="Laenge"/>
     *                         &lt;enumeration value="Breite"/>
     *                         &lt;enumeration value="Hoehe"/>
     *                         &lt;enumeration value="Durchmesser"/>
     *                         &lt;enumeration value="Gurtmass"/>
     *                         &lt;enumeration value="Laenge+Breite+Hoehe"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="dimension">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericOperatorType"/>
     *                             &lt;element name="dimension1" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}dimensionType"/>
     *                             &lt;element name="dimension2" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}dimensionType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
    @XmlType(name = "", propOrder = {
        "productDimension"
    })
    public static class ProductDimensionList {

        @XmlElement(required = true)
        protected List<ProductDimension> productDimension;

        /**
         * Gets the value of the productDimension property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the productDimension property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProductDimension().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProductDimension }
         * 
         * 
         */
        public List<ProductDimension> getProductDimension() {
            if (productDimension == null) {
                productDimension = new ArrayList<ProductDimension>();
            }
            return this.productDimension;
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
         *         &lt;element name="name">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="Laenge"/>
         *               &lt;enumeration value="Breite"/>
         *               &lt;enumeration value="Hoehe"/>
         *               &lt;enumeration value="Durchmesser"/>
         *               &lt;enumeration value="Gurtmass"/>
         *               &lt;enumeration value="Laenge+Breite+Hoehe"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="dimension">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericOperatorType"/>
         *                   &lt;element name="dimension1" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}dimensionType"/>
         *                   &lt;element name="dimension2" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}dimensionType" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {
            "name",
            "dimension"
        })
        public static class ProductDimension {

            @XmlElement(required = true)
            protected String name;
            @XmlElement(required = true)
            protected Dimension dimension;

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
             * Ruft den Wert der dimension-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Dimension }
             *     
             */
            public Dimension getDimension() {
                return dimension;
            }

            /**
             * Legt den Wert der dimension-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Dimension }
             *     
             */
            public void setDimension(Dimension value) {
                this.dimension = value;
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
             *         &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericOperatorType"/>
             *         &lt;element name="dimension1" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}dimensionType"/>
             *         &lt;element name="dimension2" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}dimensionType" minOccurs="0"/>
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
                "operator",
                "dimension1",
                "dimension2"
            })
            public static class Dimension {

                @XmlElement(required = true)
                protected NumericOperatorType operator;
                @XmlElement(required = true)
                protected DimensionType dimension1;
                protected DimensionType dimension2;

                /**
                 * Ruft den Wert der operator-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link NumericOperatorType }
                 *     
                 */
                public NumericOperatorType getOperator() {
                    return operator;
                }

                /**
                 * Legt den Wert der operator-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link NumericOperatorType }
                 *     
                 */
                public void setOperator(NumericOperatorType value) {
                    this.operator = value;
                }

                /**
                 * Ruft den Wert der dimension1-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DimensionType }
                 *     
                 */
                public DimensionType getDimension1() {
                    return dimension1;
                }

                /**
                 * Legt den Wert der dimension1-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DimensionType }
                 *     
                 */
                public void setDimension1(DimensionType value) {
                    this.dimension1 = value;
                }

                /**
                 * Ruft den Wert der dimension2-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DimensionType }
                 *     
                 */
                public DimensionType getDimension2() {
                    return dimension2;
                }

                /**
                 * Legt den Wert der dimension2-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DimensionType }
                 *     
                 */
                public void setDimension2(DimensionType value) {
                    this.dimension2 = value;
                }

            }

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
     *         &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}logicalOperatorType" minOccurs="0"/>
     *         &lt;element name="group_name" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50" maxOccurs="unbounded"/>
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
        "operator",
        "groupName"
    })
    public static class ProductGroup {

        protected LogicalOperatorType operator;
        @XmlElement(name = "group_name", required = true)
        protected List<String> groupName;

        /**
         * Ruft den Wert der operator-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link LogicalOperatorType }
         *     
         */
        public LogicalOperatorType getOperator() {
            return operator;
        }

        /**
         * Legt den Wert der operator-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link LogicalOperatorType }
         *     
         */
        public void setOperator(LogicalOperatorType value) {
            this.operator = value;
        }

        /**
         * Gets the value of the groupName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the groupName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGroupName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getGroupName() {
            if (groupName == null) {
                groupName = new ArrayList<String>();
            }
            return this.groupName;
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
     *         &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}alphanumericOperatorType"/>
     *         &lt;element name="id" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50"/>
     *         &lt;element name="source" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50" minOccurs="0"/>
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
        "operator",
        "id",
        "source"
    })
    public static class ProductID {

        @XmlElement(required = true)
        protected AlphanumericOperatorType operator;
        @XmlElement(required = true)
        protected String id;
        protected String source;

        /**
         * Ruft den Wert der operator-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AlphanumericOperatorType }
         *     
         */
        public AlphanumericOperatorType getOperator() {
            return operator;
        }

        /**
         * Legt den Wert der operator-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AlphanumericOperatorType }
         *     
         */
        public void setOperator(AlphanumericOperatorType value) {
            this.operator = value;
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
     *         &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}alphanumericOperatorType"/>
     *         &lt;element name="name" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen250"/>
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
        "operator",
        "name"
    })
    public static class ProductName {

        @XmlElement(required = true)
        protected AlphanumericOperatorType operator;
        @XmlElement(required = true)
        protected String name;

        /**
         * Ruft den Wert der operator-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AlphanumericOperatorType }
         *     
         */
        public AlphanumericOperatorType getOperator() {
            return operator;
        }

        /**
         * Legt den Wert der operator-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AlphanumericOperatorType }
         *     
         */
        public void setOperator(AlphanumericOperatorType value) {
            this.operator = value;
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
     *         &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericOperatorType"/>
     *         &lt;element name="price1" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}currencyAmountType"/>
     *         &lt;element name="price2" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}currencyAmountType" minOccurs="0"/>
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
        "operator",
        "price1",
        "price2"
    })
    public static class ProductPrice {

        @XmlElement(required = true)
        protected NumericOperatorType operator;
        @XmlElement(required = true)
        protected CurrencyAmountType price1;
        protected CurrencyAmountType price2;

        /**
         * Ruft den Wert der operator-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link NumericOperatorType }
         *     
         */
        public NumericOperatorType getOperator() {
            return operator;
        }

        /**
         * Legt den Wert der operator-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link NumericOperatorType }
         *     
         */
        public void setOperator(NumericOperatorType value) {
            this.operator = value;
        }

        /**
         * Ruft den Wert der price1-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyAmountType }
         *     
         */
        public CurrencyAmountType getPrice1() {
            return price1;
        }

        /**
         * Legt den Wert der price1-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyAmountType }
         *     
         */
        public void setPrice1(CurrencyAmountType value) {
            this.price1 = value;
        }

        /**
         * Ruft den Wert der price2-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyAmountType }
         *     
         */
        public CurrencyAmountType getPrice2() {
            return price2;
        }

        /**
         * Legt den Wert der price2-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyAmountType }
         *     
         */
        public void setPrice2(CurrencyAmountType value) {
            this.price2 = value;
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
     *         &lt;element name="property" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50"/>
     *                   &lt;element name="value" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}propertyValueType"/>
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
    @XmlType(name = "", propOrder = {
        "property"
    })
    public static class ProductPropertyList {

        @XmlElement(required = true)
        protected List<Property> property;

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
         * {@link Property }
         * 
         * 
         */
        public List<Property> getProperty() {
            if (property == null) {
                property = new ArrayList<Property>();
            }
            return this.property;
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
         *         &lt;element name="name" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50"/>
         *         &lt;element name="value" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}propertyValueType"/>
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
            "name",
            "value"
        })
        public static class Property {

            @XmlElement(required = true)
            protected String name;
            @XmlElement(required = true)
            protected PropertyValueType value;

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
             * Ruft den Wert der value-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link PropertyValueType }
             *     
             */
            public PropertyValueType getValue() {
                return value;
            }

            /**
             * Legt den Wert der value-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link PropertyValueType }
             *     
             */
            public void setValue(PropertyValueType value) {
                this.value = value;
            }

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
     *         &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}logicalOperatorType" minOccurs="0"/>
     *         &lt;element name="stampType_name" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50" maxOccurs="unbounded"/>
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
        "operator",
        "stampTypeName"
    })
    public static class ProductStampType {

        protected LogicalOperatorType operator;
        @XmlElement(name = "stampType_name", required = true)
        protected List<String> stampTypeName;

        /**
         * Ruft den Wert der operator-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link LogicalOperatorType }
         *     
         */
        public LogicalOperatorType getOperator() {
            return operator;
        }

        /**
         * Legt den Wert der operator-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link LogicalOperatorType }
         *     
         */
        public void setOperator(LogicalOperatorType value) {
            this.operator = value;
        }

        /**
         * Gets the value of the stampTypeName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the stampTypeName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStampTypeName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getStampTypeName() {
            if (stampTypeName == null) {
                stampTypeName = new ArrayList<String>();
            }
            return this.stampTypeName;
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
     *         &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}logicalOperatorType" minOccurs="0"/>
     *         &lt;element name="usage_name" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50" maxOccurs="unbounded"/>
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
        "operator",
        "usageName"
    })
    public static class ProductUsage {

        protected LogicalOperatorType operator;
        @XmlElement(name = "usage_name", required = true)
        protected List<String> usageName;

        /**
         * Ruft den Wert der operator-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link LogicalOperatorType }
         *     
         */
        public LogicalOperatorType getOperator() {
            return operator;
        }

        /**
         * Legt den Wert der operator-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link LogicalOperatorType }
         *     
         */
        public void setOperator(LogicalOperatorType value) {
            this.operator = value;
        }

        /**
         * Gets the value of the usageName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the usageName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUsageName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getUsageName() {
            if (usageName == null) {
                usageName = new ArrayList<String>();
            }
            return this.usageName;
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
     *       &lt;choice>
     *         &lt;element name="timestamp" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}timestampType"/>
     *         &lt;sequence>
     *           &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericOperatorType"/>
     *           &lt;element name="timestamp1" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}timestampType"/>
     *           &lt;element name="timestamp2" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}timestampType" minOccurs="0"/>
     *         &lt;/sequence>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "timestamp",
        "operator",
        "timestamp1",
        "timestamp2"
    })
    public static class ProductValidity {

        protected TimestampType timestamp;
        protected NumericOperatorType operator;
        protected TimestampType timestamp1;
        protected TimestampType timestamp2;

        /**
         * Ruft den Wert der timestamp-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link TimestampType }
         *     
         */
        public TimestampType getTimestamp() {
            return timestamp;
        }

        /**
         * Legt den Wert der timestamp-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link TimestampType }
         *     
         */
        public void setTimestamp(TimestampType value) {
            this.timestamp = value;
        }

        /**
         * Ruft den Wert der operator-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link NumericOperatorType }
         *     
         */
        public NumericOperatorType getOperator() {
            return operator;
        }

        /**
         * Legt den Wert der operator-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link NumericOperatorType }
         *     
         */
        public void setOperator(NumericOperatorType value) {
            this.operator = value;
        }

        /**
         * Ruft den Wert der timestamp1-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link TimestampType }
         *     
         */
        public TimestampType getTimestamp1() {
            return timestamp1;
        }

        /**
         * Legt den Wert der timestamp1-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link TimestampType }
         *     
         */
        public void setTimestamp1(TimestampType value) {
            this.timestamp1 = value;
        }

        /**
         * Ruft den Wert der timestamp2-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link TimestampType }
         *     
         */
        public TimestampType getTimestamp2() {
            return timestamp2;
        }

        /**
         * Legt den Wert der timestamp2-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link TimestampType }
         *     
         */
        public void setTimestamp2(TimestampType value) {
            this.timestamp2 = value;
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
     *         &lt;element name="operator" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericOperatorType"/>
     *         &lt;element name="weight1" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}weightType"/>
     *         &lt;element name="weight2" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}weightType" minOccurs="0"/>
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
        "operator",
        "weight1",
        "weight2"
    })
    public static class ProductWeight {

        @XmlElement(required = true)
        protected NumericOperatorType operator;
        @XmlElement(required = true)
        protected WeightType weight1;
        protected WeightType weight2;

        /**
         * Ruft den Wert der operator-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link NumericOperatorType }
         *     
         */
        public NumericOperatorType getOperator() {
            return operator;
        }

        /**
         * Legt den Wert der operator-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link NumericOperatorType }
         *     
         */
        public void setOperator(NumericOperatorType value) {
            this.operator = value;
        }

        /**
         * Ruft den Wert der weight1-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link WeightType }
         *     
         */
        public WeightType getWeight1() {
            return weight1;
        }

        /**
         * Legt den Wert der weight1-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link WeightType }
         *     
         */
        public void setWeight1(WeightType value) {
            this.weight1 = value;
        }

        /**
         * Ruft den Wert der weight2-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link WeightType }
         *     
         */
        public WeightType getWeight2() {
            return weight2;
        }

        /**
         * Legt den Wert der weight2-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link WeightType }
         *     
         */
        public void setWeight2(WeightType value) {
            this.weight2 = value;
        }

    }

}
