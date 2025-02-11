package org.kateOlieinik.tasks.strings;

import java.util.Scanner;

public class Task_reverseLatters_charAt {

    public static void main(String[] args) {
        reverseLatters();
    }

    public static void reverseLatters() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some latter");

        String lat = scn.nextLine();
        String lowCase = "";

        for (int i = 0; i < lat.length(); i++) {
            lowCase += (char)(lat.charAt(i)+32);
        }

        System.out.println(lowCase);
    }





}
