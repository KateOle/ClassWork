package org.kateOlieinik.tasks.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Task349 {
//  349  Дано рядок, що складається з рівно двох слів, розділених пропуском. Надрукуйте новий рядок,
//    у якому позиції першого та другого слова змінені (друге слово друкується спочатку). У завданні не можна
//    використовувати цикли і вказівку «якщо».

    public static void main(String[] args) {
        reverseOfTwoWords();
    }

    public static void reverseOfTwoWords() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter 2 words");

        String twoWords = scn.nextLine();

        String[] splitedWords = twoWords.split(" ");

        String[] reversedWords = {splitedWords[1], splitedWords[0]};

        System.out.println(String.join(" ", reversedWords));

    }
}
