package SealedClasses;

//🔹 Задача 1 (простая)
//
//Создай иерархию фигур:
//
//public sealed class Shape permits Circle, Rectangle {}
//
//final class Circle extends Shape {
//    double radius;
//    Circle(double radius) { this.radius = radius; }
//}
//
//final class Rectangle extends Shape {
//    double width, height;
//    Rectangle(double width, double height) {
//        this.width = width;
//        this.height = height;
//    }
//}
//
//
//В main() создай по одному объекту каждого класса и выведи их параметры.
//        Потренируйся понять, что никакие другие классы не могут наследоваться от Shape.



//public sealed class Shape permits Circle, Rectangle {}
//final class Circle extends Shape {
//    double radius;
//    Circle(double radius) { this.radius = radius; }
//}
//final class Rectangle extends Shape {
//    double width, height;
//    Rectangle(double width, double height) {
//        this.width = width;
//        this.height = height;
//    }
//}
//
//public class SealedClasses {
//    public static void main(String[] args) {
//        Circle circle = new Circle(5);
//        Rectangle rectangle = new Rectangle(4, 6);
//
//        System.out.println("Circle radius: " + circle.radius);
//        System.out.println("Rectangle width: " + rectangle.width + " height: " + rectangle.height);
//    }
//}


//🔹 Задача 2 (средняя)
//
//Расширь предыдущую задачу:
//Добавь абстрактный метод double area() в Shape,
//и реализуй его в Circle и Rectangle.
//
//        В main() создай список List<Shape> и выведи площадь каждой фигуры, используя instanceof и pattern matching:
//
//        if (shape instanceof Circle c) { ... }



//public sealed abstract class Shape permits Circle, Rectangle {
//    abstract double area();
//}
//final class Circle extends Shape {
//    double radius;
//    Circle(double radius) { this.radius = radius; }
//    @Override
//    double area() {
//        return Math.PI * radius * radius;
//    }
//}
//final class Rectangle extends Shape {
//    double width, height;
//    Rectangle(double width, double height) {
//        this.width = width;
//        this.height = height;
//    }
//    @Override
//    double area() {
//        return width * height;
//    }
//}
//
//import java.util.List;
//
//public class SealedClasses {
//    public static void main(String[] args) {
//        List<Shape> shapes = List.of(new Circle(5), new Rectangle(4, 6));
//
//        for (Shape shape : shapes) {
//            if (shape instanceof Circle c) {
//                System.out.println("Circle area: " + c.area());
//            }
//            if (shape instanceof Rectangle r) {
//                System.out.println("Rectangle area: " + r.area());
//            }
//        }
//    }
//}




//🔹 Задача 3 (сложная)
//
//Создай sealed класс User с permits Admin, Moderator, RegularUser.
//
//У каждого класса должны быть поля:
//
//Admin: String name, int level
//
//Moderator: String name, String section
//
//RegularUser: String name, int messagesCount
//
//Создай метод:
//
//public static void printUserInfo(User user)
//
//
//который через instanceof выводит информацию в зависимости от типа пользователя.
//
//        В main() создай по одному экземпляру каждого типа и выведи их описание.


//public sealed class User permits Admin, Moderator, RegularUser {}
//final class Admin extends User {
//    String name;
//    int level;
//    Admin(String name, int level) {
//        this.name = name;
//        this.level = level;
//    }
//}
//final class Moderator extends User {
//    String name;
//    String section;
//    Moderator(String name, String section) {
//        this.name = name;
//        this.section = section;
//    }
//}
//final class RegularUser extends User {
//    String name;
//    int messagesCount;
//    RegularUser(String name, int messagesCount) {
//        this.name = name;
//        this.messagesCount = messagesCount;
//    }
//}
//
//public class SealedClasses {
//    public static void printUserInfo(User user) {
//        if (user instanceof Admin a) {
//            System.out.println("Admin: " + a.name + ", level: " + a.level);
//        }
//        if (user instanceof Moderator m) {
//            System.out.println("Moderator: " + m.name + ", section: " + m.section);
//        }
//        if (user instanceof RegularUser u) {
//            System.out.println("RegularUser: " + u.name + ", messages: " + u.messagesCount);
//        }
//    }
//
//    public static void main(String[] args) {
//        printUserInfo(new Admin("Alice", 5));
//        printUserInfo(new Moderator("Bob", "Tech"));
//        printUserInfo(new RegularUser("Charlie", 42));
//    }
//}