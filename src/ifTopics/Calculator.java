package ifTopics;

import java.util.Scanner;

public class Calculator {

   public static double calculator(double number1, double number2, char sign) {
//
//        //  Калькулятор математичний. Користувач вводить два числа і знак між ними. Виводимо на екран результат.
//
        if (sign == '+') {
            return number1 + number2;
        } else if (sign == '-') {
            return number1 - number2;
        } else if (sign == '*') {
            return number1 * number2;
        } else if (sign == '/') {
            return number1 / number2;
        } else
            return Double.NaN;
    }

    public static void calculationResult (double a) {

        System.out.println(a);
   }

    //        1. Калькулятор індексу маси тіла, як на сайті, щоб давало кілька варіантів який стан тіла.
//        https://empendium.com/ua/kalkulatory/278052,imt

    public static void calculatorIndexMassOfBody() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input weight");
        double m = scanner.nextDouble();
        System.out.println("Input height, meters 0.0");
        double h = scanner.nextDouble();

        double imt;

        imt = m / Math.pow(h, 2);

        if (imt < 18.5) {
            System.out.println("Not enought weight");
        } else if (imt >= 18.5 & imt < 25) {
            System.out.println("Normal weight");
        } else if (imt >= 25 & imt < 30) {
            System.out.println("Extra weight");
        }
    }



   }