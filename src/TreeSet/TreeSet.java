//import java.util.TreeSet;
//import java.util.NavigableSet;
//
//public class TreeSet {
//    public static void main(String[] args) {
//
//        // 🧠 Задача 1. Сортировка чисел
//        TreeSet<Integer> numbers = new TreeSet<>();
//        numbers.add(15);
//        numbers.add(3);
//        numbers.add(22);
//        numbers.add(7);
//        numbers.add(12);
//
//        System.out.println("Все числа: " + numbers);
//        System.out.println("Минимум: " + numbers.first());
//        System.out.println("Максимум: " + numbers.last());
//
//        // 🧠 Задача 2. Алфавитный список
//        TreeSet<String> names = new TreeSet<>();
//        names.add("Дарья");
//        names.add("Анна");
//        names.add("Елена");
//        names.add("Борис");
//        names.add("Виктор");
//
//        System.out.println("\nОтсортированные имена: " + names);
//        System.out.println("Первое: " + names.first());
//        System.out.println("Последнее: " + names.last());
//
//        // 🧠 Задача 3. NavigableSet — поиск соседей
//        TreeSet<Integer> set = new TreeSet<>();
//        for (int i = 10; i <= 100; i += 10) {
//            set.add(i);
//        }
//
//        System.out.println("\nЧисла: " + set);
//        System.out.println("Меньше 50: " + set.lower(50));
//        System.out.println("Больше 50: " + set.higher(50));
//
//        NavigableSet<Integer> subset = set.subSet(30, true, 80, false);
//        System.out.println("Промежуток 30–80: " + subset);
//    }
//}
