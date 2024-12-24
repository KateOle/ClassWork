package org.kateOlieinik.tasks.strings;

import java.util.Scanner;

public class Task366 {
//   366. Знайти у рядку зазначений підрядок і замінити його на новий. Рядок, підрядок для заміни та новий рядок
//    вводить користувач. Розгляньте випадок заміни усіх підрядків. Також необхідно врахувати випадок відсутності
//    підрядка, який необхідно замінити (вивести is impossible).
//            Input:
//            12 45 32 567 32 109  // 32 32 32 32 32 32
//            32
//            0
//    Output:
//            12 45 0 567 0 109

    public static void main(String[] args) {
        exchangeSubstringInTheString();
    }

    public static void exchangeSubstringInTheString() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the sentence");

        String sent = scn.nextLine();

        System.out.println("Enter subsentence which should be replaced");

        String subSent1 = scn.nextLine();

        System.out.println("Enter a subsentence you want to replaced with");

        String subSent2 = scn.nextLine();

        String[] sentArray = sent.split(" ");

        boolean flag = false;

        String replacedSent;

        for (int i = 0; i < sentArray.length; i++) {
            if (sentArray[i].equals(subSent1)) {
                replacedSent = sentArray[i].replace(sentArray[i], subSent2);
                sentArray[i] = replacedSent;
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Is imposible");
        } else
            for (int i = 0; i < sentArray.length; i++) {
                System.out.print(sentArray[i] + " ");
            }
    }
}
