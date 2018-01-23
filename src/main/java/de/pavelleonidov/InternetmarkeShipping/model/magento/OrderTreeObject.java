package de.pavelleonidov.InternetmarkeShipping.model.magento;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import org.springframework.core.annotation.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
