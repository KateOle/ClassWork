package org.kateOlieinik.tasks.strings;

import java.util.Scanner;

public class Task356 {

//   356. При заданому користувачем значенні цілого числа n ≥ 2 обчислити суму 1 x 2 + 2 x 3 + ... + (n - 1) x n.
//    Відповідь виведіть у вигляді обчисленого виразу і його значення в точності, як показано у вихідних даних.

    public static void main(String[] args) {
        sumOfMultiples();
    }

    public static void sumOfMultiples() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number of n ");

        int n = scn.nextInt();

        int nMinusOne = (n - 1);

        String result = String.format("%d*%d", 1, 2);
        int res = 2;
        for (int i = 3; i <= n; i++) {
            res = res + (i-1)*i;
           result += String.format(" + %d*%d", i-1, i);
        }
       System.out.println(result + " = " + res);
    }

}
