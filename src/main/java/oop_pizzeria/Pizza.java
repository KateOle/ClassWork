package oop_pizzeria;

import java.util.LinkedList;

//Є інгредієнти піци String - "тісто", "сир", "помідор", "салямі", "кукурудза"...
//Є клас - піца (в класі піца є назва піца, ціна і список інгредієнтів).
//Створити кілька різних екземплярів класу піца.
//Додати також клас "Замовлення", в якому буде список піц.
//Замовлення має метод "розрахувати ціну всіх піц" - з урахуванням доставки

public class Pizza {

    String nameOfPizza;
    double price;

    LinkedList<String> listIngridients = new LinkedList<>();

    public Pizza(String nameOfPizza, double price){

        this.nameOfPizza = nameOfPizza;
        this.price = price;

    }

    public void addIngredient(String ingredient){

        listIngridients.add(0, ingredient);

    }

    public double getPrice() {
        return price;
    }
}
