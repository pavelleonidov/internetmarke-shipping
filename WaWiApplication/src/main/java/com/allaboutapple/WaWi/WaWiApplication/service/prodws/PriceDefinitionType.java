
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Komplexer Datentyp zur Abbildung eines kompletten Produktpreises
 * 
 * <p>Java-Klasse für priceDefinitionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="priceDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="price" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}priceType"/>
 *           &lt;element name="tempPriceList" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="tempPrice" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}tempPriceType" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="minimalPrice" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}priceType" minOccurs="0"/>
 *           &lt;element name="priceFormula" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}priceFormulaType"/>
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
@XmlType(name = "priceDefinitionType", propOrder = {
    "price",
    "tempPriceList",
    "minimalPrice",
    "priceFormula"
})
public class PriceDefinitionType {

    protected PriceType price;
    protected TempPriceList tempPriceList;
    protected PriceType minimalPrice;
    protected PriceFormulaType priceFormula;

    /**
     * Ruft den Wert der price-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getPrice() {
        return price;
    }

    /**
     * Legt den Wert der price-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setPrice(PriceType value) {
        this.price = value;
    }

    /**
     * Ruft den Wert der tempPriceList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TempPriceList }
     *     
     */
    public TempPriceList getTempPriceList() {
        return tempPriceList;
    }

    /**
     * Legt den Wert der tempPriceList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TempPriceList }
     *     
     */
    public void setTempPriceList(TempPriceList value) {
        this.tempPriceList = value;
    }

    /**
     * Ruft den Wert der minimalPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getMinimalPrice() {
        return minimalPrice;
    }

    /**
     * Legt den Wert der minimalPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setMinimalPrice(PriceType value) {
        this.minimalPrice = value;
    }

    /**
     * Ruft den Wert der priceFormula-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormulaType }
     *     
     */
    public PriceFormulaType getPriceFormula() {
        return priceFormula;
    }

    /**
     * Legt den Wert der priceFormula-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormulaType }
     *     
     */
    public void setPriceFormula(PriceFormulaType value) {
        this.priceFormula = value;
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
     *         &lt;element name="tempPrice" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}tempPriceType" maxOccurs="unbounded"/>
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
        "tempPrice"
    })
    public static class TempPriceList {

        @XmlElement(required = true)
        protected List<TempPriceType> tempPrice;

        /**
         * Gets the value of the tempPrice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tempPrice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTempPrice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TempPriceType }
         * 
         * 
         */
        public List<TempPriceType> getTempPrice() {
            if (tempPrice == null) {
                tempPrice = new ArrayList<TempPriceType>();
            }
            return this.tempPrice;
        }

    }

}
