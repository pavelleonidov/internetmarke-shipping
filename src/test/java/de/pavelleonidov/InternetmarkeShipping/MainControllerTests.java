package de.pavelleonidov.InternetmarkeShipping;

import de.pavelleonidov.InternetmarkeShipping.controller.MainController;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class MainControllerTests {
    @Test
    public void addressName() {
        MainController mainController = new MainController();

        String[] streets = {"Schubartstr. 2C", "Musterstr.23", "F3 6", "Beim Schwefelbad 30", "Schreiberskamp2", "Poelring 9", "Waldhofstraße 12", "Georg-Friedrich-Händel-Straße 23"};

        try {
            Method parseStreet = mainController.getClass().getDeclaredMethod("parseStreet", String.class);
            parseStreet.setAccessible(true);

            Method parseHouseNumber = mainController.getClass().getDeclaredMethod("parseHousenumber", String.class);
            parseHouseNumber.setAccessible(true);



            try {
                assertEquals("Schubartstr.", parseStreet.invoke(mainController, streets[0]));
                assertEquals("Musterstr.", parseStreet.invoke(mainController, streets[1]));
                assertEquals("F3", parseStreet.invoke(mainController, streets[2]));
                assertEquals("Beim Schwefelbad", parseStreet.invoke(mainController, streets[3]));
                assertEquals("Schreiberskamp", parseStreet.invoke(mainController, streets[4]));
                assertEquals("Poelring", parseStreet.invoke(mainController, streets[5]));
                assertEquals("Waldhofstraße", parseStreet.invoke(mainController, streets[6]));
                assertEquals("Georg-Friedrich-Händel-Straße", parseStreet.invoke(mainController, streets[7]));

                assertEquals("2C", parseHouseNumber.invoke(mainController, streets[0]));
                assertEquals("23", parseHouseNumber.invoke(mainController, streets[1]));
                assertEquals("6", parseHouseNumber.invoke(mainController, streets[2]));
                assertEquals("30", parseHouseNumber.invoke(mainController, streets[3]));
                assertEquals("2", parseHouseNumber.invoke(mainController, streets[4]));
                assertEquals("9", parseHouseNumber.invoke(mainController, streets[5]));
                assertEquals("12", parseHouseNumber.invoke(mainController, streets[6]));
                assertEquals("23", parseHouseNumber.invoke(mainController, streets[7]));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }


        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
