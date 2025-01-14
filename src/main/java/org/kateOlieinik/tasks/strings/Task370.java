package org.kateOlieinik.tasks.strings;

import java.util.Scanner;

public class Task370 {
//   370. Користувач вводить рядок і певний символ, який устрічається у рядку щонайменше двічі. Напишіть програму,
//    яка видалить із введеного рядка перше і останнє входження символа, а також всі символи між ними
//    Input:
//    We left in pretty good time, and came after nightfall to Klausenburgh.
//    Here I stopped for the night at the Hotel Royale.
//    u
//    Output:
//    We left in pretty good time, and came after nightfall to Klargh. Here I stopped for the night at the Hotel Royale.

    public static void main(String[] args) {
        removePartOfSentence();
    }

    public static void removePartOfSentence() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some sentence ");

        String sent = scn.nextLine();

        System.out.println("Enter some character");

        Character letter = scn.next().charAt(0);

        int firstIndex = sent.indexOf(letter);
        int lastIndex = sent.lastIndexOf(letter);

        StringBuilder sb = new StringBuilder(sent);

        if (sent.contains(letter.toString())) {
            sb.delete(firstIndex, lastIndex + 1);
            System.out.println(sb);
        } else {
            System.out.println("There is no character " + letter + " in the sentence");
        }
    }
}
