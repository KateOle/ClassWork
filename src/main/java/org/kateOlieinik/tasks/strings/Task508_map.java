package org.kateOlieinik.tasks.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task508_map {
//    Припустимо, що у нас є словник, в якому ключі є ідентифікаторами, а значення – іменами користувачів.
//    Напишіть програму, яка виводить вітальне повідомлення користувачу на основі його ідентифікатора.
//    Якщо ідентифікатор відсутній у словнику, виводиться вітання для усіх користувачів.

    public static void main(String[] args) {
        greatings();
    }

    public static void greatings() {

        Map<Integer, String> map = new HashMap<>();

        map.put( 1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Jack");

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number of user");

        Integer numb = scn.nextInt();

                System.out.println("Hi, " + map.getOrDefault(numb, "to all"));

    }

}
