package org.kateOlieinik.tasks.strings;

import java.util.Scanner;

public class Task_380 {
//    Дано рядок, що складається з n цифр (тобто одноцифрових чисел), між якими стоїть n-1 знаків операцій,
//    кожна з яких може бути або +, або -. Обчисліть значення цього виразу. Програма має надрукувати результат
//    обчислення цього виразу.

    public static void main(String[] args) {
        calculation();
    }

    public static void calculation() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some sentence");

        String sent = scn.nextLine();

//        int countMin = sent.charAt(0) -48;
//        int countPlus = sent.charAt(0)-48;

        int count = Integer.parseInt(sent.charAt(0) + ""); // startovoe dejstv.

      //  int countPlus = Integer.parseInt(sent.charAt(0) + "");


// Povtorjauszeesja dejstvie
        for (int i = 0; i < sent.length(); i++) {
            if(sent.charAt(i) == '-') {
                count -=  sent.charAt(i+1)-48;
            } else if (sent.charAt(i) == '+') {
                count += sent.charAt(i+1)-48;
            }
        }

        System.out.println(count);
    }


}
