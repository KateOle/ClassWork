package org.lessons.methods;

import java.util.Scanner;

public class task_32_methods {
    // Вводяться три додатних числа - довжини сторін трикутника. Обчисліть площу трикутника за формулою Герона.


    public static void main(String[] args) {
        neteredSides();
    }

    public static void neteredSides() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter side of triangle");

        int a = scn.nextInt();

        System.out.println("Enter side of triangle");

        int b = scn.nextInt();

        System.out.println("Enter side of triangle");

        int c = scn.nextInt();

        System.out.println(squarOfTriangle(a, b, c));
    }


    public static double squarOfTriangle(int a, int b, int c){

        double p = (a + b + c)/2;

        double s = Math.sqrt(p *(p - a)*(p-b)*(p-c));

        return s;

    }


    public static class Task_360_methods {

    //   360. Вводиться рядок. Необхідно видалити з нього всі пропуски. Після цього визначити, чи є він паліндромом,
    //    тобто однаково пишеться як зліва направо, так і справа наліво. Програма має вивести Yes, якщо слово
    //    є паліндромом, або No у протилежному випадку.

            public static void main(String[] args) {
                printPalindrome();
            }

            public static void printPalindrome(){
                Scanner scn = new Scanner(System.in);

                System.out.println("Enter some sentence ");

                String pol = scn.nextLine();

                boolean result = isPalindrome(pol);

                if(result){
                    System.out.println("yes");
                } else System.out.println("no");

            }

            public static boolean isPalindrome(String palindrome) {


                String polindrWithoutSpaces = palindrome.toLowerCase().replace(" ", "");

                StringBuilder reversedPolindromStringBuilder = new StringBuilder(polindrWithoutSpaces).reverse();

                //System.out.println(reversedPolindromStringBuilder);

                String reversedPolindromString = reversedPolindromStringBuilder.toString();

                return reversedPolindromString.equals(polindrWithoutSpaces);
            }
        }
}
