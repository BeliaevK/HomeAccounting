package ru.HomeAccounting.Utilities;

import java.util.ArrayList;

/**
 * Created by k.beliaev on 16.11.2016.
 */
public class ReadRecord {
    private static ReadRecord instance;

    public static ReadRecord getInstance() {
        if (instance == null) {
            instance = new ReadRecord();
        }
        return instance;
    }
    public ArrayList<?> readRecord(){
        return null;
    }
}
