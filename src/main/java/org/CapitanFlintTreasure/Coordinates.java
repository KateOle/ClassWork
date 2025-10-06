package org.CapitanFlintTreasure;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Coordinates {

    public static void main(String[] args){
       try {
           coordinate("North 6\nNorth 8\nEast 7\nSouth 3\nWest 9\nTreasure!");
       } catch (Exception e) {

       }

    }

    public static String coordinate(String side) throws BrokenStructureOfRowException, BrokenStructureException,
            BrokenContentException, EmptyRowException, NullException {

        // stepsNS -> North, South, stepsEW - East, West
        int stepsNS = 0;
        int stepsEW = 0;
        String digits = null;




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

       // if(str.matches("^[South,North,West,East]{1}[ ]{1}\\d*[Treasure!]")){}
        for (int i = 0; i < str.length-1; i++) {

            if (str[i].matches("^(South|North)[ ]{1}\\d+")) {
              countSN = countSN+1;
             // digits = new StringBuilder(str[i]).append(str[1]).toString();
            } else if(str[i].matches("^(East|West)[ ]{1}\\d+")) {
               countEW = countEW+1;
            } else {
                throw new BrokenStructureOfRowException(str[i]);
            }

        }

         String[] sideAndDigitSN = new String[countSN];
          String[] sideAndDigitEW = new String[countEW];

          int iSN =0;
          int iEW = 0;

        for (int i = 0; i < str.length-1; i++) {
            if (str[i].matches("^(South|North)[ ]{1}\\d+")){
              sideAndDigitSN[iSN] = (str[i].split(" ")[1]);
                iSN = iSN+1;   // TWOPOINTERS
            } else if(str[i].matches("^(East|West)[ ]{1}\\d+")) {
                sideAndDigitEW[iEW] = (str[i].split(" ")[1]);
                iEW = iEW + 1;
            }

        }



      //  System.out.println(Arrays.toString(sideAndDigitSN));


        return null;
    }


}
