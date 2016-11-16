package ru.HomeAccounting.Entities;

import java.util.Date;

/**
 * Created by k.beliaev on 16.11.2016.
 */
public class HomeAccounting {
    private int id;
    private String name;
    private int sum;
    private Date date;

    public enum TypeCosts {
        PRODUCTS , CLOTHES , RENT, ENTERTAIMENT }

    public HomeAccounting(int id, String name, TypeCosts typeCosts, int sum, Date date) {
        this.setId(id);
        this.setName(name);
        this.setSum(sum);
        this.setDate(date);
/*        typeCosts = typeCosts;*/
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
