package org.kateOlieinik.tasks.strings;

import java.util.Scanner;

public class Task353 {
//  353.  Користувач вводить рядок і певний номер n символа у ньому. Напишіть програму для видалення n-го символу з
//    не порожнього рядка. Цикли і вказівку «якщо» для розв’язування задачі використовувати не можна.

    public static void main(String[] args) {
        removeCharFromTheString();
    }

    public static void removeCharFromTheString() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a string ");

        String str = scn.nextLine();

        System.out.println("Enter some number ");

        int number = scn.nextInt();

        StringBuilder strBuild = new StringBuilder(str);

        strBuild.deleteCharAt(number);

        System.out.println(strBuild);
    }

}
