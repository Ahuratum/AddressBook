package com.example.addressbook;

import java.util.Comparator;

public class PersonContact extends BaseContact{

    private int age;

    public PersonContact(String name, int id, String location, String phoneNumber, String email, String image, int age) {

        super(name, id, location, phoneNumber, email, image);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Comparator<PersonContact> humanAgeAscendingCompare = new Comparator<PersonContact>() {
        @Override
        public int compare(PersonContact h1, PersonContact h2) {

            // Compare two human contacts by age ascending order
            return h1.getAge() - h2.getAge();
        }
    };
    public static Comparator<PersonContact> humanAgeDescendingCompare = new Comparator<PersonContact>() {
        @Override
        public int compare(PersonContact h1, PersonContact h2) {

            // Compare two human contacts by age descending order
            return h2.getAge() - h1.getAge();
        }
    };

    @Override
    public String toString() {
        return "PersonContact{" +
                "age=" + age +
                "} " + super.toString();
    }
}
