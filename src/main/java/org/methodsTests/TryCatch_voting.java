package org.methodsTests;

import java.util.Scanner;

public class TryCatch_voting {
    // user enters age and name in one string, if age >= 18, the information "You allowed to vote" is shown,
    // if age less than 18, the information "You should wait for X years" is shown

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your name and age");

        Integer age;

        while (true) {
            try {
                String nameAge = scn.nextLine();
                String[] nameAndAge = nameAge.split(" ");
                age = Integer.parseInt(nameAndAge[1]);
                if(age >= 0) {
                    break;
                } else {
                    System.out.println("Enter positive age");
                }
            } catch (Exception e) {
                System.out.println("Enter name and age again");
            }
        }

        if (age >= 18) {
            System.out.println(" You allowed to vote ");
        } else {
            System.out.println("You should wait for " + (18 - age) + " years");
        }

    }
}

