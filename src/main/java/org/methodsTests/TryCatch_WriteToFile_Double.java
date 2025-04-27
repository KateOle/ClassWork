package org.methodsTests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TryCatch_WriteToFile_Double {

//    зчитує з консолі дабл
//    зчитує з файла дабл
 //   multiple 2 doubles
//    записує в файл дабл

    public static void main(String[] args) {
            fileWithDouble();
    }


    public static double fileWithDouble() {


        double fromCons = Double.NaN;

        while (true) {
            try {
                Scanner scn = new Scanner(System.in);

                System.out.println("Enter some double digit");
                fromCons = scn.nextDouble();
                break;

            } catch (InputMismatchException e) {
                System.out.println(e);
                System.out.println("Incorrect inputted value, please enter again");

            }
        }

        Scanner myscn = null;

        String data = "";

        while (true) {
            try {
                File myFile = new File("myFile.txt");

                myscn = new Scanner(myFile);
                data = myscn.nextLine();
                break;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("Create file with data with name myFile.txt and click Enter");
                myscn = new Scanner(System.in);
                data = myscn.nextLine();
            } catch (NullPointerException e) {
                e.printStackTrace();
                System.out.println("After adding file myFile.txt click Enter");
                myscn.next();
            } catch (NoSuchElementException e) {
                e.printStackTrace();
                System.out.println("Enter double number in the file myFile.txt and click enter");
                myscn = new Scanner(System.in);
                data = myscn.nextLine();
            }
        }

       // File resultFile = new File("file/resultFile.txt");
        //resultFile.createNewFile();

        while (true) {
            try {
                Double dataFromString = Double.parseDouble(data);
                Double multipleDouble = dataFromString * fromCons;

               File resultFile = new File("file/resultFile.txt");
                resultFile.createNewFile();
                FileWriter writeResult = new FileWriter("file/resultFile.txt");
                writeResult.write(multipleDouble.toString());
                System.out.println(multipleDouble);
                writeResult.close();
                break;
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("File can't be created, access denied. Change the permissions and click Enter");

                myscn = new Scanner(System.in);
                myscn.nextLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        return Double.NaN;
    }

}
