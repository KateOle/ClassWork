package org.kateOlieinik.tasks.strings;

import java.util.Scanner;

public class task_312_methods_strings {

   // Дано рядок. Визначити порядковий номер першої вказаної букви. Якщо такої літери немає, вивести нуль.

    public static void main(String[] args) {
        printTheIndex();
    }

    public static void printTheIndex() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some sentence");

        String sent = scn.nextLine();

        System.out.println("Enter some latter");

        Character lat = scn.next().charAt(0);

        System.out.println(indexOfLatter(sent, lat));
    }

    public static int indexOfLatter(String word, Character lat) {

        for (int i = 0; i < word.length(); i++) {
            if(lat == word.charAt(i)){
                return i+1;
            }
        }


        return 0;

    }





}


