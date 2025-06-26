package org.numberFromDecimalDigitsTestsTryCatch;
//404. Напишіть програму, яка визначає, чи є у введеному рядку десяткові цифри, і виводить найбільше число, яке можна скласти
//з цих цифр. Провідних нулів у числі бути не повинно (за винятком числа 0, запис якого містить рівно одну цифру).
//Вхідний рядок містить довільні символи. Програма повинна вивести найбільше число, яке можна скласти з присутніх
//в рядку десяткових цифр.

public class numberFromDecimalDigits {

    public static void main(String[] args) {
        testConstructMaximumNumberFromDigitsInTheString();
      //  getDigitsFromString ("0 point 0 point 1");
    }

    /**
     *
     * @param line the line which contains letters and digits
     * @return the maximum number constructed from the digits within inputted line,
     *      or "There are no digits" if the digit does not occur.
     */

    public static String getDigitsFromString(String line) {

        StringBuilder digitsCollection = new StringBuilder("");

        if (line.toString().equals("")) {
            return "There are no digits";
        }

        if (line.charAt(0) == '0') {
            if (Character.isDigit(line.toString().charAt(1))) {
                return "Not allowed. Zero can't be at the beginning";
            }
        }

        for (int i = 1; i < line.length() - 1; i++) {
            if (line.charAt(i) == '0' && !Character.isDigit(line.toString().charAt(i - 1))) {
                if (Character.isDigit(line.toString().charAt(i + 1))) {
                    return "Not allowed. Zero can't be at the beginning";
                }
            }
        }


        for (int i = 0; i < line.length(); i++) {

            if (Character.isDigit(line.charAt(i))) {
                digitsCollection.append(line.charAt(i));
            }
        }

        if (digitsCollection.toString().equals("")) {
            return "There are no digits";
        }

        char[] arr = digitsCollection.toString().toCharArray();

        for (int i = 0; i < arr.length - 1; i++) {

            int maxIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            char temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        if (arr[0] == '0') {
            return arr[0] + "";
        }

        System.out.println(arr);

        return new String(arr);

    }

    public static void testConstructMaximumNumberFromDigitsInTheString() {

        //Positive: str: "Number is 2681", result: 8621
        //Positive: str: "Release Date: July 27, 2008", result: 872200
        // Positive: str: "Number is 0" result: 0
        //Positive: str: "" result: "There are no digits" (-1)
        //Positive: str: "Release Date: July", result: "There are no digits"
        //Positive: str: "Number is -13" result: 31
        //Positive: str: "Number is AB6" result: 6
        //Positive: str: "555" result: 555
        //Positive: str: "he 0 she 0" result: 0
        //Positive: str: "a 1 b 2 c3" result: 5231
        //Positive: str: "ab999999999999999999988888888800000" result: 999999999999999999988888888800000
        //Positive: str: "ab999998889999999999999988888800000" result: 999999999999999999988888888800000
        //Positive: str: "!!!@@@###"  result: "There are no digits"

        //Positive: str:  "Number is 01", result: "Not allowed. Zero can't be at the beginning"

        String[] inputtedStringTests = {
                "he 0 she 0",
                "Number is 2681",
                "Release Date: July 27, 2008",
                "Number is 0",
                "",
                "Release Date: July",
                "Number is -13",
                "Number is AB6",
                "555",

                "a 1 b 2 c3",
                "ab999999999999999999988888888800000",
                "ab999998889999999999999988888800000",
                "!!!@@@###",
                "Number is 01",
                "0 and 1",
                "15 and 03",
                "Number 01 is",
                "0 point 0 point 1",
                "0980609812",
                "003 and 002"};

        String[] expectedNumber = {
                "0",
                "8621",
                "872200",
                "0",
                "There are no digits",
                "There are no digits",
                "31",
                "6",
                "555",

                "321",
                "999999999999999999988888888800000",
                "999999999999999999988888888800000",
                "There are no digits",
                "Not allowed. Zero can't be at the beginning",
                "10",
                "Not allowed. Zero can't be at the beginning",
                "Not allowed. Zero can't be at the beginning",
                "100",
                "Not allowed. Zero can't be at the beginning",
                "Not allowed. Zero can't be at the beginning"};

        String recievedResult = "";

        for (int i = 0; i < inputtedStringTests.length; i++) {

            System.out.println("Test case N " + (i + 1));

            recievedResult = getDigitsFromString(inputtedStringTests[i]);

            if (recievedResult.equals(expectedNumber[i])) {
                System.out.println("Pass");
            } else System.out.println("Fail");
        }
    }
}


