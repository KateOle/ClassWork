package org.kateOlieinik.tasks.strings;

import java.util.Scanner;

public class Task347 {
    public static void main(String[] args) {
        lengthOfLine();
    }

    public static void lengthOfLine() {
//    347. Напишіть програму для розрахунку довжини рядка без використання функції len().

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some line");

        StringBuilder line = new StringBuilder(scn.nextLine());

        char lastSymb = line.reverse().charAt(0);

        line.reverse();

        int lengthOfLine = line.lastIndexOf(lastSymb + "") + 1;

        System.out.println(lengthOfLine);

    }
}
