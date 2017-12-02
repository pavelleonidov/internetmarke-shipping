
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response-Datentyp der Methode getCatalogList
 * 
 * <p>Java-Klasse für getCatalogListResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getCatalogListResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catalogList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="catalog" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}catalogType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "getCatalogListResponseType", propOrder = {
    "catalogList",
    "message"
})
public class GetCatalogListResponseType {

    protected CatalogList catalogList;
    protected String message;

    /**
     * Ruft den Wert der catalogList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CatalogList }
     *     
     */
    public CatalogList getCatalogList() {
        return catalogList;
    }

    /**
     * Legt den Wert der catalogList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogList }
     *     
     */
    public void setCatalogList(CatalogList value) {
        this.catalogList = value;
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
     *         &lt;element name="catalog" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}catalogType" maxOccurs="unbounded"/>
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
        "catalog"
    })
    public static class CatalogList {

        @XmlElement(required = true)
        protected List<CatalogType> catalog;

        /**
         * Gets the value of the catalog property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the catalog property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCatalog().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CatalogType }
         * 
         * 
         */
        public List<CatalogType> getCatalog() {
            if (catalog == null) {
                catalog = new ArrayList<CatalogType>();
            }
            return this.catalog;
        }

    }

}
