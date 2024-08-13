package br.com.cod3r.builder.meal.fluent;

import br.com.cod3r.builder.meal.fluent.builder.FastFoodMealBuilder;
import br.com.cod3r.builder.meal.fluent.model.FastFoodMeal;

public class Client {

    public static void main(String[] args) {
        FastFoodMeal burgerCombo = new FastFoodMealBuilder("Fries")
                .andMain("CheeseBurger")
                .forDrink("Coke")
                .thatsAll();
        System.out.println(burgerCombo);

        FastFoodMeal justFries = new FastFoodMealBuilder("Fries").thatsAll();
        System.out.println(justFries);

        FastFoodMeal heartAttackCombo = new FastFoodMealBuilder("Large Fries")
                .andMain("Monster Burger")
                .forDrink("Milk Shake")
                .andDessert("Fudge Cake")
                .andGift("2 Kilograms")
                .thatsAll();
        System.out.println(heartAttackCombo);
    }
}