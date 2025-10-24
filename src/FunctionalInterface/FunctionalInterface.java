package FunctionalInterface;



//    Задача 1
//
//    Создай List<String> с названиями городов. Используй List.forEach с ссылкой на метод (System.out::println), чтобы вывести все города.

//    import java.util.List;
//
//    public class FunctionalInterface {
//        public static void main(String[] args) {
//            List<String> cities = List.of("Москва", "Санкт-Петербург", "Новосибирск", "Екатеринбург");
//            cities.forEach(System.out::println);
//        }
//    }


//Задача 2
//
//Создай функциональный интерфейс Calculator с методом int calc(int a, int b). Используя лямбду и ссылку на метод, реализуй сложение и умножение двух чисел.

//@java.lang.FunctionalInterface
//interface Calculator {
//    int calc(int a, int b);
//}
//
//public class FunctionalInterface {
//    public static void main(String[] args) {
//        Calculator addition = (a, b) -> a + b;
//        Calculator multiplication = Math::multiplyExact;
//
//        System.out.println("Сложение: " + addition.calc(5, 3));
//        System.out.println("Умножение: " + multiplication.calc(5, 3));
//    }
//}

//Задача 3
//
//Есть класс StringUtils с методом static boolean isLong(String s), который возвращает true, если длина строки > 5. Создай List<String> и фильтруй строки с помощью ссылки на метод.


//import java.util.List;
//import java.util.stream.Collectors;
//
//class StringUtils {
//    static boolean isLong(String s) {
//        return s.length() > 5;
//    }
//}
//
//public class FunctionalInterface{
//    public static void main(String[] args) {
//        List<String> strings = List.of("Java", "Programming", "Hi", "Lambda", "Methods");
//
//        List<String> longStrings = strings.stream()
//                .filter(StringUtils::isLong)
//                .collect(Collectors.toList());
//
//        System.out.println(longStrings);
//    }
//}