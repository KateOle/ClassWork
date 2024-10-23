package stringsTopic;

import java.util.Locale;
import java.util.Scanner;

public class Strings {

public static void main(String[] args) {
  lastTwoCharFromTheLine();

}

    public static void stringUpperLowerCases() {
//   304. Напишіть програму, яка приймає від користувача рядок, і відображає цей рядок у верхньому і
//    нижньому регістрах.

        Scanner scn = new Scanner(System.in);

        System.out.println( " Enter some string ");

        String str1 = scn.nextLine();

         System.out.println(str1.toLowerCase(Locale.ROOT));

        System.out.println(str1.toUpperCase(Locale.ROOT));

    }

    public static void championTeam() {
// 305.   Скласти програму, яка запитує назву баскетбольної команди і повторює її на екрані зі словами:
//    This is a champion!.

        Scanner scn = new Scanner(System.in);

        System.out.println(" Enter a team name");

        String str = scn.nextLine();

        String str1 = "This is a champion!";

       // System.out.println(str.concat(str1));
        System.out.printf("%s! %s", str, str1);

    }

    public static void lastTwoCharFromTheLine() {
// 306.   Напишіть програму, яка виводить на екран рядок з 5-ти копій останніх двох символів введеного користувачем рядка
//            (довжина введеного рядка повинна бути не менше 2).

        Scanner scn = new Scanner(System.in);

        System.out.println( "Enter a string not less then 2 characters");

        String str = scn.nextLine();

        if (str.length() < 2) {
            System.out.println("Enter again a string not less then 2 characters");
        } else {       // fixme

            for (int i = 0; i < 5; i++) {
                String lastChar = str.substring(str.length() - 2);

                System.out.println(lastChar);
            }

        }


    }
}


