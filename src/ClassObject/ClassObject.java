package ClassObject;

public class ClassObject {
    public static void main(String[] args) {
        /*
Задача:
Создать класс Book с полями title и author.
Переопределить метод toString() для удобного вывода информации.
*/
//
//        class Book {
//            private String title;
//            private String author;
//
//            public Book(String title, String author) {
//                this.title = title;
//                this.author = author;
//            }
//
//            @Override
//            public String toString() {
//                return "Книга: " + title + ", Автор: " + author;
//            }
//
//            public static void main(String[] args) {
//                Book b = new Book("1984", "Джордж Оруэлл");
//                System.out.println(b);
//            }
//        }


        /*
Задача:
Создать класс Point с координатами x и y.
Переопределить equals() и hashCode() для сравнения объектов по значениям координат.
*/

//import java.util.Objects;
//
//        class Point {
//            private int x, y;
//
//            public Point(int x, int y) {
//                this.x = x;
//                this.y = y;
//            }
//
//            @Override
//            public boolean equals(Object o) {
//                if (this == o) return true;
//                if (!(o instanceof Point)) return false;
//                Point p = (Point) o;
//                return x == p.x && y == p.y;
//            }
//
//            @Override
//            public int hashCode() {
//                return Objects.hash(x, y);
//            }
//
//            public static void main(String[] args) {
//                Point p1 = new Point(3, 4);
//                Point p2 = new Point(3, 4);
//                System.out.println(p1.equals(p2)); // true
//            }
//        }

        /*
Задача:
Создать класс Student, реализующий Cloneable.
Переопределить метод clone(), чтобы возвращал копию объекта.
*/

//        class Student implements Cloneable {
//            String name;
//            int age;
//
//            public Student(String name, int age) {
//                this.name = name;
//                this.age = age;
//            }
//
//            @Override
//            protected Object clone() throws CloneNotSupportedException {
//                return super.clone();
//            }
//
//            public static void main(String[] args) {
//                try {
//                    Student s1 = new Student("Алексей", 20);
//                    Student s2 = (Student) s1.clone();
//                    System.out.println("Оригинал: " + s1.name);
//                    System.out.println("Клон: " + s2.name);
//                } catch (CloneNotSupportedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }


    }
}
