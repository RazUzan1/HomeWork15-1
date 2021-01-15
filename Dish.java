package com.company;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;

public class Dish {

    private String dishID;
    private String dishName;
    private Hashmap<String,Double> ingreidients;
    private int dishPrice;

    public Dish(String dishID,String dishName,Hashmap ingreidients,int dishPrice){

        this.dishID   =  dishID;
        this.dishName = dishName;
        this.ingreidients = ingreidients;
        this.dishPrice=dishPrice;
    }

    //מתודת get
    public String getDishID() {
        return dishID;
    }

    public String getDishName(){
        return dishName;
    }

    public Hashmap<String, Double> getIngreidients() {
        return ingreidients;
    }


    //מתודות set
    public String setDishid(){
        return dishID;
   }

    public String setDishName(){
        return dishName;
    }

    public Hashmap Hashmap<String, Double> setIngreidients{
        return ingreidients;
    }




    public double profit(){

    }


}

