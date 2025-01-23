package org.kateOlieinik.tasks.strings;

import java.util.Scanner;

public class Task_377 {
//    Користувачем вводиться рядок і буква, що зустрічається у рядку принаймні три рази. Напишіть програму,
//    яка замінить кожне входження букви у нижньому регістрі на цю ж букву у верхньому регістрі, за винятком першого і
//        останнього.

    public static void main(String[] args) {
        reverseLatters();
    }

    public static void reverseLatters() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some sentence");

        String sent = scn.nextLine();

        System.out.println("Enter some latter");

        Character l = scn.next().charAt(0);

        int count = 0;
        Character firstLat = ' ';
        Character uppCase = ' ';
        for (int i = 0; i < sent.length(); i++) {
            if(sent.charAt(i) == l) {
                count = count+1;
                if (count == 1) {
                    continue;
                } else
              uppCase = (char)(65 + (sent.charAt(i) - 97));
                sent = sent.substring(0, i) + uppCase + sent.substring(i+1);
            }
        }

           count = 0;
        l = (char)((l-97)+65);
        for (int i = sent.length()-1; i > -1 ; i--) {
            if (sent.charAt(i) == l) {
                count = count +1;
                if (count == 1){
                    uppCase = (char)(97 + (sent.charAt(i) - 65));
                    sent = sent.substring(0, i) + uppCase + sent.substring(i+1);
                    break;
                }
            }
        }
        System.out.println(sent);
    }
}
