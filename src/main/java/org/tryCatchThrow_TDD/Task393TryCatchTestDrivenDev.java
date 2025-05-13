package org.tryCatchThrow_TDD;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task393TryCatchTestDrivenDev {

//    Напишіть програму, яка переводить ціле число N (1 ≤ |N| < 1000000000) з системи числення з
//    основою K (2 ≤ K ≤ 36) в систему числення з основою M (2 ≤ M ≤ 36). Перший вхідний рядок містить запис
//    числа N в системі числення з основою K. Другий рядок містить числа K і M, розділені пропуском.
//    Програма повинна вивести запис числа N в системі числення з основою M.

    public static void main(String[] args) {
        testConvertToNumericalSystem ();
    }

    public static void printResult () {
        Scanner scn = new Scanner(System.in);


        System.out.println("Enter some number |N| from 1 to 1000000000");
        String number = scn.nextLine().toUpperCase();

        StringBuilder sb = new StringBuilder(number);
       // number = sb.reverse().toString(); fixme
        number = sb.toString();

        System.out.println("Enter a number in a numeral system K from base 2 to base 36");
        int k = scn.nextInt();

        System.out.println("Enter the base to which the number M will be converted from 2 to 36");
        int m = scn.nextInt();

        System.out.println(convertToNumericalSystem(number, k, m));
    }

    public static String convertToNumericalSystem (String number, int k, int m) {

        char ch = ' ';
        int value = 0;
        int result = 0;

        for (int i =number.length()-1; i >= 0; i--) {
            ch = number.charAt(number.length()-1-i);

            if (ch >= '0' && ch <= '9') {
                value = ch - '0';
            } else if (ch >= 'A' && ch <= 'Z') {
                value = ch - 'A' + 10;
            }
            result = result + value * (int) Math.pow(k, i);
        }


        Integer mod = 0;
        String modResult = "";

        Map<Integer, String> map = new HashMap<>();
        String charString = "";
        for (int j = 10; j < 36; j++) {
            char lat = (char) (j + 55);
            charString = Character.toString(lat);

            map.put(j, charString);
        }

        String resultForLatters = "";
        for (int i = result; i > 0; i = i / m) {

            mod = i % m;


            if (mod >= 10) {
                resultForLatters = map.get(mod);

            }

            if(mod >= 10) {
                modResult += resultForLatters;
            } else modResult += mod.toString();

            // modResult = mod.toString() + resultForLatters;
        }

        StringBuilder sb1 = new StringBuilder(modResult);
       modResult = sb1.reverse().toString();
       // modResult = sb1.toString();

        return modResult;
    }

    public static void testConvertToNumericalSystem () {

// Check the positive test: number - CD6, system k - 16, m - 3
        String convertResult = convertToNumericalSystem("CD6", 16, 3);
        System.out.println("Test case 1");
        if(convertResult.equals("11111201")){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
            System.out.println("Check the positive test: number - CD6, system k - 16, m - 3");
        }


        // Positive test: number - 11111201, k - 3, m - 16
        convertResult = convertToNumericalSystem("11111201", 3, 16);
        System.out.println("Test case 2");
        if(convertResult.equals("CD6")){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
            System.out.println("Positive test: number - 11111201, k - 3, m - 16");
        }


        // Positive test: number is negative -AB, k = 16, m = 10
        convertResult = convertToNumericalSystem("-AB", 16, 10);
        System.out.println("Test case 3");
        if(convertResult.equals("-171")){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
            System.out.println("Positive test: number is negative -AB, k = 16, m = 10");
        }

        //Positive test: number = Z, k = 36, m = 10
        convertResult = convertToNumericalSystem("Z", 36, 10);
        System.out.println("Test case 4");
        if(convertResult.equals("35")){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
            System.out.println("Positive test: number = Z, k = 36, m = 10");
        }

        //Positive test: number (lower case)= z, k = 36, m = 10
        convertResult = convertToNumericalSystem("z", 36, 10);
        System.out.println("Test case 5");
        if(convertResult.equals("35")){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
            System.out.println("Positive test: number (lower case)= z, k = 36, m = 10");
        }

        // Negative test: number = 0, k = 10, m = 11
        String inputNumber = "0";
        int inputK = 10;
        int inputM = 11;
        System.out.println("Test case 6");
        try{
            String received = convertToNumericalSystem(inputNumber, inputK, inputM);
            System.out.println("Fail");
        } catch (Exception e){
            System.out.println("Pass");
        }

        //Negative test: number = empty, k = 10, m = 11
        inputNumber = " ";
        inputK = 10;
        inputM = 11;
        System.out.println("Test case 7");
        try{
            String received = convertToNumericalSystem(inputNumber, inputK, inputM);
            System.out.println("Fail");
        } catch (Exception e){
            System.out.println("Pass");
        }

        //Negative test: number = 9, k = 2, m = 10
        inputNumber = "9";
        inputK = 2;
        inputM = 10;
        System.out.println("Test case 8");
        try{
            String received = convertToNumericalSystem(inputNumber, inputK, inputM);
            System.out.println("Fail");
        } catch (Exception e){
            System.out.println("Pass");
        }

        //Negative test: number = 20, k = 1, m = 10
        inputNumber = "20";
        inputK = 1;
        inputM = 10;
        System.out.println("Test case 8");
        try{
            String received = convertToNumericalSystem(inputNumber, inputK, inputM);
            System.out.println("Fail");
        } catch (Exception e){
            System.out.println("Pass");
        }

        //Negative test: number = AC, k = 37, m = 10
        inputNumber = "AC";
        inputK = 37;
        inputM = 10;
        System.out.println("Test case 10");
        try{
            String received = convertToNumericalSystem(inputNumber, inputK, inputM);
            System.out.println("Fail");
        } catch (Exception e){
            System.out.println("Pass");
        }

        //Negative test: number = AC, k = 16, m = 1
        inputNumber = "AC";
        inputK = 16;
        inputM = 1;
        System.out.println("Test case 11");
        try{
            String received = convertToNumericalSystem(inputNumber, inputK, inputM);
            System.out.println("Fail");
        } catch (Exception e){
            System.out.println("Pass");
        }

        //Negative test: number = AC, k = 16, m = 37
        inputNumber = "AC";
        inputK = 16;
        inputM = 37;
        System.out.println("Test case 12");
        try{
            String received = convertToNumericalSystem(inputNumber, inputK, inputM);
            System.out.println("Fail");
        } catch (Exception e){
            System.out.println("Pass");
        }

        //Negative test: number = 1000000001, k = 10, m = 12
        inputNumber = "1000 000 001";
        inputK = 10;
        inputM = 3;
        System.out.println("Test case 13");
        try{
            String received = convertToNumericalSystem(inputNumber, inputK, inputM);
            System.out.println("Fail");
        } catch (Exception e){
            System.out.println("Pass");
        }
    }


}
