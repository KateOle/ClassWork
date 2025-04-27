package org.methodsTests;

import java.util.Scanner;

public class TryCatch_Array_OutOfBoundException {
// There are 5 rooms and 5 people live there. User enters number of room and gets Name of person

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number of room");

        String[] people = {"Alice", "Bob", "Tom", "Kate", "Lina"};

        Integer room = scn.nextInt();

        while(true) {
            try {
                System.out.println(people[room]);
                break;
            } catch (Exception e) {
                System.out.println("Number of room can be from 0 till 4");
                room = scn.nextInt();
            }
        }
    }
}
