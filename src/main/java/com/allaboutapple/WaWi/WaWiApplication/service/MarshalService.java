package com.allaboutapple.WaWi.WaWiApplication.service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

abstract public class MarshalService<T> {
    protected T object;
    protected String fileName;


    protected T getObject() {
        if(object == null) {
            try {
                object = unmarshal();
            } catch(JAXBException e) {
                e.printStackTrace();
            }

        }
        return object;
    }

    protected T unmarshal() throws JAXBException {

        JAXBContext jaxbContext = JAXBContext.newInstance(getObjectClass());
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        //We had written this file in marshalling example
        T result = (T) jaxbUnmarshaller.unmarshal( new File(fileName));
        return result;

    }

    protected void marshal() throws JAXBException {
        File file = new File(fileName);
        JAXBContext jaxbContext = JAXBContext.newInstance(getObjectClass());
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        // output pretty printed
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(object, file);
        jaxbMarshaller.marshal(object, System.out);
    }

    protected abstract Class getObjectClass();

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
