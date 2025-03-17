package org.methodsTests;

import java.util.Scanner;

public class Task_399_tests {
//    Кодування довжин послідовностей - це базовий алгоритм стиснення даних. Реалізуйте один з найпростіших його
//    варіантів. На вхід алгоритму подається рядок, що містить символи англійського алфавіту. Цей рядок розбивається
//    на групи однакових символів, що йдуть підряд («серії»). Кожна серія характеризується символом і кількістю повторень.
//    Саме ця інформація і записується в код: спочатку пишеться довжина серії повторюваних символів, потім сам символ.
//    У серій довжиною в один символ кількість повторень не записується.
//         aaabccccCCaB
//        aabcccddffffffffff

//    Вихідні дані:
// 3ab4c2CaB
//2ab3c2d10f


    // 1 Check that numbers of series writes correctly
    // 2 Check that letter of series writes correctly
    // 3 Check that sequence consists all series from 1 letter - no numbers in the outcome
    // 4 Check that sequence contains few series with the same letter divided by other series
    // 5 Check sequence which contains Upper and Lower case letters
    // 6 Check that series repeats few times in a sequence
    // 7 Check if sequence contains only one letter

    // 8 Check if sequence contains letter and digits
    // 9 Check if sequence contains spaces
    // 10 Check if sequence contains symbols (other alphabet, digits) - show Exception

    public static void main(String[] args) {
        testConvertSeriesOfSequence();
    }

    public static void testConvertSeriesOfSequence() {
        // Check that numbers of series writes correctly (1 letter on borders)
        String result1 = convertSequenceToSeries("accccrrrp");
        System.out.println("Test case 1: ");
        if (result1.equals("a4c3rp"))
            System.out.println("Pass");
        else
            System.out.println("False");
        System.out.println("Check that numbers of series writes correctly (1 letter on borders)");


        // Check that letter of series writes correctly
        String result2 = convertSequenceToSeries("ttttttttttddddll");
        System.out.println("Test case 2: ");
        if (result2.equals("10t4d2l"))
            System.out.println("Pass");
        else
            System.out.println("False: " + "Expected: 10t4d2l " + "Actual: " + result2);
        System.out.println("Check that letter of series writes correctly");

        // Check that sequence consists all series from 1 letter - no numbers in the outcome
        String result3 = convertSequenceToSeries("trdfY");
        System.out.println("Test case 3: ");
        if (result3.equals("trdfY"))
            System.out.println("Pass");
        else
            System.out.println("False: " + "Expected: trdtfY " + "Actual: " + result3);
        System.out.println("Check that sequence consists all series from 1 letter - no numbers in the outcome");

        // Check that sequence contains few series with the same letter divided by other series
        String result4 = convertSequenceToSeries("trrrtddtttr");
        System.out.println("Test case 4: ");
        if (result4.equals("t3rt2d3tr"))
            System.out.println("Pass");
        else
            System.out.println("False");
        System.out.println("Check that sequence contains few series with the same letter divided by other series");

        // Check sequence which contains Upper and Lower case letters
        String result5 = convertSequenceToSeries("trrrTDDtttR");
        System.out.println("Test case 5: ");
        if (result5.equals("t3rT2D3tR"))
            System.out.println("Pass");
        else
            System.out.println("False");
        System.out.println("Check sequence which contains Upper and Lower case letters");

        // Check that series repeats few times in a sequence
        String result6 = convertSequenceToSeries("tTtttt");
        System.out.println("Test case 6: ");
        if (result6.equals("tT4t"))
            System.out.println("Pass");
        else
            System.out.println("False");
        System.out.println("Check that series repeats few times in a sequence");

        // 7 Check if sequence contains only one letter
        String result7 = convertSequenceToSeries("t");
        System.out.println("Test case 7: ");
        if (result7.equals("t"))
            System.out.println("Pass");
        else
            System.out.println("False");
        System.out.println("Check if sequence contains only one letter");

        // 8 Check if sequence contains letter and digits
        String result8 = convertSequenceToSeries("ttt_yy");
        System.out.println("Test case 8: ");
        if (result8 == null)
            System.out.println("Pass");
        else
            System.out.println("False: " + "Expected: " + null + "Actual: ttt555yy");
        System.out.println("Check if sequence contains letter and digits");

        //9 Check if sequence contains spaces
        String result9 = convertSequenceToSeries("ttt rrr yy");
        System.out.println("Test case 9: ");
        if (result9 == null)
            System.out.println("Pass");
        else
            System.out.println("False");
        System.out.println("Check if sequence contains spaces");

        //10 Check if sequence contains symbols (other alphabet, digits) - show Exception
        String result10 = convertSequenceToSeries("tttаааeee");
        System.out.println("Test case 10: ");
        if (result10 == null)
            System.out.println("Pass");
        else
            System.out.println("False");
        System.out.println("Check if sequence contains spaces");

        // Check that all letters of sequence are the same
        String result11 = convertSequenceToSeries("qqqqqqqqqqq");
        System.out.println("Test case 11: ");
        if (result11.equals("11q"))
            System.out.println("Pass");
        else
            System.out.println("False");
        System.out.println("Check that all letters of sequence are the same)");
    }

    public static String convertSequenceToSeries(String sequence) {

        int count = 1;
        // int calc = 1;
        String result = "";
        Integer number = 0;

        for (int i = 0; i < sequence.length(); i++) {
            if(sequence.charAt(i) < 65 || (sequence.charAt(i) > 90 && sequence.charAt(i) < 97) || sequence.charAt(i) > 122) {
                return null;
            }
        }

        for (int i = 0; i < sequence.length() - 1; i++) {

            if (sequence.charAt(i) == sequence.charAt(i + 1)) {
                count++;
            } else if (count == 1) {
                
                char letter = sequence.charAt(i);
                result += letter;
            } else {
                number = count;
                result += number.toString() + sequence.charAt(i);
                count = 1;
            }
        }

        if (count == 1) {
            result = result + sequence.charAt(sequence.length() - 1);
        } else {
            result = result + count + sequence.charAt(sequence.length() - 1);
        }


        //  String result1 = "";

//        for (int i = 0; i < result.length() ; i++) {
//            if (count == 1) {
//                result1 = result.replace("1", "");
//                count++;
//            }
//        }

        return result;
    }

}
