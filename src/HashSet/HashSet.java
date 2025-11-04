//import java.util.LinkedList;
//import java.util.Random;
//import java.util.Collections;
//import java.util.HashSet;
//import java.util.Scanner;
//import java.util.Set;
//
//public class HashSet {
//    public static void main(String[] args) {
//        System.out.println("🧩 Тема 1: Связанный список (LinkedList)");
//
//
//        // 🧠 Задача 4. Уникальные элементы
//        System.out.println("\n🧠 Задача 4. Уникальные элементы");
//        HashSet<String> names = new HashSet<>();
//        names.add("Анна");
//        names.add("Борис");
//        names.add("Виктор");
//        names.add("Анна");
//        names.add("Дарья");
//        names.add("Борис");
//        names.add("Елена");
//
//        System.out.println("Уникальные имена: " + names);
//
//        // 🧠 Задача 5. Пересечение множеств
//        System.out.println("\n🧠 Задача 5. Пересечение множеств");
//        HashSet<Integer> set1 = new HashSet<>();
//        HashSet<Integer> set2 = new HashSet<>();
//
//        Collections.addAll(set1, 1, 2, 3, 4, 5);
//        Collections.addAll(set2, 3, 4, 5, 6, 7);
//
//        HashSet<Integer> intersection = new HashSet<>(set1);
//        intersection.retainAll(set2);
//
//        System.out.println("Множество 1: " + set1);
//        System.out.println("Множество 2: " + set2);
//        System.out.println("Пересечение: " + intersection);
//
//        // 🧠 Задача 6. Проверка уникальности слов
//        System.out.println("\n🧠 Задача 6. Проверка уникальности слов");
//        String text = "яблоко груша яблоко апельсин банан груша";
//        System.out.println("Исходный текст: " + text);
//
//        String[] words = text.split(" ");
//        HashSet<String> uniqueWords = new HashSet<>();
//        HashSet<String> duplicateWords = new HashSet<>();
//
//        for (String word : words) {
//            if (!uniqueWords.add(word)) {
//                duplicateWords.add(word);
//            }
//        }
//
//        System.out.println("Уникальные слова: " + uniqueWords);
//        System.out.println("Повторяющиеся слова: " + duplicateWords);
//        System.out.println("Все слова уникальны: " + (duplicateWords.isEmpty()));
//    }
//}
