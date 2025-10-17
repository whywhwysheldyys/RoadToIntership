package AbstractClasses;

public class AbstractClasses {
    public static void main(String[] args) {
    /*
Задача 1. Тема: Абстрактные классы

Создай абстрактный класс `Shape`, который содержит:
- абстрактный метод `double getArea()`
- абстрактный метод `double getPerimeter()`
- поле `String name` и конструктор для его инициализации
- метод `void printInfo()`, который выводит название фигуры

Затем создай два подкласса:
1. `Circle` — с полем `radius`, реализующий методы для вычисления площади и периметра.
2. `Rectangle` — с полями `width` и `height`, реализующий методы для вычисления площади и периметра.

В методе `main`:
- создай по одному объекту каждого типа
- выведи их площадь, периметр и название фигуры.
*/

//    abstract class Shape {
//        protected String name;
//
//        public Shape(String name) {
//            this.name = name;
//        }
//
//        abstract double getArea();
//        abstract double getPerimeter();
//
//        public void printInfo() {
//            System.out.println("Фигура: " + name);
//        }
//    }
//
//    class Circle extends Shape {
//        private double radius;
//
//        public Circle(double radius) {
//            super("Круг");
//            this.radius = radius;
//        }
//
//        @Override
//        double getArea() {
//            return Math.PI * radius * radius;
//        }
//
//        @Override
//        double getPerimeter() {
//            return 2 * Math.PI * radius;
//        }
//    }
//
//    class Rectangle extends Shape {
//        private double width;
//        private double height;
//
//        public Rectangle(double width, double height) {
//            super("Прямоугольник");
//            this.width = width;
//            this.height = height;
//        }
//
//        @Override
//        double getArea() {
//            return width * height;
//        }
//
//        @Override
//        double getPerimeter() {
//            return 2 * (width + height);
//        }
//    }
//
//
//            Shape circle = new Circle(5);
//            Shape rectangle = new Rectangle(4, 6);
//
//            circle.printInfo();
//            System.out.println("Площадь: " + circle.getArea());
//            System.out.println("Периметр: " + circle.getPerimeter());
//
//            System.out.println();
//
//            rectangle.printInfo();
//            System.out.println("Площадь: " + rectangle.getArea());
//            System.out.println("Периметр: " + rectangle.getPerimeter());

        /*
Задача 2. Тема: Абстрактные классы

Создай абстрактный класс `Animal`, который содержит:
- поле `String name`
- конструктор для инициализации имени
- абстрактные методы:
    - `void makeSound()`
    - `void move()`
- метод `void info()`, который выводит имя животного.

Создай два класса-наследника:
1. `Dog` — реализует методы `makeSound()` (выводит "Гав-гав!") и `move()` (выводит "Бежит по полю").
2. `Fish` — реализует методы `makeSound()` (выводит "Пузырь-пузырь") и `move()` (выводит "Плавает в воде").

Создай еще один класс `Bird`, который также наследуется от `Animal`, но делает метод `makeSound()` абстрактным (т.е. сам становится абстрактным классом).

От `Bird` унаследуй класс `Eagle`, который реализует `makeSound()` (выводит "Крик орла") и `move()` (выводит "Парит в небе").

В методе `main` создай объекты `Dog`, `Fish` и `Eagle`, вызови у каждого методы `info()`, `makeSound()` и `move()`.
*/

//        abstract class Animal {
//            protected String name;
//
//            public Animal(String name) {
//                this.name = name;
//            }
//
//            abstract void makeSound();
//            abstract void move();
//
//            public void info() {
//                System.out.println("Животное: " + name);
//            }
//        }
//
//        class Dog extends Animal {
//            public Dog(String name) {
//                super(name);
//            }
//
//            @Override
//            void makeSound() {
//                System.out.println("Гав-гав!");
//            }
//
//            @Override
//            void move() {
//                System.out.println("Бежит по полю");
//            }
//        }
//
//        class Fish extends Animal {
//            public Fish(String name) {
//                super(name);
//            }
//
//            @Override
//            void makeSound() {
//                System.out.println("Пузырь-пузырь");
//            }
//
//            @Override
//            void move() {
//                System.out.println("Плавает в воде");
//            }
//        }
//
//        abstract class Bird extends Animal {
//            public Bird(String name) {
//                super(name);
//            }
//        }
//
//        class Eagle extends Bird {
//            public Eagle(String name) {
//                super(name);
//            }
//
//            @Override
//            void makeSound() {
//                System.out.println("Крик орла");
//            }
//
//            @Override
//            void move() {
//                System.out.println("Парит в небе");
//            }
//        }
//
//
//                Animal dog = new Dog("Бобик");
//                Animal fish = new Fish("Золотая рыбка");
//                Animal eagle = new Eagle("Орел");
//
//                dog.info();
//                dog.makeSound();
//                dog.move();
//
//                System.out.println();
//
//                fish.info();
//                fish.makeSound();
//                fish.move();
//
//                System.out.println();
//
//                eagle.info();
//                eagle.makeSound();
//                eagle.move();

        /*
Задача 3. Тема: Абстрактные классы

Создай абстрактный класс `Transport`, который содержит:
- поле `String type`
- конструктор для инициализации поля
- абстрактные методы:
    - `void start()` — запуск транспорта
    - `void stop()` — остановка транспорта
    - `double getSpeed()` — возвращает текущую скорость
- метод `void info()` — выводит тип транспорта.

Создай три класса-наследника:
1. `Car` — имеет поле `double speed`, реализует методы:
   - `start()` → выводит "Машина заводится"
   - `stop()` → выводит "Машина останавливается"
   - `getSpeed()` → возвращает `speed`
2. `Bike` — аналогично, но:
   - `start()` → "Велосипед начинает движение"
   - `stop()` → "Велосипед тормозит"
3. `Train` — аналогично, но:
   - `start()` → "Поезд отправляется"
   - `stop()` → "Поезд прибыл на станцию"

В методе `main`:
- создай массив типа `Transport[]` из трёх объектов (`Car`, `Bike`, `Train`)
- для каждого вызови `info()`, `start()`, `stop()` и выведи его скорость.
*/

        abstract class Transport {
            protected String type;

            public Transport(String type) {
                this.type = type;
            }

            abstract void start();
            abstract void stop();
            abstract double getSpeed();

            public void info() {
                System.out.println("Тип транспорта: " + type);
            }
        }

        class Car extends Transport {
            private double speed;

            public Car(double speed) {
                super("Машина");
                this.speed = speed;
            }

            @Override
            void start() {
                System.out.println("Машина заводится");
            }

            @Override
            void stop() {
                System.out.println("Машина останавливается");
            }

            @Override
            double getSpeed() {
                return speed;
            }
        }

        class Bike extends Transport {
            private double speed;

            public Bike(double speed) {
                super("Велосипед");
                this.speed = speed;
            }

            @Override
            void start() {
                System.out.println("Велосипед начинает движение");
            }

            @Override
            void stop() {
                System.out.println("Велосипед тормозит");
            }

            @Override
            double getSpeed() {
                return speed;
            }
        }

        class Train extends Transport {
            private double speed;

            public Train(double speed) {
                super("Поезд");
                this.speed = speed;
            }

            @Override
            void start() {
                System.out.println("Поезд отправляется");
            }

            @Override
            void stop() {
                System.out.println("Поезд прибыл на станцию");
            }

            @Override
            double getSpeed() {
                return speed;
            }
        }

                Transport[] transports = {
                        new Car(120),
                        new Bike(25),
                        new Train(90)
                };

                for (Transport t : transports) {
                    t.info();
                    t.start();
                    System.out.println("Скорость: " + t.getSpeed() + " км/ч");
                    t.stop();
                    System.out.println();
                }
            }
        }
