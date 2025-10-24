package LambdaVirazheniya;

//🧩 Тема 1: Лямбда как параметры и результаты методов
//🔹 Задача 1 (простая)
//
//Создай метод:
//
//public static void execute(Runnable action)
//
//
//который принимает лямбда-выражение и выполняет его.
//В main() вызови его, передав лямбду, выводящую в консоль фразу
//"Hello from lambda!".


//public class LambdaVirazheniya {
//    public static void execute(Runnable action) {
//        action.run();
//    }
//
//    public static void main(String[] args) {
//        execute(() -> System.out.println("Hello from lambda!"));
//    }
//}

//🔹 Задача 2 (средняя)
//
//Создай метод:
//
//public static void process(int a, int b, BiFunction<Integer, Integer, Integer> operation)
//
//
//который принимает два числа и лямбду, выполняющую над ними операцию.
//Вызови метод три раза, передав:
//
//сложение,
//
//умножение,
//
//вычитание,
//и выведи результаты.

//import java.util.function.BiFunction;
//
//public class LambdaVirazheniya {
//    public static void process(int a, int b, BiFunction<Integer, Integer, Integer> operation) {
//        int result = operation.apply(a, b);
//        System.out.println(result);
//    }
//
//    public static void main(String[] args) {
//        process(5, 3, (x, y) -> x + y);
//        process(5, 3, (x, y) -> x * y);
//        process(5, 3, (x, y) -> x - y);
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
//public class LambdaVirazheniya {
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
//        List<Integer> numbers1 = List.of(-2, -1, 0, 1, 2, 3);
//        List<Integer> numbers2 = List.of(10, 15, 20, 25);
//
//        Predicate<Integer> positiveFilter = n -> n > 0;
//        Function<Integer, Integer> doubler = n -> n * 2;
//
//        processNumbers(numbers1, positiveFilter, doubler, System.out::println);
//
//        System.out.println("---");
//
//        processNumbers(numbers2,
//                n -> n % 2 == 0,
//                n -> n + 10,
//                System.out::println);
//    }
//}