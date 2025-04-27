package org.methodsTests;

import java.util.Scanner;

public class Task_400_palindrom {
//    Дано рядок, який може містити пропуски. Визначте, чи є цей рядок паліндромом, за умови, що великі і малі
//    літери не розрізняються, а всі символи, які не є буквами, повинні бути пропущені. Виведіть слово Yes,
//    якщо слово є паліндромом і слово No, якщо ні. Довжина вхідного рядка може бути до 100000 символів.
//    При виконанні цього завдання не можна використовувати списки.

    //Check that palindrom is palindrom (letters only) -> expected 'yes'
    //Check that palindrom is palindrom (letters and spaces only) -> expected 'yes'
    //Check that sentence is Not palindrom (letters only)-> expected "no"
    //Check that sentence is Not palindrom (letters and characters)-> expected "no"

    //Check that palindrom contains Upper case letters -> expected 'yes'
    //Check that palindrom contains characters (., !?+)(not letters) -> expected 'yes'

    //Check that sentence contains 99999 symbols, sentence is palindrom -> expected 'yes'
    //Check that sentence contains 99999 symbols, sentence is NOT palindrom -> expected 'no'
    //Check that sentence contains 1 letter -> expected "yes"
    ////Check that sentence contains 2 letter, NOT palindrom -> expected "no"
    //Check that sentence not contains letters -> expected "no"
    //Check that lenght of sentence more than 100000 symbols, sentence is palindrom -> expected 'null'

    public static void main(String[] args) {
        testIsPalindrom();
    }

    public static void testIsPalindrom() {
        // Check that palindrom is palindrom (letters only) -> expected 'yes'
        boolean result1 = isPalindrom("mannam");
        System.out.println("Test case 1: ");
        if (result1)
            System.out.println("Pass");
        else
            System.out.println("False");
        System.out.println("Check that palindrom is palindrom (letters only) -> expected 'yes'");

        //Check that palindrom is palindrom (letters and spaces only) -> expected 'yes'
        boolean result2 = isPalindrom("was it a rat i saw");
        System.out.println("Test case 2: ");
        if (result2)
            System.out.println("Pass");
        else
            System.out.println("False");
        System.out.println("Check that palindrom is palindrom (letters and spaces only) -> expected 'yes'");

        //Check that sentence is Not palindrom (letters only)-> expected "no"
        boolean result3 = isPalindrom("riodejaneiro");
        System.out.println("Test case 3: ");
        if (!result3)
            System.out.println("Pass");
        else
            System.out.println("False");
        System.out.println("Check that sentence is Not palindrom (letters only)-> expected \"no\"");

        //Check that sentence is Not palindrom (letters and characters)-> expected "no"
        boolean result4 = isPalindrom("Rio-de Janeiro!");
        System.out.println("Test case 4: ");
        if (!result4)
            System.out.println("Pass");
        else
            System.out.println("False");
        System.out.println("Check that sentence is Not palindrom (letters and characters)-> expected \"no\"");

        //Check that palindrom contains Upper case letters -> expected 'yes'
        boolean result5 = isPalindrom("Was it a rat I saw");
        System.out.println("Test case 5: ");
        if (result5)
            System.out.println("Pass");
        else
            System.out.println("False");
        System.out.println("Check that palindrom contains Upper case letters -> expected 'yes'");

        //Check that palindrom contains characters (., !?+)(not letters) -> expected 'yes'
        boolean result6 = isPalindrom("Was.it.a.rat.I.saw?");
        System.out.println("Test case 6: ");
        if (result6)
            System.out.println("Pass");
        else
            System.out.println("False");
        System.out.println("Check that palindrom contains characters (., !?+)(not letters) -> expected 'yes'");

        //Check that sentence contains 99999 symbols, sentence is palindrom -> expected 'yes'
        boolean result7 = isPalindrom("a".repeat(99999));
        System.out.println("Test case 7: ");
        if (result7)
            System.out.println("Pass");
        else
            System.out.println("False");
        System.out.println("Check that sentence contains 99999 symbols, sentence is palindrom -> expected 'yes'");

        //Check that sentence contains 99999 symbols, sentence is NOT palindrom -> expected 'no'
        boolean result8 = isPalindrom("a".repeat(99998) + "b");
        System.out.println("Test case 8: ");
        if (!result8)
            System.out.println("Pass");
        else
            System.out.println("False");
        System.out.println("Check that sentence contains 99999 symbols, sentence is NOT palindrom -> expected 'no'");

        //Check that sentence contains 1 letter -> expected "yes"
        boolean result9 = isPalindrom("a");
        System.out.println("Test case 9: ");
        if (result9)
            System.out.println("Pass");
        else
            System.out.println("False");
        System.out.println("Check that sentence contains 1 letter -> expected \"yes\"");

        //Check that sentence contains 2 letter, NOT palindrom -> expected "no"
        boolean result10 = isPalindrom("ab");
        System.out.println("Test case 10: ");
        if (!result10)
            System.out.println("Pass");
        else
            System.out.println("False");
        System.out.println("Check that sentence contains 2 letter, NOT palindrom -> expected \"no\"");

        //Check that sentence not contains letters -> expected "no"
        boolean result11 = isPalindrom(".,! ?");
        System.out.println("Test case 11: ");
        if (!result11)
            System.out.println("Pass");
        else
            System.out.println("False");
        System.out.println("Check the sentence which not contains letters -> expected \"no\"");

        //Check that lenght of sentence more than 100000 symbols, sentence is palindrom -> expected 'null'
        boolean result12 = isPalindrom("a".repeat(100000));
        System.out.println("Test case 12: ");
        if (!result12)
            System.out.println("Pass");
        else
            System.out.println("False");
        System.out.println("Check that lenght of sentence more than 100000 symbols, sentence is palindrom -> expected 'null'");
    }

    public static boolean isPalindrom(String palindrom) {

        String palindromLowerCase = palindrom.toLowerCase();

        String palindromLettersOnly = "";


        for (int i = 0; i < palindromLowerCase.length(); i++) {
            if (palindromLowerCase.charAt(i) >= 97 && palindromLowerCase.charAt(i) <= 122) {
                palindromLettersOnly += palindromLowerCase.charAt(i);
            }
        }

        if (palindromLettersOnly == "") {
            return false;
        }
        if (palindromLettersOnly.length() >= 100000) {
            return false;
        }

        String firstHalfOfPalindrom = "";
        String lastHalfOfPalindrom = "";

        for (int j = 0; j < palindromLettersOnly.length() / 2; j++) {
            firstHalfOfPalindrom += palindromLettersOnly.charAt(j);
        }

        for (int j = palindromLettersOnly.length() - 1; j > (palindromLettersOnly.length() / 2) - 1; j--) {

            lastHalfOfPalindrom += palindromLettersOnly.charAt(j);
        }


        if (lastHalfOfPalindrom.length() != firstHalfOfPalindrom.length()) {
            lastHalfOfPalindrom = lastHalfOfPalindrom.substring(0, lastHalfOfPalindrom.length() - 1);
        }

        if (firstHalfOfPalindrom.equals(lastHalfOfPalindrom)) {
            return true;
        } else return false;

    }
}


