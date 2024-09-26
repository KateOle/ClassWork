package loopsTopics;

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

        for (int i = n; i > 0; i--){

            int t = scn.nextInt();
            if(compar > t) {
                compar = t;
            }

        }
        if (compar < -15) System.out.println(" Yes ");
        else System.out.println(" No ");
        System.out.println(compar);

    }
}