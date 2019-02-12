package de.pavelleonidov.InternetmarkeShipping.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import de.felixroske.jfxsupport.FXMLController;
import de.pavelleonidov.InternetmarkeShipping.Main;
import io.swagger.client.ApiException;
import io.swagger.client.api.SalesOrderAddressRepositoryV1Api;

import io.swagger.client.model.CustomerDataAddressInterface;
import io.swagger.client.model.CustomerDataCustomerInterface;
import io.swagger.client.model.SalesDataOrderAddressInterface;
import io.swagger.client.model.SalesOrderRepositoryV1SavePutBody;
import javafx.event.Event;
import javafx.fxml.FXML;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

@FXMLController
public class CustomerAddressController {

    @FXML
    private JFXTextField inputForename;

    @FXML
    private JFXTextField inputLastname;

    @FXML
    private JFXTextField inputAddress;

    @FXML
    private JFXTextField inputZip;

    @FXML
    private JFXTextField inputCity;

    @FXML
    private JFXTextField inputCountrycode;

    @FXML
    private JFXTextField inputCompany;

    @FXML
    private JFXTextField inputEmail;

    @FXML
    private JFXButton saveButton;



    @FXML
    public void initialize() {

        refreshCurrentOrder();
    }

    public void updateShipmentAddress(final Event e) {



       // io.swagger.client.api.CustomerCustomerRepositoryV1Api customer = new io.swagger.client.api.CustomerCustomerRepositoryV1Api();
        io.swagger.client.api.SalesOrderAddressRepositoryV1Api customerAddress = new SalesOrderAddressRepositoryV1Api();

        customerAddress.getApiClient().setAccessToken(SettingsController.getSettings().getMagento2AccessToken());
        customerAddress.getApiClient().setBasePath(SettingsController.getSettings().getMagento2ApiUrl());
        customerAddress.getApiClient().getHttpClient().setReadTimeout(30, TimeUnit.SECONDS);

        io.swagger.client.model.SalesDataOrderInterface currentOrder =  MainController.getCurrentOrder().get();
        io.swagger.client.model.SalesDataOrderAddressInterface address = currentOrder.getExtensionAttributes().getShippingAssignments().get(0).getShipping().getAddress();

        io.swagger.client.model.SalesOrderAddressRepositoryV1SavePutBody attributes = new io.swagger.client.model.SalesOrderAddressRepositoryV1SavePutBody();

      //  io.swagger.client.model.CustomerDataAddressInterface customerAddress = new CustomerDataAddressInterface();

        io.swagger.client.model.SalesDataOrderAddressInterface shippingAddress = new SalesDataOrderAddressInterface();

        shippingAddress.setFirstname(inputForename.getText());
        shippingAddress.setLastname(inputLastname.getText());
        shippingAddress.setStreet(Collections.singletonList(inputAddress.getText()));
        shippingAddress.setPostcode(inputZip.getText());
        shippingAddress.setCountryId(inputCountrycode.getText());
        shippingAddress.setTelephone(address.getTelephone());
        shippingAddress.setCity(inputCity.getText());
        shippingAddress.setAddressType(address.getAddressType());
        shippingAddress.setCompany(inputCompany.getText());
        shippingAddress.setEmail(inputEmail.getText());
        shippingAddress.setCustomerAddressId(address.getCustomerAddressId());
        shippingAddress.setCustomerId(address.getCustomerId());
        shippingAddress.setEntityId(address.getEntityId());
        shippingAddress.setParentId(address.getParentId());
        shippingAddress.setVatId(address.getVatId());
        shippingAddress.setVatIsValid(address.getVatIsValid());
        shippingAddress.setVatRequestDate(address.getVatRequestDate());
        shippingAddress.setVatRequestId(address.getVatRequestId());
        shippingAddress.setVatRequestSuccess(address.getVatRequestSuccess());

        attributes.setEntity(shippingAddress);


        try {
            System.out.println(MainController.getCurrentOrder().get().getCustomerId());
           // customer.customerCustomerRepositoryV1SavePut(MainController.getCurrentOrder().get().getCustomerId().toString(), attributes);
            customerAddress.salesOrderAddressRepositoryV1SavePut(address.getParentId().toString(), attributes);

        } catch (ApiException e1) {
            System.out.println(e1.getResponseBody());
        }

    }

    protected void refreshCurrentOrder() {
        io.swagger.client.model.SalesDataOrderInterface currentOrder = MainController.getCurrentOrder().get();

        io.swagger.client.model.SalesDataOrderAddressInterface address = currentOrder.getExtensionAttributes().getShippingAssignments().get(0).getShipping().getAddress();

        inputForename.setText(address.getFirstname());
        inputLastname.setText(address.getLastname());
        inputAddress.setText(address.getStreet().get(0));
        inputZip.setText(address.getPostcode());
        inputCity.setText(address.getCity());
        inputCountrycode.setText(address.getCountryId());
        inputCompany.setText(address.getCompany());
        inputEmail.setText(address.getEmail());


    }
}
