package de.pavelleonidov.InternetmarkeShipping.service;

import de.pavelleonidov.InternetmarkeShipping.Main;
import de.pavelleonidov.InternetmarkeShipping.model.Settings;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

public class SettingsXmlService extends MarshalService<Settings> {
    private static final SettingsXmlService OBJ = new SettingsXmlService();

    public static SettingsXmlService getInstance() {
        return OBJ;
    }

    public SettingsXmlService() {
        setFileName(Main.getHomeDirectory() + "/settings.xml");
    }


    public void write(Settings f) {

        object = f;

        try {
            marshal();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public Settings read()  {
        return getObject();
    }

    protected Class getObjectClass() {
        return Settings.class;
    }
}
