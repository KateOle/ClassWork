package org.kateOlieinik.tasks.strings;

import java.util.Scanner;

public class Task365 {
//   365. Користувач вводить рядок, у якому містяться слова, знаки пунктуації, причому усі слова записуються разом і
//    перша літера кожного слова є великою. Напишіть програму, яка виводить рядок, у якому введені слова розділені
//        пропусками.
    // TheOldSeaDogAtTheAdmiralBenbow

    public static void main(String[] args) {
        splitTheSentence();
    }

    public static void splitTheSentence() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the sentence");

        String sent = scn.nextLine();

        StringBuilder sentWithSpaces = new StringBuilder(sent);

        for (int i = 1; i < sentWithSpaces.length(); i++) {
            if(sentWithSpaces.charAt(i) > 64 && sentWithSpaces.charAt(i) < 91) {
                sentWithSpaces.insert(i, " ");
               i = i+1;
            }
        }
        System.out.println(sentWithSpaces);
    }
}
