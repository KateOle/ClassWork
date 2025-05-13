package org.tryCatchThrow_TDD;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeDefiner_throw_try_catch {

    // user sets the age from console, the program defined if it adult or not

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter an age");

        while (true){
        try {
            int age = scn.nextInt();

            boolean result = ageDefiner(age);
            printingResult(result);
            break;
        } catch (InputMismatchException e) {
            System.out.println("Enter correct age !");
            scn.next();
        } catch (Exception e) {
            System.out.println("Enter correct age");
        }
    }
}

    public static void printingResult(boolean result) {

        if (result) {
            System.out.println("The person is adult");
        } else System.out.println("The person is a child");
    }


    public static boolean ageDefiner(int age) throws Exception {

        if (age < 0 || age >= 130) {
            throw new Exception();
        }

        if (age >= 18) {
            return true;
        } else
            return false;
    }
}
