package org.CapitanFlintTreasure;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Coordinates {

    public static void main(String[] args){
       try {
           coordinate("North 6\nSouth 3\nEast 7\nWest 9\nTreasure!");
       } catch (Exception e) {

       }

    }

    public static String coordinate(String side) throws BrokenStructureOfRowException, BrokenStructureException,
            EmptyRowException, NullException {


        if(side == null) {
            throw new NullException();
        }

        String[] str = side.split("\n");

        int countSN = 0;
        int countEW = 0;

        if (side.isEmpty()) {
            throw new EmptyRowException();
        }

        if(str[str.length-1].equals("Treasure!")) {

        } else {throw new BrokenStructureException();}

        for (int i = 0; i < str.length-1; i++) {

            if (str[i].matches("^(South|North)[ ]{1}\\d+")) {
              countSN = countSN+1;

            } else if(str[i].matches("^(East|West)[ ]{1}\\d+")) {
               countEW = countEW+1;
            } else {
                throw new BrokenStructureOfRowException(str[i]);
            }

        }

//         String[] sideAndDigitSN = new String[countSN];
//          String[] sideAndDigitEW = new String[countEW];

          int iSN =0;
          int iEW = 0;

//        for (int i = 0; i < str.length-1; i++) {
//            if (str[i].matches("^(South|North)[ ]{1}\\d+")){
//              sideAndDigitSN[iSN] = (str[i].split(" ")[1]);
//                iSN = iSN+1;   // TWOPOINTERS
//            } else if(str[i].matches("^(East|West)[ ]{1}\\d+")) {
//                sideAndDigitEW[iEW] = (str[i].split(" ")[1]);
//                iEW = iEW + 1;
//            }
//
//        }

        for (int i = 0; i < str.length-1; i++) {
            if (str[i].matches("^(North)[ ]{1}\\d+")){
              iSN = iSN + Integer.parseInt(str[i].split(" ")[1]);}
              else if(str[i].matches("^(South)[ ]{1}\\d+")){
                iSN = iSN - Integer.parseInt(str[i].split(" ")[1]);
            }

            else if(str[i].matches("^(East)[ ]{1}\\d+")) {
                iEW = iEW + Integer.parseInt(str[i].split(" ")[1]);

            } else if(str[i].matches("^(West)[ ]{1}\\d+")){
                iEW = iEW - Integer.parseInt(str[i].split(" ")[1]);
            }

        }

       // System.out.println((iEW + " " + iSN).toString());



        return (iEW + " " + iSN).toString();
    }


}
