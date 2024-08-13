package br.com.cod3r.builder.meal.defaultMethods.builder;

import br.com.cod3r.builder.meal.defaultMethods.model.FastFoodMeal;

public abstract class FastFoodMealBuilder {
    protected FastFoodMeal meal;

    protected FastFoodMealBuilder() {
        meal = new FastFoodMeal();
    }

    public final FastFoodMeal getMeal() {
        return meal;
    }

    public void buildDrink() {
    }

    public void buildMain() {
    }

    public void buildSide() {
    }

    public void buildDessert() {
    }

    public void buildGift() {
    }
}
