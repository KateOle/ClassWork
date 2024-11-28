package org.kateOlieinik.tasks.strings;

import java.util.Scanner;

public class Task352 {
//   352. Користувач вводить рядок і один символ. Напишіть програму для підрахунку кількості входження символа в рядок.
//    У випадку, якщо введений символ є літерою, великі і малі букви розрізняються.

    public static void main(String[] args) {
        calculationOfLetters1();
    }

    public static void calculationOfLetters() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a sentence ");

        String sentence = scn.nextLine();

        System.out.println("Enter any letter ");

        String character = scn.nextLine().toLowerCase();

        String replacedCharacter = sentence.replace(character.toUpperCase(), character.toLowerCase());

        String[] splitedSent = replacedCharacter.split(character);

        int count = splitedSent.length;

        if (replacedCharacter.charAt(replacedCharacter.length()-1) == character.charAt(0)) {
               count = count + 1;
        }
        System.out.println("In this sentence " + (count-1) + " letters " + character);
    }

    public static void calculationOfLetters1() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a sentence ");

        String sentence = scn.nextLine().toLowerCase();

        System.out.println("Enter any letter ");

        Character character = scn.next().toLowerCase().charAt(0);

        int count = 0;
        int calculOfCharacter = 0;

        for (int i = 0; i < sentence.length(); i++) {
            count  = sentence.charAt(i);
            if (count == (int)character) {
                calculOfCharacter += 1;
            }
        }
        System.out.println("In this sentence " + calculOfCharacter + " " + character);

    }
}
