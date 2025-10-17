package Polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        /*
Задача:
Создать классы Cat и Dog, наследующие Animal.
Показать, как полиморфизм работает при вызове метода makeSound() через общий тип.
*/

//        class Animal {
//            public void makeSound() {
//                System.out.println("Животное издает звук");
//            }
//        }
//
//        class Cat extends Animal {
//            @Override
//            public void makeSound() {
//                System.out.println("Кошка мяукает");
//            }
//        }
//
//        class Dog extends Animal {
//            @Override
//            public void makeSound() {
//                System.out.println("Собака лает");
//            }
//
//            public static void main(String[] args) {
//                Animal a1 = new Cat();
//                Animal a2 = new Dog();
//                a1.makeSound();
//                a2.makeSound();
//            }
//        }

        /*
Задача:
Создать класс Shape с методом area().
Создать классы Circle и Rectangle, которые переопределяют этот метод.
Использовать полиморфизм для вызова area().
*/

//        abstract class Shape {
//            abstract double area();
//        }
//
//        class Circle extends Shape {
//            private double r;
//
//            public Circle(double r) {
//                this.r = r;
//            }
//
//            @Override
//            double area() {
//                return Math.PI * r * r;
//            }
//        }
//
//        class Rectangle extends Shape {
//            private double w, h;
//
//            public Rectangle(double w, double h) {
//                this.w = w;
//                this.h = h;
//            }
//
//            @Override
//            double area() {
//                return w * h;
//            }
//
//            public static void main(String[] args) {
//                Shape s1 = new Circle(3);
//                Shape s2 = new Rectangle(4, 5);
//                System.out.println("Площадь круга: " + s1.area());
//                System.out.println("Площадь прямоугольника: " + s2.area());
//            }
//        }


        /*
Задача:
Создать интерфейс Payment с методом pay().
Реализовать его в классах CardPayment и CashPayment.
Вызвать метод через общий интерфейс.
*/

//        interface Payment {
//            void pay(double amount);
//        }
//
//        class CardPayment implements Payment {
//            public void pay(double amount) {
//                System.out.println("Оплата картой: " + amount);
//            }
//        }
//
//        class CashPayment implements Payment {
//            public void pay(double amount) {
//                System.out.println("Оплата наличными: " + amount);
//            }
//
//            public static void main(String[] args) {
//                Payment p1 = new CardPayment();
//                Payment p2 = new CashPayment();
//                p1.pay(200);
//                p2.pay(150);
//            }
//        }


    }
}
