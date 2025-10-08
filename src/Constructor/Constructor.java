package Constructor;
//🧩 Задача 1. Конструктор без параметров
//
//Условие:
//Создай класс Person с конструктором без параметров, который выводит сообщение
//"Создание объекта Person" и задаёт name = "Tom", age = 41.
public class Constructor {
    public static void main(String[] args) {
//        Person tom = new Person(); //первая задача
//        tom.print();

//        🧩 Задача 2. Три конструктора с this
//
//        Условие:
//        Создай три конструктора:
//
//        Без параметров — задаёт "Неизвестно", 18
//
//        С одним параметром — задаёт имя, а возраст 18
//
//        С двумя параметрами — задаёт имя и возраст
//
//        Используй this для вызова конструкторов.
//        Person tom = new Person(); //вторая задача
//        Person bob = new Person("Bob");
//        Person sam = new Person("Sam", 25);
//
//        tom.print();
//        bob.print();
//        sam.print();

//        🧩 Задача 3. Инициализатор и порядок инициализации
//
//        Условие:
//        Добавь инициализатор, который задаёт name = "Неизвестно", age = 18.
//        Создай два конструктора: пустой и с параметрами.
//        Выведи результат, чтобы увидеть порядок инициализации.

//        Person undef = new Person(); //третья задача
//        undef.print();
//
//        Person tom = new Person("Tom", 22);
//        tom.print();
    }
}

//class Person { // третья задача
//    String name;
//    int age;
//    {
//        System.out.println("Инициализатор запущен");
//        name = "Неизвестно";
//        age = 18;
//    }
//
//    Person() {
//        System.out.println("Пустой конструктор");
//    }
//
//    Person(String name, int age) {
//        System.out.println("Конструктор с параметрами");
//        this.name = name;
//        this.age = age;
//    }
//
//    void print() {
//        System.out.printf("Имя: %s; Возраст: %d\n", name, age);
//    }


//class Person { // вторая задача
//    String name;
//    int age;
//
//    Person() {
//        this("Неизвестно" , 18);
//    }
//
//    Person(String name) {
//        this(name, 18);
//    }
//
//    Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    void print() {
//        System.out.printf("Имя: %s; Возраст: %d\n", name, age);
//    }
//}

//class Person { // первая задача
//    String name;
//    int age;
//
//    Person() {
//        System.out.println("Создание обьекта Person");
//        name = "Tom";
//        age = 41;
//    }
//    void print() {
//        System.out.printf("Name: %s; Age: %d\n", name, age);
//    }
//}