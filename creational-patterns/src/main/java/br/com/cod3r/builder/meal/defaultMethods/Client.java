package br.com.cod3r.builder.meal.defaultMethods;

import br.com.cod3r.builder.meal.defaultMethods.builder.FastFoodMealBuilder;
import br.com.cod3r.builder.meal.defaultMethods.builder.FatMealBuilder;
import br.com.cod3r.builder.meal.defaultMethods.builder.JustFriesBuilder;
import br.com.cod3r.builder.meal.defaultMethods.builder.Menu1Builder;
import br.com.cod3r.builder.meal.defaultMethods.director.MealDirector;

public class Client {

    public static void order(String name, FastFoodMealBuilder builder) {
        System.out.println("Ordering a " + name);
        MealDirector director = new MealDirector(builder);
        director.constructCombo();
        System.out.println(director.getCombo());

        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        order("Burger", new Menu1Builder());
        order("Just Fries", new JustFriesBuilder());
        order("Heart Attack", new FatMealBuilder());
    }
}