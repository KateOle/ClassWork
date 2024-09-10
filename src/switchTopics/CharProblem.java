package switchTopics;

import java.util.Random;

public class CharProblem {

    public static int howOld(final String herOld) {

        //your code here, return correct age as int ; )
        Random rnd = new Random();

        int howOld = rnd.nextInt(10);

        switch (howOld) {
            case 0: System.out.println("0 years old");
                break;
            case 1: System.out.println("1 year old");
                break;
            case 2: System.out.println("2 years old");
                break;
            case 3: System.out.println("3 years old");
                break;
            case 4: System.out.println("4 years old");
                break;
            case 5: System.out.println("5 years old");
                break;
            case 6: System.out.println("6 years old");
                break;
            case 7: System.out.println("7 years old");
                break;
            case 8: System.out.println("8 years old");
                break;
            case 9: System.out.println("9 years old");
                break;
        }
        return howOld;
    }

}
