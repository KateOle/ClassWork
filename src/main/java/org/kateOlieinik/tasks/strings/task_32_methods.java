package org.kateOlieinik.tasks.strings;

import java.util.Scanner;

public class task_32_methods {
    // Вводяться три додатних числа - довжини сторін трикутника. Обчисліть площу трикутника за формулою Герона.


    public static void main(String[] args) {
        neteredSides();
    }

    public static void neteredSides() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter side of triangle");

        int a = scn.nextInt();

        System.out.println("Enter side of triangle");

        int b = scn.nextInt();

        System.out.println("Enter side of triangle");

        int c = scn.nextInt();

        System.out.println(squarOfTriangle(a, b, c));
    }


    public static double squarOfTriangle(int a, int b, int c){

        double p = (a + b + c)/2;

        double s = Math.sqrt(p *(p - a)*(p-b)*(p-c));

        return s;

    }


}
