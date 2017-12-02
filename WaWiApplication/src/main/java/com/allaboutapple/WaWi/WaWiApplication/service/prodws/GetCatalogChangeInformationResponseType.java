
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Response-Datentyp der Methode getCatalogChangeInformation
 * 
 * <p>Java-Klasse für getCatalogChangeInformationResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getCatalogChangeInformationResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="changesAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="catalog" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}catalogType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCatalogChangeInformationResponseType", propOrder = {
    "changesAvailable",
    "catalog"
})
public class GetCatalogChangeInformationResponseType {

    protected boolean changesAvailable;
    protected List<CatalogType> catalog;

    /**
     * Ruft den Wert der changesAvailable-Eigenschaft ab.
     * 
     */
    public boolean isChangesAvailable() {
        return changesAvailable;
    }

    /**
     * Legt den Wert der changesAvailable-Eigenschaft fest.
     * 
     */
    public void setChangesAvailable(boolean value) {
        this.changesAvailable = value;
    }

    /**
     * Gets the value of the catalog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the catalog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatalog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CatalogType }
     * 
     * 
     */
    public List<CatalogType> getCatalog() {
        if (catalog == null) {
            catalog = new ArrayList<CatalogType>();
        }
        return this.catalog;
    }

}
