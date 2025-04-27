package org.methodsTests;

public class Task_402_frequency_of_letters {

    // Enter a string where 1 letter is more often. 'Hello' -> l, 2
    // String where few letters the same amount. 'abcabc' -> a, b, c, 2
    // String with spaces, characters. 'a! b, -c a.' -> a, 2
    // String with Upper and lower case 'AabAb' -> a, 3
    // Empty string '' -> null
    //No letters string '1234' -> null
    // Every letter entered 1 time 'abcd' -> a, b, c, d, 1
    // String with 1 letter 'aaaaAa' -> a, 6
    // Not alphabetic order 'zZaAbZa' -> a, z, 3
    // Maximum amount in the end of the string 'xAbhXxxxX' -> x, 6


    public static void main(String[] args) {

    }

    public static void testLettersCalculation(){
        String[] inputValue = {"Hello", "abcabc", "a! b, -c a.", "AabAb", "", "1234", "abcd", "aaaaAa", "zZaAbZa", "xAbhXxxxX" };

        String[] expectedValue ={"l, 2", "a,b,c, 2", "a, 2", "a, 3", "null, 0", "null, 0", "a,b,c,d, 1", "a, 6", "a,z, 3", "x, 6"};

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

}
