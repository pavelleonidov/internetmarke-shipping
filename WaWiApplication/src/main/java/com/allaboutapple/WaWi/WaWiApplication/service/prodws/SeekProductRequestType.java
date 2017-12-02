
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request-Datentyp der Methode seekProduct
 * 
 * <p>Java-Klasse für seekProductRequestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="seekProductRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mandantID" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen20"/>
 *         &lt;element name="subMandantID" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen20" minOccurs="0"/>
 *         &lt;element name="searchParameterList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="searchParameter" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}searchParameterType" maxOccurs="unbounded"/>
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
@XmlType(name = "seekProductRequestType", propOrder = {
    "mandantID",
    "subMandantID",
    "searchParameterList"
})
public class SeekProductRequestType {

    @XmlElement(required = true)
    protected String mandantID;
    protected String subMandantID;
    protected SearchParameterList searchParameterList;

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
     * Ruft den Wert der searchParameterList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SearchParameterList }
     *     
     */
    public SearchParameterList getSearchParameterList() {
        return searchParameterList;
    }

    /**
     * Legt den Wert der searchParameterList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchParameterList }
     *     
     */
    public void setSearchParameterList(SearchParameterList value) {
        this.searchParameterList = value;
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
     *         &lt;element name="searchParameter" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}searchParameterType" maxOccurs="unbounded"/>
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
        "searchParameter"
    })
    public static class SearchParameterList {

        @XmlElement(required = true)
        protected List<SearchParameterType> searchParameter;

        /**
         * Gets the value of the searchParameter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the searchParameter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSearchParameter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SearchParameterType }
         * 
         * 
         */
        public List<SearchParameterType> getSearchParameter() {
            if (searchParameter == null) {
                searchParameter = new ArrayList<SearchParameterType>();
            }
            return this.searchParameter;
        }

    }

}
