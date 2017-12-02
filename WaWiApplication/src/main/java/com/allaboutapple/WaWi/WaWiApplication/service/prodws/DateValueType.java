
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Komplexer Datentyp zur Abbildung von Einzeldatumsangaben oder von Datumsbereichen
 * 
 * <p>Java-Klasse für dateValueType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dateValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="firstDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="lastDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="fixDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dateValueType")
public class DateValueType {

    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstDate;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastDate;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fixDate;

    /**
     * Ruft den Wert der firstDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstDate() {
        return firstDate;
    }

    /**
     * Legt den Wert der firstDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstDate(XMLGregorianCalendar value) {
        this.firstDate = value;
    }

    /**
     * Ruft den Wert der lastDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDate() {
        return lastDate;
    }

    /**
     * Legt den Wert der lastDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDate(XMLGregorianCalendar value) {
        this.lastDate = value;
    }

    /**
     * Ruft den Wert der fixDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFixDate() {
        return fixDate;
    }

    /**
     * Legt den Wert der fixDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFixDate(XMLGregorianCalendar value) {
        this.fixDate = value;
    }

}
