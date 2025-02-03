package org.kateOlieinik.tasks.strings;

import javax.xml.crypto.Data;
import java.sql.Date;
import java.util.Scanner;

public class Task_381 {

//    Капітан Флінт закопав скарб на Острові скарбів. Він залишив опис, як знайти скарб. Опис складається з рядків виду:
//    North 5, де перше слово - одне з North, South, East, West, а друге число - кількість кроків, яку потрібно пройти в
//    цьому напрямку. Напишіть програму, яка за описом шляху до скарбу визначає точні координати скарбу, вважаючи, що
//    початок координат знаходиться на початку шляху, вісь OX спрямована на схід, вісь OY - на північ. Програма отримує
//    на вхід послідовність рядків зазначеного виду, а введення завершується рядком зі словом Treasure!. Програма має
//    вивести два цілих числа в один рядок з пропуском між ними - координати скарбу.

    public static void main(String[] args) {
        coordinates();

    }

    public static void coordinates() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some coordinates");

        String endOFInput = "Treasure!";
        // String[] strings = new String[4];
        int distanceY = 0;
        int distanceX = 0;

        while (true) {
            System.out.println("Do you want to give more coordinates?");

            String coordinate = scn.nextLine();

            String[] splittedCoordin = coordinate.split(" ");

            //  distanceX = Integer.parseInt(splittedCoordin[1]);
            //distanceY = Integer.parseInt(splittedCoordin[1]);

            String partOfWorld = splittedCoordin[0];

            switch (partOfWorld) {
                case "North": {
                    distanceY += Integer.parseInt(splittedCoordin[1]);
                    break;
                }
                case "South": {
                    distanceY -= Integer.parseInt(splittedCoordin[1]);
                    break;
                }
                case "East": {
                    distanceX += Integer.parseInt(splittedCoordin[1]);
                  break;
                }
                case "West": {
                    distanceX -= Integer.parseInt(splittedCoordin[1]);
                    break;
                }
            }

            if (endOFInput.equals(coordinate)) {
                break;
            }
        }
        System.out.println(distanceY + " " + distanceX);
    }
}
