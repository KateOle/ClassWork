package org.kateOlieinik.tasks.strings;

import java.util.Scanner;

public class Task355 {
//  355.  Вводиться додатне дійсне число, надрукуйте його першу цифру справа від десяткової точки.

    public static void main(String[] args) {
        firstDigitAfterComa();
    }

    public static void firstDigitAfterComa() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter float number");

        String numb = scn.nextLine();

        String[] arrOfFloat;

        if (numb.contains(".")) {
            arrOfFloat = numb.split("\\.");
        } else
       arrOfFloat = numb.split(",");

        char res = arrOfFloat[1].charAt(0);

        System.out.println(res);
    }

}
