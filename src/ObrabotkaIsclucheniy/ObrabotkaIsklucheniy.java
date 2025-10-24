package ObrabotkaIsclucheniy;

import java.util.Scanner;

public class ObrabotkaIsklucheniy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 🧩 Тема 1: Обработка исключений и конструкция try...catch...finally
        // Задание 1:
        // Напиши программу, которая запрашивает у пользователя два числа и делит одно на другое.
        // Используй try...catch...finally, чтобы:
        // обработать деление на ноль,
        // вывести результат,
        // в блоке finally вывести сообщение "Операция завершена".
        try {
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();
            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();
            double result = num1 / num2;
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль!");
        } finally {
            System.out.println("Операция завершена");
        }

        scanner.nextLine();

        // Задание 2:
        // Создай метод parseIntFromString(String s), который пытается преобразовать строку в число.
        // Если в строке не число, программа должна вывести сообщение "Ошибка преобразования!", но при этом не завершаться с ошибкой.
        // Проверку сделай через try...catch.
        System.out.print("Введите строку для преобразования в число: ");
        String inputString = scanner.nextLine();
        parseIntFromString(inputString);

        // Задание 3:
        // Напиши программу, которая открывает массив из 5 элементов и пытается получить элемент по индексу, введённому пользователем.
        // Если индекс некорректный — перехвати ArrayIndexOutOfBoundsException и выведи сообщение "Нет такого элемента!".
        // В finally выведи "Завершение работы программы".
        int[] array = {10, 20, 30, 40, 50};
        System.out.print("Введите индекс элемента (0-4): ");
        try {
            int index = scanner.nextInt();
            System.out.println("Элемент с индексом " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Нет такого элемента!");
        } finally {
            System.out.println("Завершение работы программы");
        }
    }

    public static void parseIntFromString(String s) {
        try {
            int number = Integer.parseInt(s);
            System.out.println("Преобразованное число: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования!");
        }
    }
}
