package dataType;

import java.util.Scanner;

public class NumericTypes {

    // 56.  Дано натуральне число. Знайдіть цифру, що стоїть в розряді десятків в десятковому записі числа (друга цифра,
    // якщо рахувати з кінця запису).

    public static void decimalNumbers() {

        System.out.println("Input the number ");
        Scanner scn = new Scanner(System.in);

        int i = scn.nextInt();

        int dec = 0;
        int numb = 0;

        numb = i % 100;
        dec = numb / 10;


        System.out.println(dec);

    }

    public static void massOfFlour() {
        //57. Мама спекла пиріг з яблуками, в якому було 60% яблук, а решта - тісто. При цьому 30% тіста становили яйця і
        // цукор, решта - борошно. Вся маса пирога дорівнює m кг. Яка маса борошна в пирозі в грамах?

        System.out.println("Input mass of dough ");

        Scanner scn = new Scanner(System.in);

        double m = scn.nextDouble();

        //double dough = (m*0.4);

        double flour = m * 100 * 0.4 * 0.7;

        System.out.printf("%.2f", flour);  // okruglit do sotych

    }

    public static void amountOfSegmentB() {
        //58. Знайти кількість відрізків b, розміщених на відрізку a, і довжину незайнятої частини на відрізку a. Користувачем
        // вводиться довжина відрізка a, а потім довжина відрізка b на окремих рядках. Відповідь виводиться в одному рядку:
        // кількість відрізків b і довжина незайнятої частини відрізка a.

        System.out.println("Input lenght of segment A");


        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        System.out.println("Input lenght of segment B");
        int b = scn.nextInt();

        int amountOfB = a / b; // amount of segments b

        int lenghtOfB = b * amountOfB; // загальна довжина відрізків b
        int modOfSegmntA = a - lenghtOfB; // довжина незайнятої частини відрізка a

        System.out.printf("кількість відрізків b %d і довжина незайнятої частини відрізка a %d", amountOfB, modOfSegmntA);
    }

    public static void sumOfNumber() {
        //59. Вводиться додатне ціле трицифрове число. Знайти суму цифр числа.

        System.out.println("Enter three digit number");

        Scanner scn = new Scanner(System.in);

        int number = scn.nextInt();

        int sum1 = number % 10;

        int decim = number / 10;

        int sum2 = decim % 10;

        int sum3 = decim / 10;

        int sum = sum1 + sum2 + sum3;

        System.out.println(sum);

    }

    public static void hoursOfSlep() {
        // 60. Тетяна кожен день лягає спати рівно опівночі і нещодавно дізналась, що оптимальний час для її сну
        // становить t хвилин.
        // Тетяна хоче поставити собі будильник так, щоб він продзвенів рівно через t хвилин після півночі, однак для цього
        // необхідно вказати час сигналу у форматі години і хвилини. Допоможіть Тані визначити, на який час завести будильник.
        // Години і хвилини у виведенні програми повинні розташовуватися на різних рядках.

        System.out.println("Input how many minuts Tatiana needs to sleep");

        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        int hours = t / 60;

        int mins = t % 60;

        System.out.println(hours + " hours");
        System.out.println(mins);
    }


    public static void sumOfNaturalNumbers() {
        // 70. Напишіть програму сумування перших n натуральних чисел. Результатом має бути ціле число.

        System.out.println("Enter some natural number ");

        Scanner scn = new Scanner(System.in);

        int natur = scn.nextInt();
        int sum = 0;

        for (int i = 1; i <= natur; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

    }


    public static void amountOfTables() {
   //79. Школа вирішила замінити парти у трьох кабінетах. Кожна парта розрахована на двох учнів. Враховуючи кількість учнів
    // у кожному класі, надрукуйте найменшу можливу кількість парт, які треба придбати. Програма повинна прочитати три
    // цілих числа: кількість учнів в кожному з трьох класів a, b та c відповідно.

        System.out.println("Pupils in 1st class ");

        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        System.out.println("Pupils in 2nd class ");
        int b = scn.nextInt();
        System.out.println("Pupils in 3rd class ");
        int c = scn.nextInt();

        int tablesA = a / 2 + a % 2;
        int tablesB = b / 2 + b % 2;
        int tablesC = c / 2 + c % 2;

        int res = tablesA + tablesB + tablesC;

        System.out.println(res);

    }

    public static void firstDiitAfterComa() {
  //94.  Вводиться додатне дійсне число a. Виведіть його першу цифру після десяткового дробу. При розв’язуванні цього
  //  завдання не можна користуватися умовною конструкцією і циклом.

        System.out.println("Enter munber ");

        Scanner scn = new Scanner(System.in);

        double a = scn.nextDouble();

        double c = a - (int)a;

        double n = c * 10;

        System.out.println((int)n);
    }

        // 2. Ввести количество месяцев, и должно рассчитать количество рабочих дней и выходных
        public static void amountOfWorkDaysAndWeekends() {
            Scanner mies = new Scanner(System.in);

            System.out.println("Months");
            int m = mies.nextInt();

            int r = m * 20;
            int v = m * 8;

            System.out.println("Working days " + r);
            System.out.println("Weekends " + v);
        }

  // 95. З початку доби минуло h годин, m хвилин, s секунд (0 < h < 12, 0 < m < 60, 0 < s < 60). За даними числами h, m, s
    // визначте кут (в градусах), на який повернулаcь годинникова стрілка з початку доби і виведіть його у вигляді
    // дійсного числа. При розв’язуванні цього завдання не можна користуватися умовними конструкціями і циклами.

//    public static void angleOfClockWise() {
//        System.out.println("Enter hours ");
//
//        Scanner scn = new Scanner(System.in);
//
//        int h = scn.nextInt();
//
//        System.out.println("Enter minutes ");
//        int m = scn.nextInt();
//
//        System.out.println("Enter seconds ");
//        int s = scn.nextInt();
//
//        double angle = 0;
//
//        angle = 30*h + 0.5*m +0.008333*s;
//
//        System.out.println(angle);
//
//    }

//  96.  З початку доби годинникова стрілка повернулася на кут a градусів. Визначте на який кут повернулась хвилинна
//  стрілка з початку останньої години. Вхідні і вихідні дані - дійсні числа. При розв’язуванні цього завдання не можна
//  користуватися умовними конструкціями і циклами.



}