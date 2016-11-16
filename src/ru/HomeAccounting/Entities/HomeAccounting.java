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
    private TypeCosts typeCosts;


    public enum TypeCosts {
        PRODUCTS , CLOTHES , RENT, ENTERTAIMENT }

    public HomeAccounting(int id, String name, TypeCosts typeCosts, int sum, Date date) {
        this.setId(id);
        this.setName(name);
        this.setSum(sum);
        this.setDate(date);
        this.setTypeCosts(typeCosts);
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

    public TypeCosts getTypeCosts() {
        return typeCosts;
    }

    public void setTypeCosts(TypeCosts typeCosts) {
        this.typeCosts = typeCosts;
    }


    @Override
    public String toString() {
        return this.id + ", Наименование: " + this.name + ", тип: " + this.typeCosts + ", цена: " + this.sum + ", дата: " + this.date;
    }
}
