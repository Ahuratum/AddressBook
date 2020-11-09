package com.example.addressbook;

import java.util.Comparator;

public class BusinessContact extends BaseContact{

    private String websiteUrl;
    private String openingTime;
    private String closingTime;

    public BusinessContact (String name, int id, String location, String phoneNumber, String email, String image,String websiteUrl, String openingTime, String closingTime) {
        super(name, id, location, phoneNumber, email, image);
        this.websiteUrl = websiteUrl;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    public String getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime;
    }

    @Override
    public String toString() {
        return "BusinessContact{" +
                "websiteUrl='" + websiteUrl + '\'' +
                ", openingTime='" + openingTime + '\'' +
                ", closingTime='" + closingTime + '\'' +
                "} " + super.toString();
    }
}
