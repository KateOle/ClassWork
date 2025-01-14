package org.kateOlieinik.tasks.strings;

import org.apache.commons.lang3.text.translate.NumericEntityEscaper;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task374 {
//  374  Дано два слова. Складіть програму, що визначає чи можна чи ні з букв слова A скласти слово B.
//    Програма має враховувати регістр літер введених слів.
//        Input:
//            Python
//            not
//            Ruby
//            Buy
//        Output:
//           Yes
//           No

    public static void main(String[] args) {
        wordFromOtherWord();
    }

    public static void wordFromOtherWord() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some word ");

        String word = scn.nextLine();

        System.out.println("Enter second word");

        String secondWord = scn.nextLine();

       // String wordLowerCase = word.toLowerCase();

      //  String secondWordLowerCase = secondWord.toLowerCase();

      //  Map<Character, Integer> map = new HashMap<>();

            if(secondWord.length() > word.length()){
             return;
        }
          StringBuilder sb = new StringBuilder(word);

            int count = 0;
        for (int i = 0; i < secondWord.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                if (secondWord.charAt(i) == word.charAt(j)) {
                    count += 1;
                    word = sb.deleteCharAt(j).toString();
                    break;
                }
            }
        }

            if(secondWord.length() == count){
                System.out.println("Yes");
            } else System.out.println("No");
        }
    }

