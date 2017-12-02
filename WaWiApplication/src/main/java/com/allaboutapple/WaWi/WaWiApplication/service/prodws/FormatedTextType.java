
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Komplexer Datentyp zur Abbildung von formatierten Texten, die aus mehreren Textzeilen bestehen koennen
 * 
 * <p>Java-Klasse für formatedTextType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="formatedTextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}string_maxLen50" minOccurs="0"/>
 *         &lt;element name="textRow" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}textRowType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formatedTextType", propOrder = {
    "name",
    "textRow"
})
public class FormatedTextType {

    protected String name;
    @XmlElement(required = true)
    protected List<TextRowType> textRow;

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
     * Gets the value of the textRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextRowType }
     * 
     * 
     */
    public List<TextRowType> getTextRow() {
        if (textRow == null) {
            textRow = new ArrayList<TextRowType>();
        }
        return this.textRow;
    }

}
