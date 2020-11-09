package com.example.addressbook;

import java.util.Comparator;

public abstract class BaseContact {

    private String name;
    private int id;
    private String phoneNumber;
    private String email;
    private String location;
    private String image;

    public BaseContact(String name, int id, String location, String phoneNumber, String email, String image) {

        //instantiate  constructor variables
        this.name = name;
        this.id = id;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public static Comparator<BaseContact> humanNameAZCompare = new Comparator<BaseContact>() {
        @Override
        public int compare(BaseContact h1, BaseContact h2) {

            // Compare human contacts by name alphabetical order
            return h1.getName().compareTo(h2.getName());
        }
    };
    public static Comparator<BaseContact> humanNameZACompare = new Comparator<BaseContact>() {
        @Override
        public int compare(BaseContact h1, BaseContact h2) {

            // Compare human contacts by name reverse alphabetical order
            return h2.getName().compareTo(h1.getName());
        }
    };

    @Override
    public String toString() {
        return "BaseContact{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}



