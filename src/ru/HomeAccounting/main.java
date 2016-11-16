package ru.HomeAccounting;

import ru.HomeAccounting.Entities.HomeAccounting;
import ru.HomeAccounting.Utilities.Initialization;
import ru.HomeAccounting.Utilities.StringReader;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by k.beliaev on 16.11.2016.
 */
public class main {
    public static void main(String[] args) throws IOException {
        ArrayList<HomeAccounting> homeAccountingArrayList = Initialization.getInstance().initHomeAccArray();
        while (true) {
            for (int i = 0; i < homeAccountingArrayList.size(); i++) {
                System.out.println(homeAccountingArrayList.get(i));
            }
            StringReader.getInstance().orderRead();
        }
    }
}
