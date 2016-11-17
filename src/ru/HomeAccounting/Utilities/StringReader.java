package ru.HomeAccounting.Utilities;

import ru.HomeAccounting.Entities.HomeAccounting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by k.beliaev on 16.11.2016.
 */
public class StringReader {
    private static StringReader instance;

    public static StringReader getInstance() {
        if (instance == null) {
            instance = new StringReader();
        }
        return instance;
    }

    public static ArrayList<HomeAccounting> orderRead(ArrayList<HomeAccounting> homeAccountingArrayList) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String readLine = reader.readLine();
            if (checkOrderFieldsIsCorrect(readLine)) {
                switch (readLine) {
                    case "c":
                        CreateRecord.getInstance().createRecord(homeAccountingArrayList);
                        break;
                    case "r":
                        ReadRecord.getInstance().readRecord(homeAccountingArrayList);
                        break;
                    case "u":
                        UpdateRecord.getInstance().updateRecord(homeAccountingArrayList);
                        break;
                    case "d":
                        DeleteRecord.getInstance().deleteRecord(homeAccountingArrayList);
                        break;
                }
            } else {
                System.out.println("Неверный запрос. Пример: \n c - создать запись, r - просмотреть список, u - " +
                    "обновить запись, d - удалить запись");
            }
        return homeAccountingArrayList;
    }

    private static boolean checkOrderFieldsIsCorrect(String readLine) {
        boolean isCorrect = false;
        if (readLine.equals("c") || readLine.equals("r")|| readLine.equals("u")|| readLine.equals("d")) isCorrect = true;
        return isCorrect;
    }

}
