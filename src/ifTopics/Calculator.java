package ifTopics;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.SortedMap;

public class Calculator {

    public static void squareEquationRoots() {
        // 3. рассчитать корни квадратного уровнения

        Scanner n = new Scanner(System.in);

        System.out.println("Input a");
        double a = n.nextDouble();
        System.out.println("Input b");
        double b = n.nextDouble();
        System.out.println("Input c");
        double c = n.nextDouble();

        double d = b * b - 4 * a * c;

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println(MessageFormat.format("Korni x1 = {0}, x2 = {1}", x1, x2));

            //  System.out.println("Korni " + x1 + " i " + x2);
        } else if (d == 0) {
            double x3 = (-b) / (2 * a);
            System.out.println("Koren " + x3);
        } else {
            System.out.println("Kornej net");
        }
    }

    public static double calculator(double number1, double number2, char sign) {
        //  Калькулятор математичний. Користувач вводить два числа і знак між ними. Виводимо на екран
        //  результат.

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

    public static void calculationResult(double a) {

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

    // 105. Користувач вводить дві різних англійські літери в окремих рядках. Напишіть програму, яка виводить повідомлення про
    // місце розташування однієї літери відносно іншої у алфавіті.

    public static void placeOfLetters() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any letter ");

        char l = scanner.next().charAt(0);

        System.out.println("Enter any letter ");

        char l1 = scanner.next().charAt(0);

        if ((int) l < (int) l1) {
            System.out.println(l + " less then  " + l1 + " on " + (l1 - l));
        } else if ((int) l == (int) l1) {
            System.out.println(l + " the same as " + l1);
        } else if ((int) l > (int) l1) {
            System.out.println(l + " is not less then " + l1 + " on " + (l - l1));
        }
    }
    //  106.  Напишіть програму, в якій користувач вводить значення температури, і, якщо це значення менше або дорівнює
    //  0 градусів Цельсія, необхідно вивести повідомлення A cold, isn’t it?. Якщо ж температура становить більше 0
    //  і менше 10 градусів Цельсія повідомлення буде Cool., у інших випадках Nice weather we’re having..

    public static void weather() {

        Scanner scn = new Scanner(System.in);

        System.out.println(" Enter a temperature, C ");

        double t = scn.nextDouble();

        if (t <= 0) {
            System.out.println(" A cold, isn’t it? ");
        } else if (t < 10) {
            System.out.println(" Cool ");
        } else
            System.out.println(" Nice weather we’re having ");
    }

    public static void replaceEvenNumbers() {
        // 176   Дано чотирицифрове число. Замінити усі парні цифри числа на символ * і вивести число.

        Scanner scn = new Scanner(System.in);

        System.out.println(" Enter 4 digits number ");
        int number = scn.nextInt();

        char star = '*';
        String star1 = "";
        String star2 = "";
        String star3 = "";
        String star4 = "";
        int endOfNumber = number % 10;

        int secondFromTheEnd = (number / 10) % 10;
        int thirdFromTheEnd = (number / 100) % 10;
        int fourthFromTheEnd = number / 1000;

        if (endOfNumber % 2 == 0) {
            star1 += star;
        } else star1 += endOfNumber;  // stroka + czyslo = stroka
        if (secondFromTheEnd % 2 == 0) {
            star2 += star;
        } else star2 += secondFromTheEnd;
        if (thirdFromTheEnd % 2 == 0) {
            star3 += star;
        } else star3 += thirdFromTheEnd;
        if (fourthFromTheEnd % 2 == 0) {
            star4 += star;
        } else star4 += fourthFromTheEnd;


        String numberWithStars = star4 + star3 + star2 + star1;

        System.out.println(numberWithStars);
    }

    public static void replaceEvenNumbers1() {
        // 176   Дано чотирицифрове число. Замінити усі парні цифри числа на символ * і вивести число.

        Scanner scn = new Scanner(System.in);

        System.out.println(" Enter 4 digits number ");
        int number = scn.nextInt();

        char star = '*';

        int endOfNumber = number % 10;

        int secondFromTheEnd = (number / 10) % 10;
        int thirdFromTheEnd = (number / 100) % 10;
        int fourthFromTheEnd = number / 1000;

        String numberWithStars = "";


        if (fourthFromTheEnd % 2 == 0) {
            numberWithStars += star;
        } else numberWithStars += fourthFromTheEnd;
        if (thirdFromTheEnd % 2 == 0) {
            numberWithStars += star;
        } else numberWithStars += thirdFromTheEnd;
        if (secondFromTheEnd % 2 == 0) {
            numberWithStars += star;
        } else numberWithStars += secondFromTheEnd;
        if (endOfNumber % 2 == 0) {
            numberWithStars += star;
        } else numberWithStars += endOfNumber;  // stroka + czyslo = stroka

        System.out.println(numberWithStars);
    }


    public static void traficLight() {
//   179.  Робота світлофора для водіїв запрограмована таким чином: на початку кожної години протягом трьох хвилин горить
//    зелений сигнал, потім протягом однієї хвилини - жовтий, потім протягом двох хвилин - червоний, а далі протягом
//    трьох хвилин - знову зелений і т. д. Дано ціле число t, що позначає час у хвилинах, що минув з початку чергової години.
//        Визначити, сигнал якого кольору горить для водіїв в цей момент.

        Scanner scn = new Scanner(System.in);

        System.out.println(" Enter t (minutes) ");

        int t = scn.nextInt();

        // 1 loop - 6 min
        if (t % 6 == 1 || t % 6 == 2 || t % 6 == 3) {
            System.out.println(" Green ");
        }

        if (t % 6 == 4) {
            System.out.println(" Yellow ");
        }
        if (t % 6 == 5 || t % 6 == 0) {
            System.out.println(" Red ");
        }
    }

    public static void forDigitsPolindrom() {
//  180.  Дано чотирицифрове число. Перевірте, чи є воно паліндромом. Паліндромом називається число, слово або текст, які однаково
//    читаються зліва направо і справа наліво. Наприклад, в нашому випадку, числами-паліндромами будуть: 1221, 4444, 9119 і т. д.
//    Приклади інших цілих чисел-паліндромів, що не відносяться до розв’язуваної задачі: 2, 454, 33, 91219 і т. д.

        Scanner scn = new Scanner(System.in);

        System.out.println(" Enter 4 digits number ");

        int n = scn.nextInt();

        if (n % 10 == n / 1000 && n % 100 / 10 == n % 1000 / 100) {
            System.out.println(" polindrom ");
        } else System.out.println("False");
    }

    public static void integerToBinary() {
//    181. Дано однобайтове десяткове число (у межах 128-255). Перевірити, чи є двійкове подання десяткового числа паліндромом,
//    з урахуванням зберігання старших нулів у двійковому поданні. Приклад таких десяткових чисел: 102 (у двійковому
//        форматі 01100110), 129 (у двійковому вигляді 10000001) і т. д.

        Scanner scn = new Scanner(System.in);

        System.out.println(" Enter a number between 128 - 255 ");

        int n = scn.nextInt();


        if (Integer.toBinaryString(n).substring(0, 4).equals(new StringBuilder(Integer.toBinaryString(n).substring(4, 8)).reverse().toString())) {
            System.out.println(" True");
        } else System.out.println("False");
    }


    public static void nextDay() {
        //182. Напишіть програму, у якій користувач вводить значення поточної дати: день, місяць і рік (цілі числа),
        // а програма
        //виводить завтрашню дату у форматі: дд.мм.рррр.

        Scanner scnDay = new Scanner(System.in);
        Scanner scnMonth = new Scanner(System.in);
        Scanner scnYear = new Scanner(System.in);

        System.out.println("Enter a day ");

        int day = scnDay.nextInt();

        System.out.println("Enter a month ");

        int month = scnMonth.nextInt();

        System.out.println("Enter a year ");

        int year = scnYear.nextInt();

        switch (month) {
            case 1:
                day = day + 1;
                if (day > 31) {
                    day = 1;
                    month = month + 1;
                }
                System.out.println(day + "." + month + "." + year);
                break;
            case 2:
                day = day + 1;
                if (day > 28 && year % 4 != 0) {
                    day = 1;
                    month = month + 1;
                }
                if (year % 4 == 0 && day == 28) {
                    day = day + 1;
                }
                System.out.println(day + "." + month + "." + year);
                break;
            case 3:
                day = day + 1;
                if (day > 31) {
                    day = 1;
                    month = month + 1;
                }
                System.out.println(day + "." + month + "." + year);
                break;
            case 4:
                day = day + 1;
                if (day > 30) {
                    day = 1;
                    month = month + 1;
                }
                System.out.println(day + "." + month + "." + year);
                break;
            case 5:
                day = day + 1;
                if (day > 31) {
                    day = 1;
                    month = month + 1;
                }
                System.out.println(day + "." + month + "." + year);
                break;
            case 6:
                day = day + 1;
                if (day > 30) {
                    day = 1;
                    month = month + 1;
                }
                System.out.println(day + "." + month + "." + year);
                break;
            case 7:
                day = day + 1;
                if (day > 31) {
                    day = 1;
                    month = month + 1;
                }
                System.out.println(day + "." + month + "." + year);
                break;
            case 8:
                day = day + 1;
                if (day > 31) {
                    day = 1;
                    month = month + 1;
                }
                System.out.println(day + "." + month + "." + year);
                break;
            case 9:
                day = day + 1;
                if (day > 30) {
                    day = 1;
                    month = month + 1;
                }
                System.out.println(day + "." + month + "." + year);
                break;
            case 10:
                day = day + 1;
                if (day > 31) {
                    day = 1;
                    month = month + 1;
                }
                System.out.println(day + "." + month + "." + year);
                break;
            case 11:
                day = day + 1;
                if (day > 30) {
                    day = 1;
                    month = month + 1;
                }
                System.out.println(day + "." + month + "." + year);
                break;
            case 12:
                day = day + 1;
                if (day > 31) {
                    day = 1;
                    month = 1;
                    year = year + 1;
                }
                System.out.println(day + "." + month + "." + year);
                break;
        }
    }


    public static void previousDate() {
//    183. Напишіть програму, у якій користувач вводить значення поточної дати: день, місяць і рік (цілі числа), а програма
//    виводить вчорашню дату у форматі: дд.мм.рррр.

        Scanner scnDay = new Scanner(System.in);
        Scanner scnMonth = new Scanner(System.in);
        Scanner scnYear = new Scanner(System.in);

        System.out.println("Enter a day ");

        int day = scnDay.nextInt();

        System.out.println("Enter a month ");

        int month = scnMonth.nextInt();

        System.out.println("Enter a year ");

        int year = scnYear.nextInt();

        LocalDate currentDate = LocalDate.of(year, month, day);

        LocalDate prevDate = currentDate.minusDays(1);

        System.out.println(" Previous date is " + prevDate);
    }


}