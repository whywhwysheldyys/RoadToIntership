package AnonymousClasses;


//🧩 Тема 1. Анонимные классы
//🔹 Задача 1 (простая)
//
//Создай интерфейс:
//
//interface Greeter {
//    void greet();
//}
//
//
//В main() создай анонимный класс, реализующий этот интерфейс,
//и выведи в консоль:
//
//Hello from anonymous class!
//interface Greeter {
//    void greet();
//}
//
//public class AnonymousClasses {
//    public static void main(String[] args) {
//        Greeter greeter = new Greeter() {
//            @Override
//            public void greet() {
//                System.out.println("Hello from anonymous class!");
//            }
//        };
//        greeter.greet();
//    }
//}


//🔹 Задача 2 (средняя)
//
//Создай абстрактный класс:
//
//abstract class Shape {
//    abstract double area();
//}
//
//
//В main() создай анонимные классы для:
//
//круга (r = 5),
//
//прямоугольника (a = 4, b = 6).
//
//Каждый должен переопределять метод area() и выводить свою площадь.



//abstract class Shape {
//    abstract double area();
//}
//
//public class AnonymousClasses {
//    public static void main(String[] args) {
//        Shape circle = new Shape() {
//            double r = 5;
//            @Override
//            double area() {
//                return Math.PI * r * r;
//            }
//        };
//
//        Shape rectangle = new Shape() {
//            double a = 4;
//            double b = 6;
//            @Override
//            double area() {
//                return a * b;
//            }
//        };
//
//        System.out.println("Circle area: " + circle.area());
//        System.out.println("Rectangle area: " + rectangle.area());
//    }
//}

//🔹 Задача 3 (сложная)
//
//Создай интерфейс:
//
//interface Operation {
//    int execute(int a, int b);
//}
//
//
//Создай метод:
//
//public static void calculate(Operation op)
//
//
//который применяет op.execute(10, 5) и выводит результат.
//В main() вызови calculate() трижды, каждый раз передавая анонимный класс, реализующий:
//
//сложение,
//
//вычитание,
//
//деление.

//interface Operation {
//    int execute(int a, int b);
//}
//
//public class AnonymousClasses {
//    public static void calculate(Operation op) {
//        System.out.println(op.execute(10, 5));
//    }
//
//    public static void main(String[] args) {
//        calculate(new Operation() {
//            @Override
//            public int execute(int a, int b) {
//                return a + b;
//            }
//        });
//
//        calculate(new Operation() {
//            @Override
//            public int execute(int a, int b) {
//                return a - b;
//            }
//        });
//
//        calculate(new Operation() {
//            @Override
//            public int execute(int a, int b) {
//                return a / b;
//            }
//        });
//    }
//}