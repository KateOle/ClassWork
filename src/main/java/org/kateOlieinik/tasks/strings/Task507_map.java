package org.kateOlieinik.tasks.strings;

import java.sql.Time;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class Task507_map {

//    Створіть словник зі списками добрих справ на сьогодні і на завтра. Надрукуйте із словника добрі справи,
//    які плануєш зробити сьогодні і взавтра.

    public static void main(String[] args) {
        goodActions();
    }

    public static void goodActions() {

        Map<String, LocalTime> mapToday = new HashMap<>();

        Map<String, Integer> mapTomorrow = new HashMap<>();

        mapToday.put("Take the child to the doctor", LocalTime.of(13, 10, 00));
        mapToday.put("Go to Gym", LocalTime.of(13, 10, 00));
        mapToday.put("Solve a problem in Java", LocalTime.of(13, 10, 00));

        mapTomorrow.put("Take children to dance class", 1);
        mapTomorrow.put("Cook halthy salat", 2);
        mapTomorrow.put("Walk in the evening", 3);

        System.out.println("Today:");
        for(String key : mapToday.keySet()){
            System.out.println(key);
        }
        System.out.println("Tomorrow:");
        for(String key : mapTomorrow.keySet()){
            System.out.println(key);
        }

    }

}
