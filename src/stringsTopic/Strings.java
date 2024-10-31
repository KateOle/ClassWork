package stringsTopic;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
       lastWordInSentence();

    }

    public static void stringUpperLowerCases() {
//   304. Напишіть програму, яка приймає від користувача рядок, і відображає цей рядок у верхньому і
//    нижньому регістрах.

        Scanner scn = new Scanner(System.in);

        System.out.println(" Enter some string ");

        String str1 = scn.nextLine();

        System.out.println(str1.toLowerCase(Locale.ROOT));

        System.out.println(str1.toUpperCase(Locale.ROOT));

    }

    public static void championTeam() {
// 305.   Скласти програму, яка запитує назву баскетбольної команди і повторює її на екрані зі словами:
//    This is a champion!.

        Scanner scn = new Scanner(System.in);

        System.out.println(" Enter a team name");

        String str = scn.nextLine();

        String str1 = "This is a champion!";

        // System.out.println(str.concat(str1));
        System.out.printf("%s! %s", str, str1);

    }

    public static void lastTwoCharFromTheLine() {
// 306.   Напишіть програму, яка виводить на екран рядок з 5-ти копій останніх двох символів введеного користувачем рядка
//            (довжина введеного рядка повинна бути не менше 2).

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a string not less then 2 characters");

        String str = scn.nextLine();

        if (str.length() < 2) {
            System.out.println("Enter again a string not less then 2 characters");
        } else {       // fixme

            for (int i = 0; i < 5; i++) {
                String lastChar = str.substring(str.length() - 2);

                System.out.print(lastChar);
            }
        }
    }

    public static void lastTwoCharFromTheLine1() {
// 306.   Напишіть програму, яка виводить на екран рядок з 5-ти копій останніх двох символів введеного користувачем рядка
//            (довжина введеного рядка повинна бути не менше 2).

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a string not less then 2 characters");

        String str = scn.nextLine();

        if (str.length() < 2) {
            System.out.println("Enter again a string not less then 2 characters");
        } else {

            StringBuilder str1 = new StringBuilder(str);

            CharSequence strChar = str1.subSequence((str.length() - 2), str.length());

            StringBuilder str2 = new StringBuilder();

            str2.repeat(strChar, 5);

            String str3 = str2.toString();

            System.out.println(str3);
        }
    }

    public static void concatTwoNumbers() {
//   307. Дано натуральне число. Знайти число, утворене з вхідного приписуванням до нього такого ж числа.

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number");

        String str = scn.nextLine();

        String concatString = str.concat(str);

        System.out.println(concatString);

    }

    public static void reversalOfNumber() {
        // 308. Дано натуральне число. Знайти число, що отримується при прочитанні його цифр справа наліво.

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number");

        String str = scn.nextLine();

        str = new StringBuilder(str).reverse().toString();

        System.out.println(str);
    }

    public static void isPalindrom() {
//   320. Користувач вводить рядок, в якому можуть бути пристуні пропуски. Визначити, чи є рядок паліндромом, тобто таким,
//    який однаково читається як справа наліво, так і зліва направо. Для літер регістр не враховувати. Приклади
//    рядків-паліндромів: racecar, 10201, Ada, Never odd or even.

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a string");

        String str = scn.nextLine();

        String lowerString = str.toLowerCase(Locale.ROOT);

        String reverseString = new StringBuilder(lowerString).reverse().toString();

        boolean palindrom = lowerString.equals(reverseString);

        System.out.println(palindrom);
    }

    public static void pasteValueInTheString() {
//   319. Напишіть програму, яка зчитує значення a і b і виводить вірш, в якому замість a і b використовуються ці значення.

        String poem = "{strA} and {strB} sat in the tree.\n" +
                "{strA} had fallen, {strB} was stolen.\n" +
                "What's remaining in the tree?";

        String strA = "A";
        String strB = "B";

        String newString = poem.replace("{strA}", strA).replace("{strB}", strB);

        System.out.println(newString);
    }

    public static void reduceNumber() {
//   318. Дано натуральне число. Знайти число, що отримується видаленням з вхідного усіх зазначених цифр.

        int[] number = {3, 4, 5, 4, 7};

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some digit");

        int n = scn.nextInt();

        for (int i = 0; i < number.length; i++) {
            if (number[i] == n) continue;
            System.out.print(number[i] + " ");
        }
    }

    public static void reduceNumber1() {
//   318. Дано натуральне число. Знайти число, що отримується видаленням з вхідного усіх зазначених цифр.

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter long number");

        String n = scn.nextLine();

        System.out.println("Enter a digit from the number");

        String d = scn.nextLine();

        String newString = n.replace(d, "");

        System.out.println(newString);

    }

    public static void isFirstLetterTheSameAsLastLetter() {
//  317.  Дано два слова. Скласти програму, яка визначає, чи перше слово починається на ту ж букву, на яку
//    закінчується друге слово.

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some word");

        String word1 = scn.nextLine();

        System.out.println("Enter second word");

        String word2 = scn.nextLine();

        String lowerCaseWord1 = word1.toLowerCase(Locale.ROOT);
        String lowerCaseWord2 = word2.toLowerCase(Locale.ROOT);

        char firstLetter = lowerCaseWord1.charAt(0);

        char lastLetter = lowerCaseWord2.charAt(word2.length() - 1);

        boolean equality = true;

        if (firstLetter == lastLetter) {
            equality = true;   // kak zdes pravilno zapisat?
        } else equality = false;
        System.out.println(equality);
    }

    public static void replaceSomeDigits() {
//   316. Дано натуральне число. Знайти число, що отримується з вхідного перестановкою його першої та останньої цифр.
//    Врахувати випадок введення одноцифрового числа.

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some number");

        int n = scn.nextInt();

        if (n < 10) {
            System.out.println(n);
            return;
        }

        String stringN = Integer.toString(n);

        String resultString = stringN.charAt(stringN.length() - 1) + stringN.substring(1, stringN.length() - 1) + stringN.charAt(0);

        System.out.println(resultString);
    }

    public static void removeDigitsFromTheString() {
//   328. Користувач вводить рядок, у якому чергуються цифри та інші символи. На початку і у кінці рядка цифри відсутні.
//    Напишіть програму, яка друкує усі символи введеного рядка у тому ж порядку, але без цифр.

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some string");

        String initialString = scn.nextLine();

        for (int i = 0; i < 10; i++) {
            initialString = initialString.replace("" + i, "");
        }
        System.out.println(initialString);

    }

    public static void replaceOfWords() {
//   329. Напишіть програму, щоб у введеному користувачем рядку виконати обмін місцями першого та останнього символів.

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some phrase");

        String phrase = scn.nextLine();

        String[] reverseWords = phrase.split(" ");

        String temp = reverseWords[0];
        reverseWords[0] = reverseWords[reverseWords.length - 1];
        reverseWords[reverseWords.length - 1] = temp;

        for (int i = 0; i < reverseWords.length; i++) {
            System.out.print(reverseWords[i] + " ");
        }
    }

    public static void changeRegister() {
//   330. Напишіть програму, яка змінює регістр введеного єдиного символу, тобто переводить великі літери у малі,
//    а малі - у великі, інші символи не змінює.
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some character");

        char character = scn.next().charAt(0);

        if (Character.isUpperCase(character)) {
            char lowerCharacter = Character.toLowerCase(character);
            System.out.println(lowerCharacter);
        } else if (Character.isLowerCase(character)) {
            char upperCharacter = Character.toUpperCase(character);
            System.out.println(upperCharacter);
        } else {
            System.out.println(character);
        }
    }

    public static void sumOfStringNumber() {
//    331. Вводиться додатне ціле трицифрове число. Знайти суму цифр числа. Операціями ділення націло і остача
//    від ділення користуватися не можна.
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some number");

        String number = scn.nextLine();

        int count = 0;
        for (int i = 0; i < number.length(); i++) {
            int digit = Character.getNumericValue(number.charAt(i));
            count += digit;
        }
        System.out.println(count);
    }

    public static void firstWordInSentence() {
//   332. Напишіть програму, яка виводить перше слово у рядку. Слово - це послідовність непробільних символів,
//    обмежена пропусками або межами рядка. Вхідний рядок містить довільну послідовність символів.
//    Програма повинна вивести перше слово цього рядка.
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some sentence");

        String sent = scn.nextLine();

        String[] arrayOfWords = sent.split(" ");

        System.out.println(arrayOfWords[0]);

    }

    public static void lastWordInSentence() {
//  333.  Напишіть програму, яка виводить останнє слово у рядку. Слово – це послідовність непробільних символів,
//    обмежена пропусками або межами рядка. Вхідний рядок містить довільну послідовність символів.
//    Програма повинна вивести останнє слово цього рядка.
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some sentence");

        String sent = scn.nextLine();

        String[] arrayOfWords = sent.split(" ");

        System.out.println(arrayOfWords[arrayOfWords.length-1]);
    }

    public static void penguins() {
//   334. Напишіть програму, яка по введеному числу n від 1 до 9 виводить на екран n пінгвінів з відповідним номером -
//    число від 1 до n. Зображення одного пінгвіна має розмір 5 x 9 символів, між двома сусідніми пінгвінами
//    також є порожній (з пропусків) стовпець. Дозволяється вивести порожній стовпець після останнього пінгвіна.
//    Для спрощення малювання скопіюйте пінгвіна із вихідних даних. Врахуйте, що виведення на екран виконується
//    порядково, а не «попінгвінно».

//                 _~_        _~_        _~_        _~_
//                (o o)      (o o)      (o o)      (o o)
//               /  V  \    /  V  \    /  V  \    /  V  \
//              /(  1  )\  /(  2  )\  /(  3  )\  /(  4  )\
//                ^^ ^^      ^^ ^^      ^^ ^^      ^^ ^^


    }
 }

