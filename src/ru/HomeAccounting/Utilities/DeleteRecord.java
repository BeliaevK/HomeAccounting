package ru.HomeAccounting.Utilities;

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

    public ArrayList<?> deleteRecord (){
        return null;
    }
}
