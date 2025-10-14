package Interface;

public class Interface {
    public static void main(String[] args) {
        // Задача: Интерфейсы
// Создайте интерфейс Printable с методом print().
// Создайте два класса: Book и Magazine, которые реализуют Printable.
// В методе print() Book выводит "Printing book", а Magazine — "Printing magazine".
// В main создайте массив Printable с объектами Book и Magazine и вызовите print() для каждого элемента.
//
//        interface Printable {
//            void print();
//        }
//
//        class Book implements Printable {
//            public void print() {
//                System.out.println("Printing book");
//            }
//        }
//
//        class Magazine implements Printable {
//            public void print() {
//                System.out.println("Printing magazine");
//            }
//        }
//
//
//                Printable[] items = {new Book(), new Magazine()};
//
//                for (Printable item : items) {
//                    item.print();

        // Задача: Интерфейсы
// Создайте интерфейс Drawable с методом draw().
// Создайте классы Circle и Rectangle, которые реализуют Drawable.
// В методе draw() Circle выводит "Drawing circle", а Rectangle — "Drawing rectangle".
// В main создайте массив Drawable с объектами Circle и Rectangle и вызовите draw() для каждого элемента.

//        interface Drawable {
//            void draw();
//        }
//
//        class Circle implements Drawable {
//            public void draw() {
//                System.out.println("Drawing circle");
//            }
//        }
//
//        class Rectangle implements Drawable {
//            public void draw() {
//                System.out.println("Drawing rectangle");
//            }
//        }
//
//                Drawable[] shapes = {new Circle(), new Rectangle()};
//
//                for (Drawable shape : shapes) {
//                    shape.draw();
//                }

        // Задача: Интерфейсы
// Создайте интерфейс Worker с методом work().
// Создайте классы Developer и Tester, которые реализуют Worker.
// В методе work() Developer выводит "Writing code", а Tester — "Testing software".
// В main создайте список Worker с объектами Developer и Tester и вызовите work() для каждого элемента.

//import java.util.ArrayList;
//import java.util.List;
//
//        interface Worker {
//            void work();
//        }
//
//        class Developer implements Worker {
//            public void work() {
//                System.out.println("Writing code");
//            }
//        }
//
//        class Tester implements Worker {
//            public void work() {
//                System.out.println("Testing software");
//            }
//        }
//
//        public class Main {
//            public static void main(String[] args) {
//                List<Worker> workers = new ArrayList<>();
//                workers.add(new Developer());
//                workers.add(new Tester());
//
//                for (Worker worker : workers) {
//                    worker.work();
//                }
//            }
//        }

    }
        }
//        }
