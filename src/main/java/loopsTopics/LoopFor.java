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
        int min = (int) Math.pow(10, n - 1);

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
        while (a > 1) {
            //  System.out.println("..." + div);
            if (a % div == 0) {
                a = a / div;
                // System.out.println(div + " " + a);
                d.add(div);
            } else {
                div += 1;
            }
        }
        LinkedList<Integer> e = new LinkedList<>();
        int div1 = 2;
        while (b > 1) {
            //  System.out.println("..." + div);
            if (b % div1 == 0) {
                b = b / div1;
                //  System.out.println(div1 + " " + b);
                e.add(div1);
            } else {
                div1 += 1;
            }
        }
        // d.toArray();
    }

    public static void algorithmEuclida1() {
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
//        int a = 10;
//        int b = 10;

        int r = a % b;
        int temp = 0;
        if (a == b) {
            System.out.println(a);
            return;
        }
        if (b > a) {
            temp = a;
            a = b;
            b = temp;
        }

        int maxIterations = 50;
        while (r > 0 && maxIterations > 0) {
            a = b;
            b = r;
            r = a % b;
            maxIterations--;
        }
        System.out.println(b);


    }

    public static void numberOfDigitFromTheEnd() {
//   290. Дано натуральне число n. Визначити номер деякої заданої цифри d в ньому, відраховуючи від кінця числа.
//    Якщо такої цифри немає, відповіддю має бути число 0; якщо таких цифр в числі кілька, повинен бути визначений номер
//    позиції найправішої з них.

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter long number");

        int a = scn.nextInt();

        System.out.println("Enter 1 digit number");

        int b = scn.nextInt();

        int result = 0;

        int curentNumber = a;

        int count = 0;
        int curentDigit = -1;

        while (curentNumber != 0) {
            curentDigit = curentNumber % 10;
            curentNumber = curentNumber / 10;
            count++;

            if (curentDigit == b) {
                result = count;
                break;
            }
        }
        System.out.println(result);
    }

    public static void polindrom() {
//    294. Дано два чотирицифрових числа a і b. Виведіть усі чотирицифрові числа на відрізку від a до b,
//    які є паліндромами (читаються однаково як зліва направо, так і справа наліво).

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter 4 digits number");

        int a = scn.nextInt();

        System.out.println("Enter 4 digits number");

        int b = scn.nextInt();


        for (int i = a; i <= b; i++) {
            int lastDigitOfCurrentNumber = i % 10;
            int firstDigitOfCurrentNumber = i / 1000;
            int secondDigitFromTheEndOfCurrentNumb = (i / 10) % 10;
            int secondDigitOfCurrentNumber = (i / 100) % 10;

            if (lastDigitOfCurrentNumber == firstDigitOfCurrentNumber & secondDigitFromTheEndOfCurrentNumb == secondDigitOfCurrentNumber) {
                System.out.println(i);
            }
        }

    }


    public static void rowOfCards() {
        //    296. Для настільної гри використовуються картки з номерами від 1 до n. Одна картка загубилася. Знайдіть її,
//    знаючи номери решти карток. Користувач вводить ціле число n, далі n-1 номери решти карток
//    (різні числа від 1 до n). Програма повинна вивести номер втраченої картки.

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number of card");

        int a = scn.nextInt();

        int[] numbers = new int[a];


        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = scn.nextInt();
        }

        for (int i = 1; i <= a; i++) {
            boolean fi = false;
            for (int j = 0; j < numbers.length; j++) {
                if (i == numbers[j]) {
                    fi = true;
                }
            }
            if (!fi) {
                System.out.println(i);
            }
        }
    }


    public static void division() {
//   297.  Оленка вчиться ділити з залишком. Вона взяла деяке число, розділила його на 2 і відкинула залишок.
//        Те, що вийшло, розділила на 3 та знову відкинула залишок. Отримане число вона розділила на 4, відкинула
//    залишок і отримала число k. Яке число могла вибрати Оленка спочатку? Вводиться натуральне число k,
//    що не перевершує 1000. Необхідно вивести усі можливі числа, які могла б вибрати спочатку Оленка,
//    за зростанням, розділяючи їх пропусками.

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number less than 1000");

        int k = scn.nextInt();

        int res = 0;
        for (int i = 0; i <= 23; i++) {
            res = 24 * k + i;
            System.out.println(res + " ");
        }
    }

    public static void amountOfNumbers() {
//    298. Скільки всього натуральних чисел складаються з не менш ніж a цифр і не більше, ніж b цифр?
//    Вводяться два довільних натуральних числа a і b в окремих рядках. Виведіть одне число: кількість чисел,
//    що володіють зазначеними властивостями.
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number a");

        int a = scn.nextInt();

        System.out.println("Enter a number b");

        int b = scn.nextInt();

        int powA = (int) Math.pow(10, a - 1) - 1;
        int powB = (int) Math.pow(10, b) - 1;

        System.out.println(powB - powA);
    }

    public static void devideToEveryDigit() {
//   299. Дано натуральне число n (n ≤ 1000). Скласти програму для перевірки чи ділиться ціле число на кожну з його
//    цифр без залишку. Надрукувати такі числа в інтервалі від 10 до n в порядку зростання, через пропуск.

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number n");

        int n = scn.nextInt();


        int res = 0;
        for (int i = 0; i < n; i++) {
            if (n >= 100) {
                int a1 = n % 10;
                int a2 = (n / 10) % 10;
                int a3 = n / 100;
                if (n % a1 == 0 & n % a2 == 0 & n % a3 == 0 & a1 != 0 & a2 != 0 & a3 != 0)
                    System.out.println(n);
            } else if (n >= 10) {
                int a1 = n % 10;
                int a2 = n / 10;
                if (n % a1 == 0 & n % a2 == 0 & a1 != 0 & a2 != 0)
                    System.out.println(n);
            }
        }
    }

    public static void money() {
//   300. В одній країні використовуються грошові купюри номіналом в 1, 2, 4, 8, 16, 32 і 64. Дано натуральне число n.
//    Якою найменшою кількістю таких грошових знаків можна виплатити суму n (вказати кількість кожної з
//            використовуваних для виплати купюр)? Передбачається, що є досить велика кількість купюр всіх номіналів.

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter amount of money");

        int n = scn.nextInt();

        int[] m = new int[7];

        for (int i = 6; i >= 0; i--) {
            m[i] = n / (int) Math.pow(2, i);
            n = n % (int) Math.pow(2, i);
            System.out.println((int) Math.pow(2, i) + " - " + m[i]);
        }
    }

    public static void findTwoNumbersifKnownSumAndMultiple() {
        // 301. Задумали два натуральних числа x і y (x, y ≤ 1000). Щоб відгадати ці числа, називають суму цих
// чисел a і їх добуток b. Відгадайте ці числа і виведіть їх в порядку зростання, розділяючи пропуском.

        boolean flag = true;

        while (flag) {
            Scanner scn = new Scanner(System.in);

            System.out.println("Enter Sum of numbers in mind (every number less then 1001)");

            int a = scn.nextInt();

            System.out.println("Enter Multiple of numbers in mind (every number less then 1001)");

            int b = scn.nextInt();

            int d = 0;
            int x = 0;
            int y = 0;

            // x + y = a; x*y = b
            //x = a - y
            // (a - y)*y = b
            // a*y - y*y - b = 0
            //-y*y + a*y -b = 0 |(*-1)
            //y*y -a*y + b = 0

            d = (int) Math.pow(a, 2) - 4 * b;
            y = (a + (int) Math.sqrt(d)) / 2;
            x = (a - (int) Math.sqrt(d)) / 2;

            if (x > 1000 || y > 1000) {
                System.out.println(" Numbers in mind more then 1000, enter smaller numbers ");

            } else {
                System.out.println(y + " " + x);
                flag = false;
            }
        }
    }

    public static void intervalOddNumbers() {
//   302 Надрукувати всі непарні числа з інтервалу [a, b] (a ≥ b). Розглянути варіант програми без використання
//    інструкції розгалуження.

        Scanner scn = new Scanner(System.in);

        System.out.println(" Enter beginning of interval ");

        int a = scn.nextInt();

        System.out.println(" Enter end of interval ");

        int b = scn.nextInt();

        for (int i = a - (1 - a % 2); i >= b; i = i - 2) {   // i-=2
            System.out.println(i);
        }
    }

    public static void intervalOddNumbers1() {
//   302 Надрукувати всі непарні числа з інтервалу [a, b] (a ≥ b). Розглянути варіант програми без використання
//    інструкції розгалуження.

        Scanner scn = new Scanner(System.in);

        System.out.println(" Enter beginning of interval ");

        int a = scn.nextInt();

        System.out.println(" Enter end of interval ");

        int b = scn.nextInt();

        // more optimal to make bigger steps in cycle than check every step (now checks every second step)
        if (a % 2 == 0)
            a -= 1;
        for (int i = a; i >= b; i = i - 2) {   // i-=2
            System.out.println(i);
        }
    }

    public static void intervalOfEvenNumbers() {
//    302 Надрукувати всі парні числа з інтервалу [a, b] (a ≤ b). Розглянути варіант програми без використання
//    інструкції розгалуження.

        Scanner scn = new Scanner(System.in);

        System.out.println(" Enter beginning of interval ");

        int a = scn.nextInt();

        System.out.println( " Enter end of interval ");

        int b = scn.nextInt();

        if (a % 2 != 0)
            a = a + 1;

        for (int i = a; i <=b ; i += 2) {
            System.out.print(i + " ");
        }
    }
}

