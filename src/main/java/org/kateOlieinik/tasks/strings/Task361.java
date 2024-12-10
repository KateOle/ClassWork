package org.kateOlieinik.tasks.strings;

import java.util.*;

public class Task361 {


    public static void main(String[] args) {
        dictionaryMorse();
    }

    public static void dictionaryMorse(){

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some character ");

        String charecter = scn.nextLine().toUpperCase(); // PYT

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

        for (int i = 0; i < charecter.length(); i++) {
            word += map.get(charecter.charAt(i) + "");  // sposob perevesti char w stroku
        }
        System.out.println(word);








    }
}
