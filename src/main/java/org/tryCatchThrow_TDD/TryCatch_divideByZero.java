package org.tryCatchThrow_TDD;

import java.util.Scanner;

public class TryCatch_divideByZero {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter first number");

        Integer number1 = scn.nextInt();

        System.out.println("Enter second number ");

        Integer result;

            Integer number2 = scn.nextInt();

            while(true) {
                try {
                    result = number1 / number2;
                    break;
                } catch (Exception e) {
                    System.out.println("Dividing by Zero is forbiden. Enter number again");
                    number2 = scn.nextInt();
                }
            }

        System.out.println("The result is " + result);
    }
}
