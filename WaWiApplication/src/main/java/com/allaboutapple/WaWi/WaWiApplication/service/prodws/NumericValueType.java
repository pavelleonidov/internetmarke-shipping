
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Komplexer Datentyp zur Abbildung von numerischen Einzelwerten oder numerischen Bereichen, ggf. mit Masseinheit
 * 
 * <p>Java-Klasse für numericValueType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="numericValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="minValue" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="maxValue" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="fixValue" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="unit" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen10" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "numericValueType")
public class NumericValueType {

    @XmlAttribute
    protected BigDecimal minValue;
    @XmlAttribute
    protected BigDecimal maxValue;
    @XmlAttribute
    protected BigDecimal fixValue;
    @XmlAttribute
    protected String unit;

    /**
     * Ruft den Wert der minValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinValue() {
        return minValue;
    }

    /**
     * Legt den Wert der minValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinValue(BigDecimal value) {
        this.minValue = value;
    }

    /**
     * Ruft den Wert der maxValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxValue() {
        return maxValue;
    }

    /**
     * Legt den Wert der maxValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxValue(BigDecimal value) {
        this.maxValue = value;
    }

    /**
     * Ruft den Wert der fixValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFixValue() {
        return fixValue;
    }

    /**
     * Legt den Wert der fixValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFixValue(BigDecimal value) {
        this.fixValue = value;
    }

    /**
     * Ruft den Wert der unit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Legt den Wert der unit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

}
