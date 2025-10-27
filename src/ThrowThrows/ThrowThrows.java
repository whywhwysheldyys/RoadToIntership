package ThrowThrows;

import java.io.IOException;

// 🔹 Тема 1: throw и throws
// Задание 1:
// Создай метод checkNumber(int num), который выбрасывает исключение IllegalArgumentException, если число отрицательное.
// В main вызови этот метод и перехвати исключение.

//public class ThrowThrows {
//    public static void checkNumber(int num) {
//        if (num < 0) {
//            throw new IllegalArgumentException("Число не может быть отрицательным");
//        }
//        System.out.println("Число корректно: " + num);
//    }

// Задание 2:
// Создай метод divide(int a, int b) throws ArithmeticException, который возвращает результат деления.
// Если b == 0, выбрасывай исключение с помощью throw.
// В main перехвати исключение и выведи "Ошибка: деление на ноль!".

//    public static int divide(int a, int b) throws ArithmeticException {
//        if (b == 0) {
//            throw new ArithmeticException("Деление на ноль");
//        }
//        return a / b;
//    }

// Задание 3:
// Создай метод readFile(String fileName) throws IOException, который симулирует чтение файла (просто выводит сообщение "Чтение файла...").
// Если имя файла равно null или пустое, выбрасывай IOException с сообщением "Имя файла не указано!".
// Перехвати исключение в main.

//    public static void readFile(String fileName) throws IOException {
//        if (fileName == null || fileName.trim().isEmpty()) {
//            throw new IOException("Имя файла не указано!");
//        }
//        System.out.println("Чтение файла: " + fileName);
//    }
//
//    public static void main(String[] args) {
//        try {
//            checkNumber(-5);
//        } catch (IllegalArgumentException e) {
//            System.out.println("Перехвачено исключение: " + e.getMessage());
//        }
//
//        try {
//            int result = divide(10, 0);
//            System.out.println("Результат деления: " + result);
//        } catch (ArithmeticException e) {
//            System.out.println("Ошибка: деление на ноль!");
//        }
//
//        try {
//            readFile("");
//        } catch (IOException e) {
//            System.out.println("Ошибка ввода-вывода: " + e.getMessage());
//        }
//    }
//}
