package org.kateOlieinik.tasks.strings;

import java.util.Scanner;

public class Task348 {

    public static void main(String[] args) {
        countedFlags1();
    }

    public static void countedFlags() {
//    348. Напишіть програму, яка по введеному числу n від 1 до 9 виводить на екран n прапорців з відповідними номерами.
//    Зображення одного прапорця має розмір 4 x 4 символи, між двома сусідніми прапорцями також є порожній (з пропусків)
//    стовпець. Дозволяється вивести порожній стовпець після останнього прапорця. Усередині кожного прапорця повинен бути
//    записаний його номер - число від 1 до n.
        //    +___ +___ +___
        //    |1 / |2 / |3 /
        //    |__\ |__\ |__\
        //    |    |    |



        String str01 = "+___ ";
        String str02 = "|";
        int count = 1;
        String str03 = " / ";
        String str04 = "|__\\ ";
        String str05 = "|    ";

        String str1 = "";
        String str2 = "";
        String str3 = "";
        String str4 = "";

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some number from 1 till 9");

        int number = scn.nextInt();

        for (int i = 0; i < number; i++) {
            str1 += str01;
            str2 += str02+count+str03;
            str3 += str04;
            str4 += str05;
            count =count+1;
        }

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

    }

    public static void countedFlags1() {
//    348. Напишіть програму, яка по введеному числу n від 1 до 9 виводить на екран n прапорців з відповідними номерами.
//    Зображення одного прапорця має розмір 4 x 4 символи, між двома сусідніми прапорцями також є порожній (з пропусків)
//    стовпець. Дозволяється вивести порожній стовпець після останнього прапорця. Усередині кожного прапорця повинен бути
//    записаний його номер - число від 1 до n.
        //    +___ +___ +___
        //    |1 / |2 / |3 /
        //    |__\ |__\ |__\
        //    |    |    |



        String str01 = "+___ ";
        String str02 = "|%d / ";
        String str03 = "|__\\ ";
        String str04 = "|    ";

        String str1 = "";
        String str2 = "";
        String str3 = "";
        String str4 = "";

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some number from 1 till 9");

        int number = scn.nextInt();

        for (int i = 1; i <= number; i++) {
            str1 += str01;
            str2 += String.format(str02, i);
            str3 += str03;
            str4 += str04;
        }

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

    }
}
