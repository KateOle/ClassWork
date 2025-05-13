package arraysTopics;

public class ArraysOneD {

    public static void SumHalfOfArray() {


//        дано список чисел {3,2,-5,4,-4,1,-6,1,6,-3,-4,9}:
////        1. Знайти суму всіх неприх і відємних
//        2. Відсіяти в новий масив тільки ті які більші середнього
//        3. просумувати першу половину чисел

//        дано список чисел {3,2,-5,4,-4,1,-6,1,6,-3,-4,9}:
//        3. просумувати першу половину чисел

        int[] numbers = {3, 2, -5, 4, -4, 1, -6, 1, 6, -3, -4, 9};

        int count = numbers.length / 2;

        int[] newNumbers = new int[count];

        for (int i = 0; i < newNumbers.length; i++) {    // Vtoraja polovina ischodnogo massiva zapisana v newNumbers
            newNumbers[i] = numbers[i + numbers.length/2];
        }

        int sum = 0;
        for (int i = 0; i < newNumbers.length; i++) {
            sum = sum + newNumbers[i];
        }

        System.out.println(sum);

    }

    public static void SumOfValuesMoreThenIndex()  {
//        дано список чисел {3,2,-5,4,-4,1,-6,1,6,-3,-4,9}:
//        4. просумувати тільки ті числа значення яких більше за їх поточний індекс

        int[] numbers = {3, 2, -5, 4, -4, 1, -6, 1, 6, -3, -4, 9};

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > i) {
                count++;
            }
        }

        int[] newNumbers = new int[count];

        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > i) {
                newNumbers[j] = numbers[i];
                j++;
            }
        }

        int sum = 0;
        for (int i = 0; i < newNumbers.length; i++) {
            sum = sum + newNumbers[i];
        }
        System.out.println(sum);

    }

    public static void FilterCutLastFourDigits() {
//        дано список чисел {3,2,-5,4,-4,1,-6,1,6,-3,-4,9}:
//        5. Відсіяти в інший масив останні 4 числа

        int[] numbers = {3, 2, -5, 4, -4, 1, -6, 1, 6, -3, -4, 9};

        int count = 4;

        int[] newNumbers = new int[count];
        for (int i = 0; i < 4; i++) {
        //    newNumbers[i] = numbers[numbers.length - 1 - i];
            newNumbers[i] = numbers[i + numbers.length - 4];
            System.out.println(newNumbers[i]);
        }

    }

    public static void FilterLessThenZeroExchangeToZero() {
//        6. Скопіювати в новий масив всі числа, якщо вони менші нуля то замінити на нуль
//
        int[] numbers = {3, 2, -5, 4, -4, 1, -6, 1, 6, -3, -4, 9};
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                count = count + 1;
            }
        }
            int[] negativeNumbers = new int[count];
            int i = 0;
            for (int j = 0; j < numbers.length; j++) {
                if(numbers[j] < 0){
                    negativeNumbers[i] = numbers[j];
                    System.out.println(negativeNumbers[i]);
                    i++;

                }
            }
    }

    public static void FilterInEvenAndEvenIndex() {
//        7. Скопіювати в новий масив числа тільки ті числа в яких індекси парні і значення парні

        int[] numbers = {3, 2, -5, 4, -4, 1, -6, 1, 6, -3, -4, 9};
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0 && numbers[i] % 2 == 0) {
                count++;
            }
        }

        int[] evenNumbers = new int[count];
        //int j = 0;
        for (int i = 0, j = 0; i < numbers.length; i++) {
            if (i % 2 == 0 && numbers[i] % 2 == 0) {
                evenNumbers[j] = numbers[i];
                System.out.println(evenNumbers[j]);
                j++;
            }
        }
    }

    public static void FilterRightNeighbMoreTheZero() {
//        8. Відсіяти в новий список числа якщо правий сусід цього числа більше 0

        int[] numbers = {3, 2, -5, 4, -4, 1, -6, 1, 6, -3, -4, 9};
        int count = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i + 1]  > 0) {
                count++;
            }
        }

        int[] newNumbers = new int[count];

        int j = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i + 1] > 0) {
                newNumbers[j] = numbers[i];
                System.out.println(newNumbers[j]);
                j++;
            }
        }
    }

    public static void FilterSumOfNeighbLessThenCurrentValue() {
//  9. Відсіяти в новий список числа сумма двох сусідів яких меньше за поточний

        int[] numbers = {3, 2, -5, 4, -4, 1, -6, 1, 6, -3, -4, 9};

        int count = 0;

        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i - 1] + numbers[i + 1] < numbers[i]) {
                count++;
            }
        }

        int[] sumOfNeighbors = new int[count];
        int j = 0;
        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i - 1] + numbers[i + 1] < numbers[i]) {
                sumOfNeighbors[j] = numbers[i];
                System.out.println(sumOfNeighbors[j]);
                j++;
            }
        }

    }

    public static void ReverseOfArray() {
// Перевернути масив

        int[] numbers = {3, 2, -5, 4, -4, 1, -6, 1, 6, -3, -4, 9};

        int [] neNumbers = new int[numbers.length];

        int j = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            neNumbers[j] = numbers[i];
            j++;
         //   System.out.println(neNumbers[i]);
        }

        for (int i = 0; i < neNumbers.length; i++) {
            System.out.println(neNumbers[i]);
        }
}

public static void filterEvenAndNegative() {
    // 10. Відфільтрувати ті які мають парні індекси і відємні значення
        int[] numbers = {3, 2, -5, 4, -4, 1, -6, 1, 6, -3, -4, 9};

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0 && numbers[i] < 0) {
                count++;
            }
        }

        int[] evenIndNegativeNumbers = new int[count];

        int i = 0;
        for (int j = 0; j < numbers.length; j++) {
            if (j % 2 == 0 && numbers[j] < 0) {
                evenIndNegativeNumbers[i] = numbers[j];
                System.out.println(evenIndNegativeNumbers[i]);
                i++;
            }
        }
}


    //  11. Відфільтрувати ті які діляться націло на 2 і на 3
//        int[] numbers = {3, 2, -5, 4, -4, 1, -6, 1, 6, -3, -4, 9};
//
//        int count = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 == 0 && numbers[i] % 3 == 0){
//                count ++;
//            }
//        }
//
//        int[] divisionByTwoAndThree = new int[count];
//
//        for (int i = 0, j = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 == 0 && numbers[i] % 3 == 0){
//                divisionByTwoAndThree[j] = numbers[i];
//                System.out.println(divisionByTwoAndThree[j]);
//                j++;
//            }
//        }

//         12. Відфільтрувати ті які більші за середнє значення всього списку
//        int[] numbers = {3, 2, -5, 4, -4, 1, -6, 1, 6, -3, -4, 9};
//
//        int count = 0;
//        double aver = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            aver = (aver + numbers[i])/numbers.length;
//        }
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > aver) {
//                count++;
//            }
//        }
//
//        double[] moreThenAver = new double[count];
//        for (int i = 0, j = 0; i < numbers.length; i++) {
//            if (numbers[i] > aver) {
//                moreThenAver[j] = numbers[i];
//                System.out.println(moreThenAver[j]);
//                j++;
//            }
//        }

    //   13. Відфільтрувати ті які більші за середнє значення попередніх чисел
//        int[] numbers = {3, 2, -5, 4, -4, 1, -6, 1, 6, -3, -4, 9};
//
//        int count = 0;
//        double averPrivious = 0;
//        double sum = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            sum = sum + numbers[i];
//            averPrivious = sum / (i + 1);
//            if (numbers[i] > averPrivious) {
//                count++;
//            }
//        }
//
//       double[] moreThenAverPrivious = new double[count];
//
//        for (int i = 0, j=0; i < numbers.length; i++) {
//            sum = sum + numbers[i];
//            averPrivious = sum / (i + 1);
//            if (numbers[i] > averPrivious) {
//                moreThenAverPrivious[j] = numbers[i];
//                System.out.println(moreThenAverPrivious[j]);
//                j++;
//            }
//        }

    //    14. Порахувати кількість відємних
//        int[] numbers = {3, 2, -5, 4, -4, 1, -6, 1, 6, -3, -4, 9};
//
//        int count = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] < 0) {
//                count++;
//            }
//        }
//
//        int[] negative = new int[count];
//        for (int i = 0, j = 0; i < numbers.length; i++) {
//            if (numbers[i] < 0) {
//                negative[j] = numbers[i];
//                System.out.println(negative[j]);
//                j++;
//            }
//        }

    //   15. Порахувати кількість таких відємних перед яким стоїть додатнє число

//        int[] numbers = {3, 2, -5, 4, -4, 1, -6, 1, 6, -3, -4, 9};
//
//        int count = 0;
//
//        for (int i = 1; i < numbers.length; i++) {
//            if(numbers[i] < 0 && numbers[i-1] > 0) {
//                count++;
//            }
//        }
//
//        int[] negativeAfterPositive = new int[count];
//
//        for (int i = 1, j = 0; i < numbers.length; i++) {
//            if(numbers[i] < 0 && numbers[i-1] > 0) {
//                negativeAfterPositive[j] = numbers[i];
//                System.out.println(negativeAfterPositive[j]);
//                j++;
//            }
//        }

    //   16. Порахувати суму всіх таких чисел які є непарними і перед ними парне додатнє число
//        int[] numbers = {3, 2, -5, 4, -4, 1, -6, 1, 6, -3, -4, 9};
//
//        int count = 0;
//        int sum = 0;
//
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] % 2 != 0 && numbers[i - 1] % 2 == 0 && numbers[i - 1] > 0) {
//                sum = sum + numbers[i];
//            }
//        }
//
//         System.out.println(sum);

    //  17. Знайти таке число яке найближче до середнього значення
//        int[] numbers = {3, 2, -5, 4, -4, 1, -6, 1, 6, -3, -4, 9};
//        double aver = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            aver = aver + numbers[i];
//        }
//        aver = aver / numbers.length;
//
//
//        int minInd = 0;
//        for (int i = 0; i < numbers.length; i++) {
//
//            double difference = Math.abs(numbers[i] - aver);
//            double differenceInd = Math.abs(numbers[minInd] - aver);
//
//            if (differenceInd > difference) {
//                minInd=i;
//            }
//        }
//
//        System.out.println(minInd);

    //     18. Знайти таке число яке найдалі вд середнього значення
//        int[] numbers = {3, 2, -5, 4, -4, 1, -6, 1, 6, -3, -4, 9};
//
//        double aver = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            aver = aver + numbers[i];
//        }
//        aver = aver / numbers.length;
//
//        int maxInd = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            double differ = Math.abs(aver - numbers[i]);
//            double differMax = Math.abs(aver - numbers[maxInd]);
//
//            if (differMax < differ) {
//                maxInd = i;
//            }
//        }
//
//        System.out.println(maxInd);

// 19. Створити новий масив в який перекинути всі елементи з поточного але відємні перетворити в 0,
// а додатні зменшити до найближчого парного (якщо вони непарні, а якщо парні то не чіпати, наприклад
// якщо 6 то залишити 6, якщо 5 то з нього буде 4, якщо 11 то з нього буде 10)
// (загалом повинно вийти: {2,2,0,4,0,0,0,0,6,0,0,8})

//        int[] numbers = {3, 2, -5, 4, -4, 1, -6, 1, 6, -3, -4, 9};
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] < 0) {
//                numbers[i] = 0;
//            }
//            if (numbers[i] % 2 != 0) {
//                numbers[i]--;
//            }
//            System.out.printf(" %d", numbers[i]);
//        }

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
}

