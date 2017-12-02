
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Komplexer Datentyp zur Abbildung des eigentlichen Formelausdrucks fuer die Preisberechnungsformel
 * 
 * <p>Java-Klasse für formulaExpressionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="formulaExpressionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="condition" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="formula" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="formulaComponent" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}formulaComponentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formulaExpressionType", propOrder = {
    "condition",
    "formula",
    "formulaComponent"
})
public class FormulaExpressionType {

    protected byte[] condition;
    @XmlElement(required = true)
    protected byte[] formula;
    protected List<FormulaComponentType> formulaComponent;

    /**
     * Ruft den Wert der condition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCondition() {
        return condition;
    }

    /**
     * Legt den Wert der condition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCondition(byte[] value) {
        this.condition = ((byte[]) value);
    }

    /**
     * Ruft den Wert der formula-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFormula() {
        return formula;
    }

    /**
     * Legt den Wert der formula-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFormula(byte[] value) {
        this.formula = ((byte[]) value);
    }

    /**
     * Gets the value of the formulaComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formulaComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormulaComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormulaComponentType }
     * 
     * 
     */
    public List<FormulaComponentType> getFormulaComponent() {
        if (formulaComponent == null) {
            formulaComponent = new ArrayList<FormulaComponentType>();
        }
        return this.formulaComponent;
    }

}
