package ru.HomeAccounting.Utilities;

import ru.HomeAccounting.Entities.HomeAccounting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
    public ArrayList<HomeAccounting> readRecord(ArrayList<HomeAccounting> homeAccountingArrayList) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вывод списка: all - вывести все записи");
        String[] recordField = reader.readLine().split("\\|");
        if (checkOrderFieldsIsCorrect(recordField)) {
            homeAccountingArrayList.forEach(System.out::println);
        }
        else {
            System.out.println("Неверный формат записи. Пример: \n all - вывести все записи");
        }
        return homeAccountingArrayList;
    }

    private static boolean checkOrderFieldsIsCorrect(String[] recordField) {
        boolean isCorrect = false;
        if (recordField[0].equals("all")) isCorrect = true;
        return isCorrect;
    }
}
