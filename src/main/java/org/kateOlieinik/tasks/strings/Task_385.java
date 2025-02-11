//package org.kateOlieinik.tasks.strings;
//
//import java.util.Scanner;
//
//public class Task_385 {
////    Дано рядок, що є параграфом в тексті. Текст необхідно відформатувати так, щоб довжина кожного рядка не
////    перевищувала числа m, слова при цьому не розривати. На вхід програмі спочатку подається число m (0 < m ≤ 255).
////    У наступному рядку знаходиться вхідний текст. Довжина слів в ньому не перевищує m, слова розділені рівно одним
////    пропуском. Виведіть розбиття цього тексту на рядки довжиною не більше ніж m символів (слово переноситься на
////            наступний рядок тільки якщо в поточному рядку його розмістити вже неможливо). Новий рядок не повинен
////    починатися з пропуску.
//
//    public static void main(String[] args) {
//        breakWords();
//    }
//
//    public static void breakWords() {
//
//        Scanner scn = new Scanner(System.in);
//
//        System.out.println("Enter some sentence");
//
//        String sent = scn.nextLine();
//
//        System.out.println("Enter some number");
//
//        int n = scn.nextInt();
//
//        String collectWords = "";
//
//        for (int i = 0; i < sent.charAt(32); i++) {
//            if(i <= n){
//                collectWords += sent.charAt(i);
//            } else
//                System.out.println();
//        }
//
//    }
//
//}
