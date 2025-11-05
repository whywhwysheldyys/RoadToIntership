//import java.util.HashMap;
//import java.util.Map;
//import java.util.Arrays;
//import java.util.List;
//import java.util.ArrayList;
//
//public class HashMap {
//    public static void main(String[] args) {
//
//        // 🧠 Задача 4. Телефонная книга
//        HashMap<String, String> phoneBook = new HashMap<>();
//        phoneBook.put("Анна", "123-45-67");
//        phoneBook.put("Борис", "555-12-12");
//        phoneBook.put("Елена", "987-65-43");
//
//        System.out.println("Телефонная книга:");
//        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
//            System.out.println(entry.getKey() + " → " + entry.getValue());
//        }
//        System.out.println("Найден номер для Борис: " + phoneBook.get("Борис"));
//
//        // 🧠 Задача 5. Подсчёт слов в тексте
//        String text = "я люблю я код";
//        String[] words = text.split(" ");
//        HashMap<String, Integer> wordCount = new HashMap<>();
//
//        for (String word : words) {
//            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
//        }
//
//        System.out.println("\nТекст: " + text);
//        System.out.println("Подсчёт слов: " + wordCount);
//
//        // 🧠 Задача 6. Таблица оценок
//        HashMap<String, Integer> grades = new HashMap<>();
//        grades.put("Анна", 8);
//        grades.put("Борис", 6);
//        grades.put("Виктор", 9);
//        grades.put("Дарья", 10);
//
//        System.out.println("\nОценки: " + grades);
//
//        double sum = 0;
//        for (int grade : grades.values()) {
//            sum += grade;
//        }
//        double average = sum / grades.size();
//        System.out.println("Средний балл: " + average);
//
//        List<String> aboveAverage = new ArrayList<>();
//        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
//            if (entry.getValue() > average) {
//                aboveAverage.add(entry.getKey());
//            }
//        }
//        System.out.println("Выше среднего: " + aboveAverage);
//    }
//}
//
