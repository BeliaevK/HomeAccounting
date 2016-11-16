package ru.HomeAccounting.Utilities;

import ru.HomeAccounting.Entities.HomeAccounting;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by k.beliaev on 16.11.2016.
 */
public class Initialization {
    private static Initialization instance;

    public static Initialization getInstance() {
        if (instance == null) {
            instance = new Initialization();
        }
        return instance;
    }

    public static ArrayList<HomeAccounting> initHomeAccArray() {
        ArrayList<HomeAccounting> homeAccArray = new ArrayList<HomeAccounting>();
            homeAccArray.add(new HomeAccounting(1, "Хлеб" , HomeAccounting.TypeCosts.PRODUCTS,20, new Date(116,11,10)));
            homeAccArray.add(new HomeAccounting(2, "Молоко" , HomeAccounting.TypeCosts.PRODUCTS,30, new Date(116,11,11)));
            homeAccArray.add(new HomeAccounting(3, "Куртка" , HomeAccounting.TypeCosts.CLOTHES,5500, new Date(116,11,12)));
            homeAccArray.add(new HomeAccounting(4, "Оплата за квартиру" , HomeAccounting.TypeCosts.RENT,3600, new Date(116,11,13)));
            homeAccArray.add(new HomeAccounting(5, "Кино" , HomeAccounting.TypeCosts.ENTERTAIMENT,250, new Date(116,11,14)));
            homeAccArray.add(new HomeAccounting(6, "Пицца" , HomeAccounting.TypeCosts.PRODUCTS,500, new Date(116,11,15)));
            homeAccArray.add(new HomeAccounting(7, "Футболка" , HomeAccounting.TypeCosts.CLOTHES,400, new Date(116,11,15)));
            homeAccArray.add(new HomeAccounting(8, "Джинсы" , HomeAccounting.TypeCosts.CLOTHES,1250, new Date(116,11,15)));
        return homeAccArray;
    }
}
