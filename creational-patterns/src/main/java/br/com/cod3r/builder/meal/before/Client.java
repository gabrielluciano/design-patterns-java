package br.com.cod3r.builder.meal.before;

import br.com.cod3r.builder.meal.before.model.FastFoodMeal;

public class Client {

    public static void main(String[] args) {

        FastFoodMeal burgerCombo = new FastFoodMeal("Coke", "CheeseBurger", "Fries");
        System.out.println(burgerCombo);

        FastFoodMeal justFries = new FastFoodMeal(null, null, "Fries");
        System.out.println(justFries);

        FastFoodMeal hearAttackCombo = new FastFoodMeal("Milk Shake", "Monster Burger",
                "Large Fries", "Fudge Cake", "2 Kilograms");
        System.out.println(hearAttackCombo);
    }
}