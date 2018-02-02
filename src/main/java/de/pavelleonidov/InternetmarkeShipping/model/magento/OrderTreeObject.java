package de.pavelleonidov.InternetmarkeShipping.model.magento;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import de.pavelleonidov.InternetmarkeShipping.controller.MainController;
import de.pavelleonidov.InternetmarkeShipping.controller.SettingsController;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import org.springframework.core.annotation.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class OrderTreeObject extends TreeObject<OrderTreeObject> {

    io.swagger.client.model.SalesDataOrderInterface responseOrder;

    public OrderTreeObject(io.swagger.client.model.SalesDataOrderInterface order) {

        super();
        responseOrder = order;

        io.swagger.client.model.SalesDataOrderAddressInterface address = responseOrder.getExtensionAttributes().getShippingAssignments().get(0).getShipping().getAddress();


        setOrderId(order.getIncrementId());
        setCustomerName(address.getFirstname() + " " + address.getLastname());
        setStatus(order.getStatus());

        String paymentMethod = order.getPayment().getMethod();
        String formattedPaymentMethod = order.getPayment().getAdditionalInformation().get(0);
        String channel = "Magento";

        if(paymentMethod.equals("m2epropayment")) {
            List<String> additionalPaymentInformation = order.getPayment().getAdditionalInformation();

            channel = additionalPaymentInformation.get(0);
            formattedPaymentMethod = additionalPaymentInformation.get(1);
        }


        setChannelAccountName("");

        // This column is relevant for M2EPro connector in order to display the eBay / Amazon customer account name in the tree view
        if(order.getCustomerId() != null) {

            try {
                io.swagger.client.model.CustomerDataCustomerInterface customerInterface = MainController.getCustomerRepositoryApi().customerCustomerRepositoryV1GetByIdGet(order.getCustomerId());

                List<io.swagger.client.model.FrameworkAttributeInterface> customAttributes = customerInterface.getCustomAttributes();

                if(customAttributes.size() > 1) {
                    // Take eBay account name
                    if(customAttributes.get(1).getAttributeCode().equals("ebay_user_id")) {
                        setChannelAccountName(customAttributes.get(1).getValue());
                    }
                }


            } catch (io.swagger.client.ApiException e) {
                e.printStackTrace();
            }

        }

        setChannel(channel);
        setPaymentMethod(formattedPaymentMethod);
        setCreatedAt(order.getCreatedAt());
        setFirstItem(order.getItems().get(0).getName());

    }


    public StringProperty getOrderId() {
        return getProperty("orderId");
    }

    public void setOrderId(String orderId) {
        setProperty("orderId", orderId);
    }

    public StringProperty getCustomerName() {
        return getProperty("customerName");
    }

    public void setCustomerName(String customerName) {
        setProperty("customerName", customerName);
    }

    public StringProperty getChannelAccountName() {
        return getProperty("channelAccountName");
    }

    public void setChannelAccountName(String channelAccountName) {
        setProperty("channelAccountName", channelAccountName);
    }

    public StringProperty getStatus() {
        return getProperty("status");
    }

    public void setStatus(String status) {
        setProperty("status", status);
    }

    public StringProperty getChannel() {
        return getProperty("channel");
    }

    public void setChannel(String channel) {
        setProperty("channel", channel);
    }

    public StringProperty getPaymentMethod() {
        return getProperty("paymentMethod");
    }

    public void setPaymentMethod(String paymentMethod) {
        setProperty("paymentMethod", paymentMethod);
    }

    public StringProperty getCreatedAt() {
        return getProperty("createdAt");
    }

    public void setCreatedAt(String createdAt) {
        setProperty("createdAt", createdAt);
    }

    public StringProperty getFirstItem() { return getProperty("firstItem"); }

    public void setFirstItem(String firstItem) { setProperty("firstItem", firstItem); }

    public io.swagger.client.model.SalesDataOrderInterface getResponseOrder() {
        return responseOrder;
    }
}
