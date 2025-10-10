package arraysTopics;

import java.util.Arrays;

public class ArraysTwoDimensional {

    public static void rightNeighborMoreThenZero() {
        //  8. Відсіяти в новий список числа якщо правий сусід цього числа більше 0
        int[][] matrix = {
                {1, -5, 7, -2},
                {-6, 4, -1, 6},
                {8, -3, 2, -9},
                {-9, 4, -5, 1}
        };

        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < (matrix.length - 1); j++) {
                if (matrix[i][j + 1] > 0) {
                    count++;
                }
            }

        }
    }

    public static void filterOddRowsOddLines() {

        // 9. Відсіяти в новий список всі числа які знаходяться в непраних рядках і непраних стовпчиках
        int[][] matrix = {
                {1, -5, 7, -2},
                {-6, 4, -1, 6},
                {8, -3, 2, -9},
                {-9, 4, -5, 1}
        };

        int count = 0;

        for (int i = 0; i < matrix.length; i++) {     // row
            for (int j = 0; j < matrix.length; j++) {   // column
                if (i % 2 != 0 && j % 2 != 0) {
                    count++;
                }
            }
        }

        int[] filterMatrix = new int[count];

        int k = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i % 2 != 0 && j % 2 != 0) {
                    filterMatrix[k] = matrix[i][j];
                    System.out.println(filterMatrix[k]);
                    k++;
                }
            }
        }
    }

    public static void sumOfElements() {
        int[][] matrix = {
                {  1, -5,  7, -2, 1 },
                { -6,  4, -1,  6, 1 },
                {  8, -3,  2, -9, 1 },
                { -9,  4, -5,  1, 1 }
        };

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
               sum = sum + matrix[i][j];
            }

        }

        System.out.println(sum);



    }

    public static void sumOfRow(){
        int[][] matrix = {
                {  1, -5,  7, -2, 1 },
                { -6,  4, -1,  6, 1 },
                {  8, -3,  2, -9, 1 },
                { -9,  4, -5,  1, 1 }
        };

        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            count = count +1;
        }

        int[] sumOfRow = new int[count];

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length; j++) {
                int current = matrix[i][j];
                sum = sum + matrix[i][j];
            }
            sumOfRow[i] = sum;
            sum = 0;
         // System.out.println(sumOfRow[i]);
        }

       // System.out.println(Arrays.toString(sumOfRow));

    }

    public static void sumOfColumns(){
        int[][] matrix = {
                {  1, -5,  7, -2, 1, 2 },
                { -6,  4, -1,  6, 1, 2 },
                {  8, -3,  2, -9, 1, 2 },
                { -9,  4, -5,  1, 1, 2 }
        };

        int count = 0;
        int current = 0;


            for (int j = 0; j < matrix[0].length; j++) {
               // current = matrix[i][j];
               count = count +1;
            }

            int[] sumOfColumnsAr = new int[count];

            int sum = 0;


            for (int j = 0; j < matrix[0].length; j++) {
                for (int i = 0; i < matrix.length; i++) {
                sum = sum + matrix[i][j];
            }
                sumOfColumnsAr[j] = sum;
              sum = 0;
        }

        System.out.println(Arrays.toString(sumOfColumnsAr));

    }









    //  Є двохвимірний список - -4. Сума всіх чисел
//        int[][] matrix = {
//                {  1, -5,  7, -2 },
//                { -6,  4, -1,  6 },
//                {  8, -3,  2, -9 },
//                { -9,  4, -5,  1 }
//        };
//
//        int sum = 0;
//
//        for (int i = 0; i < matrix.length; i++) {
//              for (int j = 0; j < matrix.length; j++) {
//                  sum = sum + matrix[i][j];
//                  System.out.println("arr[" + i + "][" + j + "] = "
//                          + matrix[i][j]);
//            }
//        }


    //System.out.println(sum);

    //   Є двохвимірний список -3. Сума тільки прешого рядка
//        int[][] matrix = {
//                {  1, -5,  7, -2 },
//                { -6,  4, -1,  6 },
//                {  8, -3,  2, -9 },
//                { -9,  4, -5,  1 }
//        };
//
//        int sumFirstOfRow = 0;
//
//
//              for (int j = 0; j < matrix.length; j++) {
//
//                sumFirstOfRow = sumFirstOfRow + matrix[0][j];
//            }
//
//        System.out.println(sumFirstOfRow);

    //  Є двохвимірний список -2. Сума тільки другого стовпця
//        int[][] matrix = {
//                {  1, -5,  7, -2 },
//                { -6,  4, -1,  6 },
//                {  8, -3,  2, -9 },
//                { -9,  4, -5,  1 }
//        };
//        int sumOfSecondColumn = 0;
//
//        for (int i = 0; i < matrix.length; i++) {
//
//                sumOfSecondColumn = sumOfSecondColumn + matrix[i][1];
//             }
//
//        System.out.println(sumOfSecondColumn);

//        //  Є двохвимірний список -1. Сума діагоналі
//        int[][] matrix = {
//                {1, -5, 7, -2},
//                {-6, 4, -1, 6},
//                {8, -3, 2, -9},
//                {-9, 4, -5, 1}
//        };
//
//        int sumOfDiag = 0;
//
//        for (int i = 0; i < matrix.length; i++) {
//                    sumOfDiag = sumOfDiag + matrix[i][i];
//        }
//
//        System.out.println(sumOfDiag);
//        int[][] matrix = {
//                {1, -5, 7, -2},
//                {-6, 4, -1, 6},
//                {8, -3, 2, -9},
//                {-9, 4, -5, 1}
//        };
//
//        int sumOfDiag = 0;
//
//        for (int i = matrix.length - 1; i >= 0; i--) {
//            sumOfDiag = sumOfDiag + matrix[i][3 - i];
//        }
//
//        System.out.println(sumOfDiag);

    //  0. Сума парних рядків
//        int[][] matrix = {
//                {1, -5, 7, -2},
//                {-6, 4, -1, 6},
//                {8, -3, 2, -9},
//                {-9, 4, -5, 1}
//        };
//
//        int sum = 0;
//
//        for (int i = 0; i < matrix.length; i+=2) {  // i = i + 2
//            for (int j = 0; j < matrix.length; j++) {
//
//                sum+= matrix[i][j];  // sum = sum + matrix[i][j];
//
//            }
//        }
//
//        System.out.println(sum);


    //   1. Знайти суму всіх неприх і відємних
//        int[][] matrix = {
//                {1, -5, 7, -2},
//                {-6, 4, -1, 6},
//                {8, -3, 2, -9},
//                {-9, 4, -5, 1}
//        };
//
//        int sumNegativAngEven = 0;
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix.length; j++) {
//                if(matrix[i][j] < 0 && matrix[i][j] % 2 != 0) {
//                    sumNegativAngEven+= matrix[i][j];
//                }
//            }
//        }
//
//        System.out.println(sumNegativAngEven);

    //3. просумувати першу половину чисел
    //4. просумувати тільки ті числа значення яких більше за їх поточний індекс
    //5. Відсіяти в інший масив останні 4 числа

    // 2. Відсіяти в новий масив тільки ті які більші середнього
//        int[][] matrix = {
//                {1, -5, 7, -2},
//                {-6, 4, -1, 6},
//                {8, -3, 2, -9},
//                {-9, 4, -5, 1}
//        };
//
//        int count = 0;
//        int aver = 0;
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix.length; j++) {
//                aver += matrix[i][j];
//            }
//        }
//
//        aver = aver / matrix.length * matrix[0].length;  // matrix[0] - how many elements in the 1 row
//        System.out.println("Average is " + aver);
//
//        for (int j = 0; j < matrix.length; j++) {
//            for (int k = 0; k < matrix.length; k++) {
//                if (matrix[j][k] > aver) {
//                    count++;
//                }
//            }
//        }
//
//        int[] neMatrix = new int[count];
//        int l = 0;
//        for (int j = 0; j < matrix.length; j++) {
//            for (int k = 0; k < matrix.length; k++) {
//                if (matrix[j][k] > aver) {
//                    neMatrix[l] = matrix[j][k];
//                    System.out.print(" " + neMatrix[l]);
//                    l++;
//                }
//            }
//        }

    // 3  просумувати першу половину чисел
//        int[][] matrix = {
//                {1, -5, 7, -2},
//                {-6, 4, -1, 6},
//                {8, -3, 2, -9},
//                {-9, 4, -5, 1}
//        };
//
//        int count = matrix.length * matrix[0].length/2;   // matrix.length = 4 (kol-vo riadov); matrix[0].length = 4 (elementy w riadke)
//        int sum = 0;
//
//        int[] newMatrix = new int[count];
//
//        int l = 0;
//        for (int i = 0; i < matrix.length / 2; i++) {  // stroki
//            for (int j = 0; j < matrix.length; j++) {  // elementy w stroke
//  //            if (l < count)
//                    newMatrix[l] = matrix[i][j];
//                    l++;
//
//            }
//        }
//
//        for (int i = 0; i < newMatrix.length; i++) {
//            sum += newMatrix[i];
//        }
//        System.out.println(sum);

    // 4. Просумувати тільки ті числа значення яких більше за суму двох індексів цього числа.
//        int[][] matrix = {
//                {1, -5, 7, -2},
//                {-6, 4, -1, 6},
//                {8, -3, 2, -9},
//                {-9, 4, -5, 1}
//        };
//
//        int sum = 0;
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix.length; j++) {
//                if ((i + j) < matrix[i][j]) {
//                    sum += matrix[i][j];
//                }
//            }
//        }
//        System.out.println(sum);

    //    5. Відсіяти в інший масив останні 4 числа
//        int[][] matrix = {
//                {1, -5, 7, -2},
//                {-6, 4, -1, 6},
//                {8, -3, 2, -9},
//                {-9, 4, -5, 1}
//        };
//
//        int[] neMatrix = new int[4];
//
//        int l = 0;
//        for (int i = matrix.length - 1; i >= 0; i--) {
//            for (int j = matrix.length - 1; j >= 0; j--) {
//                if (l < 4) {
//                    neMatrix[l] = matrix[i][j];
//                    //  System.out.println(neMatrix[l]);
//                    l++;
//                }
//            }
//        }
//
//        int[] reversNeMatrix = new int[4];
//        int k = 0;
//        for (int i = neMatrix.length - 1; i >= 0; i--) {
//            reversNeMatrix[k] = neMatrix[i];
//            System.out.println(reversNeMatrix[k]);
//            k++;
//
//        }

    // 6. Скопіювати в новий масив всі числа, якщо вони менші нуля то замінити на нуль
//        int[][] matrix = {
//                {1, -5, 7, -2},
//                {-6, 4, -1, 6},
//                {8, -3, 2, -9},
//                {-9, 4, -5, 1}
//        };
//
//        int[] newMatrix = new int[matrix.length * matrix[0].length];
//
//
//        int l = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix.length; j++) {
//                if (matrix[i][j] > 0){
//                    newMatrix[l] = matrix[i][j];
//                }
//                System.out.print(" " + newMatrix[l]);
//                l++;
//            }
//        }

    //      7. Скопіювати в новий масив тільки ті числа в яких сума двох індексів парна і значення парне
//        int[][] matrix = {
//                {1, -5, 7, -2},
//                {-6, 4, -1, 6},
//                {8, -3, 2, -9},
//                {-9, 4, -5, 1}
//        };
//
//        int count = 0;
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix.length; j++) {
//                if ((i + j) % 2 == 0 && matrix[i][j] % 2 == 0) {
//                    count++;
//                }
//            }
//        }
//
//        int[] newMatrix = new int[count];
//
//        int l = 0;
//        for (int j = 0; j < matrix.length; j++) {
//            for (int k = 0; k < matrix.length; k++) {
//                if ((j + k) % 2 == 0 && matrix[j][k] % 2 == 0) {
//                    newMatrix[l] = matrix[j][k];
//                    System.out.printf(" %d", newMatrix[l]);
//                    l++;
//                }
//            }
//        }

//}


//}


//  0. Сума парних рядків
//        int[][] matrix = {
//                {1, -5, 7, -2},
//                {-6, 4, -1, 6},
//                {8, -3, 2, -9},
//                {-9, 4, -5, 1}
//        };

}
