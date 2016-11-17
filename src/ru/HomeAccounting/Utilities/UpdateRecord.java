package ru.HomeAccounting.Utilities;

import ru.HomeAccounting.Entities.HomeAccounting;

import java.util.ArrayList;

/**
 * Created by k.beliaev on 16.11.2016.
 */
public class UpdateRecord {
    private static UpdateRecord instance;

    public static UpdateRecord getInstance() {
        if (instance == null) {
            instance = new UpdateRecord();
        }
        return instance;
    }

    public ArrayList<HomeAccounting> updateRecord(ArrayList<HomeAccounting> homeAccountingArrayList){
        return null;
    }
}
