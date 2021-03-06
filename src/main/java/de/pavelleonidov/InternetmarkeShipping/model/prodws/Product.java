package de.pavelleonidov.InternetmarkeShipping.model.prodws;

import de.pavelleonidov.InternetmarkeShipping.model.prodws.types.*;
import de.pavelleonidov.InternetmarkeShipping.model.prodws.list.*;
import de.pavelleonidov.InternetmarkeShipping.model.prodws.list.DimensionList;
import de.pavelleonidov.InternetmarkeShipping.model.prodws.list.DocumentReferenceList;
import de.pavelleonidov.InternetmarkeShipping.model.prodws.list.GroupedPropertyList;
import de.pavelleonidov.InternetmarkeShipping.model.prodws.list.PropertyList;
import de.pavelleonidov.InternetmarkeShipping.model.prodws.types.*;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

@XmlRootElement(name = "product")
@XmlAccessorType(XmlAccessType.FIELD)
public class Product {


    protected String prodWSId;
    protected String name;
    protected String shortName;
    protected String description;
    protected String annotation;
    protected String branche;
    protected String destination;
    protected String transport;
    protected String type;
    protected String state;
    protected String minLength;
    protected String maxLength;
    protected String minHeight;
    protected String maxHeight;
    protected String minWidth;
    protected String maxWidth;

    protected String minWeight;
    protected String maxWeight;

    protected boolean trackingPossible;
    protected String allowedForm;



    protected BigDecimal grossPriceValue;
    protected String grossPriceCurrency;
    protected boolean grossPriceCalculated;

    protected BigDecimal netPriceValue;
    protected String netPriceCurrency;
    protected boolean netPriceCalculated;


    protected ExtendedIdentifierType extendedIdentifier;
    protected UnitPriceType priceDefinition;
    protected SlidingPriceListType slidingPriceList;
    protected DimensionList dimensionList;
    protected NumericValueType weight;
    protected PropertyList propertyList;
    protected GroupedPropertyList groupedPropertyList;
    protected DestinationAreaType destinationArea;
    protected DocumentReferenceList documentReferenceList;

    protected String id;



    public ExtendedIdentifierType getExtendedIdentifier() {
        return extendedIdentifier;
    }

    public void setExtendedIdentifier(ExtendedIdentifierType extendedIdentifier) {
        this.extendedIdentifier = extendedIdentifier;
    }

    public UnitPriceType getPriceDefinition() {
        return priceDefinition;
    }

    public void setPriceDefinition(UnitPriceType priceDefinition) {
        this.priceDefinition = priceDefinition;
    }

    public SlidingPriceListType getSlidingPriceList() {
        return slidingPriceList;
    }

    public void setSlidingPriceList(SlidingPriceListType slidingPriceList) {
        this.slidingPriceList = slidingPriceList;
    }

    public DimensionList getDimensionList() {
        return dimensionList;
    }

    public void setDimensionList(DimensionList dimensionList) {
        this.dimensionList = dimensionList;
    }

    public NumericValueType getWeight() {
        return weight;
    }

    public void setWeight(NumericValueType weight) {
        this.weight = weight;
    }

    public PropertyList getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(PropertyList propertyList) {
        this.propertyList = propertyList;
    }

    public GroupedPropertyList getGroupedPropertyList() {
        return groupedPropertyList;
    }

    public void setGroupedPropertyList(GroupedPropertyList groupedPropertyList) {
        this.groupedPropertyList = groupedPropertyList;
    }

    public DestinationAreaType getDestinationArea() {
        return destinationArea;
    }

    public void setDestinationArea(DestinationAreaType destinationArea) {
        this.destinationArea = destinationArea;
    }

    public DocumentReferenceList getDocumentReferenceList() {
        return documentReferenceList;
    }

    public void setDocumentReferenceList(DocumentReferenceList documentReferenceList) {
        this.documentReferenceList = documentReferenceList;
    }

    public String getProdWSId() {
        return prodWSId;
    }

    public void setProdWSId(String prodWSId) {
        this.prodWSId = prodWSId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public String getBranche() {
        return branche;
    }

    public void setBranche(String branche) {
        this.branche = branche;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public BigDecimal getNetPriceValue() {
        return netPriceValue;
    }

    public void setNetPriceValue(BigDecimal netPriceValue) {
        this.netPriceValue = netPriceValue;
    }

    public String getNetPriceCurrency() {
        return netPriceCurrency;
    }

    public void setNetPriceCurrency(String netPriceCurrency) {
        this.netPriceCurrency = netPriceCurrency;
    }

    public boolean isNetPriceCalculated() {
        return netPriceCalculated;
    }

    public void setNetPriceCalculated(boolean netPriceCalculated) {
        this.netPriceCalculated = netPriceCalculated;
    }

    public BigDecimal getGrossPriceValue() {
        return grossPriceValue;
    }

    public void setGrossPriceValue(BigDecimal grossPriceValue) {
        this.grossPriceValue = grossPriceValue;
    }

    public String getGrossPriceCurrency() {
        return grossPriceCurrency;
    }

    public void setGrossPriceCurrency(String grossPriceCurrency) {
        this.grossPriceCurrency = grossPriceCurrency;
    }

    public boolean isGrossPriceCalculated() {
        return grossPriceCalculated;
    }

    public void setGrossPriceCalculated(boolean grossPriceCalculated) {
        this.grossPriceCalculated = grossPriceCalculated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMinLength() {
        return minLength;
    }

    public void setMinLength(String minLength) {
        this.minLength = minLength;
    }

    public String getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(String maxLength) {
        this.maxLength = maxLength;
    }

    public String getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(String minWeight) {
        this.minWeight = minWeight;
    }

    public String getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(String maxWeight) {
        this.maxWeight = maxWeight;
    }

    public boolean isTrackingPossible() {
        return trackingPossible;
    }

    public void setTrackingPossible(boolean trackingPossible) {
        this.trackingPossible = trackingPossible;
    }

    public String getAllowedForm() {
        return allowedForm;
    }

    public void setAllowedForm(String allowedForm) {
        this.allowedForm = allowedForm;
    }

    public String getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(String maxHeight) {
        this.maxHeight = maxHeight;
    }

    public String getMinHeight() {
        return minHeight;
    }

    public void setMinHeight(String minHeight) {
        this.minHeight = minHeight;
    }

    public String getMinWidth() {
        return minWidth;
    }

    public void setMinWidth(String minWidth) {
        this.minWidth = minWidth;
    }

    public String getMaxWidth() {
        return maxWidth;
    }

    public void setMaxWidth(String maxWidth) {
        this.maxWidth = maxWidth;
    }
}
