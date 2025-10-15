package InterfaceAndPolymorphism;


//🔹 Задача 1 — Простая
//
//Создай интерфейс Shape с методом
//
//double getArea();
//
//
//Реализуй его в двух классах: Circle и Rectangle.
//
//Circle хранит поле radius
//
//Rectangle — width и height
//        Создай Main, в котором:
//
//Создаёшь массив Shape[] shapes из нескольких фигур;
//
//Выводишь площадь каждой фигуры.


//    interface Shape {
//        double getArea();
//    }
//
//
//    class Circle implements Shape {
//        private double radius;
//
//        public Circle(double radius) {
//            this.radius = radius;
//        }
//
//        @Override
//        public double getArea() {
//            return Math.PI * radius * radius;
//        }
//    }
//
//
//    class Rectangle implements Shape {
//        private double width;
//        private double height;
//
//        public Rectangle(double width, double height) {
//            this.width = width;
//            this.height = height;
//        }
//
//        @Override
//        public double getArea() {
//            return width * height;
//        }
//    }
//
//
//    public class InterfaceAndPolymorphism {
//        public static void main(String[] args) {
//            // Создаем массив разных фигур
//            Shape[] shapes = {
//                    new Circle(5.0),
//                    new Rectangle(3.0, 4.0),
//                    new Circle(2.5),
//                    new Rectangle(6.0, 1.5)
//            };
//
//
//            for (Shape shape : shapes) {
//                System.out.printf("Площадь фигуры: %.2f\n", shape.getArea());
//            }
//        }
//    }

//🔹 Задача 2 — Средняя
//
//Добавь к интерфейсу Shape новый метод
//
//double getPerimeter();
//
//
//и реализуй его в существующих классах.
//Создай метод printShapeInfo(Shape shape), который выводит:
//
//Тип фигуры: ...
//Площадь: ...
//Периметр: ...
//
//
//и используй полиморфизм, чтобы вызывать его для каждой фигуры без проверки типа (instanceof не использовать!).

//interface Shape {
//    double getArea();
//    double getPerimeter();
//}
//
//class Circle implements Shape {
//    private double radius;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    @Override
//    public double getArea() {
//        return Math.PI * radius * radius;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 2 * Math.PI * radius;
//    }
//}
//
//class Rectangle implements Shape {
//    private double width;
//    private double height;
//
//    public Rectangle(double width, double height) {
//        this.width = width;
//        this.height = height;
//    }
//
//    @Override
//    public double getArea() {
//        return width * height;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 2 * (width + height);
//    }
//}
//
//public class InterfaceAndPolymorphism{
//    public static void printShapeInfo(Shape shape) {
//        System.out.println("Тип фигуры: " + shape.getClass().getSimpleName());
//        System.out.printf("Площадь: %.2f\n", shape.getArea());
//        System.out.printf("Периметр: %.2f\n", shape.getPerimeter());
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        Shape[] shapes = {
//                new Circle(5.0),
//                new Rectangle(3.0, 4.0),
//                new Circle(2.5),
//                new Rectangle(6.0, 1.5)
//        };
//
//        for (Shape shape : shapes) {
//            printShapeInfo(shape);
//        }
//    }
//}


//🔹 Задача 3 — Сложная
//
//Добавь новый интерфейс
//
//interface Colored {
//    String getColor();
//}
//
//
//Реализуй его в Circle и Rectangle.
//Теперь создай класс ShapePrinter, который имеет метод:
//
//public static void printDetailedInfo(Shape shape)
//
//
//Он должен:
//
//Вывести тип фигуры, площадь и периметр (используя интерфейс Shape);
//
//Если фигура также реализует Colored, вывести её цвет;
//
//Работать корректно без использования instanceof — через интерфейсы и полиморфизм.
//interface Shape {
//    double getArea();
//    double getPerimeter();
//}
//
//class Circle implements Shape {
//    private double radius;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    @Override
//    public double getArea() {
//        return Math.PI * radius * radius;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 2 * Math.PI * radius;
//    }
//}
//
//class Rectangle implements Shape {
//    private double width;
//    private double height;
//
//    public Rectangle(double width, double height) {
//        this.width = width;
//        this.height = height;
//    }
//
//    @Override
//    public double getArea() {
//        return width * height;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 2 * (width + height);
//    }
//}
//
//public class InterfaceAndPolymorphism {
//    public static void printShapeInfo(Shape shape) {
//        System.out.println("Тип фигуры: " + shape.getClass().getSimpleName());
//        System.out.printf("Площадь: %.2f\n", shape.getArea());
//        System.out.printf("Периметр: %.2f\n", shape.getPerimeter());
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        Shape[] shapes = {
//                new Circle(5.0),
//                new Rectangle(3.0, 4.0),
//                new Circle(2.5),
//                new Rectangle(6.0, 1.5)
//        };
//
//        for (Shape shape : shapes) {
//            printShapeInfo(shape);
//        }
//    }
//}
