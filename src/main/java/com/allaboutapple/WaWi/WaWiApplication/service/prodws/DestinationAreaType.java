
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Komplexer Datentyp zur Abbildung des Zielbereiches eines Produktes
 * 
 * <p>Java-Klasse für destinationAreaType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="destinationAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="nationalDestinationArea" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}nationalDestinationAreaType"/>
 *         &lt;element name="internationalDestinationArea" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}internationalDestinationAreaType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "destinationAreaType", propOrder = {
    "nationalDestinationArea",
    "internationalDestinationArea"
})
public class DestinationAreaType {

    protected NationalDestinationAreaType nationalDestinationArea;
    protected InternationalDestinationAreaType internationalDestinationArea;

    /**
     * Ruft den Wert der nationalDestinationArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NationalDestinationAreaType }
     *     
     */
    public NationalDestinationAreaType getNationalDestinationArea() {
        return nationalDestinationArea;
    }

    /**
     * Legt den Wert der nationalDestinationArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalDestinationAreaType }
     *     
     */
    public void setNationalDestinationArea(NationalDestinationAreaType value) {
        this.nationalDestinationArea = value;
    }

    /**
     * Ruft den Wert der internationalDestinationArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalDestinationAreaType }
     *     
     */
    public InternationalDestinationAreaType getInternationalDestinationArea() {
        return internationalDestinationArea;
    }

    /**
     * Legt den Wert der internationalDestinationArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalDestinationAreaType }
     *     
     */
    public void setInternationalDestinationArea(InternationalDestinationAreaType value) {
        this.internationalDestinationArea = value;
    }

}
