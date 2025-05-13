package org.tryCatchThrow_TDD;

import java.util.Scanner;

public class TryCatch {


    public static void main(String[] args) {
        tryCatch();
    }

    public static void tryCatch(){


        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number");

        String str = scn.nextLine();

        try{
        Integer number = Integer.parseInt(str);
        }
        catch(Exception e){
            System.out.println("Enter a number again");

            str = scn.nextLine();
        }


    }
}
