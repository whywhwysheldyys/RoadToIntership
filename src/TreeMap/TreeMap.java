//import java.util.*;
//
//public class TreeMap {
//    public static void main(String[] args) {
//
//        // 1. Реализовать словарь частоты слов
//        String text = "apple banana apple orange banana apple";
//        TreeMap<String, Integer> frequency = new TreeMap<>();
//
//        for (String word : text.split(" ")) {
//            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
//        }
//
//        System.out.println("Словарь частоты слов:");
//        frequency.forEach((k, v) -> System.out.println(k + "=" + v));
//
//        System.out.println();
//
//        // 2. Вывод только уникальных значений в отсортированном виде
//        int[] numbers = {5, 3, 8, 3, 1, 5, 7};
//        TreeMap<Integer, Boolean> uniqueMap = new TreeMap<>();
//
//        for (int num : numbers) {
//            uniqueMap.put(num, true);
//        }
//
//        System.out.println("Уникальные значения по возрастанию:");
//        for (Integer key : uniqueMap.keySet()) {
//            System.out.println(key);
//        }
//
//        System.out.println();
//
//        // 3. Настройка TreeMap с собственным компаратором
//        TreeMap<String, Integer> customMap = new TreeMap<>(
//                (s1, s2) -> {
//                    if (s1.length() != s2.length()) {
//                        return Integer.compare(s1.length(), s2.length());
//                    } else {
//                        return s1.compareTo(s2);
//                    }
//                }
//        );
//
//        customMap.put("apple", 10);
//        customMap.put("kiwi", 5);
//        customMap.put("banana", 7);
//        customMap.put("pear", 3);
//        customMap.put("fig", 8);
//
//        System.out.println("TreeMap с собственным компаратором:");
//        customMap.forEach((k, v) -> System.out.println(k + "=" + v));
//    }
//}
