package ru.HomeAccounting.Utilities;

import ru.HomeAccounting.Entities.HomeAccounting;

import java.util.ArrayList;

/**
 * Created by k.beliaev on 16.11.2016.
 */
public class CreateRecord {
    private static CreateRecord instance;

    public static CreateRecord getInstance() {
        if (instance == null) {
            instance = new CreateRecord();
        }
        return instance;
    }

    public ArrayList <HomeAccounting> createRecord (){

        return null;
    }
}
