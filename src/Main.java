// import topic_If.CharProblem;


import dataType.NumericTypes;
import ifTopics.*;

public class Main {


    public static void main(String[] args) {

        //  ArraysOneD.SumHalfOfArray();

      //  ArraysTwoDimensional.filterOddRowsOddLines();

      //  NumericTypes.decimalNumbers();

      //  NumericTypes.massOfFlour();

       // NumericTypes.amountOfSegmentB();

      //  NumericTypes.sumOfNumber();
      //  NumericTypes.hoursOfSlep();
      //  NumericTypes.sumOfNaturalNumbers();
      //  NumericTypes.amountOfTables();
     //   NumericTypes.firstDiitAfterComa();
     //   NumericTypes.amountOfWorkDaysAndWeekends();
       //   Calculator.calculatorIndexMassOfBody();
     // NumericTypes.angleOfClockWise();
        NumericTypes.angleOfMinuteClockWise();


//        int[][] matric = new int[3][3];
//
//        matric[0][0] = 5;


//        int[] newNumbers1 = new int[newNumbers.length];
//        for (int i = 0, j = newNumbers.length - 1; i < newNumbers.length && j > -1; i++, j--) {
//          //  newNumbers1[i] = newNumbers[newNumbers.length - (i + 1)];
//            newNumbers1[i] = newNumbers[j];
//            System.out.println(newNumbers1[i]);
//        }


//        String[] fruits = new String[3];

//        Дано масив {2,3,9,-1,14,-25,17,-7,9,4,3}
//        Знайти:
//        1. суму додатніх
//        2. добуток відємних
//        3. найбільше
//        4. найменше
//        5. середнє
//
//        int[] numbers = new int[]{2, 3, 9, -1, 14, -25, 17, -7, 9, 4, 3};
//
////                1. суму додатніх
//        int sum = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > 0) {
//                sum = sum + numbers[i];
//            }
//        }
//        System.out.println(sum);
//
//        //        2. добуток відємних
//        int multi = 1;
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] < 0) {
//                multi = multi * numbers[i];
//            }
//        }
//        System.out.println(multi);
//
//        //        3. найбільше
//        int max = numbers[0];
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > max) {
//                max = numbers[i];
//            }
//        }
//        System.out.println(max);
//
//        //        4. найменше
//        int min = numbers[0];
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] < min) {
//                min = numbers[i];
//            }
//        }
//        System.out.println(min);
//
//        //        5. середнє
//        double average = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > 0) {
//                average = average + numbers[i];
//            }
//        }
//        average = average/numbers.length;
//        System.out.println(average);

//        Дано масив {2.3,1.7,3.5,5,9,10.0,11.77,4}
//        1. Перетворити його в цілочисельний масив (створити новий і в нього все перегнати)
//        2. відібрати тільки ті числа які більші за 8 і записати в новий масив
//        3. всі числа помножити на 10 і записати в новий масив
//        4. всі числа помножити на середнє значення і перенести в новий масив
//        5. знайти середнє всіх чисел. Взяти всі що більші за середнє і до них додати десять і перенести в новий масив

//        double[] numbers = new double[]{2.3, 1.7, 3.5, 5, 9, 10.0, 11.77, 4};

//        1. Перетворити його в цілочисельний масив (створити новий і в нього все перегнати)
//        int[] newNumbers = new int[numbers.length];
//
//        for (int i = 0; i < numbers.length; i++) {
//            newNumbers[i] = (int) numbers[i];
//            System.out.print(newNumbers[i] + " ");
//        }
//        2. відібрати тільки ті числа які більші за 8 і записати в новий масив
//        int count = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > 8) {
//                count = count + 1;
//            }
//        }
//
//        double[] moreThanEight = new double[count];
//
//        int j = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > 8) {
//                moreThanEight[j] = numbers[i];
//                j = j + 1;
//            }
//        }
//
//        for (int i = 0; i < moreThanEight.length; i++) {
//
//            System.out.println(moreThanEight[i]);
//        }
//
//        //        3. всі числа помножити на 10 і записати в новий масив

//        double[] numbers = new double[]{2.3, 1.7, 3.5, 5, 9, 10.0, 11.77, 4};
//        double[] multiTen = new double[numbers.length];
//
//        for (int i = 0; i < numbers.length; i++) {
//            multiTen[i] = 10 * numbers[i];
//        }
//        for (int i = 0; i < multiTen.length; i++) {
//            System.out.print(multiTen[i] + " ");
//        }

//        4. всі числа помножити на середнє значення і перенести в новий масив

//        double[] numbers = new double[]{2.3, 1.7, 3.5, 5, 9, 10.0, 11.77, 4};
//        double[] averageMulti = new double[numbers.length];
//
//        double average = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            average = average + numbers[i];
//        }
//        average = average/numbers.length;
//
//        for (int n = 0; n < numbers.length; n++) {
//            averageMulti[n] = average * numbers[n];
//        }
//
//           for(int i=0;i<averageMulti.length; i++){
//            System.out.print(  String.format("%5.2f ",averageMulti[i]));
//        }

//        5. знайти середнє всіх чисел. Взяти всі що більші за середнє і до них додати десять і перенести
//        в новий масив

//        double[] numbers = new double[]{2.3, 1.7, 3.5, 5, 9, 10.0, 11.77, 4};
//        int count = 0;
//
//        double average = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            average = average + numbers[i];
//        }
//       average = average/numbers.length;
//
//        for (int i = 0; i < numbers.length; i++) {
//           if (numbers[i] > average) {
//               count = count + 1;
//           }
//        }
//        double[] newNumbers = new double[count];
//       int j = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > average) {
//                newNumbers[j] = numbers[i] + 10;
//                System.out.println(newNumbers[j]);
//                j++;
//            }
//        }

//


// 3 fruits, if 2 of them are match, printing - 'matches' if not, printing - 'don't match'
//                boolean flag = false;
//
//                fruits [0] = "Apple";
//                fruits [1] = "Orange";
//                fruits [2] = "Banana";
//
////               if (fruits [0] == fruits [1] || fruits [1] == fruits [2] || fruits [0] == fruits [2]) {
////                       System.out.println("Match");
////               } else System.out.println("Don't match");
//
//                // solution with flags
//                if (fruits [0] == fruits [1] || fruits [1] == fruits [2] || fruits [0] == fruits [2]) {
//                        flag = true;
//                        System.out.println("Match");
//                } else System.out.println("Don't match");

//
//    int[] numbers = new int[]{3, 5, 8, 9, 12, 26};


//        // Znajty max chyslo
//
//        int max = numbers[0];
//
//        for (int i = 0; i <= 5 ; i++) {
//            if (numbers[i] < max) {
//                max = numbers[i];
//            }
//
//        }
//        System.out.println(max);

//        // kilkist parnych
//        int kilk = 0;
//
//        for (int i = 0; i <= 5 ; i++) {
//            if (numbers[i] % 2 == 0) {
//                kilk = kilk +1;
//            }
//        }
//        System.out.println(kilk);


//        int sum = 0;
//
//        for (int i = 0; i <= 5; i++) {
//            if (numbers[i] < 10) {
//                sum = sum + numbers[i];
//            }
//        }
//        System.out.println(sum);

//                int multiOfTwo = 1;
//
//                for (int i = 0; i <=5 ; i++) {
//                        multiOfTwo = multiOfTwo * numbers[i];
//                }
//                System.out.println(multiOfTwo);


//                int sumOfTwo = 0;
////                sumOfTwo = sumOfTwo + numbers[1];
////                sumOfTwo = sumOfTwo + numbers[2];
////                sumOfTwo = sumOfTwo + numbers[3];
////                sumOfTwo = sumOfTwo + numbers[4];
////                sumOfTwo = sumOfTwo + numbers[5];
//
//                for (int i = 0; i <= 5; i++) {
//                        sumOfTwo = sumOfTwo + numbers[i];
//                    }
//                System.out.println(sumOfTwo);


// Arrays
//                int[] testMass = new int[4];
//
////                testMass[0] = 5;
////                testMass[0] = testMass[0] + 10;  // 15 = 5 + 10
//////              testMass[1] = 12;
////                testMass[2] = 21;
////                testMass[3] = 15;
//              //  testMass[4] = 6; // ArrayIndexOutOfBoundsException
//
//               // System.out.println(testMass);
//
//                for (int i = 0; i < testMass.length; i++){
//                        System.out.println(testMass[i]);
//                }

// Array 100 element. od 0 do 99
//              int [] array = new int[100];
//
//
//                for (int i = 0; i < array.length; i++) {
//                        array[i] =100 + i;
//                     System.out.println(i + " element " + array[i]);
//
//                }

// 4 partii - 0, 1, 2, 3. 1000 people in every parties. 20% of people move to the party there speaker tells.
// Speaker 0 is telling.


//      3. Конвертор валют. Є на виібр 4 валюти: гривні, долари, євро і злоті.
//      Користувач вводить скільки в ньогоо є на одній валюті, а отримує скільки це на іншій яку він вказав

//
//                User a = new User();
//                User andrii = new User();
//
//                a.age = 23;
//  }

//}

//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Enter number 1");
//            double number1 = scanner.nextDouble();
//            System.out.println("Enter number 2");
//            double number2 = scanner.nextDouble();
//
//            System.out.println("Enter sign: +, -, *, /");
//            char sign = scanner.next().charAt(0);
//
//            while (sign != '+' & sign != '-' & sign != '*' & sign != '/') {
//                System.out.println("Enter valid sign: +, -, *, /");
//                sign = scanner.next().charAt(0);
//            }
//
//            if ( sign == '/' ) {
//                while (number2 == 0) {
//                    System.out.println("Enter other number, not zero");
//                    number2 = scanner.nextDouble();
//                }
//            }
//
//            double a = calculator(number1, number2, sign);
//            calculationResult(a);
//
//    }


// 4. Три игровые кости. рассчитать кто выиграл
//    public static int multi(int a, int b, int c) {
//        return a * b * c;
//    }
//
//    public static int twoMulti(int a) {
//        return a * 2;
//    }
//
//    public static void task1 () {
//
//        System.out.println("Input an age");
//
//        Scanner age = new Scanner(System.in);
//
//        short n = age.nextShort();
//
//        if (isMoreThan18(n)) {
//            System.out.println("Vouting");
//        } else {
//            System.out.println("Not vouting");
//        }
//
//    }
//
//    public static boolean isMoreThan18(int age){
//        return age >= 18;
//    }
//
//
//    public static void main(String[] args) {

//       multi (2, 4, 7);
//        System.out.println(multi (4, 5, 7));

//        int b = twoMulti(5);
//        System.out.println(b);

//  task1();

// 3. рассчитать корни квадратного уровнения

//        Scanner n = new Scanner(System.in);
//
//        System.out.println("Input a");
//        double a = n.nextDouble();
//        System.out.println("Input b");
//        double b = n.nextDouble();
//        System.out.println("Input c");
//        double c = n.nextDouble();
//
//        double d = b * b - 4 * a * c;
//
//        if (d > 0) {
//            double x1 = (-b + Math.sqrt(d)) / (2 * a);
//            double x2 = (-b - Math.sqrt(d)) / (2 * a);
//
//            System.out.println(MessageFormat.format("Korni x1 = {0}, x2 = {1}", x1, x2));
//
//          //  System.out.println("Korni " + x1 + " i " + x2);
//        } else if (d == 0) {
//            double x3 = (-b) / (2 * a);
//            System.out.println("Koren " + x3);
//        } else {
//            System.out.println("Kornej net");
//        }



    }
}


