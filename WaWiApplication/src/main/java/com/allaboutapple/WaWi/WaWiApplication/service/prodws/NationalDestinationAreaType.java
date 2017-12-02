
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Komplexer Datentyp zur Abbildung der nationalen Zielbereiche
 * 
 * <p>Java-Klasse für nationalDestinationAreaType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="nationalDestinationAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="nationalZipCodeList" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}nationalZipCodeListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nationalZipCodeGroup" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}nationalZipCodeGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nationalDestinationAreaType", propOrder = {
    "nationalZipCodeList",
    "nationalZipCodeGroup"
})
public class NationalDestinationAreaType {

    protected List<NationalZipCodeListType> nationalZipCodeList;
    protected List<NationalZipCodeGroupType> nationalZipCodeGroup;

    /**
     * Gets the value of the nationalZipCodeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nationalZipCodeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationalZipCodeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NationalZipCodeListType }
     * 
     * 
     */
    public List<NationalZipCodeListType> getNationalZipCodeList() {
        if (nationalZipCodeList == null) {
            nationalZipCodeList = new ArrayList<NationalZipCodeListType>();
        }
        return this.nationalZipCodeList;
    }

    /**
     * Gets the value of the nationalZipCodeGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nationalZipCodeGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationalZipCodeGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NationalZipCodeGroupType }
     * 
     * 
     */
    public List<NationalZipCodeGroupType> getNationalZipCodeGroup() {
        if (nationalZipCodeGroup == null) {
            nationalZipCodeGroup = new ArrayList<NationalZipCodeGroupType>();
        }
        return this.nationalZipCodeGroup;
    }

}
