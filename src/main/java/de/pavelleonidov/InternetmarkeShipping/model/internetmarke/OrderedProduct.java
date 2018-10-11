package de.pavelleonidov.InternetmarkeShipping.model.internetmarke;

public class OrderedProduct {
    protected String orderId;
    protected String link;
    protected String trackId;
    protected Boolean isTrackingPossible;
    protected String targetFileName;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackid) {
        this.trackId = trackid;
    }

    public String getTargetFileName() {
        return targetFileName;
    }

    public void setTargetFileName(String targetFileName) {
        this.targetFileName = targetFileName;
    }

    public Boolean isTrackingPossible() {
        return isTrackingPossible;
    }

    public void setTrackingPossible(Boolean trackingPossible) {
        isTrackingPossible = trackingPossible;
    }
}
