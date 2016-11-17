package ru.HomeAccounting.Utilities;

import ru.HomeAccounting.Entities.HomeAccounting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;

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

    public ArrayList <HomeAccounting> createRecord (ArrayList<HomeAccounting> homeAccountingArrayList) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Создание записи: Наименование | Тип | Цена");
            String[] recordField = reader.readLine().split("\\|");
            if (checkOrderFieldsIsCorrect(recordField)) {
                homeAccountingArrayList.add(new HomeAccounting(homeAccountingArrayList.size() + 1, recordField[0],
                    HomeAccounting.TypeCosts.valueOf(recordField[1]), Integer.parseInt(recordField[2]), new Date()));
            }
            else {
                System.out.println("Неверный формат записи. Пример: \n Наименование | Тип | Цена");
            }
            return homeAccountingArrayList;
    }

        private static boolean checkOrderFieldsIsCorrect(String[] recordField) {
            boolean isCorrect = true;
            if (recordField.length < 3 || recordField.length > 3) isCorrect = false;
            return isCorrect;
        }
}




