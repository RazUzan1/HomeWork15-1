package com.company;
import java.util.HashMap;
import java.util.Map;

public class Restaurant {
    String resName;
    HashMap<Ingredient, Double> ingredients;

    public Restaurant(String resName) {
        this.resName = resName;
        HashMap<Ingredient, Double> ingredients = new HashMap<>();
    }


    void addIngredient(Ingredient i, Double amount) {
        i = new Ingredient("2012", "בטטה", 11.90);
        ingredients.put(i, 3.5);
    }

    Double totalCost(){
        double sum = 0;
        for (Map.Entry<Ingredient, Double> i : ingredients.entrySet()) {
            sum += i.getKey().getIngPrice() * i.getValue();
        }

        return sum;
    }
    boolean isAvailable(Dish dish){
        for (Map.Entry<String, Double> i : dish.getIngredients().entrySet()){
            Ingredient temp = new Ingredient(null,"בקבוק קולה זכוכית", 8.0);
            if(ingredients.containsKey(temp)){
                return true;
            }
        }
        return false;
    }
}