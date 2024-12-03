package org.kateOlieinik.tasks.strings;

import java.util.Scanner;

public class Task358 {

//   358. Користувач вводить рядок одноцифрових чисел без пропусків. Напишіть програму для обчислення суми цих чисел.

    public static void main(String[] args) {
        sumOfDigits();
    }

    public static void sumOfDigits() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number ");

        String n = scn.nextLine();

        int sum = 0;

        for (int i = 0; i < n.length(); i++) {
            sum += (n.charAt(i))-48;
        }
        System.out.println(sum);
    }
}
