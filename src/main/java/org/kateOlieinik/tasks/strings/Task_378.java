package org.kateOlieinik.tasks.strings;

import java.util.Scanner;

public class Task_378 {
//    Дано рядок. Розріжте його на дві «рівні» частини (якщо довжина рядка непарна,
//                                                      помістіть центральний символ у першу частину,
//                                                      так що перша частина міститиме на один символ більше,
//                                                      ніж друга частина).
//    Тепер надрукуйте новий рядок, уякому перша та друга половини обмінялися місцями (не використовуйте вказівку
//            «якщо» для цього завдання).

    public static void main(String[] args) {
        cutReplaceTheWord();
    }

    public static void cutReplaceTheWord() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some word");

        String word = scn.nextLine();

        int count = word.length() & 1;  // pobitovaja operacija  (word.length() % 2)

        String firstHalfOfWord = word.substring(0, word.length() / 2 + count);
        String secondHalfOfWord = word.substring(word.length() / 2 + count, word.length());

//        if (word.length()%2 == 0) {
//            firstHalfOfWord = word.substring(0, word.length() / 2);
//        } else firstHalfOfWord = word.substring(0, word.length() / 2 + 1);
//
//          if (word.length()%2 == 0) {
//              secondHalfOfWord = word.substring(word.length() / 2, word.length());
//          } else  secondHalfOfWord = word.substring(word.length() / 2 + 1, word.length());


        System.out.println(secondHalfOfWord + firstHalfOfWord);


    }
}




