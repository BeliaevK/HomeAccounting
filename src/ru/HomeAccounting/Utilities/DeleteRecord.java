package ru.HomeAccounting.Utilities;

import ru.HomeAccounting.Entities.HomeAccounting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

    public ArrayList<HomeAccounting> deleteRecord (ArrayList<HomeAccounting> homeAccountingArrayList) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Укажите идентификатор для удаления записи");
        try{
            homeAccountingArrayList.remove((Integer.parseInt(reader.readLine()))-1);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("");
        }
        return homeAccountingArrayList;
    }


}
