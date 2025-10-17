package Incapsulation;

public class Incapsulation {
    public static void main(String[] args) {
        /*
Задача:
Создать класс BankAccount с приватным полем balance.
Добавить методы deposit(double amount) и withdraw(double amount),
а также getBalance(). При попытке снять больше, чем есть — выводить предупреждение.
*/

//        class BankAccount {
//            private double balance;
//
//            public void deposit(double amount) {
//                if (amount > 0) {
//                    balance += amount;
//                }
//            }
//
//            public void withdraw(double amount) {
//                if (amount > balance) {
//                    System.out.println("Недостаточно средств!");
//                } else {
//                    balance -= amount;
//                }
//            }
//
//            public double getBalance() {
//                return balance;
//            }
//
//            public static void main(String[] args) {
//                BankAccount acc = new BankAccount();
//                acc.deposit(1000);
//                acc.withdraw(300);
//                System.out.println("Баланс: " + acc.getBalance());

        /*
Задача:
Создать класс Person с приватными полями name и age.
Добавить сеттер для age, который не позволяет устанавливать возраст < 0 или > 120.
*/

//        class Person {
//            private String name;
//            private int age;
//
//            public Person(String name, int age) {
//                this.name = name;
//                setAge(age);
//            }
//
//            public void setAge(int age) {
//                if (age < 0 || age > 120) {
//                    System.out.println("Некорректный возраст!");
//                } else {
//                    this.age = age;
//                }
//            }
//
//            public int getAge() {
//                return age;
//            }
//
//            public String getName() {
//                return name;
//            }
//
//            public static void main(String[] args) {
//                Person p = new Person("Иван", 25);
//                p.setAge(130);
//                System.out.println(p.getName() + ": " + p.getAge());

        /*
Задача:
Создать класс Temperature, который хранит температуру в градусах Цельсия.
Добавить методы для установки и получения значения,
а также метод для перевода в Фаренгейты.
*/

//        class Temperature {
//            private double celsius;
//
//            public Temperature(double celsius) {
//                this.celsius = celsius;
//            }
//
//            public double getCelsius() {
//                return celsius;
//            }
//
//            public void setCelsius(double celsius) {
//                this.celsius = celsius;
//            }
//
//            public double toFahrenheit() {
//                return celsius * 9 / 5 + 32;
//            }
//
//            public static void main(String[] args) {
//                Temperature t = new Temperature(25);
//                System.out.println("Цельсий: " + t.getCelsius());
//                System.out.println("Фаренгейт: " + t.toFahrenheit());
            }
        }



