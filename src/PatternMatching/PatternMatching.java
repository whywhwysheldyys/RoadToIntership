package PatternMatching;

public class PatternMatching {
    public static void main(String[] args) {
        printObjectInfo("Привет");
        printObjectInfo(3);
    }
    //
//    // 🧩 Pattern Matching — Паттерн типов (используется с instanceof и switch)
//
//    // Задание 1: Напиши метод printObjectInfo(Object obj), который:
// Если obj — это String, выводит "Строка длиной X"
// Если obj — это Integer, выводит "Целое число: X"
// Если obj — это Double, выводит "Дробное число: X"
// В остальных случаях — "Неизвестный тип"
    public static void printObjectInfo(Object obj) {
        if (obj instanceof String s) {
            System.out.println("Строка длиной " + s.length());
        } else if (obj instanceof Integer i) {
            System.out.println("Целое число: " + i);
        } else if (obj instanceof Double d) {
            System.out.println("Дробное число: " + d);
        } else {
            System.out.println("Неизвестный тип");
        }
    }
}
//
//    // Задание 2: Создай метод calculate(Object obj), который:
// Если obj — это Integer, возвращает квадрат числа.
// Если obj — это Double, возвращает его удвоенное значение.
// Если obj — это String, возвращает её длину.
// В остальных случаях возвращает -1.
//    public static int calculate(Object obj) {
//        if (obj instanceof Integer i) {
//            return i * i;
//        } else if (obj instanceof Double d) {
//            return (int) (d * 2);
//        } else if (obj instanceof String s) {
//            return s.length();
//        } else {
//            return -1;
//        }
//    }
//
//    // Задание 3: Используя switch с pattern matching, реализуй метод describe(Object o), который:
// Для String возвращает "Это строка: <значение>"
// Для Number возвращает "Это число: <значение>"
// Для null возвращает "Пустое значение"
// Для остальных — "Что-то другое"
//    public static String describe(Object o) {
//        return switch (o) {
//            case String s -> "Это строка: " + s;
//            case Number n -> "Это число: " + n;
//            case null -> "Пустое значение";
//            default -> "Что-то другое";
//        };
//    }
//
// 📦 Pattern Matching — Record-паттерн (используется с record и switch)
//
//    // Задание 1: Создай record Point(int x, int y) и метод printQuadrant(Point p), который с помощью pattern matching определяет, в какой четверти находится точка:
// x > 0, y > 0 → "I четверть"
// x < 0, y > 0 → "II четверть"
// x < 0, y < 0 → "III четверть"
// x > 0, y < 0 → "IV четверть"
// иначе → "На оси"
//    record Point(int x, int y) {}
//
//    public static String printQuadrant(Point p) {
//        return switch (p) {
//            case Point(int x, int y) when x > 0 && y > 0 -> "I четверть";
//            case Point(int x, int y) when x < 0 && y > 0 -> "II четверть";
//            case Point(int x, int y) when x < 0 && y < 0 -> "III четверть";
//            case Point(int x, int y) when x > 0 && y < 0 -> "IV четверть";
//            default -> "На оси";
//        };
//    }
//
//    // Задание 2: Создай record Person(String name, int age) и метод getCategory(Person p), который с помощью switch возвращает:
// если возраст < 14 → "Ребёнок"
// от 14 до 17 → "Подросток"
// от 18 до 64 → "Взрослый"
// 65 и выше → "Пенсионер"
//    record Person(String name, int age) {}
//
//    public static String getCategory(Person p) {
//        return switch (p) {
//            case Person(String n, int a) when a < 14 -> "Ребёнок";
//            case Person(String n, int a) when a >= 14 && a <= 17 -> "Подросток";
//            case Person(String n, int a) when a >= 18 && a <= 64 -> "Взрослый";
//            case Person(String n, int a) when a >= 65 -> "Пенсионер";
//            default -> "Неопределённо";
//        };
//    }
//
//    // Задание 3: Создай record Rectangle(Point topLeft, Point bottomRight) и метод getWidth(Rectangle r), который с помощью record-паттерна вычисляет и возвращает ширину прямоугольника.
// (ширина = bottomRight.x - topLeft.x)
//    record Rectangle(Point topLeft, Point bottomRight) {}
//
//    public static int getWidth(Rectangle r) {
//        return switch (r) {
//            case Rectangle(Point topLeft, Point bottomRight) -> bottomRight.x() - topLeft.x();
//        };
//    }
//}
