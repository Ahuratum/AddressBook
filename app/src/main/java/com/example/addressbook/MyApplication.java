package com.example.addressbook;

import android.app.Application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyApplication extends Application {

    private static List<BaseContact> contacts = new ArrayList<BaseContact>();
    private static int nextId = 5;

    public MyApplication() {
        contactsList();
    }

    private void contactsList() {


        //contacts.addAll(Arrays.asList(new BaseContact[] {baseContact0});
    }

    public static List<BaseContact> getHumanList() {
        return contacts;
    }

    public static void setHumanList(List<BaseContact> humanArrayList) {
        MyApplication.contacts = humanArrayList;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        MyApplication.nextId = nextId;
    }
}
