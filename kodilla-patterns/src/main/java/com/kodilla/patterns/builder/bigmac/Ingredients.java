package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Ingredients {
    public static final String LETTUCE = "LETTUCE";
    public static final String ONION = "ONION";
    public static final String BACON = "BACON";
    public static final String CUCUMBER = "CUCUMBER";
    public static final String CHILIPEPPER = "CHILI PEPPER";
    public static final String CHAMPIGNON = "CHAMPIGNON";
    public static final String SHRIMP = "SHRIMP";
    public static final String CHEESE = "CHEESE";

    final private List<String> ingredients = new ArrayList<>();
    private String ingredient;

    public void addIngredients(String ingredient) {
        if (ingredient.equals(LETTUCE) || ingredient.equals(ONION) || ingredient.equals(BACON)|| ingredient.equals(CUCUMBER)|| ingredient.equals(CHILIPEPPER)|| ingredient.equals(CHAMPIGNON)|| ingredient.equals(SHRIMP)|| ingredient.equals(CHEESE)) {
            ingredients.add(ingredient);
        } else {
            throw new IllegalStateException("You cannot add this ingredient to your Bigmac!");
        }
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Ingredients{" +
                "ingredients=" + ingredients +
                '}';
    }
}
