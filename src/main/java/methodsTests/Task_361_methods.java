package methodsTests;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_361_methods {
//    Код Морзе - це код, в якому кожна буква алфавіту (наприклад, англійського),
//    кожна цифра та різні знаки пунктуації представляються набором крапок і дефісів.
//    Напишіть програму, яка перетворює рядок, введений користувачем, в код Морзе (таблицю значення кодів Морзе
//            знайдіть в Інтернеті).

    public static void main(String[] args) {
        printDictionaryMorse();
    }


    public static void printDictionaryMorse() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some character ");

        String characters = scn.nextLine().toUpperCase(); // PYT

        System.out.println(dictionaryMorse(characters));
        //dictionaryMorse(characters);

    }

        public static String dictionaryMorse(String character){

        Map<String, String> map = new HashMap<>();  // обявлення = ініціалізація

        map.put("W", ".--");
        map.put("9", "----.");
        map.put(",", ".----.");
        map.put("P", ".--.");
        map.put("Y", "-.--");
        map.put("T", "-");
        map.put(":", "---...");
        map.put(")", "-.-.-");

        String word = "";

        for (int i = 0; i < character.length(); i++) {
            word += map.get(character.charAt(i) + "");  // sposob perevesti char w stroku
        }

        return word;

        }
    }


