package org.kateOlieinik.tasks.strings;

import java.util.Scanner;

public class Task_28_methods {

    //Напишіть програму, яка обчислює значення a + aa + aaa + aaaa із заданою цифрою як цілочисельне значення a.

    public static void main(String[] args) {
        numberFromUser();
    }

    public static void numberFromUser(){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some number");

        int n = scn.nextInt();

        System.out.println(sumOfDigits(n));
    }

    public static int sumOfDigits(int a) {

        int result = a * 1234;
       return result;
    }
}
