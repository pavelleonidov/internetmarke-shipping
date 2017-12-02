
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Komplexer Datentyp zur Abbildung einer Formelkomponente mit Referenz auf das entsprechende EKP-Produkt, welches den Preisanteil definiert
 * 
 * <p>Java-Klasse für formulaComponentType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="formulaComponentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prodwsID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="component" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formulaComponentType", propOrder = {
    "prodwsID",
    "version",
    "component"
})
public class FormulaComponentType {

    protected int prodwsID;
    @XmlElement(required = true)
    protected BigInteger version;
    @XmlElement(required = true)
    protected String component;

    /**
     * Ruft den Wert der prodwsID-Eigenschaft ab.
     * 
     */
    public int getProdwsID() {
        return prodwsID;
    }

    /**
     * Legt den Wert der prodwsID-Eigenschaft fest.
     * 
     */
    public void setProdwsID(int value) {
        this.prodwsID = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersion(BigInteger value) {
        this.version = value;
    }

    /**
     * Ruft den Wert der component-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponent() {
        return component;
    }

    /**
     * Legt den Wert der component-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponent(String value) {
        this.component = value;
    }

}
