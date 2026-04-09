package com.kateryna.pizzeria;

public enum Ingredient {
    CHEDDER("Chedder", 10),
    MICHIGAN("Parmezan", 10),
    MOZARELLA("Mozarella", 8),
    ;

    private final String name;
    private final int price;

    Ingredient(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
