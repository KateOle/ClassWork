package oop_pizzeria;

import java.util.LinkedList;

public class Orders {

    double orderPrice = 0;

    public Orders(){

    }

    LinkedList<Pizza> listOfPizzas = new LinkedList<>();

    public double calculatePriceOfOrder(){

        double sumPrice = 0;

        for (int i = 0; i < this.listOfPizzas.size(); i++) {
            sumPrice = this.listOfPizzas.get(i).getPrice() + sumPrice;
        }

        sumPrice = sumPrice + orderPrice;

        return sumPrice;
    }

    public void setDelivery(double orderPrice){

        this.orderPrice = orderPrice;

    }

    public void addPizza(Pizza pizza){

        listOfPizzas.add(0, pizza);

    }

    public static void testM(){

    }

}
