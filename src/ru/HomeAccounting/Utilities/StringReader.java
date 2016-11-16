package ru.HomeAccounting.Utilities;

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

    public static ArrayList<?> orderRead() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean isCorrectOrder = false;
        while (!isCorrectOrder) {
            String readLine = reader.readLine();
            if (checkOrderFieldsIsCorrect(readLine)) {
                switch (readLine) {
                    case "c":
                        CreateRecord.getInstance().createRecord();
                        break;
                    case "r":
                        ReadRecord.getInstance().readRecord();
                        break;
                    case "u":
                        UpdateRecord.getInstance().updateRecord();
                        break;
                    case "d":
                        DeleteRecord.getInstance().deleteRecord();
                        break;
                }
            } else System.out.println("Неверный запрос. Пример: \n c - создать запись, r - просмотреть список, u - " +
                    "обновить запись, d - удалить запись");
        }
        return null;
    }

    private static boolean checkOrderFieldsIsCorrect(String readLine) {
        boolean isCorrect = true;
        if (!readLine.equals("c") || !readLine.equals("r")|| !readLine.equals("u")|| !readLine.equals("d")) isCorrect = false;
        return isCorrect;
    }

}
