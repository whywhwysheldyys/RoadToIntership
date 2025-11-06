//import java.util.*;
//
//public class SortedMap {
//    public static void main(String[] args) {
//
//        // 1. Нахождение поддиапазона ключей
//        SortedMap<Integer, String> map = new TreeMap<>();
//        map.put(1, "a");
//        map.put(3, "b");
//        map.put(5, "c");
//        map.put(7, "d");
//
//        int a = 3;
//        int b = 7;
//
//        SortedMap<Integer, String> sub = map.subMap(a, b);
//        for (var e : sub.entrySet()) {
//            System.out.println(e.getKey() + "=" + e.getValue());
//        }
//
//        // 2. Получить первый и последний элементы
//        SortedMap<String, Integer> students = new TreeMap<>();
//        students.put("Artem", 83);
//        students.put("Boris", 90);
//        students.put("Dima", 75);
//        students.put("Egor", 88);
//
//        String first = students.firstKey();
//        String last = students.lastKey();
//
//        System.out.println(first + "=" + students.get(first));
//        System.out.println(last + "=" + students.get(last));
//
//        // 3. Сравнение двух SortedMap по ключам
//        SortedMap<Integer, String> map1 = new TreeMap<>();
//        map1.put(1, "a");
//        map1.put(3, "b");
//        map1.put(5, "c");
//
//        SortedMap<Integer, String> map2 = new TreeMap<>();
//        map2.put(3, "x");
//        map2.put(4, "y");
//        map2.put(5, "z");
//
//        Set<Integer> both = new TreeSet<>(map1.keySet());
//        both.retainAll(map2.keySet());
//
//        Set<Integer> only1 = new TreeSet<>(map1.keySet());
//        only1.removeAll(map2.keySet());
//
//        Set<Integer> only2 = new TreeSet<>(map2.keySet());
//        only2.removeAll(map1.keySet());
//
//        System.out.println("both = " + both);
//        System.out.println("only1 = " + only1);
//        System.out.println("only2 = " + only2);
//    }
//}
