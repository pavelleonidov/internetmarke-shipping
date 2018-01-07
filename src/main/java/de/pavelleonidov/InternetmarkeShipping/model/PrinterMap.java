package de.pavelleonidov.InternetmarkeShipping.model;

public class PrinterMap {
    protected int identifier;
    protected String name;

    public PrinterMap(int identifier, String name) {
        setIdentifier(identifier);
        setName(name);
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
