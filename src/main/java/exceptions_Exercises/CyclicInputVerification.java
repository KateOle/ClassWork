package exceptions_Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CyclicInputVerification {

//    циклічну перевірку вводу. Якщо ти хочеш щоб ввели число, а вводять щось не правильно,
//    пропонувати ввід допоки не введе число
    public static void InputANumber() {

        Scanner scn = new Scanner(System.in);

        boolean flag = true;
        while(flag){
        try {
            System.out.println("Enter a number");
            Integer number = scn.nextInt();
            System.out.println("Correct. " + number + " is a number");
            flag = false;

        } catch (InputMismatchException e) {
            System.out.println( " This is not a number ");
            scn.nextLine();

        } catch (Exception e) {
            System.out.println(" There is no correct");
            scn.nextLine();
        }
        }



    }

}
