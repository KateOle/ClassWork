package org.tryCatchThrow_TDD;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatch_MultiException {

    public static void main(String[] args) {

        File myFile = new File("MyFile.txt");


        try{
            Scanner myReader = new Scanner(myFile);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

        } catch(FileNotFoundException ex){
            System.out.println(ex);
        }
        catch(Exception e) {
          e.printStackTrace();
        }
    }
}
