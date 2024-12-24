package org.kateOlieinik.tasks.strings;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Task367_map {
//  367.  Напишіть програму, яка дає користувачеві можливість вводити рядок і відображає символ, який найчастіше
//    з’являється у рядку та кількість його входжень. Якщо у рядку є кілька таких символів, необхідно врахувати
//    лише перший з них.
// Black Dog Appears and Disappears
//   a 5

    public static void main(String[] args) {
        calculOfSymbols();
    }

    public static void calculOfSymbols() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some sentence");

        String sent = scn.nextLine();

        String sentLowerCase = sent.toLowerCase(Locale.ROOT);

        Map<Character, Integer> map = new HashMap<>();  // обявлення = ініціалізація

        for (int i = 0; i < sentLowerCase.length(); i++) {

            if (map.containsKey(sentLowerCase.charAt(i))) {
                map.put(sentLowerCase.charAt(i), 1 + map.get(sentLowerCase.charAt(i)));
            } else map.put(sentLowerCase.charAt(i), 1);
        }

        int count = 0;
        char characterKey = ' ';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() > count) {
                count = entry.getValue();
                characterKey = entry.getKey();
            }

        }
        if (characterKey == ' ') {
            System.out.print("white space");
        }
        System.out.println(characterKey + " " + count);
    }
}



