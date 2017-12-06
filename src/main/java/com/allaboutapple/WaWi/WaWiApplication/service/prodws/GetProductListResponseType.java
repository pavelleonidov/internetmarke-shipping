
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Response-Datentyp der Methode getProductList
 * 
 * <p>Java-Klasse für getProductListResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getProductListResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="salesProductList" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element ref="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}SalesProduct" maxOccurs="unbounded"/>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="basicProductList" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element ref="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}BasicProduct" maxOccurs="unbounded"/>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="additionalProductList" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element ref="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}AdditionalProduct" maxOccurs="unbounded"/>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="specialServiceList" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element ref="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}SpecialService" maxOccurs="unbounded"/>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/sequence>
 *           &lt;element name="shortSalesProductList" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element ref="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}ShortSalesProduct" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="message" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen1000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProductListResponseType", propOrder = {
    "date",
    "salesProductList",
    "basicProductList",
    "additionalProductList",
    "specialServiceList",
    "shortSalesProductList",
    "message"
})
public class GetProductListResponseType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    protected SalesProductList salesProductList;
    protected BasicProductList basicProductList;
    protected AdditionalProductList additionalProductList;
    protected SpecialServiceList specialServiceList;
    protected ShortSalesProductList shortSalesProductList;
    protected String message;

    /**
     * Ruft den Wert der date-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Legt den Wert der date-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Ruft den Wert der salesProductList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SalesProductList }
     *     
     */
    public SalesProductList getSalesProductList() {
        return salesProductList;
    }

    /**
     * Legt den Wert der salesProductList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesProductList }
     *     
     */
    public void setSalesProductList(SalesProductList value) {
        this.salesProductList = value;
    }

    /**
     * Ruft den Wert der basicProductList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BasicProductList }
     *     
     */
    public BasicProductList getBasicProductList() {
        return basicProductList;
    }

    /**
     * Legt den Wert der basicProductList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicProductList }
     *     
     */
    public void setBasicProductList(BasicProductList value) {
        this.basicProductList = value;
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
     * Ruft den Wert der specialServiceList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SpecialServiceList }
     *     
     */
    public SpecialServiceList getSpecialServiceList() {
        return specialServiceList;
    }

    /**
     * Legt den Wert der specialServiceList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialServiceList }
     *     
     */
    public void setSpecialServiceList(SpecialServiceList value) {
        this.specialServiceList = value;
    }

    /**
     * Ruft den Wert der shortSalesProductList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ShortSalesProductList }
     *     
     */
    public ShortSalesProductList getShortSalesProductList() {
        return shortSalesProductList;
    }

    /**
     * Legt den Wert der shortSalesProductList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortSalesProductList }
     *     
     */
    public void setShortSalesProductList(ShortSalesProductList value) {
        this.shortSalesProductList = value;
    }

    /**
     * Ruft den Wert der message-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Legt den Wert der message-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
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
     *         &lt;element ref="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}AdditionalProduct" maxOccurs="unbounded"/>
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
        "additionalProduct"
    })
    public static class AdditionalProductList {

        @XmlElement(name = "AdditionalProduct", required = true)
        protected List<AdditionalProductType> additionalProduct;

        /**
         * Gets the value of the additionalProduct property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the additionalProduct property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdditionalProduct().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AdditionalProductType }
         * 
         * 
         */
        public List<AdditionalProductType> getAdditionalProduct() {
            if (additionalProduct == null) {
                additionalProduct = new ArrayList<AdditionalProductType>();
            }
            return this.additionalProduct;
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
     *         &lt;element ref="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}BasicProduct" maxOccurs="unbounded"/>
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
        "basicProduct"
    })
    public static class BasicProductList {

        @XmlElement(name = "BasicProduct", required = true)
        protected List<BasicProductType> basicProduct;

        /**
         * Gets the value of the basicProduct property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the basicProduct property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBasicProduct().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BasicProductType }
         * 
         * 
         */
        public List<BasicProductType> getBasicProduct() {
            if (basicProduct == null) {
                basicProduct = new ArrayList<BasicProductType>();
            }
            return this.basicProduct;
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
     *         &lt;element ref="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}SalesProduct" maxOccurs="unbounded"/>
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
        "salesProduct"
    })
    public static class SalesProductList {

        @XmlElement(name = "SalesProduct", required = true)
        protected List<SalesProductType> salesProduct;

        /**
         * Gets the value of the salesProduct property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the salesProduct property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSalesProduct().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SalesProductType }
         * 
         * 
         */
        public List<SalesProductType> getSalesProduct() {
            if (salesProduct == null) {
                salesProduct = new ArrayList<SalesProductType>();
            }
            return this.salesProduct;
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
     *         &lt;element ref="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}ShortSalesProduct" maxOccurs="unbounded"/>
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
        "shortSalesProduct"
    })
    public static class ShortSalesProductList {

        @XmlElement(name = "ShortSalesProduct", required = true)
        protected List<ShortSalesProductType> shortSalesProduct;

        /**
         * Gets the value of the shortSalesProduct property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the shortSalesProduct property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getShortSalesProduct().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ShortSalesProductType }
         * 
         * 
         */
        public List<ShortSalesProductType> getShortSalesProduct() {
            if (shortSalesProduct == null) {
                shortSalesProduct = new ArrayList<ShortSalesProductType>();
            }
            return this.shortSalesProduct;
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
     *         &lt;element ref="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}SpecialService" maxOccurs="unbounded"/>
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
        "specialService"
    })
    public static class SpecialServiceList {

        @XmlElement(name = "SpecialService", required = true)
        protected List<SpecialServiceType> specialService;

        /**
         * Gets the value of the specialService property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the specialService property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpecialService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpecialServiceType }
         * 
         * 
         */
        public List<SpecialServiceType> getSpecialService() {
            if (specialService == null) {
                specialService = new ArrayList<SpecialServiceType>();
            }
            return this.specialService;
        }

    }

}
