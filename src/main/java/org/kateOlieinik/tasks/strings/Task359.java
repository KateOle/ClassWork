package org.kateOlieinik.tasks.strings;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task359 {

//   359. Напишіть програму, яка зчитує рядок, введений користувачем, що містить дату у формі mm/dd/yyyy.
//    Програма має вивести на екран дату у вигляді Місяць Число, Рік.
  //  12/29/2022    - December 29, 2022

    public static void main(String[] args) {
        dateTransformer();
    }

    public static void dateTransformer() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some date");

        String date = scn.nextLine();

        DateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
        Date date1 = new Date();
        try {
        date1 = format1.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        DateFormat format2 = new SimpleDateFormat("MMMMM dd, yyyy");
        String dateString = format2.format(date1);
        System.out.println(dateString);
    }

}
