
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response-Datentyp der Methode getProduct
 * 
 * <p>Java-Klasse für getProductResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getProductResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}SalesProduct" minOccurs="0"/>
 *         &lt;element ref="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}BasicProduct" minOccurs="0"/>
 *         &lt;element ref="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}AdditionalProduct" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}SpecialService" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getProductResponseType", propOrder = {
    "salesProduct",
    "basicProduct",
    "additionalProduct",
    "specialService",
    "message"
})
public class GetProductResponseType {

    @XmlElement(name = "SalesProduct")
    protected SalesProductType salesProduct;
    @XmlElement(name = "BasicProduct")
    protected BasicProductType basicProduct;
    @XmlElement(name = "AdditionalProduct")
    protected List<AdditionalProductType> additionalProduct;
    @XmlElement(name = "SpecialService")
    protected List<SpecialServiceType> specialService;
    protected String message;

    /**
     * Ruft den Wert der salesProduct-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SalesProductType }
     *     
     */
    public SalesProductType getSalesProduct() {
        return salesProduct;
    }

    /**
     * Legt den Wert der salesProduct-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesProductType }
     *     
     */
    public void setSalesProduct(SalesProductType value) {
        this.salesProduct = value;
    }

    /**
     * Ruft den Wert der basicProduct-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BasicProductType }
     *     
     */
    public BasicProductType getBasicProduct() {
        return basicProduct;
    }

    /**
     * Legt den Wert der basicProduct-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicProductType }
     *     
     */
    public void setBasicProduct(BasicProductType value) {
        this.basicProduct = value;
    }

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

}
