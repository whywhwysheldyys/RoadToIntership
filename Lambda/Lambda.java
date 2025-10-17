package Lambda;


//🧩 Задача 1. Сортировка списка строк
//
//        Создай List<String> с произвольными словами.
//        С помощью лямбда-выражения отсортируй их по длине (от коротких к длинным).
//        Выведи результат на экран.

//import java.util.ArrayList;
//import java.util.List;
//
//public class Lambda {
//    public static void main(String[] args) {
//        List<String> words = new ArrayList<>(List.of("Java", "Functional", "Code", "Lambda"));
//
//        words.sort((s1, s2) -> s1.length() - s2.length());
//
//        System.out.println(words);
//    }
//}

//🧩 Задача 2. Фильтрация чисел
//
//Создай List<Integer> с числами от 1 до 10.
//Используя лямбда-выражение и метод removeIf, удали все нечётные числа.
//Выведи результат.
//
//Подсказка:
//
//        numbers.removeIf(n -> n % 2 != 0);
//
//
//Ожидаемый вывод:
//
//        [2, 4, 6, 8, 10]


//import java.util.ArrayList;
//import java.util.List;
//
//public class Lambda{
//    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//
//        numbers.removeIf(n -> n % 2 != 0);
//
//        System.out.println(numbers);
//    }
//}

//@FunctionalInterface
//interface Operation {
//    int apply(int a, int b);
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Operation addition = (a, b) -> a + b;
//        Operation subtraction = (a, b) -> a - b;
//        Operation power = (a, b) -> (int) Math.pow(a, b);
//
//        int a = 3;
//        int b = 4;
//
//        System.out.println("Сложение: " + addition.apply(a, b));
//        System.out.println("Вычитание: " + subtraction.apply(a, b));
//        System.out.println("Степень: " + power.apply(a, b));
//    }
//}


