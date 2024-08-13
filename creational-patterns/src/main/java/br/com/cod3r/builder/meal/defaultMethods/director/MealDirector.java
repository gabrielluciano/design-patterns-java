package br.com.cod3r.builder.meal.defaultMethods.director;

import br.com.cod3r.builder.meal.defaultMethods.builder.FastFoodMealBuilder;
import br.com.cod3r.builder.meal.defaultMethods.model.FastFoodMeal;

public class MealDirector {

    private final FastFoodMealBuilder builder;

    public MealDirector(FastFoodMealBuilder builder) {
        this.builder = builder;
    }

    public void constructCombo() {
        builder.buildDrink();
        builder.buildMain();
        builder.buildSide();
        builder.buildDessert();
        builder.buildGift();
    }

    public FastFoodMeal getCombo() {
        return builder.getMeal();
    }
}
