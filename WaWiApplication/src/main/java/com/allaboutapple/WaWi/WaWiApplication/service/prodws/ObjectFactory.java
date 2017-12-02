
package com.allaboutapple.WaWi.WaWiApplication.service.prodws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.allaboutapple.WaWi.WaWiApplication.service.prodws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SeekProductVersionsRequest_QNAME = new QName("urn:www-deutschepost-de:Product/ProductInformation/1.1/common", "seekProductVersionsRequest");
    private final static QName _SalesProduct_QNAME = new QName("urn:www-deutschepost-de:Product/ProductInformation/1.1/common", "SalesProduct");
    private final static QName _GetProductVersionsListRequest_QNAME = new QName("urn:www-deutschepost-de:Product/ProductInformation/1.1/common", "getProductVersionsListRequest");
    private final static QName _GetProductVersionsRequest_QNAME = new QName("urn:www-deutschepost-de:Product/ProductInformation/1.1/common", "getProductVersionsRequest");
    private final static QName _RegisterEMailAdressRequest_QNAME = new QName("urn:www-deutschepost-de:Product/ProductInformation/1.1/common", "registerEMailAdressRequest");
    private final static QName _RegisterNotificationRequest_QNAME = new QName("urn:www-deutschepost-de:Product/ProductInformation/1.1/common", "registerNotificationRequest");
    private final static QName _GetCatalogChangeInformationRequest_QNAME = new QName("urn:www-deutschepost-de:Product/ProductInformation/1.1/common", "getCatalogChangeInformationRequest");
    private final static QName _GetCatalogListRequest_QNAME = new QName("urn:www-deutschepost-de:Product/ProductInformation/1.1/common", "getCatalogListRequest");
    private final static QName _AdditionalProduct_QNAME = new QName("urn:www-deutschepost-de:Product/ProductInformation/1.1/common", "AdditionalProduct");
    private final static QName _ShortSalesProduct_QNAME = new QName("urn:www-deutschepost-de:Product/ProductInformation/1.1/common", "ShortSalesProduct");
    private final static QName _GetProductRequest_QNAME = new QName("urn:www-deutschepost-de:Product/ProductInformation/1.1/common", "getProductRequest");
    private final static QName _GetProductListRequest_QNAME = new QName("urn:www-deutschepost-de:Product/ProductInformation/1.1/common", "getProductListRequest");
    private final static QName _GetCatalogRequest_QNAME = new QName("urn:www-deutschepost-de:Product/ProductInformation/1.1/common", "getCatalogRequest");
    private final static QName _BasicProduct_QNAME = new QName("urn:www-deutschepost-de:Product/ProductInformation/1.1/common", "BasicProduct");
    private final static QName _GetChangedProductVersionsListRequest_QNAME = new QName("urn:www-deutschepost-de:Product/ProductInformation/1.1/common", "getChangedProductVersionsListRequest");
    private final static QName _SeekProductRequest_QNAME = new QName("urn:www-deutschepost-de:Product/ProductInformation/1.1/common", "seekProductRequest");
    private final static QName _GetProductChangeInformationRequest_QNAME = new QName("urn:www-deutschepost-de:Product/ProductInformation/1.1/common", "getProductChangeInformationRequest");
    private final static QName _SpecialService_QNAME = new QName("urn:www-deutschepost-de:Product/ProductInformation/1.1/common", "SpecialService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.allaboutapple.WaWi.WaWiApplication.service.prodws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProductVersionsListRequestType }
     * 
     */
    public GetProductVersionsListRequestType createGetProductVersionsListRequestType() {
        return new GetProductVersionsListRequestType();
    }

    /**
     * Create an instance of {@link GetProductListRequestType }
     * 
     */
    public GetProductListRequestType createGetProductListRequestType() {
        return new GetProductListRequestType();
    }

    /**
     * Create an instance of {@link GetProductVersionsListResponse.Exception }
     * 
     */
    public GetProductVersionsListResponse.Exception createGetProductVersionsListResponseException() {
        return new GetProductVersionsListResponse.Exception();
    }

    /**
     * Create an instance of {@link ExceptionDetailType }
     * 
     */
    public ExceptionDetailType createExceptionDetailType() {
        return new ExceptionDetailType();
    }

    /**
     * Create an instance of {@link RegisterEMailAdressResponse.Exception }
     * 
     */
    public RegisterEMailAdressResponse.Exception createRegisterEMailAdressResponseException() {
        return new RegisterEMailAdressResponse.Exception();
    }

    /**
     * Create an instance of {@link GetProductVersionsResponse }
     * 
     */
    public GetProductVersionsResponse createGetProductVersionsResponse() {
        return new GetProductVersionsResponse();
    }

    /**
     * Create an instance of {@link SpecialDayType }
     * 
     */
    public SpecialDayType createSpecialDayType() {
        return new SpecialDayType();
    }

    /**
     * Create an instance of {@link TempUnitPriceType }
     * 
     */
    public TempUnitPriceType createTempUnitPriceType() {
        return new TempUnitPriceType();
    }

    /**
     * Create an instance of {@link BasicProductType.GroupedPropertyList }
     * 
     */
    public BasicProductType.GroupedPropertyList createBasicProductTypeGroupedPropertyList() {
        return new BasicProductType.GroupedPropertyList();
    }

    /**
     * Create an instance of {@link InternationalDestinationAreaType.ChargeZoneList }
     * 
     */
    public InternationalDestinationAreaType.ChargeZoneList createInternationalDestinationAreaTypeChargeZoneList() {
        return new InternationalDestinationAreaType.ChargeZoneList();
    }

    /**
     * Create an instance of {@link PriceDefinitionType }
     * 
     */
    public PriceDefinitionType createPriceDefinitionType() {
        return new PriceDefinitionType();
    }

    /**
     * Create an instance of {@link GetChangedProductVersionsListResponseType.BasicProductList }
     * 
     */
    public GetChangedProductVersionsListResponseType.BasicProductList createGetChangedProductVersionsListResponseTypeBasicProductList() {
        return new GetChangedProductVersionsListResponseType.BasicProductList();
    }

    /**
     * Create an instance of {@link CurrencyAmountType }
     * 
     */
    public CurrencyAmountType createCurrencyAmountType() {
        return new CurrencyAmountType();
    }

    /**
     * Create an instance of {@link AccountProdReferenceType }
     * 
     */
    public AccountProdReferenceType createAccountProdReferenceType() {
        return new AccountProdReferenceType();
    }

    /**
     * Create an instance of {@link ExternIdentifierType }
     * 
     */
    public ExternIdentifierType createExternIdentifierType() {
        return new ExternIdentifierType();
    }

    /**
     * Create an instance of {@link CatalogType.CatalogValueList }
     * 
     */
    public CatalogType.CatalogValueList createCatalogTypeCatalogValueList() {
        return new CatalogType.CatalogValueList();
    }

    /**
     * Create an instance of {@link GetProductVersionsResponseType.SalesProductList }
     * 
     */
    public GetProductVersionsResponseType.SalesProductList createGetProductVersionsResponseTypeSalesProductList() {
        return new GetProductVersionsResponseType.SalesProductList();
    }

    /**
     * Create an instance of {@link SeekProductVersionsResponseType }
     * 
     */
    public SeekProductVersionsResponseType createSeekProductVersionsResponseType() {
        return new SeekProductVersionsResponseType();
    }

    /**
     * Create an instance of {@link SpecialDayType.Region }
     * 
     */
    public SpecialDayType.Region createSpecialDayTypeRegion() {
        return new SpecialDayType.Region();
    }

    /**
     * Create an instance of {@link SeekProductRequestType.SearchParameterList }
     * 
     */
    public SeekProductRequestType.SearchParameterList createSeekProductRequestTypeSearchParameterList() {
        return new SeekProductRequestType.SearchParameterList();
    }

    /**
     * Create an instance of {@link SeekProductRequestType }
     * 
     */
    public SeekProductRequestType createSeekProductRequestType() {
        return new SeekProductRequestType();
    }

    /**
     * Create an instance of {@link SearchParameterType.ProductUsage }
     * 
     */
    public SearchParameterType.ProductUsage createSearchParameterTypeProductUsage() {
        return new SearchParameterType.ProductUsage();
    }

    /**
     * Create an instance of {@link CatalogValueType.PropertyList }
     * 
     */
    public CatalogValueType.PropertyList createCatalogValueTypePropertyList() {
        return new CatalogValueType.PropertyList();
    }

    /**
     * Create an instance of {@link FormulaExpressionType }
     * 
     */
    public FormulaExpressionType createFormulaExpressionType() {
        return new FormulaExpressionType();
    }

    /**
     * Create an instance of {@link AdditionalProductType.PropertyList }
     * 
     */
    public AdditionalProductType.PropertyList createAdditionalProductTypePropertyList() {
        return new AdditionalProductType.PropertyList();
    }

    /**
     * Create an instance of {@link DestinationAreaType }
     * 
     */
    public DestinationAreaType createDestinationAreaType() {
        return new DestinationAreaType();
    }

    /**
     * Create an instance of {@link RegisterNotificationResponseType }
     * 
     */
    public RegisterNotificationResponseType createRegisterNotificationResponseType() {
        return new RegisterNotificationResponseType();
    }

    /**
     * Create an instance of {@link GetProductVersionsResponseType.AdditionalProductList }
     * 
     */
    public GetProductVersionsResponseType.AdditionalProductList createGetProductVersionsResponseTypeAdditionalProductList() {
        return new GetProductVersionsResponseType.AdditionalProductList();
    }

    /**
     * Create an instance of {@link GetCatalogResponseType }
     * 
     */
    public GetCatalogResponseType createGetCatalogResponseType() {
        return new GetCatalogResponseType();
    }

    /**
     * Create an instance of {@link SalesProductType.DocumentReferenceList }
     * 
     */
    public SalesProductType.DocumentReferenceList createSalesProductTypeDocumentReferenceList() {
        return new SalesProductType.DocumentReferenceList();
    }

    /**
     * Create an instance of {@link CurrencyValueType }
     * 
     */
    public CurrencyValueType createCurrencyValueType() {
        return new CurrencyValueType();
    }

    /**
     * Create an instance of {@link InternationalDestinationAreaType.CountryGroupList }
     * 
     */
    public InternationalDestinationAreaType.CountryGroupList createInternationalDestinationAreaTypeCountryGroupList() {
        return new InternationalDestinationAreaType.CountryGroupList();
    }

    /**
     * Create an instance of {@link GroupedPropertyType.FormatedTextList }
     * 
     */
    public GroupedPropertyType.FormatedTextList createGroupedPropertyTypeFormatedTextList() {
        return new GroupedPropertyType.FormatedTextList();
    }

    /**
     * Create an instance of {@link GetProductVersionsListResponse }
     * 
     */
    public GetProductVersionsListResponse createGetProductVersionsListResponse() {
        return new GetProductVersionsListResponse();
    }

    /**
     * Create an instance of {@link SlidingPriceType }
     * 
     */
    public SlidingPriceType createSlidingPriceType() {
        return new SlidingPriceType();
    }

    /**
     * Create an instance of {@link SearchParameterType.ProductWeight }
     * 
     */
    public SearchParameterType.ProductWeight createSearchParameterTypeProductWeight() {
        return new SearchParameterType.ProductWeight();
    }

    /**
     * Create an instance of {@link SpecialServiceType.ServiceDayList }
     * 
     */
    public SpecialServiceType.ServiceDayList createSpecialServiceTypeServiceDayList() {
        return new SpecialServiceType.ServiceDayList();
    }

    /**
     * Create an instance of {@link GetCatalogResponse }
     * 
     */
    public GetCatalogResponse createGetCatalogResponse() {
        return new GetCatalogResponse();
    }

    /**
     * Create an instance of {@link ValidityType }
     * 
     */
    public ValidityType createValidityType() {
        return new ValidityType();
    }

    /**
     * Create an instance of {@link SearchParameterType.ProductName }
     * 
     */
    public SearchParameterType.ProductName createSearchParameterTypeProductName() {
        return new SearchParameterType.ProductName();
    }

    /**
     * Create an instance of {@link GetProductVersionsListResponseType.BasicProductList }
     * 
     */
    public GetProductVersionsListResponseType.BasicProductList createGetProductVersionsListResponseTypeBasicProductList() {
        return new GetProductVersionsListResponseType.BasicProductList();
    }

    /**
     * Create an instance of {@link SalesProductType.PropertyList }
     * 
     */
    public SalesProductType.PropertyList createSalesProductTypePropertyList() {
        return new SalesProductType.PropertyList();
    }

    /**
     * Create an instance of {@link ShortSalesProductType.PriceDefinition }
     * 
     */
    public ShortSalesProductType.PriceDefinition createShortSalesProductTypePriceDefinition() {
        return new ShortSalesProductType.PriceDefinition();
    }

    /**
     * Create an instance of {@link SearchParameterType.ProductDimensionList.ProductDimension.Dimension }
     * 
     */
    public SearchParameterType.ProductDimensionList.ProductDimension.Dimension createSearchParameterTypeProductDimensionListProductDimensionDimension() {
        return new SearchParameterType.ProductDimensionList.ProductDimension.Dimension();
    }

    /**
     * Create an instance of {@link SeekProductVersionsResponse }
     * 
     */
    public SeekProductVersionsResponse createSeekProductVersionsResponse() {
        return new SeekProductVersionsResponse();
    }

    /**
     * Create an instance of {@link RegisterEMailAdressRequestType.SubMandant }
     * 
     */
    public RegisterEMailAdressRequestType.SubMandant createRegisterEMailAdressRequestTypeSubMandant() {
        return new RegisterEMailAdressRequestType.SubMandant();
    }

    /**
     * Create an instance of {@link GetProductResponseType }
     * 
     */
    public GetProductResponseType createGetProductResponseType() {
        return new GetProductResponseType();
    }

    /**
     * Create an instance of {@link GroupedPropertyType.DocumentReferenceList }
     * 
     */
    public GroupedPropertyType.DocumentReferenceList createGroupedPropertyTypeDocumentReferenceList() {
        return new GroupedPropertyType.DocumentReferenceList();
    }

    /**
     * Create an instance of {@link SeekProductVersionsRequestType }
     * 
     */
    public SeekProductVersionsRequestType createSeekProductVersionsRequestType() {
        return new SeekProductVersionsRequestType();
    }

    /**
     * Create an instance of {@link ExtendedIdentifierType }
     * 
     */
    public ExtendedIdentifierType createExtendedIdentifierType() {
        return new ExtendedIdentifierType();
    }

    /**
     * Create an instance of {@link GetChangedProductVersionsListResponse.Exception }
     * 
     */
    public GetChangedProductVersionsListResponse.Exception createGetChangedProductVersionsListResponseException() {
        return new GetChangedProductVersionsListResponse.Exception();
    }

    /**
     * Create an instance of {@link GetProductListResponseType.SpecialServiceList }
     * 
     */
    public GetProductListResponseType.SpecialServiceList createGetProductListResponseTypeSpecialServiceList() {
        return new GetProductListResponseType.SpecialServiceList();
    }

    /**
     * Create an instance of {@link GetChangedProductVersionsListResponseType }
     * 
     */
    public GetChangedProductVersionsListResponseType createGetChangedProductVersionsListResponseType() {
        return new GetChangedProductVersionsListResponseType();
    }

    /**
     * Create an instance of {@link GetProductRequestType }
     * 
     */
    public GetProductRequestType createGetProductRequestType() {
        return new GetProductRequestType();
    }

    /**
     * Create an instance of {@link OperandType }
     * 
     */
    public OperandType createOperandType() {
        return new OperandType();
    }

    /**
     * Create an instance of {@link RegisterNotificationResponse }
     * 
     */
    public RegisterNotificationResponse createRegisterNotificationResponse() {
        return new RegisterNotificationResponse();
    }

    /**
     * Create an instance of {@link SearchParameterType.ProductValidity }
     * 
     */
    public SearchParameterType.ProductValidity createSearchParameterTypeProductValidity() {
        return new SearchParameterType.ProductValidity();
    }

    /**
     * Create an instance of {@link RegisterEMailAdressResponse }
     * 
     */
    public RegisterEMailAdressResponse createRegisterEMailAdressResponse() {
        return new RegisterEMailAdressResponse();
    }

    /**
     * Create an instance of {@link GetProductResponse.Exception }
     * 
     */
    public GetProductResponse.Exception createGetProductResponseException() {
        return new GetProductResponse.Exception();
    }

    /**
     * Create an instance of {@link GetCatalogChangeInformationResponseType }
     * 
     */
    public GetCatalogChangeInformationResponseType createGetCatalogChangeInformationResponseType() {
        return new GetCatalogChangeInformationResponseType();
    }

    /**
     * Create an instance of {@link GetProductVersionsListResponseType.AdditionalProductList }
     * 
     */
    public GetProductVersionsListResponseType.AdditionalProductList createGetProductVersionsListResponseTypeAdditionalProductList() {
        return new GetProductVersionsListResponseType.AdditionalProductList();
    }

    /**
     * Create an instance of {@link UnitPriceType.TempPriceList }
     * 
     */
    public UnitPriceType.TempPriceList createUnitPriceTypeTempPriceList() {
        return new UnitPriceType.TempPriceList();
    }

    /**
     * Create an instance of {@link GetProductChangeInformationRequestType }
     * 
     */
    public GetProductChangeInformationRequestType createGetProductChangeInformationRequestType() {
        return new GetProductChangeInformationRequestType();
    }

    /**
     * Create an instance of {@link SearchParameterType.ProductGroup }
     * 
     */
    public SearchParameterType.ProductGroup createSearchParameterTypeProductGroup() {
        return new SearchParameterType.ProductGroup();
    }

    /**
     * Create an instance of {@link SeekProductResponseType }
     * 
     */
    public SeekProductResponseType createSeekProductResponseType() {
        return new SeekProductResponseType();
    }

    /**
     * Create an instance of {@link DateValueType }
     * 
     */
    public DateValueType createDateValueType() {
        return new DateValueType();
    }

    /**
     * Create an instance of {@link SearchParameterType.ProductDimensionList.ProductDimension }
     * 
     */
    public SearchParameterType.ProductDimensionList.ProductDimension createSearchParameterTypeProductDimensionListProductDimension() {
        return new SearchParameterType.ProductDimensionList.ProductDimension();
    }

    /**
     * Create an instance of {@link RegisterEMailAdressResponseType }
     * 
     */
    public RegisterEMailAdressResponseType createRegisterEMailAdressResponseType() {
        return new RegisterEMailAdressResponseType();
    }

    /**
     * Create an instance of {@link GetCatalogChangeInformationResponse.Exception }
     * 
     */
    public GetCatalogChangeInformationResponse.Exception createGetCatalogChangeInformationResponseException() {
        return new GetCatalogChangeInformationResponse.Exception();
    }

    /**
     * Create an instance of {@link GetProductListResponseType.SalesProductList }
     * 
     */
    public GetProductListResponseType.SalesProductList createGetProductListResponseTypeSalesProductList() {
        return new GetProductListResponseType.SalesProductList();
    }

    /**
     * Create an instance of {@link PropertyValueType }
     * 
     */
    public PropertyValueType createPropertyValueType() {
        return new PropertyValueType();
    }

    /**
     * Create an instance of {@link SeekProductVersionsResponseType.SalesProduct }
     * 
     */
    public SeekProductVersionsResponseType.SalesProduct createSeekProductVersionsResponseTypeSalesProduct() {
        return new SeekProductVersionsResponseType.SalesProduct();
    }

    /**
     * Create an instance of {@link PriceType }
     * 
     */
    public PriceType createPriceType() {
        return new PriceType();
    }

    /**
     * Create an instance of {@link GetProductVersionsResponseType.ShortSalesProductList }
     * 
     */
    public GetProductVersionsResponseType.ShortSalesProductList createGetProductVersionsResponseTypeShortSalesProductList() {
        return new GetProductVersionsResponseType.ShortSalesProductList();
    }

    /**
     * Create an instance of {@link GetCatalogChangeInformationRequestType }
     * 
     */
    public GetCatalogChangeInformationRequestType createGetCatalogChangeInformationRequestType() {
        return new GetCatalogChangeInformationRequestType();
    }

    /**
     * Create an instance of {@link WeightType }
     * 
     */
    public WeightType createWeightType() {
        return new WeightType();
    }

    /**
     * Create an instance of {@link SeekProductResponseType.SalesProduct }
     * 
     */
    public SeekProductResponseType.SalesProduct createSeekProductResponseTypeSalesProduct() {
        return new SeekProductResponseType.SalesProduct();
    }

    /**
     * Create an instance of {@link GetProductVersionsResponseType.BasicProductList }
     * 
     */
    public GetProductVersionsResponseType.BasicProductList createGetProductVersionsResponseTypeBasicProductList() {
        return new GetProductVersionsResponseType.BasicProductList();
    }

    /**
     * Create an instance of {@link GetCatalogListResponse }
     * 
     */
    public GetCatalogListResponse createGetCatalogListResponse() {
        return new GetCatalogListResponse();
    }

    /**
     * Create an instance of {@link GetProductChangeInformationResponse.Exception }
     * 
     */
    public GetProductChangeInformationResponse.Exception createGetProductChangeInformationResponseException() {
        return new GetProductChangeInformationResponse.Exception();
    }

    /**
     * Create an instance of {@link RegisterNotificationRequestType }
     * 
     */
    public RegisterNotificationRequestType createRegisterNotificationRequestType() {
        return new RegisterNotificationRequestType();
    }

    /**
     * Create an instance of {@link GetProductListResponse.Exception }
     * 
     */
    public GetProductListResponse.Exception createGetProductListResponseException() {
        return new GetProductListResponse.Exception();
    }

    /**
     * Create an instance of {@link GroupedPropertyType }
     * 
     */
    public GroupedPropertyType createGroupedPropertyType() {
        return new GroupedPropertyType();
    }

    /**
     * Create an instance of {@link ShortProductIdentifierType }
     * 
     */
    public ShortProductIdentifierType createShortProductIdentifierType() {
        return new ShortProductIdentifierType();
    }

    /**
     * Create an instance of {@link SalesProductType.StampTypeList }
     * 
     */
    public SalesProductType.StampTypeList createSalesProductTypeStampTypeList() {
        return new SalesProductType.StampTypeList();
    }

    /**
     * Create an instance of {@link GetCatalogResponse.Exception }
     * 
     */
    public GetCatalogResponse.Exception createGetCatalogResponseException() {
        return new GetCatalogResponse.Exception();
    }

    /**
     * Create an instance of {@link BasicProductType.DocumentReferenceList }
     * 
     */
    public BasicProductType.DocumentReferenceList createBasicProductTypeDocumentReferenceList() {
        return new BasicProductType.DocumentReferenceList();
    }

    /**
     * Create an instance of {@link CountryType }
     * 
     */
    public CountryType createCountryType() {
        return new CountryType();
    }

    /**
     * Create an instance of {@link GetProductListResponseType.BasicProductList }
     * 
     */
    public GetProductListResponseType.BasicProductList createGetProductListResponseTypeBasicProductList() {
        return new GetProductListResponseType.BasicProductList();
    }

    /**
     * Create an instance of {@link GetProductChangeInformationResponseType }
     * 
     */
    public GetProductChangeInformationResponseType createGetProductChangeInformationResponseType() {
        return new GetProductChangeInformationResponseType();
    }

    /**
     * Create an instance of {@link SeekProductVersionsRequestType.SearchParameterList }
     * 
     */
    public SeekProductVersionsRequestType.SearchParameterList createSeekProductVersionsRequestTypeSearchParameterList() {
        return new SeekProductVersionsRequestType.SearchParameterList();
    }

    /**
     * Create an instance of {@link GetCatalogListResponseType }
     * 
     */
    public GetCatalogListResponseType createGetCatalogListResponseType() {
        return new GetCatalogListResponseType();
    }

    /**
     * Create an instance of {@link InternationalDestinationAreaType.CountryNegativList }
     * 
     */
    public InternationalDestinationAreaType.CountryNegativList createInternationalDestinationAreaTypeCountryNegativList() {
        return new InternationalDestinationAreaType.CountryNegativList();
    }

    /**
     * Create an instance of {@link SearchParameterType.ProductCategory }
     * 
     */
    public SearchParameterType.ProductCategory createSearchParameterTypeProductCategory() {
        return new SearchParameterType.ProductCategory();
    }

    /**
     * Create an instance of {@link SpecialServiceType.PropertyList }
     * 
     */
    public SpecialServiceType.PropertyList createSpecialServiceTypePropertyList() {
        return new SpecialServiceType.PropertyList();
    }

    /**
     * Create an instance of {@link SearchParameterType.ProductPrice }
     * 
     */
    public SearchParameterType.ProductPrice createSearchParameterTypeProductPrice() {
        return new SearchParameterType.ProductPrice();
    }

    /**
     * Create an instance of {@link CountrySpecificPropertyType }
     * 
     */
    public CountrySpecificPropertyType createCountrySpecificPropertyType() {
        return new CountrySpecificPropertyType();
    }

    /**
     * Create an instance of {@link NationalZipCodeGroupType }
     * 
     */
    public NationalZipCodeGroupType createNationalZipCodeGroupType() {
        return new NationalZipCodeGroupType();
    }

    /**
     * Create an instance of {@link CatalogValueType }
     * 
     */
    public CatalogValueType createCatalogValueType() {
        return new CatalogValueType();
    }

    /**
     * Create an instance of {@link GetProductVersionsRequestType }
     * 
     */
    public GetProductVersionsRequestType createGetProductVersionsRequestType() {
        return new GetProductVersionsRequestType();
    }

    /**
     * Create an instance of {@link GetChangedProductVersionsListResponseType.SpecialServiceList }
     * 
     */
    public GetChangedProductVersionsListResponseType.SpecialServiceList createGetChangedProductVersionsListResponseTypeSpecialServiceList() {
        return new GetChangedProductVersionsListResponseType.SpecialServiceList();
    }

    /**
     * Create an instance of {@link GetChangedProductVersionsListResponseType.AdditionalProductList }
     * 
     */
    public GetChangedProductVersionsListResponseType.AdditionalProductList createGetChangedProductVersionsListResponseTypeAdditionalProductList() {
        return new GetChangedProductVersionsListResponseType.AdditionalProductList();
    }

    /**
     * Create an instance of {@link GetProductVersionsListResponseType.ShortSalesProductList }
     * 
     */
    public GetProductVersionsListResponseType.ShortSalesProductList createGetProductVersionsListResponseTypeShortSalesProductList() {
        return new GetProductVersionsListResponseType.ShortSalesProductList();
    }

    /**
     * Create an instance of {@link SlidingPriceListType }
     * 
     */
    public SlidingPriceListType createSlidingPriceListType() {
        return new SlidingPriceListType();
    }

    /**
     * Create an instance of {@link SpecialServiceType.ExclusionDayList }
     * 
     */
    public SpecialServiceType.ExclusionDayList createSpecialServiceTypeExclusionDayList() {
        return new SpecialServiceType.ExclusionDayList();
    }

    /**
     * Create an instance of {@link GetProductListResponseType }
     * 
     */
    public GetProductListResponseType createGetProductListResponseType() {
        return new GetProductListResponseType();
    }

    /**
     * Create an instance of {@link SpecialServiceType }
     * 
     */
    public SpecialServiceType createSpecialServiceType() {
        return new SpecialServiceType();
    }

    /**
     * Create an instance of {@link SeekProductVersionsResponse.Exception }
     * 
     */
    public SeekProductVersionsResponse.Exception createSeekProductVersionsResponseException() {
        return new SeekProductVersionsResponse.Exception();
    }

    /**
     * Create an instance of {@link DocumentReferenceType }
     * 
     */
    public DocumentReferenceType createDocumentReferenceType() {
        return new DocumentReferenceType();
    }

    /**
     * Create an instance of {@link SearchParameterType.Branch }
     * 
     */
    public SearchParameterType.Branch createSearchParameterTypeBranch() {
        return new SearchParameterType.Branch();
    }

    /**
     * Create an instance of {@link SalesProductType.CountrySpecificPropertyList }
     * 
     */
    public SalesProductType.CountrySpecificPropertyList createSalesProductTypeCountrySpecificPropertyList() {
        return new SalesProductType.CountrySpecificPropertyList();
    }

    /**
     * Create an instance of {@link TextBlockType }
     * 
     */
    public TextBlockType createTextBlockType() {
        return new TextBlockType();
    }

    /**
     * Create an instance of {@link SearchParameterType.ProductPropertyList.Property }
     * 
     */
    public SearchParameterType.ProductPropertyList.Property createSearchParameterTypeProductPropertyListProperty() {
        return new SearchParameterType.ProductPropertyList.Property();
    }

    /**
     * Create an instance of {@link SalesProductType.UsageList }
     * 
     */
    public SalesProductType.UsageList createSalesProductTypeUsageList() {
        return new SalesProductType.UsageList();
    }

    /**
     * Create an instance of {@link NationalZipCodeListType }
     * 
     */
    public NationalZipCodeListType createNationalZipCodeListType() {
        return new NationalZipCodeListType();
    }

    /**
     * Create an instance of {@link PropertyType }
     * 
     */
    public PropertyType createPropertyType() {
        return new PropertyType();
    }

    /**
     * Create an instance of {@link SearchParameterType.ProductStampType }
     * 
     */
    public SearchParameterType.ProductStampType createSearchParameterTypeProductStampType() {
        return new SearchParameterType.ProductStampType();
    }

    /**
     * Create an instance of {@link TempPriceType }
     * 
     */
    public TempPriceType createTempPriceType() {
        return new TempPriceType();
    }

    /**
     * Create an instance of {@link GetProductVersionsResponseType.SpecialServiceList }
     * 
     */
    public GetProductVersionsResponseType.SpecialServiceList createGetProductVersionsResponseTypeSpecialServiceList() {
        return new GetProductVersionsResponseType.SpecialServiceList();
    }

    /**
     * Create an instance of {@link GetProductListResponse }
     * 
     */
    public GetProductListResponse createGetProductListResponse() {
        return new GetProductListResponse();
    }

    /**
     * Create an instance of {@link GetChangedProductVersionsListRequestType }
     * 
     */
    public GetChangedProductVersionsListRequestType createGetChangedProductVersionsListRequestType() {
        return new GetChangedProductVersionsListRequestType();
    }

    /**
     * Create an instance of {@link AccountProdReferenceType.CountryNegativList }
     * 
     */
    public AccountProdReferenceType.CountryNegativList createAccountProdReferenceTypeCountryNegativList() {
        return new AccountProdReferenceType.CountryNegativList();
    }

    /**
     * Create an instance of {@link RegisterEMailAdressRequestType }
     * 
     */
    public RegisterEMailAdressRequestType createRegisterEMailAdressRequestType() {
        return new RegisterEMailAdressRequestType();
    }

    /**
     * Create an instance of {@link GetCatalogListRequestType }
     * 
     */
    public GetCatalogListRequestType createGetCatalogListRequestType() {
        return new GetCatalogListRequestType();
    }

    /**
     * Create an instance of {@link GetProductListResponseType.ShortSalesProductList }
     * 
     */
    public GetProductListResponseType.ShortSalesProductList createGetProductListResponseTypeShortSalesProductList() {
        return new GetProductListResponseType.ShortSalesProductList();
    }

    /**
     * Create an instance of {@link SearchParameterType.AdditionalProductList }
     * 
     */
    public SearchParameterType.AdditionalProductList createSearchParameterTypeAdditionalProductList() {
        return new SearchParameterType.AdditionalProductList();
    }

    /**
     * Create an instance of {@link TimestampType }
     * 
     */
    public TimestampType createTimestampType() {
        return new TimestampType();
    }

    /**
     * Create an instance of {@link PriceFormulaType }
     * 
     */
    public PriceFormulaType createPriceFormulaType() {
        return new PriceFormulaType();
    }

    /**
     * Create an instance of {@link SearchParameterType.CountryList }
     * 
     */
    public SearchParameterType.CountryList createSearchParameterTypeCountryList() {
        return new SearchParameterType.CountryList();
    }

    /**
     * Create an instance of {@link BasicProductType }
     * 
     */
    public BasicProductType createBasicProductType() {
        return new BasicProductType();
    }

    /**
     * Create an instance of {@link GetProductVersionsResponse.Exception }
     * 
     */
    public GetProductVersionsResponse.Exception createGetProductVersionsResponseException() {
        return new GetProductVersionsResponse.Exception();
    }

    /**
     * Create an instance of {@link GetCatalogListResponse.Exception }
     * 
     */
    public GetCatalogListResponse.Exception createGetCatalogListResponseException() {
        return new GetCatalogListResponse.Exception();
    }

    /**
     * Create an instance of {@link ChargeZoneType }
     * 
     */
    public ChargeZoneType createChargeZoneType() {
        return new ChargeZoneType();
    }

    /**
     * Create an instance of {@link PriceOperandType }
     * 
     */
    public PriceOperandType createPriceOperandType() {
        return new PriceOperandType();
    }

    /**
     * Create an instance of {@link CatalogType }
     * 
     */
    public CatalogType createCatalogType() {
        return new CatalogType();
    }

    /**
     * Create an instance of {@link TextRowType }
     * 
     */
    public TextRowType createTextRowType() {
        return new TextRowType();
    }

    /**
     * Create an instance of {@link FormatedTextType }
     * 
     */
    public FormatedTextType createFormatedTextType() {
        return new FormatedTextType();
    }

    /**
     * Create an instance of {@link GetProductVersionsListResponseType.SpecialServiceList }
     * 
     */
    public GetProductVersionsListResponseType.SpecialServiceList createGetProductVersionsListResponseTypeSpecialServiceList() {
        return new GetProductVersionsListResponseType.SpecialServiceList();
    }

    /**
     * Create an instance of {@link DimensionType }
     * 
     */
    public DimensionType createDimensionType() {
        return new DimensionType();
    }

    /**
     * Create an instance of {@link SalesProductType.AccountServiceReferenceList }
     * 
     */
    public SalesProductType.AccountServiceReferenceList createSalesProductTypeAccountServiceReferenceList() {
        return new SalesProductType.AccountServiceReferenceList();
    }

    /**
     * Create an instance of {@link SalesProductType.CategoryList }
     * 
     */
    public SalesProductType.CategoryList createSalesProductTypeCategoryList() {
        return new SalesProductType.CategoryList();
    }

    /**
     * Create an instance of {@link FormulaComponentType }
     * 
     */
    public FormulaComponentType createFormulaComponentType() {
        return new FormulaComponentType();
    }

    /**
     * Create an instance of {@link GetProductVersionsListResponseType.SalesProductList }
     * 
     */
    public GetProductVersionsListResponseType.SalesProductList createGetProductVersionsListResponseTypeSalesProductList() {
        return new GetProductVersionsListResponseType.SalesProductList();
    }

    /**
     * Create an instance of {@link AdditionalProductType.DocumentReferenceList }
     * 
     */
    public AdditionalProductType.DocumentReferenceList createAdditionalProductTypeDocumentReferenceList() {
        return new AdditionalProductType.DocumentReferenceList();
    }

    /**
     * Create an instance of {@link ShortSalesProductType }
     * 
     */
    public ShortSalesProductType createShortSalesProductType() {
        return new ShortSalesProductType();
    }

    /**
     * Create an instance of {@link SalesProductType.DimensionList }
     * 
     */
    public SalesProductType.DimensionList createSalesProductTypeDimensionList() {
        return new SalesProductType.DimensionList();
    }

    /**
     * Create an instance of {@link SearchParameterType }
     * 
     */
    public SearchParameterType createSearchParameterType() {
        return new SearchParameterType();
    }

    /**
     * Create an instance of {@link InternationalDestinationAreaType.CountryList }
     * 
     */
    public InternationalDestinationAreaType.CountryList createInternationalDestinationAreaTypeCountryList() {
        return new InternationalDestinationAreaType.CountryList();
    }

    /**
     * Create an instance of {@link GetProductChangeInformationResponse }
     * 
     */
    public GetProductChangeInformationResponse createGetProductChangeInformationResponse() {
        return new GetProductChangeInformationResponse();
    }

    /**
     * Create an instance of {@link SearchParameterType.ProductPropertyList }
     * 
     */
    public SearchParameterType.ProductPropertyList createSearchParameterTypeProductPropertyList() {
        return new SearchParameterType.ProductPropertyList();
    }

    /**
     * Create an instance of {@link GroupedPropertyType.PropertyList }
     * 
     */
    public GroupedPropertyType.PropertyList createGroupedPropertyTypePropertyList() {
        return new GroupedPropertyType.PropertyList();
    }

    /**
     * Create an instance of {@link GetProductVersionsListResponseType }
     * 
     */
    public GetProductVersionsListResponseType createGetProductVersionsListResponseType() {
        return new GetProductVersionsListResponseType();
    }

    /**
     * Create an instance of {@link AdditionalProductType }
     * 
     */
    public AdditionalProductType createAdditionalProductType() {
        return new AdditionalProductType();
    }

    /**
     * Create an instance of {@link RegisterNotificationResponse.Exception }
     * 
     */
    public RegisterNotificationResponse.Exception createRegisterNotificationResponseException() {
        return new RegisterNotificationResponse.Exception();
    }

    /**
     * Create an instance of {@link UnitPriceType }
     * 
     */
    public UnitPriceType createUnitPriceType() {
        return new UnitPriceType();
    }

    /**
     * Create an instance of {@link GetCatalogListResponseType.CatalogList }
     * 
     */
    public GetCatalogListResponseType.CatalogList createGetCatalogListResponseTypeCatalogList() {
        return new GetCatalogListResponseType.CatalogList();
    }

    /**
     * Create an instance of {@link GetCatalogChangeInformationResponse }
     * 
     */
    public GetCatalogChangeInformationResponse createGetCatalogChangeInformationResponse() {
        return new GetCatalogChangeInformationResponse();
    }

    /**
     * Create an instance of {@link CountryGroupType }
     * 
     */
    public CountryGroupType createCountryGroupType() {
        return new CountryGroupType();
    }

    /**
     * Create an instance of {@link NumericValueType }
     * 
     */
    public NumericValueType createNumericValueType() {
        return new NumericValueType();
    }

    /**
     * Create an instance of {@link GetProductListResponseType.AdditionalProductList }
     * 
     */
    public GetProductListResponseType.AdditionalProductList createGetProductListResponseTypeAdditionalProductList() {
        return new GetProductListResponseType.AdditionalProductList();
    }

    /**
     * Create an instance of {@link SeekProductResponse }
     * 
     */
    public SeekProductResponse createSeekProductResponse() {
        return new SeekProductResponse();
    }

    /**
     * Create an instance of {@link GetChangedProductVersionsListResponse }
     * 
     */
    public GetChangedProductVersionsListResponse createGetChangedProductVersionsListResponse() {
        return new GetChangedProductVersionsListResponse();
    }

    /**
     * Create an instance of {@link GetProductResponse }
     * 
     */
    public GetProductResponse createGetProductResponse() {
        return new GetProductResponse();
    }

    /**
     * Create an instance of {@link InternationalDestinationAreaType }
     * 
     */
    public InternationalDestinationAreaType createInternationalDestinationAreaType() {
        return new InternationalDestinationAreaType();
    }

    /**
     * Create an instance of {@link NationalZipCodeGroupType.NationalZipCodeArea }
     * 
     */
    public NationalZipCodeGroupType.NationalZipCodeArea createNationalZipCodeGroupTypeNationalZipCodeArea() {
        return new NationalZipCodeGroupType.NationalZipCodeArea();
    }

    /**
     * Create an instance of {@link SpecialServiceType.GroupedPropertyList }
     * 
     */
    public SpecialServiceType.GroupedPropertyList createSpecialServiceTypeGroupedPropertyList() {
        return new SpecialServiceType.GroupedPropertyList();
    }

    /**
     * Create an instance of {@link GetCatalogRequestType }
     * 
     */
    public GetCatalogRequestType createGetCatalogRequestType() {
        return new GetCatalogRequestType();
    }

    /**
     * Create an instance of {@link SearchParameterType.CountryGroupList }
     * 
     */
    public SearchParameterType.CountryGroupList createSearchParameterTypeCountryGroupList() {
        return new SearchParameterType.CountryGroupList();
    }

    /**
     * Create an instance of {@link SearchParameterType.ChargeZoneList }
     * 
     */
    public SearchParameterType.ChargeZoneList createSearchParameterTypeChargeZoneList() {
        return new SearchParameterType.ChargeZoneList();
    }

    /**
     * Create an instance of {@link GetProductVersionsResponseType }
     * 
     */
    public GetProductVersionsResponseType createGetProductVersionsResponseType() {
        return new GetProductVersionsResponseType();
    }

    /**
     * Create an instance of {@link SalesProductType }
     * 
     */
    public SalesProductType createSalesProductType() {
        return new SalesProductType();
    }

    /**
     * Create an instance of {@link NationalDestinationAreaType }
     * 
     */
    public NationalDestinationAreaType createNationalDestinationAreaType() {
        return new NationalDestinationAreaType();
    }

    /**
     * Create an instance of {@link BasicProductType.DimensionList }
     * 
     */
    public BasicProductType.DimensionList createBasicProductTypeDimensionList() {
        return new BasicProductType.DimensionList();
    }

    /**
     * Create an instance of {@link RegisterNotificationRequestType.SubMandant }
     * 
     */
    public RegisterNotificationRequestType.SubMandant createRegisterNotificationRequestTypeSubMandant() {
        return new RegisterNotificationRequestType.SubMandant();
    }

    /**
     * Create an instance of {@link SearchParameterType.ProductID }
     * 
     */
    public SearchParameterType.ProductID createSearchParameterTypeProductID() {
        return new SearchParameterType.ProductID();
    }

    /**
     * Create an instance of {@link GetChangedProductVersionsListResponseType.SalesProductList }
     * 
     */
    public GetChangedProductVersionsListResponseType.SalesProductList createGetChangedProductVersionsListResponseTypeSalesProductList() {
        return new GetChangedProductVersionsListResponseType.SalesProductList();
    }

    /**
     * Create an instance of {@link SalesProductType.GroupedPropertyList }
     * 
     */
    public SalesProductType.GroupedPropertyList createSalesProductTypeGroupedPropertyList() {
        return new SalesProductType.GroupedPropertyList();
    }

    /**
     * Create an instance of {@link BasicProductType.PropertyList }
     * 
     */
    public BasicProductType.PropertyList createBasicProductTypePropertyList() {
        return new BasicProductType.PropertyList();
    }

    /**
     * Create an instance of {@link AlphanumericValueType }
     * 
     */
    public AlphanumericValueType createAlphanumericValueType() {
        return new AlphanumericValueType();
    }

    /**
     * Create an instance of {@link AdditionalProductType.GroupedPropertyList }
     * 
     */
    public AdditionalProductType.GroupedPropertyList createAdditionalProductTypeGroupedPropertyList() {
        return new AdditionalProductType.GroupedPropertyList();
    }

    /**
     * Create an instance of {@link SalesProductType.ReferenceTextList }
     * 
     */
    public SalesProductType.ReferenceTextList createSalesProductTypeReferenceTextList() {
        return new SalesProductType.ReferenceTextList();
    }

    /**
     * Create an instance of {@link SalesProductType.AccountProductReferenceList }
     * 
     */
    public SalesProductType.AccountProductReferenceList createSalesProductTypeAccountProductReferenceList() {
        return new SalesProductType.AccountProductReferenceList();
    }

    /**
     * Create an instance of {@link SearchParameterType.ProductDimensionList }
     * 
     */
    public SearchParameterType.ProductDimensionList createSearchParameterTypeProductDimensionList() {
        return new SearchParameterType.ProductDimensionList();
    }

    /**
     * Create an instance of {@link PriceDefinitionType.TempPriceList }
     * 
     */
    public PriceDefinitionType.TempPriceList createPriceDefinitionTypeTempPriceList() {
        return new PriceDefinitionType.TempPriceList();
    }

    /**
     * Create an instance of {@link SeekProductResponse.Exception }
     * 
     */
    public SeekProductResponse.Exception createSeekProductResponseException() {
        return new SeekProductResponse.Exception();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeekProductVersionsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:www-deutschepost-de:Product/ProductInformation/1.1/common", name = "seekProductVersionsRequest")
    public JAXBElement<SeekProductVersionsRequestType> createSeekProductVersionsRequest(SeekProductVersionsRequestType value) {
        return new JAXBElement<SeekProductVersionsRequestType>(_SeekProductVersionsRequest_QNAME, SeekProductVersionsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesProductType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:www-deutschepost-de:Product/ProductInformation/1.1/common", name = "SalesProduct")
    public JAXBElement<SalesProductType> createSalesProduct(SalesProductType value) {
        return new JAXBElement<SalesProductType>(_SalesProduct_QNAME, SalesProductType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductVersionsListRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:www-deutschepost-de:Product/ProductInformation/1.1/common", name = "getProductVersionsListRequest")
    public JAXBElement<GetProductVersionsListRequestType> createGetProductVersionsListRequest(GetProductVersionsListRequestType value) {
        return new JAXBElement<GetProductVersionsListRequestType>(_GetProductVersionsListRequest_QNAME, GetProductVersionsListRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductVersionsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:www-deutschepost-de:Product/ProductInformation/1.1/common", name = "getProductVersionsRequest")
    public JAXBElement<GetProductVersionsRequestType> createGetProductVersionsRequest(GetProductVersionsRequestType value) {
        return new JAXBElement<GetProductVersionsRequestType>(_GetProductVersionsRequest_QNAME, GetProductVersionsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterEMailAdressRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:www-deutschepost-de:Product/ProductInformation/1.1/common", name = "registerEMailAdressRequest")
    public JAXBElement<RegisterEMailAdressRequestType> createRegisterEMailAdressRequest(RegisterEMailAdressRequestType value) {
        return new JAXBElement<RegisterEMailAdressRequestType>(_RegisterEMailAdressRequest_QNAME, RegisterEMailAdressRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterNotificationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:www-deutschepost-de:Product/ProductInformation/1.1/common", name = "registerNotificationRequest")
    public JAXBElement<RegisterNotificationRequestType> createRegisterNotificationRequest(RegisterNotificationRequestType value) {
        return new JAXBElement<RegisterNotificationRequestType>(_RegisterNotificationRequest_QNAME, RegisterNotificationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatalogChangeInformationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:www-deutschepost-de:Product/ProductInformation/1.1/common", name = "getCatalogChangeInformationRequest")
    public JAXBElement<GetCatalogChangeInformationRequestType> createGetCatalogChangeInformationRequest(GetCatalogChangeInformationRequestType value) {
        return new JAXBElement<GetCatalogChangeInformationRequestType>(_GetCatalogChangeInformationRequest_QNAME, GetCatalogChangeInformationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatalogListRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:www-deutschepost-de:Product/ProductInformation/1.1/common", name = "getCatalogListRequest")
    public JAXBElement<GetCatalogListRequestType> createGetCatalogListRequest(GetCatalogListRequestType value) {
        return new JAXBElement<GetCatalogListRequestType>(_GetCatalogListRequest_QNAME, GetCatalogListRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalProductType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:www-deutschepost-de:Product/ProductInformation/1.1/common", name = "AdditionalProduct")
    public JAXBElement<AdditionalProductType> createAdditionalProduct(AdditionalProductType value) {
        return new JAXBElement<AdditionalProductType>(_AdditionalProduct_QNAME, AdditionalProductType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShortSalesProductType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:www-deutschepost-de:Product/ProductInformation/1.1/common", name = "ShortSalesProduct")
    public JAXBElement<ShortSalesProductType> createShortSalesProduct(ShortSalesProductType value) {
        return new JAXBElement<ShortSalesProductType>(_ShortSalesProduct_QNAME, ShortSalesProductType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:www-deutschepost-de:Product/ProductInformation/1.1/common", name = "getProductRequest")
    public JAXBElement<GetProductRequestType> createGetProductRequest(GetProductRequestType value) {
        return new JAXBElement<GetProductRequestType>(_GetProductRequest_QNAME, GetProductRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductListRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:www-deutschepost-de:Product/ProductInformation/1.1/common", name = "getProductListRequest")
    public JAXBElement<GetProductListRequestType> createGetProductListRequest(GetProductListRequestType value) {
        return new JAXBElement<GetProductListRequestType>(_GetProductListRequest_QNAME, GetProductListRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatalogRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:www-deutschepost-de:Product/ProductInformation/1.1/common", name = "getCatalogRequest")
    public JAXBElement<GetCatalogRequestType> createGetCatalogRequest(GetCatalogRequestType value) {
        return new JAXBElement<GetCatalogRequestType>(_GetCatalogRequest_QNAME, GetCatalogRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasicProductType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:www-deutschepost-de:Product/ProductInformation/1.1/common", name = "BasicProduct")
    public JAXBElement<BasicProductType> createBasicProduct(BasicProductType value) {
        return new JAXBElement<BasicProductType>(_BasicProduct_QNAME, BasicProductType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChangedProductVersionsListRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:www-deutschepost-de:Product/ProductInformation/1.1/common", name = "getChangedProductVersionsListRequest")
    public JAXBElement<GetChangedProductVersionsListRequestType> createGetChangedProductVersionsListRequest(GetChangedProductVersionsListRequestType value) {
        return new JAXBElement<GetChangedProductVersionsListRequestType>(_GetChangedProductVersionsListRequest_QNAME, GetChangedProductVersionsListRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeekProductRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:www-deutschepost-de:Product/ProductInformation/1.1/common", name = "seekProductRequest")
    public JAXBElement<SeekProductRequestType> createSeekProductRequest(SeekProductRequestType value) {
        return new JAXBElement<SeekProductRequestType>(_SeekProductRequest_QNAME, SeekProductRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductChangeInformationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:www-deutschepost-de:Product/ProductInformation/1.1/common", name = "getProductChangeInformationRequest")
    public JAXBElement<GetProductChangeInformationRequestType> createGetProductChangeInformationRequest(GetProductChangeInformationRequestType value) {
        return new JAXBElement<GetProductChangeInformationRequestType>(_GetProductChangeInformationRequest_QNAME, GetProductChangeInformationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecialServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:www-deutschepost-de:Product/ProductInformation/1.1/common", name = "SpecialService")
    public JAXBElement<SpecialServiceType> createSpecialService(SpecialServiceType value) {
        return new JAXBElement<SpecialServiceType>(_SpecialService_QNAME, SpecialServiceType.class, null, value);
    }

}
