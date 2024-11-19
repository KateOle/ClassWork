package org.kateOlieinik.tasks.strings;

import java.util.Scanner;
import java.lang.StringBuilder;

public class Task306 {
    public static void main(String[] args) {
      //  lastTwoCharFromTheLine1();
    }

    public static void lastTwoCharFromTheLine() {
// 306.   Напишіть програму, яка виводить на екран рядок з 5-ти копій останніх двох символів введеного користувачем рядка
//            (довжина введеного рядка повинна бути не менше 2).

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a string not less then 2 characters");

        String str = scn.nextLine();

        if (str.length() < 2) {
            System.out.println("Enter again a string not less then 2 characters");
        } else {       // fixme

            for (int i = 0; i < 5; i++) {
                String lastChar = str.substring(str.length() - 2);

                System.out.print(lastChar);
            }
        }
    }

    public static void lastTwoCharFromTheLine1() {
// 306.   Напишіть програму, яка виводить на екран рядок з 5-ти копій останніх двох символів введеного користувачем рядка
//            (довжина введеного рядка повинна бути не менше 2).

            Scanner scn = new Scanner(System.in);

            System.out.println("Enter a string not less then 2 characters");

            String str = scn.nextLine();

            if (str.length() < 2) {
                System.out.println("Enter again a string not less then 2 characters");
            } else {

                StringBuilder str1 = new StringBuilder(str);

                CharSequence strChar = str1.subSequence((str.length() - 2), str.length());

                StringBuilder str2 = new StringBuilder();

//                str2.repeat(strChar, 5);
//
//                String str3 = str2.toString();

               // System.out.println(str3);
            }
        }
    }

