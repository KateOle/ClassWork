package org.kateOlieinik.tasks.strings;

import java.util.Scanner;

public class Task {

//    дано текст, зсунути його по методу цицерона
//    abc - bcd
//    bob - cnc
//    ali - bmj

    public static void main(String[] args) {
        cryptograf();
    }

    public static void cryptograf() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some word");

        String word = scn.nextLine();

        System.out.println("Enter shift");

        Integer sh = scn.nextInt();

        String collect = "";

        for (int i = 0; i < word.length(); i++) {
            char symb = word.charAt(i);
            if ((symb+sh) >= 122){
                collect += (char)((symb)-(26)+sh);
            } else
            {
                collect += (char) (symb + sh);
            }
        }

        System.out.println(collect);



    }

}
