package Records;


//Задача 1
//
//Создай record Person с полями name и age. Создай объект Person, выведи его поля через методы доступа и переопредели toString с помощью compact constructor.
//public class Records {
//    public record Person(String name, int age) {
//        public Person {
//            if (age < 0) {
//                throw new IllegalArgumentException("Возраст не может быть отрицательным");
//            }
//        }
//
//        @Override
//        public String toString() {
//            return String.format("Person[name=%s, age=%d]", name, age);
//        }
//    }
//
//    public static void main(String[] args) {
//        Person person = new Person("Иван", 25);
//
//        System.out.println("Имя: " + person.name());
//        System.out.println("Возраст: " + person.age());
//
//        System.out.println(person);
//    }
//}


//Задача 2
//
//Создай record Rectangle с полями width и height. Реализуй метод area() внутри record, который возвращает площадь прямоугольника. Создай объект и выведи площадь.

//public class Records {
//    public record Rectangle(double width, double height) {
//        public double area() {
//            return width * height;
//        }
//    }
//
//    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle(5.0, 3.0);
//        System.out.println("Площадь прямоугольника: " + rectangle.area());
//    }
//}


//Задача 3
//
//Создай record Book с полями title, author и year. Добавь проверку в compact constructor, чтобы year не был меньше 1450 (появление книг). Если год некорректный — кидай IllegalArgumentException.

//public class Records {
//    public record Book(String title, String author, int year) {
//        public Book {
//            if (year < 1450) {
//                throw new IllegalArgumentException("Год не может быть меньше 1450");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Book book1 = new Book("Война и мир", "Лев Толстой", 1869);
//        System.out.println(book1);
//
//        Book book2 = new Book("Некорректная книга", "Автор", 1400);
//    }
//}