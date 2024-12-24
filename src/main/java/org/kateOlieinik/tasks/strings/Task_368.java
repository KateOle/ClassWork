package org.kateOlieinik.tasks.strings;

import java.util.Scanner;

public class Task_368 {

// 368.   Користувач вводить рядок і певний символ. Напишіть програму, яка друкує місця розташування (індекси)
//    першої та останньої появи введеного символа. Якщо символ зустрічається лише один раз, то виведіть його індекс.
//    Якщо символ не зустрічається, надрукуйте missing. У цьому завданні не можна використовувати цикли.
//   Input:
//    9965 GNU
//    6
// Output:
// 2

    public static void main(String[] args) {
        indexOfSomeCharacter();
    }

    public static void indexOfSomeCharacter() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some sentence ");

        String sent = scn.nextLine();

        System.out.println("Enter some number");

        Character numb = scn.next().charAt(0);

        int charStart = -1;
        int charEnd = -1;
        for (int i = 0; i < sent.length(); i++) {
            if(sent.charAt(i) == numb){
                charStart = i;
                break;
            }
        }

        for (int i = sent.length()-1; i > -1; i--) {
            if (sent.charAt(i) == numb) {
                charEnd = i;
                break;
            }
        }
        if (charStart == -1 || charEnd == -1) {
            System.out.println("Missing");
        }else if(charStart == charEnd) {
            System.out.println(charStart);
        } else if (charStart != charEnd) {
            System.out.println(charStart + " " + charEnd);
        }

    }
}
