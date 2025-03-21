package org.methodsTests;

import java.util.Scanner;

public class Task_377_methods_tests {

    //    Користувачем вводиться рядок і буква, що зустрічається у рядку принаймні три рази. Напишіть програму,
//    яка замінить кожне входження букви у нижньому регістрі на цю ж букву у верхньому регістрі, за винятком першого і
//        останнього.

    // Positive
    // Check that first and last letters are lowerCase, middle letters are UpperCase
    // Check that if only 2 letters they should be lowerCase
    // Check that if only 1 letter it is lowerCase
    // Check the first or last letter matches with user inputs is in upper case - then ignore it
    // Check if no letters then no changes in the sentence

    // Negative
    // Check that user enters not letter symbol
    // Check that user enters '-'
    // Check that user enters character (space)
    // Check that user enters Upper letter which presents in the sentence


    public static void main(String[] args) {
        testReverseLatters();
    }

    public static void testReverseLatters() {
        String result1 = changeLettersFromSecondToUpperCase('b', "Abbbc");
        System.out.print("Testcase 1: ");
        if (result1.equals("AbBbc"))
            System.out.println("Ok");
        else
            System.out.println("False");

        String result2 = changeLettersFromSecondToUpperCase('b', "");
        System.out.print("Testcase 2: ");
        if (result2.equals(""))
            System.out.println("Ok");
        else
            System.out.println("False");

        String result3 = changeLettersFromSecondToUpperCase('a', "aaaaa");
        System.out.print("Testcase 3: ");
        if (result3.equals("aAAAa"))
            System.out.println("Ok");
        else
            System.out.println("False");

        // Check that first and last letters are lowerCase, middle letters are UpperCase
        String result4 = changeLettersFromSecondToUpperCase('n', "There should be one-- and preferably only one --obvious way to do it.");
        System.out.print("Testcase 4: ");
        if (result4.equals("There should be one-- aNd preferably oNly one --obvious way to do it."))
            System.out.println("Ok");
        else {
            System.out.println("False");
            System.out.println("Check that first and last letters are lowerCase, middle letters are UpperCase");
        }

        // Check that if only 2 letters they should be lowerCase
        String result5 = changeLettersFromSecondToUpperCase('n', "There should be one-- and");
        System.out.print("Testcase 5: ");
        if (result5.equals("There should be one-- and"))
            System.out.println("Ok");
        else {
            System.out.println("False");
            System.out.println("Check that if only 2 letters they should be lowerCase");
        }

        // Check that if only 1 letter it is lowerCase
        String result6 = changeLettersFromSecondToUpperCase('n', "There should be one");
        System.out.print("Testcase 6: ");
        if (result6.equals("There should be one"))
            System.out.println("Ok");
        else {
            System.out.println("False");
            System.out.println("Check that if only 1 letter it is lowerCase");
        }

        // Check the first or last letter matches with user inputs is in upper case - then ignore it
        String result7 = changeLettersFromSecondToUpperCase('n', "NThere should be one-- and preferably only one --obvious way to do it.");
        System.out.print("Testcase 7: ");
        if (result7.equals("NThere should be one-- aNd preferably oNly one --obvious way to do it."))
            System.out.println("Ok");
        else {
            System.out.println("False");
            System.out.println("Check the first or last letter matches with user inputs is in upper case - then ignore it");
        }

        // Check if no letters then no changes in the sentence
        String result8 = changeLettersFromSecondToUpperCase('n', "There should be oe-- ad preferably oly oe --obvious way to do it.");
        System.out.print("Testcase 8: ");
        if (result8.equals("There should be oe-- ad preferably oly oe --obvious way to do it."))
            System.out.println("Ok");
        else {
            System.out.println("False");
            System.out.println("Check if no letters then no changes in the sentence");
        }

        // Check that user enters 2 letters
        String result9 = changeLettersFromSecondToUpperCase('*', "There should be one-- and preferably only one --obvious way to do it.");
        System.out.print("Testcase 9: ");
        if (result9.equals("There should be one-- and preferably only one --obvious way to do it."))
            System.out.println("Ok");
        else {
            System.out.println("False");
            System.out.println("Check that user enters 2 letters");
        }

        // Check that user enters digit
        String result10 = changeLettersFromSecondToUpperCase('*', "There should be one-- and preferably only one --obvious way to do it.");
        System.out.print("Testcase 10: ");
        if (result10.equals("There should be one-- and preferably only one --obvious way to do it."))
            System.out.println("Ok");
        else {
            System.out.println("False");
            System.out.println("Check that user enters 2 letters");
        }

        // Check that user enters '-'
        String result11 = changeLettersFromSecondToUpperCase('-', "There should be one-- and preferably only one --obvious way to do it.");
        System.out.print("Testcase 11: ");
        if (result11.equals("There should be one-- and preferably only one --obvious way to do it."))
            System.out.println("Ok");
        else {
            System.out.println("False");
            System.out.println("Check that user enters '-'");
        }

        // Check that user enters space -  - no changes in the sentence
        String result12 = changeLettersFromSecondToUpperCase(' ', "There should be one-- and preferably only one --obvious way to do it.");
        System.out.print("Testcase 12: ");
        if (result12.equals("There should be one-- and preferably only one --obvious way to do it."))
            System.out.println("Ok");
        else {
            System.out.println("False");
            System.out.println("Check that user enters space");
        }

        // Check that if a user enters a letter in uppercase, it doesn't affect the task result (it will work as expected)
        String result13 = changeLettersFromSecondToUpperCase('N', "There should be one-- and preferably only one --obvious way to do it.");
        System.out.print("Testcase 13: ");
        if (result13.equals("There should be one-- aNd preferably oNly one --obvious way to do it."))
            System.out.println("Ok");
        else {
            System.out.println("False");
            System.out.println("Check that user enters Upper letter which presents in the sentence");
        }

        // Check if sentence contains more than 3 Upper letter and more than 3 lower letter which user enters - ignore Upper letter and process lower letter
        String result14 = changeLettersFromSecondToUpperCase('n', "Therne shounld be one-- aNd preferably oNly one --obNvious way to do it.");
        System.out.print("Testcase 14: ");
        if (result14.equals("Therne shouNld be oNe-- aNd preferably oNly one --obNvious way to do it."))
            System.out.println("Ok");
        else {
            System.out.println("False");
            System.out.println("Check if sentence contains more than 3 Upper letter and more than 3 lower letter which user enters");
        }

        // Check if sentence contains less than 3 Upper letter and more than 3 lower letter which user enters - ignore Upper letter and processed lower letter
        String result15 = changeLettersFromSecondToUpperCase('n', "There should be one-- and preferably only one --obvious way to do Nit.");
        System.out.print("Testcase 15: ");
        if (result15.equals("There should be one-- aNd preferably oNly one --obvious way to do Nit."))
            System.out.println("Ok");
        else {
            System.out.println("False");
            System.out.println("Check if sentence contains less than 3 Upper letter and more than 3 lower letter which user enters");
        }

        // Check if sentence contains less than 3 lower letter in the sentence - no changes in the sentence
        String result16 = changeLettersFromSecondToUpperCase('n', "There should be one-- and preferably oly oe --obvious way to do it.");
        System.out.print("Testcase 16: ");
        if (result16.equals("There should be one-- and preferably oly oe --obvious way to do it."))
            System.out.println("Ok");
        else {
            System.out.println("False");
            System.out.println("Check if sentence contains less than 3 lower letter in the sentence - no changes in the sentence");
        }

    }

    public static void reverseLatters() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some sentence");

        String sent = scn.nextLine();

        System.out.println("Enter some letter");

        char l = scn.next().charAt(0);

        //   l = Character.toLowerCase(l);  // then I reverted Upper letter to lower letter here, the tests don't see it

        System.out.println(changeLettersFromSecondToUpperCase(l, sent));
    }

    public static String changeLettersFromSecondToUpperCase(char letter, String sentence) {

        int count = 0;
        Character firstLat = ' ';
        Character uppCase = ' ';
        letter = Character.toLowerCase(letter);   // revert Upper letter, entered by user, to lower letter
        boolean isLetter = Character.isLetter(letter); // Add boolean if it is true = letter entered, if it is false, not letter entered
        int indexLastLetter = 0;

        if (sentence != "") {
            if (isLetter) {

                for (int i = 0; i < sentence.length(); i++) {
                    if (sentence.charAt(i) == letter) {
                        if (sentence.charAt(i) > 96 && sentence.charAt(i) < 123) {
                            count = count + 1;
                            indexLastLetter = i;
                            if (count == 1) {
                                continue;
                            } else
                                uppCase = (char) (65 + (sentence.charAt(i) - 97));
                            sentence = sentence.substring(0, i) + uppCase + sentence.substring(i + 1);
                        }
                    }

                }
            }


            letter = (char) ((letter - 97) + 65);

            if (sentence.charAt(indexLastLetter) == letter) {
                uppCase = (char) (97 + (sentence.charAt(indexLastLetter) - 65));
                sentence = sentence.substring(0, indexLastLetter) + uppCase + sentence.substring(indexLastLetter + 1);

            } else if (sentence.charAt(0) == letter) {

            }
            }

            return sentence;
        }
}
