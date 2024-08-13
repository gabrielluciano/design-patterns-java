package br.com.cod3r.builder.meal.defaultMethods.builder;

public class JustFriesBuilder extends FastFoodMealBuilder {

    @Override
    public void buildSide() {
        meal.setSide("Large Fries");
    }
}
