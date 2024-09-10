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

    // 10. Відфільтрувати ті які мають парні індекси і відємні значення
//        int[] numbers = {3, 2, -5, 4, -4, 1, -6, 1, 6, -3, -4, 9};
//
//        int count = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (i % 2 == 0 && numbers[i] < 0) {
//                count++;
//            }
//        }
//
//        int[] evenIndNegativeNumbers = new int[count];
//
//        int i = 0;
//        for (int j = 0; j < numbers.length; j++) {
//            if (j % 2 == 0 && numbers[j] < 0) {
//                evenIndNegativeNumbers[i] = numbers[j];
//                System.out.println(evenIndNegativeNumbers[i]);
//                i++;
//            }
//        }

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
}

