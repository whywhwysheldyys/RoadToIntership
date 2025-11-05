//import java.util.LinkedList;
//import java.util.Random;
//import java.util.Collections;
//
//public class LinkedListExample {
//    public static void main(String[] args) {
//        System.out.println("🧩 Тема 1: Связанный список (LinkedList)");
//
//        // 🧠 Задача 1. Очередь ожидания
//        System.out.println("\n🧠 Задача 1. Очередь ожидания");
//        LinkedList<String> clients = new LinkedList<>();
//        clients.add("Анна");
//        clients.add("Борис");
//        clients.add("Виктор");
//        clients.add("Дарья");
//        clients.add("Елена");
//
//        System.out.println("Очередь клиентов:");
//        while (!clients.isEmpty()) {
//            System.out.println("Обслуживается: " + clients.poll());
//        }
//
//        // 🧠 Задача 2. История действий
//        System.out.println("\n🧠 Задача 2. История действий");
//        LinkedList<String> history = new LinkedList<>();
//
//        history.add("Открыл страницу");
//        history.add("Нажал кнопку");
//        history.add("Ввёл текст");
//        history.add("Сохранил данные");
//        history.add("Закрыл приложение");
//
//        System.out.println("Полная история: " + history);
//
//        history.removeLast();
//        System.out.println("После отмены: " + history);
//
//        history.add("Отправил форму");
//        System.out.println("После нового действия: " + history);
//
//        // 🧠 Задача 3. Работа с числами
//        System.out.println("\n🧠 Задача 3. Работа с числами");
//        LinkedList<Integer> numbers = new LinkedList<>();
//        Random random = new Random();
//
//        for (int i = 0; i < 10; i++) {
//            numbers.add(random.nextInt(100));
//        }
//
//        System.out.println("Исходный список: " + numbers);
//
//        Collections.sort(numbers);
//        System.out.println("Отсортированный список: " + numbers);
//
//        numbers.removeIf(n -> n % 2 == 0);
//        System.out.println("После удаления чётных: " + numbers);
//    }
//}