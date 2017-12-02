
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Komplexer Datentyp zur Abbildung einer Textzeile, bestehend aus mehreren Textbloecken, die unterschiedlich formatiert sein koennen
 * 
 * <p>Java-Klasse für textRowType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="textRowType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="textBlock" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}textBlockType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "textRowType", propOrder = {
    "textBlock"
})
public class TextRowType {

    @XmlElement(required = true)
    protected List<TextBlockType> textBlock;

    /**
     * Gets the value of the textBlock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textBlock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextBlock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextBlockType }
     * 
     * 
     */
    public List<TextBlockType> getTextBlock() {
        if (textBlock == null) {
            textBlock = new ArrayList<TextBlockType>();
        }
        return this.textBlock;
    }

}
