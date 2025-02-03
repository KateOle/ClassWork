package org.kateOlieinik.tasks.strings;

import java.util.Scanner;

public class Task_383 {
//    Напишіть програму для друку літери A за допомогою введеного користувачем символа.
//
//    Вхідні дані:
//
//            *
//    Вихідні дані:
//
//             ***
//            *   *
//            *   *
//            *****
//            *   *
//            *   *
//            *   *
//

    public static void main(String[] args) {
        latA();
    }

    public static void latA(){

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some character");

        Character a = scn.nextLine().charAt(0);

//        for (int i = 0; i < 5; i++) {
//            if(i!=0 & i!=4) {
//                System.out.print(a);
//            }
//        }
        String pr = " ";

        for (int i = 0; i < 7; i++) {

            for (int j = 0; j < 5; j++) {
                if(i==0) {
                    if(j==0 | j==4) {
                        System.out.printf("%s", pr);
                    } else System.out.printf("%c", a);
                } else if (i==4){
                    System.out.printf("%c", a);
                } else {
                    if(j==1 | j==2 | j==3){
                        System.out.printf("%s", pr);
                    } else
                        System.out.printf("%c", a);
                }
                //System.out.printf("\t%c", a);
            }
            System.out.println();

        }
    }

}
