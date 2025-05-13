package stringsTopic;

import java.util.Locale;
import java.util.Scanner;
import org.apache.commons.lang3.*;
import java.lang.*;
import java.lang.StringBuilder;

public class Strings {

    public static void main(String[] args) {
        whiteSpaces1();
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

        System.out.println(arrayOfWords[arrayOfWords.length - 1]);
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
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number of pinguins from 1 to 9");

        int n = scn.nextInt();

        String str01 = "   _~_   " + "  ";
        String str02 = "  (o o)  " + "  ";
        String str03 = " /  V  \\ " + "  ";
        String str04 = "/(  %  )\\" + "  ";
        String str05 = "  ^^ ^^  " + "  ";
        String str1 = "";
        String str2 = "";
        String str3 = "";
        String str4 = "";
        String str5 = "";

        for (int i = 0; i < n; i++) {
            str1 += str01;
            str2 += str02;
            str3 += str03;
            str4 += str04.replace("%", String.valueOf(i + 1));
            str5 += str05;

        }
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);

    }

    public static void numbersFromString() {
//    335. Дано рядок, який, можливо, містить пропуски. «Витягніть» з цього рядка всі символи, які є цифрами і складіть
//    з них новий рядок.
//    3+3=6     -- 336
//    2 * 3 = 6   --- 236

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some phrase");

        String row = scn.nextLine();

        Character stor;


        for (int i = 0; i < row.length(); i++) {
            stor = row.charAt(i);
            if (stor >= 48 && stor <= 57) {
                System.out.print(stor + " ");
            }
        }
    }

    public static void accessToAccount() {
//    336. Для доступу до власного акаунту на сайті соціальної мережі користувач ввів логін і
//    пароль. Так як була увімкнена двофакторна авторизація, на його телефон прийшло повідомлення
//    з рядком цифр та інформацією як отримати код доступу. У повідомленні йшлося: «Кожну цифру, яка більша 5,
//    необхідно націло розділити на 2, а потім з утвореної послідовності цифр видалити усі парні числа». Який код
//    повинен ввести користувач для успішної авторизації? Напишіть програму, на вхід якої вводиться рядок цифр із
//        повідомлення, а програма повинна надрукувати правильний код доступу.

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some code");

        String code = scn.nextLine();

        int count = 0;
        for (int i = 0; i < code.length(); i++) {
            Character codeChar = code.charAt(i);
            if (codeChar > 53 && codeChar < 58) {
                count = (codeChar - 48) / 2;
                if (count % 2 != 0) {
                    System.out.print(count + " ");
                }
            }
        }
    }

    public static void asciiFromTo() {
//    337. Виведіть усі символи ASCII з кодами від n (n > 32) до m (m < 127) і їх коди в наступному вигляді: «символ код».

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter star code");

        int fromChar = scn.nextInt();

        System.out.println("Enter end code");

        int toChar = scn.nextInt();

        for (int i = fromChar; i <= toChar; i++) {
            char result = (char) i;
            System.out.printf("%c %d \n", result, i);
        }
    }

    public static void removeSpacesFromTheSent() {
//  338.  У рядку є кілька слів, розділених одним або декількома пропусками. Потрібно прибрати з тексту зайві пропуски:
//    два і більше пропусків поспіль, а також всі пропуски на початку і в кінці рядка. На вхід програмі подається рядок,
//    що складається не більше ніж з 255 символів. Надрукувати новий рядок.

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some sentence");

        String line = scn.nextLine();

        String resultLine = line.replaceAll("\\s+", " ").trim();

        System.out.println(resultLine);
    }

    public static void calculationFromTheString() {
//    339. Дано вираз, який має один з наступних виглядів: 'A+B', 'A-B' або 'A*B', де A і B - цілі числа від 0 до 1000000000.
//    Визначте значення цього виразу.

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some statememnt");

        String statem = scn.nextLine();

        boolean plus = statem.contains("+");
        boolean minus = statem.contains("-");
        boolean multip = statem.contains("*");

        String[] numberFromTheStringBasic = null;
        int numbRes = 0;

        if (plus) {
            numberFromTheStringBasic = statem.split("\\+");
            int numb = Integer.parseInt(numberFromTheStringBasic[0]);
            int numb2 = Integer.parseInt(numberFromTheStringBasic[1]);
            numbRes = numb + numb2;

        } else if (minus) {
            numberFromTheStringBasic = statem.split("\\-");
            int numbMin1 = Integer.parseInt(numberFromTheStringBasic[0]);
            int numbMin2 = Integer.parseInt(numberFromTheStringBasic[1]);
            numbRes = numbMin1 - numbMin2;

        } else if (multip) {
            numberFromTheStringBasic = statem.split("\\*");
            int numbMult1 = Integer.parseInt(numberFromTheStringBasic[0]);
            int numMult2 = Integer.parseInt(numberFromTheStringBasic[1]);
            numbRes = numbMult1 * numMult2;
        }
        System.out.println(numbRes);
    }

    public static void stringToLowerCase() {
//    340. Дано рядок, який, можливо, містить пропуски. Переведіть усі символи цього рядка в нижній регістр.
//    Hearts of Three, by Jack London

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a line");

        String statem = scn.nextLine();

        String lowerCaseLine = statem.toLowerCase();

        System.out.println(lowerCaseLine);

    }

    public static void lineOfAsciiCodes() {
//    341. Виведіть поспіль, без пропусків, усі символи, що лежать в таблиці ASCII між двома заданими символами.
//    Програма отримує на вхід два символу, кожен в окремому рядку і повинна вивести рядок, що починається першим
//    із заданих символів і закінчується другим.

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter first character");

        char asciiChar1 = scn.next().charAt(0);

        System.out.println("Enter second character");

        char asciiChar2 = scn.next().charAt(0);

        int asciiInt1 = asciiChar1;
        int asciiInt2 = asciiChar2;

        for (int i = asciiInt1; i <= asciiInt2; i++) {
            System.out.print((char) i);
        }
    }

    public static void whiteSpaces() {
//    343. Дано рядок. Визначити число пропусків в ньому.
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some line");

        String line = scn.nextLine();

        int count = line.length() - line.replace(" ", "").length();

        System.out.println(count);
    }

    public static void whiteSpaces1() {
//    343. Дано рядок. Визначити число пропусків в ньому.
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter some line");

        String line = scn.nextLine();

        int whiteSpacesCount = StringUtils.countMatches(line, " ");
        System.out.println(whiteSpacesCount);
    }

}

