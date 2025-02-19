package methodsTests;

import java.util.Scanner;

public class Task_360_methods {

//   360. Вводиться рядок. Необхідно видалити з нього всі пропуски. Після цього визначити, чи є він паліндромом,
//    тобто однаково пишеться як зліва направо, так і справа наліво. Програма має вивести Yes, якщо слово
//    є паліндромом, або No у протилежному випадку.

        public static void main(String[] args) {
            isPolindrom();
        }

        public static void printPolindrom(){
            Scanner scn = new Scanner(System.in);

            System.out.println("Enter some sentence ");

            String pol = scn.nextLine();

        }

        public static boolean isPolindrom(String polendrom) {


            String polindrWithoutSpaces = polendrom.toLowerCase().replace(" ", "");

            StringBuilder reversedPolindromStringBuilder = new StringBuilder(polindrWithoutSpaces).reverse();

            //System.out.println(reversedPolindromStringBuilder);

            String reversedPolindromString = reversedPolindromStringBuilder.toString();

            if (reversedPolindromString.equals(polindrWithoutSpaces)) {
                System.out.println("yes");
            } else System.out.println("No");
        }
    }
