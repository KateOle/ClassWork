package com.kateryna.pizzeria;


public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Four cheeses", 400.00);


        pizza1.addIngredient(Ingredient.CHEDDER);
        pizza1.addIngredient(Ingredient.MOZARELLA);
        System.out.println(pizza1);
    }

}
