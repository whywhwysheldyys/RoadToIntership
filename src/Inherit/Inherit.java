package Inherit;

public class Inherit {
    public static void main(String[] args) {
        /*
Задача:
Создать базовый класс Animal с методом makeSound().
Создать подкласс Dog, который переопределяет makeSound().
*/

//        class Animal {
//            public void makeSound() {
//                System.out.println("Животное издает звук");
//            }
//        }
//
//        class Dog extends Animal {
//            @Override
//            public void makeSound() {
//                System.out.println("Собака лает: Гав-гав!");
//            }
//
//            public static void main(String[] args) {
//                Dog d = new Dog();
//                d.makeSound();
//            }
//        }


        /*
Задача:
Создать класс Vehicle с полем speed и методом move().
Создать класс Car, наследующий Vehicle, с дополнительным полем brand.
*/
//
//        class Vehicle {
//            protected int speed;
//
//            public void move() {
//                System.out.println("Транспорт движется со скоростью " + speed + " км/ч");
//            }
//        }
//
//        class Car extends Vehicle {
//            private String brand;
//
//            public Car(String brand, int speed) {
//                this.brand = brand;
//                this.speed = speed;
//            }
//
//            public void showInfo() {
//                System.out.println("Марка: " + brand + ", скорость: " + speed);
//            }
//
//            public static void main(String[] args) {
//                Car c = new Car("BMW", 120);
//                c.showInfo();
//                c.move();
//            }
//        }


        /*
Задача:
Создать класс Employee с полями name и salary.
Создать подкласс Manager с дополнительным полем bonus.
Переопределить метод для расчёта итогового дохода.
*/

//        class Employee {
//            protected String name;
//            protected double salary;
//
//            public Employee(String name, double salary) {
//                this.name = name;
//                this.salary = salary;
//            }
//
//            public double getIncome() {
//                return salary;
//            }
//        }
//
//        class Manager extends Employee {
//            private double bonus;
//
//            public Manager(String name, double salary, double bonus) {
//                super(name, salary);
//                this.bonus = bonus;
//            }
//
//            @Override
//            public double getIncome() {
//                return salary + bonus;
//            }
//
//            public static void main(String[] args) {
//                Manager m = new Manager("Анна", 50000, 10000);
//                System.out.println("Доход менеджера: " + m.getIncome());
//            }
//        }

    }
}
