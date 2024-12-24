package org.kateOlieinik.tasks.strings;

import java.util.*;

public class Task364_list {
    //364. Вводиться рядок. Потрібно видалити з нього повторювані символи і всі пропуски.
//    aa
//    a a b b c dd e

    public static void main(String[] args) {
        removeSpacesAndDoubleLettersFromRow();
    }

    public static void removeSpacesAndDoubleLettersFromRow() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some row");

        String row = scn.nextLine();

        String withoutSpaces = row.replace(" ", "");
        char[] withoutSpacesArray = withoutSpaces.toCharArray();

        List<Character> newList = new LinkedList<Character>();

        for (int i = 0; i < withoutSpacesArray.length; i++) {
            if (newList.contains(withoutSpacesArray[i])) {
            } else newList.add(withoutSpacesArray[i]);
        }

        for (int i = 0; i < newList.size(); i++) {
            System.out.print(newList.get(i));
        }
    }
}
