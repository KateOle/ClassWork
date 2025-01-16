package org.kateOlieinik.tasks.strings;

import java.util.Scanner;

public class Task379 {
//   379. Дано послідовність символів довжини n (n ≥ 1). Перевірити баланс круглих дужок в цьому виразі
//            (кожна відкита дужка має свою закриту дужку). Наприклад, при введенні виразу (()) () програма
//    повинна повідомити про правильність розстановки дужок (True), а при введенні виразу ((()) - про
//    неправильність (False). Напишіть програму, яка може перевіряти баланс дужок в арифметичних виразах, тексті і т. д.

    public static void main(String[] args) {
        balansOfBrackets();
    }

    public static void balansOfBrackets() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some expression");

        String expr = scn.nextLine();

        int balance = 0;

        if (expr.charAt(0) == ')') {
            System.out.println("False");
            return;
        }

        for (int i = 0; i < expr.length(); i++) {
            if (expr.charAt(i) == '(') {
               balance++;
            } else if (expr.charAt(i) == ')') {
                balance--;
            } if (balance < 0) {
                break;
            }
        }
        if (balance != 0) {
            System.out.println("False");
        }
        if(balance == 0){
            System.out.println("True");
        }
    }
}
