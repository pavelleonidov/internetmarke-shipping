package com.allaboutapple.WaWi.WaWiApplication.utility.handler.soap;

import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Set;

public class SOAPMessageWriterHandler implements SOAPHandler<SOAPMessageContext> {

    public boolean handleMessage(SOAPMessageContext smc) {

        Boolean outboundProperty = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        SOAPMessage message = smc.getMessage();

        try {
            if (!outboundProperty.booleanValue()) {
                System.out.println("SOAP Response : ");
                message.writeTo(System.out);
            } else {
                System.out.println("SOAP Request : ");
                message.writeTo(System.out);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return outboundProperty;
    }

    public Set getHeaders() {
        return null;
    }

    public boolean handleFault(SOAPMessageContext context) {
        return true;
    }

    public void close(MessageContext context) {
    }


}