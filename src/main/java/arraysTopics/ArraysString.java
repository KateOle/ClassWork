package arraysTopics;

import java.util.Scanner;

public class ArraysString {

    public static void ReduceSumOfLetters() {
    // дано список слів: dog, cat, rat, mouse, dragon, wolf,
    //        1. знайти кількість букв загальну

        String[] words = new String[]{"dog", "cat", "rat", "mouse", "dragon", "wolf"};

        int letters = 0;

        for (int i = 0; i < words.length; i++) {
           // letters = letters + words[i].length();
            letters += words[i].length();
        }
        System.out.println(letters);

    }

    public static void ReduceAmountOfWordsMoreThenThreeLetters() {
    //  2. знайти кількість слів більших за 3 букви

        String[] words = new String[]{"dog", "cat", "rat", "mouse", "dragon", "wolf"};

        int wordsMoreThenThree = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 3) {
                wordsMoreThenThree++;
            }
        }

        System.out.println(wordsMoreThenThree);
    }

    public static void filterOfWordsWithOddLetters() {
    //  3. відсіяти в новий список слова в яких непрна кількість букв

        String[] words = new String[]{"dog", "cat", "rat", "mouse", "dragon", "wolf"};
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 !=0 ) {
                count = count +1;
            }
        }

        String[] wordsOddLetters = new String[count];

        int j = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 !=0 ) {
                wordsOddLetters[j] = words[i];
                System.out.println(wordsOddLetters[j]);
                j++;
            }
        }
    }


    public static void reduceConcatenOfWords() {
//        // 4. зліпити всі стрінги в одне довге
        String[] words = new String[]{"dog", "cat", "rat", "mouse", "dragon", "wolf"};

        StringBuilder text = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            text.append(words[i]);
        }
        System.out.println(text);

        String[] longWord = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            longWord[i] = words[i];
            System.out.print(longWord[i]);
        }
    }

    public static void upperAndLowerCaseInString() {
       // 520.  Напишіть програму, яка приймає рядок символів, і обчислює кількість великих та малих літер.

        Scanner scn = new Scanner(System.in);

        System.out.println( " Enter a string ");
        String str1 = scn.nextLine();

        char letter = 0;
        int countUpper = 0;
        int countLower = 0;

        for (int i = 0; i < str1.length(); i++) {
            letter = str1.charAt(i);
            if( letter>= 60 && letter <= 90) {
                countUpper++;
            } else if ( letter >= 97 && letter <= 122) {
                   countLower++;
            }
        }

        System.out.println( " Upper case " + countUpper );
        System.out.println( " Lower case " + countLower );


    }
}
