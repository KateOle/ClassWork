package org.methodsTests;

import java.util.LinkedList;
import java.util.List;

public class Two_pointers_example {


    public static void main(String[] args) {
    }

    public static void twoPointers1(){
        // two pointers example, range
        // 1,2,3, 5, 8,9,10, 12 -> "1-3", "5-5", "8-10", "12-12"

        Integer[] numbers = {1,2,3, 5, 7,8,9,10, 14,15,16};

        List<String> serias = new LinkedList<>();

        Integer point1 = 0;
        Integer point2 = 0;

        for (int i = 0; i < numbers.length-1; i++) {
            if ((numbers[point2 + 1] - numbers[point2]) == 1) {
                point2++;
            } else {

                String startSeria = numbers[point1].toString();
                String endSeria = numbers[point2].toString();

                serias.add(startSeria + "-" + endSeria);


                point1= point2+1;
                point2= point1;
            }

        }

        String startSeria = numbers[point1].toString();
        String endSeria = numbers[point2].toString();

        serias.add(startSeria + "-" + endSeria);


        System.out.println(serias);

    }

    public static void twoPointers2(){

      //  two pointers example
        int point1 = 0;
        int point2 = 0;

        int[] mass = {1,1,1,2,2,3,4,4,4,4,2,2};
        //int[] mass1 = new int[];
        List<Integer> sumNumb = new LinkedList<>();

        for (int i = 0; i < mass.length; i++) {
           if(mass[point1] == mass[point2]) {
               point2++;

           } else {
             sumNumb.add(point2-point1);
               point1 = point2;
               point2++;
           }
        }
        sumNumb.add(point2-point1);

        System.out.println(sumNumb);



    }


}
