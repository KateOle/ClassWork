package org.kateOlieinik.tasks.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Task351 {
//   351. Дано послідовність символів, що має вигляд p1*p2*...*pn, де pn - цифра. Обчисліть значення виразу.

    public static void main(String[] args) {
        multipleResult();
    }

    public static void multipleResult() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a string ");

        String str = scn.nextLine();

        String[] splitedSent = str.split("\\*");

        //System.out.println(Arrays.toString(splitedSent));  - Output of Array

        int[] n = new int[splitedSent.length];
        for (int i = 0; i < splitedSent.length; i++) {
             n[i] =Integer.valueOf(splitedSent[i]);
        }

        int multipleResult = 1;
        for (int i = 0; i < n.length; i++) {
            multipleResult *= n[i];
        }
        System.out.println(multipleResult);
    }
}
