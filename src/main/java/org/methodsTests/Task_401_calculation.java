package org.methodsTests;

import java.util.LinkedList;
import java.util.List;

public class Task_401_calculation {

//    Дано рядок, що містить одне або більше цілих чисел від 0 до 1000000000, розділених знаками + або -. Розрахуйте
//    значення цього виразу.

    // 12+3-2 = 13
    // 12= 12
    // 1000000000+1000000000+1000000000= 3000000000 (long type/borders)
    // 12-6-6= 0
    // 14.0-1-1= 3.0
    // 12-'o'= null
    // 5-9-3=-7
    // 9/3+2 =5
    // 1000000001+10+1= null
    // r-t+p=null

    public static void main(String[] args) {
       calculation("123+5+7");
    }

    public static void testCalculation(){

        String[] inputValue = {"12+3-2",  "12", "1000000000+1000000000+1000000000", "12-6-6", "14.0-1-1", "12-o", "5-9-3", "9/3+2", "1000000001+10+1", "r-t+p"};

        String[] expectedValue = {"13", "12", "3000000000", "0", "3.0", "null", "7", "5", "null", "null"};

        int count = 0;

        for (int i = 0; i < inputValue.length; i++) {
            if(inputValue[i] == expectedValue[i]) {
                System.out.println("Test " + i + " Passed");
                count++;
            } else {
                System.out.println("Test " + i + " Expected value " + expectedValue[i] + " Recieved vealue " + " False");
            }
        }
    }


    public static String calculation (String str){



        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i)) || str.charAt(i) == '+' || str.charAt(i) == '-'){

            } else {
                return null;
            }
        }

        List<Integer> digits = new LinkedList<>();

        List<Character> plusMinus = new LinkedList<>();

        String everyDigit = "";

        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                digits.add((int)(str.charAt(i))-48);
                everyDigit+=str.charAt(i);
                System.out.println(digits);
            }
        }



        return null;
    }
}
