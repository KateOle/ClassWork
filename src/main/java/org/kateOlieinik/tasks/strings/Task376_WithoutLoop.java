package org.kateOlieinik.tasks.strings;

import java.util.Scanner;

public class Task376_WithoutLoop {

    // Complex is better thacilpmoc nated.

    public static void main(String[] args) {
        reversePartOfSent1();
    }

    public static void reversePartOfSent1() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some sentence");

        String sent = scn.nextLine();

        System.out.println("Enter some character");

        Character letter = scn.next().charAt(0);

        int firstLetter = sent.indexOf(letter);

        int lastLetter = sent.lastIndexOf(letter);

        String sumOfSent = "";

        StringBuilder sb = new StringBuilder(sent.substring(firstLetter, lastLetter+1));

        sumOfSent = sent.substring(0, firstLetter)+ "-" + sb.reverse() + "-" + sent.substring(lastLetter+1, sent.length());

        System.out.println(sumOfSent);
    }
}

