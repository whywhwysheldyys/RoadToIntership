package BuildInFunctionalInterfaces;

//🔹 Задача 1 (простая)
//
//Используй Consumer<String> для вывода всех элементов списка строк:
//
//List<String> words = List.of("Java", "Lambda", "Stream");
//
//
//Каждое слово выведи на новой строке через forEach.

//import java.util.List;
//import java.util.function.Consumer;
//
//public class BuildInFunctionalInterfaces {
//    public static void main(String[] args) {
//        List<String> words = List.of("Java", "Lambda", "Stream");
//
//        Consumer<String> printer = word -> System.out.println(word);
//        words.forEach(printer);
//    }
//}

//🔹 Задача 2 (средняя)
//
//Используй Function<Integer, String> для преобразования числа в строку:
//
//Если число чётное — вернуть "Even",
//
//Если нечётное — вернуть "Odd".
//Проверь функцию на нескольких числах и выведи результаты.

//import java.util.function.Function;
//
//public class BuildInFunctionalInterfaces {
//    public static void main(String[] args) {
//        Function<Integer, String> parityChecker = number -> number % 2 == 0 ? "Even" : "Odd";
//
//        System.out.println(parityChecker.apply(4));
//        System.out.println(parityChecker.apply(7));
//        System.out.println(parityChecker.apply(0));
//        System.out.println(parityChecker.apply(13));
//    }
//}

//🔹 Задача 3 (сложная)
//
//Используй цепочку встроенных интерфейсов:
//Создай Predicate<Integer> для проверки, что число положительное,
//и Function<Integer, Integer> для удвоения числа.
//
//Затем напиши метод:
//
//public static void processNumbers(List<Integer> numbers,
//                                  Predicate<Integer> filter,
//                                  Function<Integer, Integer> mapper,
//                                  Consumer<Integer> action)
//
//
//который:
//
//Фильтрует список по filter,
//
//Преобразует через mapper,
//
//Применяет action (например, печатает результат).
//
//Протестируй с разными наборами чисел и лямбдами.



//import java.util.List;
//import java.util.function.Predicate;
//import java.util.function.Function;
//import java.util.function.Consumer;
//
//public class BuildInFunctionalInterfaces {
//    public static void processNumbers(List<Integer> numbers,
//                                      Predicate<Integer> filter,
//                                      Function<Integer, Integer> mapper,
//                                      Consumer<Integer> action) {
//        for (Integer number : numbers) {
//            if (filter.test(number)) {
//                Integer result = mapper.apply(number);
//                action.accept(result);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Predicate<Integer> positiveFilter = n -> n > 0;
//        Function<Integer, Integer> doubler = n -> n * 2;
//
//        List<Integer> numbers1 = List.of(-2, -1, 0, 1, 2, 3);
//        List<Integer> numbers2 = List.of(5, 10, 15, 20);
//
//        processNumbers(numbers1, positiveFilter, doubler, System.out::println);
//
//        System.out.println("---");
//
//        processNumbers(numbers2,
//                n -> n % 2 == 0,
//                n -> n * 3,
//                System.out::println);
//    }
//}