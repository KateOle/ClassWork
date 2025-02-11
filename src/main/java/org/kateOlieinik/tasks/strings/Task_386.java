package org.kateOlieinik.tasks.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_386 {

//    Послідовності із символів 0 і 1 називаються бінарними. Вони широко застосовуються в інформатиці.
//    Одне з незручностей бінарних послідовностей – їх важко запам’ятовувати. Для вирішення цієї проблеми був
//    запропонований такий спосіб їх стиснення: переглядаючи послідовність зліва направо, виконується заміна 1 на a,
//    01 на b, 001 на c, ..., 00000000000000000000000001 на z. Напишіть програму, яка допоможе автоматизувати
//    такий процес заміни.

    public static void main(String[] args) {
        exchangeNumbersToLatters();
    }

    public static void exchangeNumbersToLatters(){

        Map<String, Character> map = new HashMap<>();

       Scanner scn = new Scanner(System.in);

        System.out.println("Enter some binar number");

        String numb = scn.nextLine();

        String binNumb = "1";

        String alphab = "";

        for (int i = 0; i < 26; i++) {

            map.put(binNumb, (char)(i+97));
            binNumb = "0" + binNumb;
        }

          String[] arrayNumb = numb.split("1");

        String[] collect = new String[arrayNumb.length];
        for (int i = 0; i < arrayNumb.length; i++) {
            collect[i] = arrayNumb[i] + "1";

        }

        for (int i = 0; i < collect.length; i++) {
            System.out.print(map.get(collect[i]));
        }

//        for (Map.Entry<String, Character> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
//        }

     //   System.out.println(map.get(numb));





//        Scanner scn = new Scanner(System.in);
//
//        System.out.println("Enter some number");
//
//        String numb = scn.nextLine();
//
//        String exch = "";
//        String lat = "a";
//
//        for (int i = 0; i < numb.length(); i++) {
//
//            if (1 == lat){
//
//             }
//
//
//        }


    }

}
