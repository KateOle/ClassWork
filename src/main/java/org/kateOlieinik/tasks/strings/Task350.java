package org.kateOlieinik.tasks.strings;

import java.util.Scanner;

public class Task350 {

    // 350. Напишіть програму, яка отримує рядок і обчислює кількість цифр і букв у ньому.

    public static void main(String[] args) {
        calculationOfDigitsAndLetters();
    }

    public static void calculationOfDigitsAndLetters() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some words");

        String words = scn.nextLine();

        // String newWords = words.replace(" ","");

        int countOfLetters = 0;
        int countOfDigits = 0;

        for (int i = 0; i < words.length(); i++) {
            int indexOfLetter = words.charAt(i);
            if ((indexOfLetter >= 65 && indexOfLetter <= 90) || (indexOfLetter >= 97 && indexOfLetter <= 122)) {
                countOfLetters += 1;
            }
            if (indexOfLetter >= 48 && indexOfLetter <= 57) {
                countOfDigits += 1;
            }
        }
        System.out.println("Letters " + countOfLetters);
        System.out.println("Digits " + countOfDigits);

    }

}
