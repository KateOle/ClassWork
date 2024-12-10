package org.kateOlieinik.tasks.strings;

import java.util.Scanner;

public class Task363 {

//    363. Визначити, чи є введене слово ідентифікатором, тобто починається воно з літери англійського алфавіту
//            (малої або великої) або знака підкреслення і не містить інших символів, крім букв англійського
//    алфавіту (в будь-якому регістрі), цифр і знака підкреслення.
    // Lazy check

    public static void main(String[] args) {
        isIdentifier();
    }

    public static void isIdentifier() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some word ");

        String word = scn.nextLine();

        boolean starts = true;

        char c = word.charAt(0);

        if (!((c > 64 && c < 91) || (c > 96 && c < 123) || c == 95)) {
           starts = false;
        } else
        for (int i = 1; i < word.length(); i++) {
            if (!((word.charAt(i) > 64 && word.charAt(i) < 91) || (word.charAt(i) > 96 && word.charAt(i) < 123) || (word.charAt(i) > 47 && word.charAt(i) < 58) || word.charAt(i) == 95)) {
                starts = false;
                break;
            }
        }
        System.out.println(starts);
    }
}
