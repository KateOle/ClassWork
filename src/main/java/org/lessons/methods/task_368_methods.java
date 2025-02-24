package org.lessons.methods;

import java.util.Scanner;

public class task_368_methods {
    // 368.   Користувач вводить рядок і певний символ. Напишіть програму, яка друкує місця розташування (індекси)
//    першої та останньої появи введеного символа. Якщо символ зустрічається лише один раз, то виведіть його індекс.
//    Якщо символ не зустрічається, надрукуйте missing. У цьому завданні не можна використовувати цикли.
//   Input:
//    9965 GNU
//    6
// Output:
// 2

    public static void main(String[] args) {
        enteredWordAndCharacterFromUser();

    }

    public static void enteredWordAndCharacterFromUser() {

        // Принимаем от юзера данные
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some sentence ");

        String sent = scn.nextLine();

        System.out.println("Enter some number");

        Character numb = scn.next().charAt(0);

        String result = getIndexOfStartAndCharacters(sent, numb);

        System.out.println(result);
    }

    public static String getIndexOfStartAndCharacters(String sent, Character number){
        int charStart = getStartCharacterIndex(sent, number);
        int charEnd = getEndCharacterIndex(sent, number);

        // Вывод результатов с обработкой исключений
        if (charStart == -1 || charEnd == -1) {
            return "Missing";
        }else if(charStart == charEnd) {
            return String.format("startCharacter %d", charStart);
        } else if (charStart != charEnd) {
            return String.format("startCharacter %d, endCharacter %d", charStart, charEnd);
        } else return null;
    }

        public static int getStartCharacterIndex(String sent, Character numb){
            // расчет первого совпадающего символа
            int charStart = -1;
         //  int charEnd = -1;
            for (int i = 0; i < sent.length(); i++) {
                if (sent.charAt(i) == numb) {
                    charStart = i;
                    break;
                }
            }
            return charStart;
        }

        public static int getEndCharacterIndex(String sent, Character numb){
            // расчет последнего совпадающего символа
            int charEnd = -1;
            for (int i = sent.length() - 1; i > -1; i--) {
                if (sent.charAt(i) == numb) {
                    charEnd = i;
                    break;
                }
            }
            return charEnd;
        }
    }


