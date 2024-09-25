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
        count = count/i;

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
        while ( a < pow ){
            count = num * count;
            a++;
        }

        System.out.println(count);

    }
}