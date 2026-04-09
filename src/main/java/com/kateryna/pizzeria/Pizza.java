package com.kateryna.pizzeria;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//Є інгредієнти піци String - "тісто", "сир", "помідор", "салямі", "кукурудза"...
//Є клас - піца (в класі піца є назва піца, ціна і список інгредієнтів).
//Створити кілька різних екземплярів класу піца.
//Додати також клас "Замовлення", в якому буде список піц.
//Замовлення має метод "розрахувати ціну всіх піц" - з урахуванням доставки

public class Pizza {

    private final String name;
    private final double price;
    private final List<Ingredient> ingredients = new ArrayList<>();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return Double.compare(price, pizza.price) == 0 && Objects.equals(name, pizza.name) && Objects.equals(ingredients, pizza.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, ingredients);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ingredients=" + ingredients +
                '}';
    }
}
