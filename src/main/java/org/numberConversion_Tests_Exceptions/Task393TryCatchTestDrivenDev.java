package org.numberConversion_Tests_Exceptions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task393TryCatchTestDrivenDev {

//    Напишіть програму, яка переводить ціле число N (1 ≤ |N| < 1000000000) з системи числення з
//    основою K (2 ≤ K ≤ 36) в систему числення з основою M (2 ≤ M ≤ 36). Перший вхідний рядок містить запис
//    числа N в системі числення з основою K. Другий рядок містить числа K і M, розділені пропуском.
//    Програма повинна вивести запис числа N в системі числення з основою M.

    public static void main(String[] args) {
        testConvertToNumericalSystem();
    }

    public static void printResult() {
        Scanner scn = new Scanner(System.in);


        System.out.println("Enter some number |N| from 1 to 1000000000");
        String number = scn.nextLine();

        StringBuilder sb = new StringBuilder(number);
        // number = sb.reverse().toString(); fixme
        number = sb.toString();

        System.out.println("Enter a number in a numeral system K from base 2 to base 36");
        int k = scn.nextInt();

        System.out.println("Enter the base to which the number M will be converted from 2 to 36");
        int m = scn.nextInt();

        try {
            System.out.println(convertToNumericalSystem(number, k, m));
        } catch (OutOfRangeForNumberException | OutsideOfNumericSystemException |
                 NotAcceptableCharacterForNumericalSystemException | MissingNumberException e) {
            System.out.println("Fail");
            e.printStackTrace();
        }
    }

    public static String convertToNumericalSystem(String number, int k, int m) throws OutOfRangeForNumberException, OutsideOfNumericSystemException, NotAcceptableCharacterForNumericalSystemException, MissingNumberException {

        char ch = ' ';
        int value = 0;
        int result = 0;
        char minus = ' ';

        if (number == "" || number == null) {
            throw new MissingNumberException();
        }

        number = number.toUpperCase();


        if (number.charAt(0) == '-') {
            minus = '-';
            number = number.substring(1, number.length());
        }

        if (number == "0") {
            throw new OutOfRangeForNumberException(number, k);
        }

        if (k < 2 || k > 36) {
            throw new OutsideOfNumericSystemException(k, "Input numeric system");
        }

        if (m < 2 || m > 36) {
            throw new OutsideOfNumericSystemException(m, "Output numeric system");
        }

        for (int i = 0; i < number.length(); i++) {
            if (Character.isAlphabetic(number.charAt(i))) {
                if ((number.charAt(i) - 55) < k) {

                } else throw new NotAcceptableCharacterForNumericalSystemException(number.charAt(i));
            } else if (Character.isDigit(number.charAt(i))) {
                if ((number.charAt(i) - 48) < k) {

                } else throw new NotAcceptableCharacterForNumericalSystemException(number.charAt(i));
            } else throw new NotAcceptableCharacterForNumericalSystemException(number.charAt(i));
        }


        for (int i = number.length() - 1; i >= 0; i--) {
            ch = number.charAt(number.length() - 1 - i);

            if (ch >= '0' && ch <= '9') {
                value = ch - '0';
            } else if (ch >= 'A' && ch <= 'Z') {
                value = ch - 'A' + 10;
            } else throw new OutsideOfNumericSystemException(k, String.valueOf(ch));

            result = result + value * (int) Math.pow(k, i);
        }
        if (result > 1000000000) {
            throw new OutOfRangeForNumberException(number, k);
        }

        //throw new Exception();

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

            if (mod >= 10) {
                modResult += resultForLatters;
            } else
                modResult += mod.toString();


            // modResult = mod.toString() + resultForLatters;
        }

        StringBuilder sb1 = new StringBuilder(modResult);
        modResult = sb1.reverse().toString();

        if (minus == '-') {
            modResult = minus + modResult;
        }

        return modResult;
    }

    public static void testConvertToNumericalSystem() {

        // Check the positive test: number - CD6, system k - 16, m - 3
        String convertResult = "";

        String[] numberPositive = {"CD6", "11111201", "-A1", "Z", "z"};
        Integer[] kPositive = {16, 3, 16, 36, 36};
        Integer[] mPositive = {3, 16, 10, 10, 10};
        String[] expectedResult = {"11111201", "CD6", "-161", "35", "35"};

        for (int i = 0; i < numberPositive.length; i++) {
            System.out.println("Test case " + (i + 1));
            try {
                convertResult = convertToNumericalSystem(numberPositive[i], kPositive[i], mPositive[i]);
                if (convertResult.equals(expectedResult[i])) {
                    System.out.println("Pass");

                } else {
                    System.out.println("Fail");
                    String format = String.format("Check the positive test: number: %s, system k: %d, m: %d. Expected output: %s, received: %s", numberPositive[i], kPositive[i], mPositive[i], expectedResult[i], convertResult);
                    System.out.println(format);
                }

            } catch (Exception e) {
                System.out.println("Fail");
                e.printStackTrace();
            }
        }


        // Negative test: number = 0, k = 10, m = 11

//        String inputNumber = "0";
//        int inputK = 10;
//        int inputM = 11;

        String received = "";
        //   System.out.println("Test case 6");

        String[] numberNegative = {"0", "", null, "9", "20", "AC", "A-1", "AC", "AC", "B", "1000000001", "111011100110101100101000000001"};
        Integer[] kNegative = {10, 10, 10, 2, 1, 37, 16, 16, 16, 10, 10, 2};
        Integer[] mNegative = {11, 11, 11, 10, 10, 10, 10, 1, 37, 3, 3, 3};
        Exception[] expectedException = {new OutOfRangeForNumberException(numberNegative[0], kNegative[0]),
                new MissingNumberException(),
                new MissingNumberException(),
                new NotAcceptableCharacterForNumericalSystemException(numberNegative[3].charAt(0)),
                new OutsideOfNumericSystemException(kNegative[4], "Input numeric system"),
                new OutsideOfNumericSystemException(kNegative[5], "Input numeric system"),
                new NotAcceptableCharacterForNumericalSystemException(numberNegative[6].charAt(1)),
                new OutsideOfNumericSystemException(mNegative[7], "Output numeric system"),
                new OutsideOfNumericSystemException(mNegative[8], "Output numeric system"),
                new NotAcceptableCharacterForNumericalSystemException(numberNegative[9].charAt(0)),
                new OutOfRangeForNumberException(numberNegative[10], kNegative[10]),
                new OutOfRangeForNumberException(numberNegative[11], kNegative[11]),
        };

        for (int i = 0; i < numberNegative.length; i++) {
            System.out.println("Test case " + (i + 6));
            try {
                received = convertToNumericalSystem(numberNegative[i], kNegative[i], mNegative[i]);
                System.out.println("Fail");
            } catch (Exception receivedException) {
                if (expectedException[i].getClass() == receivedException.getClass()) {
                    System.out.println("Pass");
                } else System.out.println("Fail");
            }
        }

//        try {
//            received = convertToNumericalSystem(inputNumber, inputK, inputM);
//            System.out.println("Fail");
//        } catch (NotAcceptableCharacterForNumericalSystemException e) {
//            System.out.println("Fail");
//        }catch (OutsideOfNumericSystemException e) {
//            System.out.println("Fail");
//        } catch (MissingNumberException e){
//            System.out.println("Fail");
//        } catch (OutOfRangeForNumberException e) {
//            System.out.println("Pass");
//        }
//
//        //Negative test: number = empty, k = 10, m = 11
//        inputNumber = "";
//        inputK = 10;
//        inputM = 11;
//        System.out.println("Test case 7");
//        try {
//            received = convertToNumericalSystem(inputNumber, inputK, inputM);
//            System.out.println("Fail");
//        } catch (NotAcceptableCharacterForNumericalSystemException e) {
//            System.out.println("Fail");
//        }catch (OutsideOfNumericSystemException e) {
//            System.out.println("Fail");
//        } catch (MissingNumberException e){
//            System.out.println("Pass");
//        } catch (OutOfRangeForNumberException e) {
//            System.out.println("Fail");
//        }
//
//        //Negative test: number = empty, k = 10, m = 11
//        inputNumber = null;
//        inputK = 10;
//        inputM = 11;
//        System.out.println("Test case 8");
//        try {
//            received = convertToNumericalSystem(inputNumber, inputK, inputM);
//            System.out.println("Fail");
//        } catch (NotAcceptableCharacterForNumericalSystemException e) {
//            System.out.println("Fail");
//        }catch (OutsideOfNumericSystemException e) {
//            System.out.println("Fail");
//        } catch (MissingNumberException e){
//            System.out.println("Pass");
//        } catch (OutOfRangeForNumberException e) {
//            System.out.println("Fail");
//        }
//
//        //Negative test: number = 9, k = 2, m = 10, в двоичной системе допустимы только 0 и 1, не 9
//        inputNumber = "9";
//        inputK = 2;
//        inputM = 10;
//        System.out.println("Test case 9");
//        try {
//            received = convertToNumericalSystem(inputNumber, inputK, inputM);
//            System.out.println("Fail");
//        } catch (Exception e) {
//            System.out.println("Pass");
//        }
//
//        //Negative test: number = 20, k = 1, m = 10
//        inputNumber = "20";
//        inputK = 1;
//        inputM = 10;
//        System.out.println("Test case 10");
//        try {
//            received = convertToNumericalSystem(inputNumber, inputK, inputM);
//            System.out.println("Fail");
//        } catch (Exception e) {
//            System.out.println("Pass");
//        }
//
//        //Negative test: number = AC, k = 37, m = 10
//        inputNumber = "AC";
//        inputK = 37;
//        inputM = 10;
//        System.out.println("Test case 11");
//        try {
//            received = convertToNumericalSystem(inputNumber, inputK, inputM);
//            System.out.println("Fail");
//        } catch (Exception e) {
//            System.out.println("Pass");
//        }
//
//        //Negative test: number = A-1, k = 16, m = 10
//        inputNumber = "A-1";
//        inputK = 16;
//        inputM = 10;
//        System.out.println("Test case 12");
//        try {
//            received = convertToNumericalSystem(inputNumber, inputK, inputM);
//            System.out.println("Fail");
//        } catch (Exception e) {
//            System.out.println("Pass");
//        }
//
//        //Negative test: number = AC, k = 16, m = 1
//        inputNumber = "AC";
//        inputK = 16;
//        inputM = 1;
//        System.out.println("Test case 13");
//        try{
//            received = convertToNumericalSystem(inputNumber, inputK, inputM);
//            System.out.println("Fail");
//        } catch (Exception e){
//            System.out.println("Pass");
//        }
//
//        //Negative test: number = AC, k = 16, m = 37
//        inputNumber = "AC";
//        inputK = 16;
//        inputM = 37;
//        System.out.println("Test case 14");
//        try {
//            received = convertToNumericalSystem(inputNumber, inputK, inputM);
//            System.out.println("Fail");
//        } catch (Exception e) {
//            System.out.println("Pass");
//        }
//
//        //Negative test: number = B, k = 10, m = 3
//        inputNumber = "B";
//        inputK = 10;
//        inputM = 3;
//        System.out.println("Test case 15");
//        try {
//            received = convertToNumericalSystem(inputNumber, inputK, inputM);
//            System.out.println("Fail");
//        } catch (Exception e) {
//            System.out.println("Pass");
//        }
//
//        //Negative test: number = 1000000001, k = 10, m = 12
//        inputNumber = "1000000001";
//        inputK = 10;
//        inputM = 3;
//        System.out.println("Test case 16");
//        try {
//            received = convertToNumericalSystem(inputNumber, inputK, inputM);
//            System.out.println("Fail");
//        } catch (Exception e) {
//            System.out.println("Pass");
//        }
//
//        //Negative test: number = 111011100110101100101000000001, k = 2, m = 10
//        inputNumber = "111011100110101100101000000001";
//        inputK = 2;
//        inputM = 3;
//        System.out.println("Test case 17");
//        try {
//            received = convertToNumericalSystem(inputNumber, inputK, inputM);
//            System.out.println("Fail");
//        } catch (Exception e) {
//            System.out.println("Pass");
//        }

    }
}
