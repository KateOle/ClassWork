package org.kateOlieinik.tasks.strings;

import java.util.Scanner;

public class Task357 {

//   357. Напишіть програму для видалення символів, які мають непарні значення індексів у введеному користувачем рядку.

    public static void main(String[] args) {
        removingOfOddIndexes1();
    }

    public static void removingOfOddIndexes() {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter some word ");

        String word = scn.nextLine();


        // System.out.println(wordWithoutOddLetters.deleteCharAt(1));

        StringBuilder wordWithoutOddLetters = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if (i % 2 == 0) {

                wordWithoutOddLetters.append(word.charAt(i));
            }
        }

        System.out.println(wordWithoutOddLetters);


    }

    public static void removingOfOddIndexes1() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some word ");

        String word = scn.nextLine();

        StringBuilder wordWithoutOddLetters = new StringBuilder(word);

        for (int i = (word.length() - 1) - (word.length()) % 2; i > -1; i-=2) {
                 wordWithoutOddLetters.deleteCharAt(i);
                    }
        System.out.println(wordWithoutOddLetters);
    }
}

