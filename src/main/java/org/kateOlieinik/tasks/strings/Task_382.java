package org.kateOlieinik.tasks.strings;

import java.util.Scanner;

public class Task_382 {

//    Напишіть програму, на вхід якої даються чотири числа a, b, c і d, кожне у своєму рядку.
//    Програма повинна вивести фрагмент таблиці множення для всіх чисел відрізка [a; b] на всі числа відрізка [c; d].
//    Числа a, b, c і d є натуральними і не перевищують 10, a ≤ b, c ≤ d. Дотримуйтесь формату виведення як у
//    вихідних даних. Для поділу елементів всередині рядка використовуйте \t - символ табуляції. Зауважте, що
//    лівим стовпчиком і верхнім рядком виводяться самі числа із заданих відрізків.


public static void main(String[] args) {
    multipleTwoRows();
}

public static void multipleTwoRows() {

    Scanner scn = new Scanner(System.in);

    System.out.println("Enter start of first interval, a");

    int a = scn.nextInt();

    System.out.println("Enter end of first interval, b");

    int b = scn.nextInt();

    System.out.println("Enter start of second interval, c");

    int c = scn.nextInt();

    System.out.println("Enter end of second interval, d");

    int d = scn.nextInt();

    for (int i = a; i <=b ; i++) {
        System.out.printf("\t%d", i);
    }
//    for (int i = c; i <=d ; i++) {
//        System.out.printf("\n\t%d", i);
//    }

    int res = 0;
    for (int i = c; i <= d ; i++) {
        System.out.printf("\n%d", i);
        for (int j = a; j <= b; j++) {

            res = i*j;
            System.out.printf("\t%d", res);
        }
    }
}



}