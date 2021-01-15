package com.company;

public class Ingredient {
    private String ingID;
    private String ingName;
    private Double ingPrice;

    public Ingredient(String ingID,String ingName,Double ingPrice){

     this.ingID=ingID;
     this.ingName=ingName;
     this.ingPrice=ingPrice;
    }

    //מתודות get
    public String getIngID(){
        return getIngID();
       }

    public String getIngName(){
        return ingName;
    }

    public Double getIngPrice(){
        return ingPrice;
    }


   //מתודות set

    public String setIngID(){
        return ingID;
    }

    public String setIngName(){
        return ingName;
    }

    public Double setIngPrice(){
        return ingPrice;
    }

}
