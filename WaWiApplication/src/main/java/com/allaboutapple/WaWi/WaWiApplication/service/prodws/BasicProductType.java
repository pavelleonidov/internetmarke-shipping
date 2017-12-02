
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Komplexer Datentyp zur Abbildung eines Basisproduktes
 * 
 * <p>Java-Klasse für basicProductType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="basicProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extendedIdentifier" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}extendedIdentifierType"/>
 *         &lt;element name="priceDefinition" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}unitPriceType"/>
 *         &lt;element name="slidingPriceList" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}slidingPriceListType" minOccurs="0"/>
 *         &lt;element name="dimensionList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="length" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
 *                   &lt;element name="width" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
 *                   &lt;element name="height" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
 *                   &lt;element name="diameter" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
 *                   &lt;element name="girth" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
 *                   &lt;element name="addedEdgeLength" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="weight" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
 *         &lt;element name="propertyList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="property" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}propertyType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="groupedPropertyList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="groupedProperty" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}groupedPropertyType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="destinationArea" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}destinationAreaType" minOccurs="0"/>
 *         &lt;element name="documentReferenceList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="documentReference" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}documentReferenceType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "basicProductType", propOrder = {
    "extendedIdentifier",
    "priceDefinition",
    "slidingPriceList",
    "dimensionList",
    "weight",
    "propertyList",
    "groupedPropertyList",
    "destinationArea",
    "documentReferenceList"
})
public class BasicProductType {

    @XmlElement(required = true)
    protected ExtendedIdentifierType extendedIdentifier;
    @XmlElement(required = true)
    protected UnitPriceType priceDefinition;
    protected SlidingPriceListType slidingPriceList;
    protected DimensionList dimensionList;
    protected NumericValueType weight;
    protected PropertyList propertyList;
    protected GroupedPropertyList groupedPropertyList;
    protected DestinationAreaType destinationArea;
    protected DocumentReferenceList documentReferenceList;

    /**
     * Ruft den Wert der extendedIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedIdentifierType }
     *     
     */
    public ExtendedIdentifierType getExtendedIdentifier() {
        return extendedIdentifier;
    }

    /**
     * Legt den Wert der extendedIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedIdentifierType }
     *     
     */
    public void setExtendedIdentifier(ExtendedIdentifierType value) {
        this.extendedIdentifier = value;
    }

    /**
     * Ruft den Wert der priceDefinition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UnitPriceType }
     *     
     */
    public UnitPriceType getPriceDefinition() {
        return priceDefinition;
    }

    /**
     * Legt den Wert der priceDefinition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPriceType }
     *     
     */
    public void setPriceDefinition(UnitPriceType value) {
        this.priceDefinition = value;
    }

    /**
     * Ruft den Wert der slidingPriceList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SlidingPriceListType }
     *     
     */
    public SlidingPriceListType getSlidingPriceList() {
        return slidingPriceList;
    }

    /**
     * Legt den Wert der slidingPriceList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SlidingPriceListType }
     *     
     */
    public void setSlidingPriceList(SlidingPriceListType value) {
        this.slidingPriceList = value;
    }

    /**
     * Ruft den Wert der dimensionList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DimensionList }
     *     
     */
    public DimensionList getDimensionList() {
        return dimensionList;
    }

    /**
     * Legt den Wert der dimensionList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionList }
     *     
     */
    public void setDimensionList(DimensionList value) {
        this.dimensionList = value;
    }

    /**
     * Ruft den Wert der weight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NumericValueType }
     *     
     */
    public NumericValueType getWeight() {
        return weight;
    }

    /**
     * Legt den Wert der weight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericValueType }
     *     
     */
    public void setWeight(NumericValueType value) {
        this.weight = value;
    }

    /**
     * Ruft den Wert der propertyList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PropertyList }
     *     
     */
    public PropertyList getPropertyList() {
        return propertyList;
    }

    /**
     * Legt den Wert der propertyList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyList }
     *     
     */
    public void setPropertyList(PropertyList value) {
        this.propertyList = value;
    }

    /**
     * Ruft den Wert der groupedPropertyList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupedPropertyList }
     *     
     */
    public GroupedPropertyList getGroupedPropertyList() {
        return groupedPropertyList;
    }

    /**
     * Legt den Wert der groupedPropertyList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupedPropertyList }
     *     
     */
    public void setGroupedPropertyList(GroupedPropertyList value) {
        this.groupedPropertyList = value;
    }

    /**
     * Ruft den Wert der destinationArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DestinationAreaType }
     *     
     */
    public DestinationAreaType getDestinationArea() {
        return destinationArea;
    }

    /**
     * Legt den Wert der destinationArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationAreaType }
     *     
     */
    public void setDestinationArea(DestinationAreaType value) {
        this.destinationArea = value;
    }

    /**
     * Ruft den Wert der documentReferenceList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceList }
     *     
     */
    public DocumentReferenceList getDocumentReferenceList() {
        return documentReferenceList;
    }

    /**
     * Legt den Wert der documentReferenceList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceList }
     *     
     */
    public void setDocumentReferenceList(DocumentReferenceList value) {
        this.documentReferenceList = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="length" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
     *         &lt;element name="width" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
     *         &lt;element name="height" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
     *         &lt;element name="diameter" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
     *         &lt;element name="girth" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
     *         &lt;element name="addedEdgeLength" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}numericValueType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "length",
        "width",
        "height",
        "diameter",
        "girth",
        "addedEdgeLength"
    })
    public static class DimensionList {

        protected NumericValueType length;
        protected NumericValueType width;
        protected NumericValueType height;
        protected NumericValueType diameter;
        protected NumericValueType girth;
        protected NumericValueType addedEdgeLength;

        /**
         * Ruft den Wert der length-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link NumericValueType }
         *     
         */
        public NumericValueType getLength() {
            return length;
        }

        /**
         * Legt den Wert der length-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link NumericValueType }
         *     
         */
        public void setLength(NumericValueType value) {
            this.length = value;
        }

        /**
         * Ruft den Wert der width-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link NumericValueType }
         *     
         */
        public NumericValueType getWidth() {
            return width;
        }

        /**
         * Legt den Wert der width-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link NumericValueType }
         *     
         */
        public void setWidth(NumericValueType value) {
            this.width = value;
        }

        /**
         * Ruft den Wert der height-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link NumericValueType }
         *     
         */
        public NumericValueType getHeight() {
            return height;
        }

        /**
         * Legt den Wert der height-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link NumericValueType }
         *     
         */
        public void setHeight(NumericValueType value) {
            this.height = value;
        }

        /**
         * Ruft den Wert der diameter-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link NumericValueType }
         *     
         */
        public NumericValueType getDiameter() {
            return diameter;
        }

        /**
         * Legt den Wert der diameter-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link NumericValueType }
         *     
         */
        public void setDiameter(NumericValueType value) {
            this.diameter = value;
        }

        /**
         * Ruft den Wert der girth-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link NumericValueType }
         *     
         */
        public NumericValueType getGirth() {
            return girth;
        }

        /**
         * Legt den Wert der girth-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link NumericValueType }
         *     
         */
        public void setGirth(NumericValueType value) {
            this.girth = value;
        }

        /**
         * Ruft den Wert der addedEdgeLength-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link NumericValueType }
         *     
         */
        public NumericValueType getAddedEdgeLength() {
            return addedEdgeLength;
        }

        /**
         * Legt den Wert der addedEdgeLength-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link NumericValueType }
         *     
         */
        public void setAddedEdgeLength(NumericValueType value) {
            this.addedEdgeLength = value;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="documentReference" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}documentReferenceType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "documentReference"
    })
    public static class DocumentReferenceList {

        @XmlElement(required = true)
        protected List<DocumentReferenceType> documentReference;

        /**
         * Gets the value of the documentReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documentReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumentReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocumentReferenceType }
         * 
         * 
         */
        public List<DocumentReferenceType> getDocumentReference() {
            if (documentReference == null) {
                documentReference = new ArrayList<DocumentReferenceType>();
            }
            return this.documentReference;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="groupedProperty" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}groupedPropertyType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "groupedProperty"
    })
    public static class GroupedPropertyList {

        @XmlElement(required = true)
        protected List<GroupedPropertyType> groupedProperty;

        /**
         * Gets the value of the groupedProperty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the groupedProperty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGroupedProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GroupedPropertyType }
         * 
         * 
         */
        public List<GroupedPropertyType> getGroupedProperty() {
            if (groupedProperty == null) {
                groupedProperty = new ArrayList<GroupedPropertyType>();
            }
            return this.groupedProperty;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="property" type="{urn:www-deutschepost-de:Product/ProductInformation/1.1/common}propertyType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "property"
    })
    public static class PropertyList {

        @XmlElement(required = true)
        protected List<PropertyType> property;

        /**
         * Gets the value of the property property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the property property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PropertyType }
         * 
         * 
         */
        public List<PropertyType> getProperty() {
            if (property == null) {
                property = new ArrayList<PropertyType>();
            }
            return this.property;
        }

    }

}
