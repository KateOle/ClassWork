package org.kateOlieinik.tasks.strings;

import java.util.Scanner;

public class Task376_reversePartOfSentence {
//    376. Дано рядок і символ, який зустрічається у рядку принаймні два рази. Напишіть програму,
//    яка надрукує новий рядок (на основі введеного користувачем), у якому послідовність символів,
//    що містяться між першою і останньою появою введеного символа, буде записана у зворотному порядку.

    public static void main(String[] args) {
        reversePartOfSentence();
    }

    public static void reversePartOfSentence() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some sentence");

        String sent = scn.nextLine();

        System.out.println("Enter some character");

        Character letter = scn.next().charAt(0);

        int firstLetter = sent.indexOf(letter);

        int lastLetter = sent.lastIndexOf(letter);

       // StringBuilder sb = new StringBuilder(sent);

        String partOfSent = "";
        String newSent = "";
        for (int i = 0; i < sent.length(); i++) {

            if(i > firstLetter && i < lastLetter) {
                partOfSent += sent.charAt(i);
            }
        }
        StringBuilder sb = new StringBuilder(partOfSent);
        newSent =   sb.reverse().toString();
       // break;

        String sumOfSent = "";

        sumOfSent = sent.substring(0, firstLetter+1) + newSent + sent.substring(lastLetter, sent.length());

        System.out.println(sumOfSent);

    }
}
