package org.kateOlieinik.tasks.strings;

import java.util.Scanner;

public class Task378 {
//
//   378. Дано рядок. Розріжте його на дві «рівні» частини (якщо довжина рядка непарна, помістіть
//            центральнийсимвол у першу частину, так що перша частина міститиме на один символ більше, ніж друга частина).
//    Тепер надрукуйте новий рядок, у якому перша та друга половини обмінялися місцями (не використовуйте вказівку «якщо»
//            для цього завдання).
//country
//        town


    public static void main(String[] args) {
        cutToTwoParts();
    }

    public static void cutToTwoParts() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some word");

        String word = scn.nextLine();

        int halfMod = (word.length())%2;  // 1

        int half = (word.length())/2;

        String halfOfWord = word.substring(0, half+halfMod);

        String endOfWord = word.substring(half+halfMod, word.length());

        System.out.println(endOfWord + halfOfWord);
    }
}
