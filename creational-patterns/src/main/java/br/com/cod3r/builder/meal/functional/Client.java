package br.com.cod3r.builder.meal.functional;

import br.com.cod3r.builder.meal.functional.model.FastFoodMeal;

public class Client {

    public static void main(String[] args) {
        FastFoodMeal burgerCombo = FastFoodMeal.withSide("Fries")
                .andMain("CheeseBurger")
                .forDrink("Coke")
                .thatsAll();
        System.out.println(burgerCombo);

        FastFoodMeal justFries = FastFoodMeal.withSide("Fries").thatsAll();
        System.out.println(justFries);

        FastFoodMeal heartAttackCombo = FastFoodMeal.withSide("Large Fries")
                .andMain("Monster Burger")
                .forDrink("Milk Shake")
                .andDessert("Fudge Cake")
                .andGift("2 Kilograms")
                .thatsAll();
        System.out.println(heartAttackCombo);
    }
}