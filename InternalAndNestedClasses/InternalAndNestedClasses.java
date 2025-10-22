package InternalAndNestedClasses;

//public class InternalAndNestedClasses {
//    🧩 Задача 1. Внутренний класс — описание книги
//    Создай класс Library, внутри которого будет внутренний класс Book.
//    Требования:
//    Book хранит title и author.
//    Library содержит метод addBook(String title, String author) — создаёт объект Book и добавляет его в список.
//    Library содержит метод printBooks() — выводит все книги в формате:
//            "Название: <title>, Автор: <author>"
//    class Library {
//        private java.util.List<Book> books = new java.util.ArrayList<>();
//
//        class Book {
//            String title;
//            String author;
//
//            Book(String title, String author) {
//                this.title = title;
//                this.author = author;
//            }
//        }
//
//        void addBook(String title, String author) {
//            Book book = new Book(title, author);
//            books.add(book);
//        }
//
//        void printBooks() {
//            for (Book book : books) {
//                System.out.println("Название: " + book.title + ", Автор: " + book.author);
//            }
//        }
//    }

//⚙️ Задача 2. Статический вложенный класс — геометрия
//    Создай класс MathUtils с вложенным статическим классом Circle.
//    Требования:
//    Circle хранит радиус.
//    В Circle реализуй методы:
//    getArea() — возвращает площадь круга.
//            getPerimeter() — возвращает длину окружности.
//    В MathUtils добавь метод printCircleInfo(double r), который создаёт Circle и выводит:
//    Радиус: <r>, Площадь: <area>, Периметр: <perimeter>
//    class MathUtils {
//        static class Circle {
//            double radius;
//
//            Circle(double radius) {
//                this.radius = radius;
//            }
//
//            double getArea() {
//                return Math.PI * radius * radius;
//            }
//
//            double getPerimeter() {
//                return 2 * Math.PI * radius;
//            }
//        }
//
//        static void printCircleInfo(double r) {
//            Circle circle = new Circle(r);
//            System.out.println("Радиус: " + r + ", Площадь: " + circle.getArea() + ", Периметр: " + circle.getPerimeter());
//        }
//    }

//🧠 Задача 3. Вложенные классы с взаимодействием
//    Создай класс Computer с внутренним классом Processor и вложенным статическим классом Memory.
//    Требования:
//    У Processor есть поля cores (число ядер) и frequency (ГГц).
//    У Memory есть поле size (в ГБ).
//    В Computer реализуй метод showConfig(), который:
//    создаёт Processor с параметрами (например, 8 ядер, 3.6 ГГц);
//    создаёт Memory с размером 16 ГБ;
//    выводит конфигурацию:
//    Процессор: 8 ядер, 3.6 ГГц
//    Память: 16 ГБ
//    class Computer {
//        class Processor {
//            int cores;
//            double frequency;
//
//            Processor(int cores, double frequency) {
//                this.cores = cores;
//                this.frequency = frequency;
//            }
//        }
//
//        static class Memory {
//            int size;
//
//            Memory(int size) {
//                this.size = size;
//            }
//        }
//
//        void showConfig() {
//            Processor processor = new Processor(8, 3.6);
//            Memory memory = new Memory(16);
//            System.out.println("Процессор: " + processor.cores + " ядер, " + processor.frequency + " ГГц");
//            System.out.println("Память: " + memory.size + " ГБ");
//        }
//    }
//}
