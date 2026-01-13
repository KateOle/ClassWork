package arraysTopics;

import java.util.Arrays;
import java.util.Random;

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

    public static void flattenOfArray() {
        // Make one dimencional array from two dimencional
       int[][] twoDimenArray={
               {  1, -5,  7, -2, 1, 2 },
               { -6,  4, -1,  6, 1, 2 },
               {  8, -3,  2, -9, 1, 2 },
               { -9,  4, -5,  1, 1, 2 }
       };

       int length = 0;

        for (int i = 0; i < twoDimenArray.length ; i++) {

               length = length+twoDimenArray[i].length;
        }

        int[] oneDimenArray = new int[length];

//        oneDimenArray[0] = twoDimenArray[0][0];
//        oneDimenArray[1] = twoDimenArray[0][1];
//        oneDimenArray[2] = twoDimenArray[0][2];
//        oneDimenArray[3] = twoDimenArray[0][3];
//        oneDimenArray[4] = twoDimenArray[0][4];
//        oneDimenArray[5] = twoDimenArray[0][5];
//        oneDimenArray[6] = twoDimenArray[1][0];
//        oneDimenArray[7] = twoDimenArray[1][1];

        int count1 = 0;

        for (int i = 0; i < twoDimenArray.length; i++) {

            for (int j = 0; j < twoDimenArray[i].length; j++) {
             // oneDimenArray[j+(i*twoDimenArray[i].length)] = twoDimenArray[i][j];

                oneDimenArray[count1] = twoDimenArray[i][j];
                count1 = count1 +1;

            }

        }

    }

    public static void sumOfDiag() {
        //Calculate sum of diagonals

        int[][] twoDimenArray={
                {  1, -5,  7, -2},
                { -6,  4, -1,  6},
                {  8, -3,  2, -9},
                { -9,  4, -5,  1}
        };

        int sumOfDiag1 = 0;
        int sumOfDiag2 = 0;

        for (int i = 0; i < twoDimenArray.length; i++) {
            sumOfDiag1 = sumOfDiag1 + twoDimenArray[i][i];
        }
//
//        sumOfDiag2 = sumOfDiag2 + twoDimenArray[0][3];
//        sumOfDiag2 = sumOfDiag2 + twoDimenArray[1][2];
//        sumOfDiag2 = sumOfDiag2 + twoDimenArray[2][1];
//        sumOfDiag2 = sumOfDiag2 + twoDimenArray[3][0];


        for (int i = 0; i < twoDimenArray.length; i++) {
           sumOfDiag2 = sumOfDiag2 + twoDimenArray[i][twoDimenArray.length-1-i];
        }


    }



    public static void marksMoreThen10() {

        int[][] schoolMarks = {{7,9,10,12},
                              {11,12,6,3},
                               {1,2,3,4}};

        int count = 0;

        for (int i = 0; i < schoolMarks.length; i++) {
            for (int j = 0; j < schoolMarks[i].length; j++) {
                if(schoolMarks[i][j] >= 10){
                    count = count+1;
                }
            }

        }

        int[] excelentSchoolMarks = new int[count];

        int count1 = 0;

        for (int s = 0; s < schoolMarks.length; s++) {
            for (int i = 0; i < schoolMarks[s].length; i++) {
                if(schoolMarks[s][i] >= 10){
                    excelentSchoolMarks[count1] = schoolMarks[s][i];
                    count1 = count1 +1;
                }

            }
        }



    }

    public static void exchangeRowsOfMatrix() {
        //Exchange first row of Matrix with the last row, the second row with the third row
        int[][] matrixRows = {
                {1, -5, 7, -2},
                {-6, 4, -1, 6},
                {8, -3, 2, -9},
                {-9, 4, -5, 1}
        };

        int[][] temp = new int[matrixRows.length / 2][matrixRows.length];

        for (int i = 0; i < matrixRows.length / 2; i++) {
            for (int j = 0; j < matrixRows.length; j++) {
                temp[i][j] = matrixRows[i][j];
            }
        }

        for (int i = 0; i < matrixRows.length; i++) {
            for (int j = 0; j < matrixRows[i].length; j++) {
                matrixRows[i][j] = matrixRows[matrixRows.length - (i + 1)][j];
            }
        }

        int[][] exchangedMatrix = new int[matrixRows.length][matrixRows.length];

        for (int i = 0; i < matrixRows.length; i++) {
            for (int j = 0; j < matrixRows[i].length; j++) {
                if (i < matrixRows.length / 2) {
                    exchangedMatrix[i][j] = matrixRows[i][j];
                } else {
                    exchangedMatrix[i][j] = temp[matrixRows.length - 1 - i][j];
                }

            }
        }

        for (int i = 0; i < exchangedMatrix.length; i++) {
            for (int j = 0; j < exchangedMatrix[i].length; j++) {
                System.out.print(" " + exchangedMatrix[i][j]);

            }
            System.out.println(" ");

        }
    }

        public static void multipleAndAverage() {
           // Є трьохвимірий масив - порахувати добуток і середнє значення всіх елементів.

            int[][][] array = {
                    {{1,3}, {6, -5}, {3, 2}, {-2, 8}},
                    {{-6, 4, -1, 6},
                    {8, -3, 2, -9},
                    {-9, 4, -5, 1}}
            };

            long multiple = 1;

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    for (int k = 0; k < array[i][j].length; k++) {
                        multiple = multiple*array[i][j][k];
                    }
                }

            }

            int count =0;
            int sum = 0;

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    for (int k = 0; k < array[i][j].length; k++) {
                        count = count +1;
                        sum = sum + array[i][j][k];
                    }

                }
            }

            double average = 1.0 * sum/count;

            System.out.println(sum + " " + count);
            System.out.println("Multiple " + multiple + "Average " + average);


        }

 //       public static void arrayOfDates(){
//            Є масив дат коли людина буде їздити на метро
//            (наприклад 1 січня, 30 січня, 2 лютого, 5 лютого, 7 лютого...).
//            Людина може купити квиток на 1 день - 2 євро.
//            І людина може купити квиток на 1 місяць(30 днів підряд) - 30 євро.
//            Як найвигідніше купити квитки для людини щоб витратити найменше
//            коштів але покрити всі потрібні дні для поїздок
//
//            {{7,9,10,12},{11,12,6,3},{1,2,3,4}}

 //       }

    public static void fromOneDtoTwoDArray(){
//        Завдання на масиви:
//        5. Є одновимірний масив на 20 елементів, зробити з нього двохвимірний 5 на 4.


        int[] oneDec = {1, -3, 5, 7, 18, 52, 8, -5, 9, -11, 1, -3, 5, 7, 18, 52, 8, -5, 9, -11};

        int[][] twoDec = new int[5][4];

//        twoDec[0][0] = oneDec[0];
//        twoDec[0][1] = oneDec[1];
//        twoDec[0][2] = oneDec[2];
//        twoDec[0][3] = oneDec[3];
//
//        twoDec[1][0] = oneDec[4];
//        twoDec[1][1] = oneDec[5];
//        twoDec[1][2] = oneDec[6];
//        twoDec[1][3] = oneDec[7];
//
//        twoDec[2][0] = oneDec[8];
//        twoDec[2][1] = oneDec[9];
//        twoDec[2][2] = oneDec[10];
//        twoDec[2][3] = oneDec[11];
//
//        twoDec[3][0] = oneDec[12];
//        twoDec[3][1] = oneDec[13];
//        twoDec[3][2] = oneDec[14];
//        twoDec[3][3] = oneDec[15];
//
//        twoDec[4][0] = oneDec[16];
//        twoDec[4][1] = oneDec[17];
//        twoDec[4][2] = oneDec[18];
//        twoDec[4][3] = oneDec[19];


        for (int i = 0; i < twoDec.length; i++) {
            for (int j = 0; j < twoDec[i].length; j++) {
                twoDec[i][j] = oneDec[j+(i* twoDec[i].length)];
            }
        }

        for (int i = 0; i < twoDec.length; i++) {
            for (int j = 0; j < twoDec[i].length; j++) {
                System.out.print(twoDec[i][j] + " ");

            }
            System.out.println(" ");
        }
    }


        public static void fromTwoTwoDecToOneTwoDec() {
//        6. Є два двохвимірні масиви 4 на 4, зробити з них: один двохвимірний 8 на 4, один двохвимірний 4 на 8

           int[][] firstTwoD = new int[4][4];
           int[][] secondTwoD = new int[4][4];

            for (int i = 0; i < firstTwoD.length; i++) {
                for (int j = 0; j < firstTwoD[i].length; j++) {
                    firstTwoD[i][j] = (i*4)+j;
                }
            }

            Random arrayRandom = new Random();


            for (int i = 0; i < secondTwoD.length; i++) {
                for (int j = 0; j < secondTwoD[i].length; j++) {
                    secondTwoD[i][j] = arrayRandom.nextInt(30);
                }
            }

            int[][] twoD8x4 = new int[8][4];

            for (int i = 0; i < twoD8x4.length; i++) {
                for (int j = 0; j < twoD8x4[i].length; j++) {
                    if(i<4) {
                        twoD8x4[i][j] = firstTwoD[i][j];
                    } else
                        twoD8x4[i][j] = secondTwoD[i-4][j];
                }
            }

            int[][] twoD4X8 = new int[4][8];

            for (int i = 0; i < twoD4X8.length; i++) {
                for (int j = 0; j < twoD4X8[i].length; j++) {
                    if(j > 3){
                        twoD4X8[i][j] = secondTwoD[i][j-4];
                    } else
                   twoD4X8[i][j] = firstTwoD[i][j];
                }
            }

        }

        public static void buyAndSellStoke(){
//            You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
//       On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at
//       any time. However, you can sell and buy the stock multiple times on the same day, ensuring you never
//       hold more than one share of the stock.
//        Find and return the maximum profit you can achieve.

          int[] prices = {6,3,5,1,6,8};

          int profit = 0;
          int stock = prices[0];

            for (int i = 1; i < prices.length; i++) {
                //   for (int j = 1+i; j < prices.length; j++) {

                    if(prices[i-1] < prices[i]){
                        profit = profit + (prices[i]-prices[i-1]);
                //    }
                }
            }
            System.out.println(profit);
        }


//    Concatenation of Array
//            https://leetcode.com/problems/concatenation-of-array/?envType=problem-list-v2&envId=array
//    Given an integer array nums of length n, you want to create an array ans of length 2n
//    where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//
//    Specifically, ans is the concatenation of two nums arrays.
//    Return the array ans.

    public static void getConcatArray(){
        int[] num = {3, 4, 6, 7};

        int[] anum = new int[num.length*2];

        for (int i = 0; i < num.length; i++) {
            anum[i] = num[i];
            anum[i+4] = num[i];

        }

    }

    public static void removeElement(){
//        Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
//        The order of the elements may be changed. Then return the number of elements in
//        nums which are not equal to val.
//
//        Consider the number of elements in nums which are not equal to val be k, to get accepted,
//        you need to do the following things:
//
//        Change the array nums such that the first k elements of nums contain the elements which are not
//        equal to val. The remaining elements of nums are not important as well as the size of nums.
//         Return k.

        int[] num = {0,1,2,2,3,0,4,2};

        int val = 2;

        int count = 0;

        for (int i = 0; i < num.length ; i++) {
            if(num[i] == val){
                count = count +1;
            }
        }

        int[] removedNum = new int[num.length - count];

        int point = 0;

        for (int i = 0; i < num.length; i++) {
            if(num[i] != val){
                removedNum[point] = num[i];
                point++;
            }
        }

        System.out.print("removedNum");
        for (int i = 0; i < removedNum.length; i++) {
            System.out.print(" " + removedNum[i]);

        }
        System.out.println();
        System.out.println("k " + point);

    }


//        for (int i = 0; i < oneDec.length/5; i++) {
//            twoDec[1][i] = oneDec[i+oneDec.length/5];
//        }
//
//        for (int i = 0; i < oneDec.length/5; i++) {
//            twoDec[2][i] = oneDec[i+8];
//        }
//        for (int i = 0; i < oneDec.length/5; i++) {
//            twoDec[3][i] = oneDec[i+12];
//        }
//        for (int i = 0; i < oneDec.length/5; i++) {
//            twoDec[4][i] = oneDec[i+16];
//        }


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

