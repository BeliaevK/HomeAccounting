package ru.HomeAccounting.Utilities;

import ru.HomeAccounting.Entities.HomeAccounting;

import java.util.ArrayList;

/**
 * Created by k.beliaev on 16.11.2016.
 */
public class DeleteRecord {
    private static DeleteRecord instance;

    public static DeleteRecord getInstance() {
        if (instance == null) {
            instance = new DeleteRecord();
        }
        return instance;
    }

    public ArrayList<HomeAccounting> deleteRecord (){
        return null;
    }
}
