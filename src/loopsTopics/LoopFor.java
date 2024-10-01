package loopsTopics;

import java.util.LinkedList;
import java.util.Scanner;

public class LoopFor {

//    250. Визначте суму усіх елементів послідовності, яка завершується числом 0. Вводиться послідовність цілих чисел,
//    що закінчується числом 0 (саме число 0 в послідовність не входить, а використовується як ознака її закінчення).

    public static void sumOfElements() {

        Scanner scn = new Scanner(System.in);

        System.out.println(" Enter some numbers ");

        int num = scn.nextInt();

        int count = 0;
        while (num != 0) {
            count = num + count;
            num = scn.nextInt();
        }

        System.out.println(count);
    }

    public static void averNumbers() {
//   251. Визначте середнє значення всіх елементів послідовності, яка завершується числом 0. Вводиться послідовність цілих
//    чисел, що закінчується числом 0 (саме число 0 в послідовність не входить, а використовується як ознака її закінчення).

        Scanner scn = new Scanner(System.in);

        System.out.println(" Enter some numbers ");

        int num = scn.nextInt();

        int count = 0;
        int i = 0;
        while (num != 0) {
            count = (num + count);
            i++;
            num = scn.nextInt();
        }
        count = count / i;

        System.out.println(count);
    }

    public static void power() {
        //260. Дано цілі числа a і b. Обчислити ab, не використовуючи операцію піднесення до степеня.

        Scanner scn = new Scanner(System.in);

        System.out.println(" Enter some number ");

        int num = scn.nextInt();

        System.out.println(" Enter power of number ");

        int pow = scn.nextInt();

        int count = 1;
        int a = 0;
        while (a < pow) {
            count = num * count;
            a++;
        }

        System.out.println(count);

    }

    public static void SumOfPower() {
//   261. Напишіть програму, яка зчитує числа (по одному в рядку) до тих пір, поки сума введених чисел не буде дорівнювати 0
//    і відразу після цього виводить суму квадратів всіх введених чисел. Гарантується, що в якийсь момент сума введених
//    чисел дорівнюватиме 0, після цього зчитування продовжувати не потрібно.

        Scanner scn = new Scanner(System.in);

        System.out.println(" Enter some number ");


        int sum = 0;
        double sumOfPower = 0;

        while (true) {
            int num = scn.nextInt();

            sum = num + sum;

            sumOfPower = sumOfPower + Math.pow(num, 2);

            if (sum == 0) {
                break;
            }
        }
        System.out.println(sumOfPower);
    }

    public static void minTempofMonth() {
//  263.  Учні 5 класу вели щоденники спостереження за погодою і щодня записували денну температуру. Знайдіть найнижчу
//    температуру за весь час спостережень. Якщо температура знижувалась нижче -15 градусів, необхідно вивести Yes,
//    у протилежному випадку No. Програма отримує на вхід кількість днів, протягом яких проводилося спостереження
//    n (1 ≤ n ≤ 31), потім для кожного дня вводиться температура.

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter how many days you are going to measure temperature from 1 till 31");
        int n = scn.nextInt();
        // int condOfEnd = 0;
        int compar = 0;

        for (int i = n; i > 0; i--) {

            int t = scn.nextInt();
            if (compar > t) {
                compar = t;
            }

        }
        if (compar < -15) System.out.println(" Yes ");
        else System.out.println(" No ");
        System.out.println(compar);

    }

    public static void minTempofMonthWhile() {
//  263.  Учні 5 класу вели щоденники спостереження за погодою і щодня записували денну температуру. Знайдіть найнижчу
//    температуру за весь час спостережень. Якщо температура знижувалась нижче -15 градусів, необхідно вивести Yes,
//    у протилежному випадку No. Програма отримує на вхід кількість днів, протягом яких проводилося спостереження
//    n (1 ≤ n ≤ 31), потім для кожного дня вводиться температура.

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter how many days you are going to measure temperature from 1 till 31");
        int n = scn.nextInt();

        int compar = 0;

        int i = 0;
        while (i < n) {

            int t = scn.nextInt();
            if (compar > t) {
                compar = t;
            }
            i++;
        }
        if (compar < -15) System.out.println(" Yes ");
        else System.out.println(" No ");
        System.out.println(compar);

    }

    public static void steps() {
//    268. За даним натуральним числом n (n ≤ 9) виведіть драбинку з n сходинок як у вихідних даних, n-а сходинка складається
//    з чисел від 1 до n без пропусків.

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter amount of steps ");
        int n = scn.nextInt();

        String str = "";
        int i = 1;

        while (i <= n) {

            str = str + i;
            System.out.println(str);
            i++;
        }
    }

    public static void stepsFor() {
//    268. За даним натуральним числом n (n ≤ 9) виведіть драбинку з n сходинок як у вихідних даних, n-а сходинка складається
//    з чисел від 1 до n без пропусків.

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter amount of steps ");
        int n = scn.nextInt();

        String str = "";

        for (int i = 1; i <= n; i++) {
            str = str + i;
            System.out.println(str);

        }
    }


    public static void isAutomorfnNumber() {
//   270. Дано натуральне число n. Визначити, чи є воно автоморфним числом. Примітка. Автоморфне число - число, квадрат
//    якого рівний останнім розрядами квадрата цього числа: 5 - 25, 6 - 36, 25 - 625.

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number ");

        int n = scn.nextInt();

        int pow = (int) Math.pow(n, 2);

        int count = 1;
        while (true) {
            if (n / 10 > 0) {
                count++;
                n = n / 10;
            } else break;
        }

        int endOfPow = 0;
        int endOfN = 0;
        //int beginOfNumb = 0;
        for (int i = 0; i < count; i++) {
            endOfPow = pow % 10;
            pow = pow / 10;

            endOfN = n % 10;
            n = n / 10;

        }
        if (endOfPow == endOfN) {
            System.out.println("True");
        } else System.out.println("False");
    }

    public static void oddNaturalNumer() {
   // 271. Дано натуральне число n. Надрукуйте всі n-значні непарні натуральні числа в порядку спадання.

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter of n-digit number");

        int n = scn.nextInt();

        int max = (int) Math.pow(10, n) - 1;
        int min = (int) Math.pow(10, n-1);

        for (int i = max; i >= min; i--) {
            if (i % 2 != 0) {
                System.out.printf("%d ", i);
            }
        }
    }

public static void algorithmEuclida() {
//    272. Дано два натуральних числа a і b. Розробити програму для визначення найбільшого спільного
//    дільника (НСД) заданих чисел. Використайте алгоритм Евкліда .
//    Алгоритм:
//            Пусть есть два числа a и b ( a>b ).
//            Найти остаток от деления a на b ( r=a%b ).
//            Если остаток r=0, то b — это НОД.
//    Если остаток r!=0, заменить a на b, а b на r, и повторить шаги до тех пор, пока остаток не станет 0.

    Scanner scn = new Scanner(System.in);

    System.out.println("Enter first number");

    int a = scn.nextInt();

    System.out.println("Enter second number");

    int b = scn.nextInt();

    LinkedList<Integer> d = new LinkedList<>();
    int div = 2;
    while (a > 1){
      //  System.out.println("..." + div);
        if (a % div == 0){
            a = a / div;
           // System.out.println(div + " " + a);
            d.add(div);
        }
        else{
            div += 1;
        }
    }
    LinkedList<Integer> e = new LinkedList<>();
    int div1 = 2;
    while (b > 1){
        //  System.out.println("..." + div);
        if (b % div1 == 0){
            b = b / div1;
          //  System.out.println(div1 + " " + b);
            e.add(div1);
        }
        else{
            div1 += 1;
        }
    }
   // d.toArray();


}
}
