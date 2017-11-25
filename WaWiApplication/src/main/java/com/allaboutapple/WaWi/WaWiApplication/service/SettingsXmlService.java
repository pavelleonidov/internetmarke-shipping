package com.allaboutapple.WaWi.WaWiApplication.service;

import com.allaboutapple.WaWi.WaWiApplication.model.Settings;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

public class SettingsXmlService {
    private static final SettingsXmlService OBJ = new SettingsXmlService();

    public static SettingsXmlService getInstance() {
        return OBJ;
    }

    public void write(Settings f, String filename) throws Exception{

        XMLEncoder encoder =
                new XMLEncoder(
                        new BufferedOutputStream(
                                new FileOutputStream(filename)));
        encoder.writeObject(f);
        encoder.close();
    }

    public Settings read(String filename) throws Exception {
        XMLDecoder decoder =
                new XMLDecoder(new BufferedInputStream(
                        new FileInputStream(filename)));
        Settings o = (Settings)decoder.readObject();
        decoder.close();
        return o;
    }
}
