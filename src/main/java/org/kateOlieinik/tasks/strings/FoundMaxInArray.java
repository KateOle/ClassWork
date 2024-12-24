package org.kateOlieinik.tasks.strings;

public class FoundMaxInArray {

    public static void main(String[] args) {
        findMaxInArray();
    }

    public static void findMaxInArray() {

        int[] arrayInt = {12, 356, 89, 1, 3 };

        int count = 0;
        for (int i = 0; i < arrayInt.length; i++) {

            if(arrayInt[i] > count) {
                count = arrayInt[i];
            }
        }

        System.out.println(count);
    }

}

