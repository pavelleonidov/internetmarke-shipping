
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Komplexer Datentyp zur Abbildung eines Staffelpreises
 * 
 * <p>Java-Klasse für slidingPriceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="slidingPriceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="slidingScale" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType"/>
 *         &lt;element name="price" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}unitPriceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "slidingPriceType", propOrder = {
    "slidingScale",
    "price"
})
public class SlidingPriceType {

    @XmlElement(required = true)
    protected NumericValueType slidingScale;
    @XmlElement(required = true)
    protected UnitPriceType price;

    /**
     * Ruft den Wert der slidingScale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NumericValueType }
     *     
     */
    public NumericValueType getSlidingScale() {
        return slidingScale;
    }

    /**
     * Legt den Wert der slidingScale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericValueType }
     *     
     */
    public void setSlidingScale(NumericValueType value) {
        this.slidingScale = value;
    }

    /**
     * Ruft den Wert der price-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UnitPriceType }
     *     
     */
    public UnitPriceType getPrice() {
        return price;
    }

    /**
     * Legt den Wert der price-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPriceType }
     *     
     */
    public void setPrice(UnitPriceType value) {
        this.price = value;
    }

}
