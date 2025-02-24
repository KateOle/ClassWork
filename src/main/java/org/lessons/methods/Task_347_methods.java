package org.lessons.methods;

import java.util.Scanner;

public class Task_347_methods {
    public static void main(String[] args) {
        printlengthOfLine();
    }

    public static void printlengthOfLine() {
//    347. Напишіть програму для розрахунку довжини рядка без використання функції len().


        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some line");

       System.out.println(findLengthOfLine(scn.nextLine()));

    }

    public static int findLengthOfLine(String line){

        StringBuilder line1 = new StringBuilder(line);

        char lastSymb = line1.reverse().charAt(0);

        line1.reverse();

        int lengthOfLine = line1.lastIndexOf(lastSymb + "") + 1;

        return lengthOfLine;
    }



}
