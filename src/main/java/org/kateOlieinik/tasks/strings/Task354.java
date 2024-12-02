package org.kateOlieinik.tasks.strings;

import java.util.Scanner;

public class Task354 {
//    354. Напишіть програму для перевірки чи є введена літера голосною або приголосною.

    public static void main(String[] args) {
        consonentVovel();
    }

    public static void consonentVovel() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a character ");

        String str = scn.nextLine();

        int indexOfStr = str.charAt(0);

        int[] vovels = {65, 69, 73, 79, 85, 89, 97, 101, 105, 111, 117, 121};

        boolean flag = false;

        for (int i = 0; i < vovels.length; i++) {
            if (indexOfStr == vovels[i]) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("The element is vowel");
        } else
            System.out.println("The element is consonant");
    }

}
