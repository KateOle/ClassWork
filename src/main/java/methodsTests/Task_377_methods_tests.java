package methodsTests;

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
    // Check that user enters 2 letters
    // Check that user enters digit
    // Check that user enters character (space)


    public static void main(String[] args) {
        reverseLatters();
    }

    public static void reverseLatters(){

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some sentence");

        String sent = scn.nextLine();

        System.out.println("Enter some latter");

        Character l = scn.next().charAt(0);

        System.out.println(changeLettersFromSecondToUpperCase(l, sent));
    }

    public static String changeLettersFromSecondToUpperCase(char letter, String sentence) {

        int count = 0;
        Character firstLat = ' ';
        Character uppCase = ' ';

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == letter) {
                count = count + 1;
                if (count == 1) {
                    continue;
                } else
                    uppCase = (char) (65 + (sentence.charAt(i) - 97));
                sentence = sentence.substring(0, i) + uppCase + sentence.substring(i + 1);
            }
        }

        letter = (char) ((letter - 97) + 65);
      //  count = 0;
        for (int i = sentence.length() - 1; i > -1; i--) {
            if (sentence.charAt(i) == letter) {
              // count = count + 1;
              //  if (count == 1) {
                    uppCase = (char) (97 + (sentence.charAt(i) - 65));
                    sentence = sentence.substring(0, i) + uppCase + sentence.substring(i + 1);
                    break;
              //  }
            }
        }

        return sentence;
    }

//    public static String chageLastLetterToLowerCase(char lastLetter, String sentence) {
//        int count = 0;
//        Character uppCase;
//        lastLetter = (char) ((lastLetter - 97) + 65);
//        for (int i = sentence.length() - 1; i > -1; i--) {
//            if (sentence.charAt(i) == lastLetter) {
//                count = count + 1;
//                if (count == 1) {
//                    uppCase = (char) (97 + (sentence.charAt(i) - 65));
//                    sentence = sentence.substring(0, i) + uppCase + sentence.substring(i + 1);
//                    break;
//                }
//            }
//        }
//       // System.out.println(sentence);
//       return sentence;
//
//}
}
