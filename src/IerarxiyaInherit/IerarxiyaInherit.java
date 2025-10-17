package IerarxiyaInherit;

public class IerarxiyaInherit {
    public static void main(String[] args) {

    /*
Задача 1. Тема: Иерархия наследования и преобразование типов

Создай базовый класс `Employee` с полем:
- `String name`
и методом:
- `void work()` — выводит "Сотрудник работает"

Создай подклассы:
1. `Manager` — переопределяет метод `work()`, выводит "Менеджер руководит командой"
   и добавляет метод `holdMeeting()`, который выводит "Проводит совещание".
2. `Developer` — переопределяет метод `work()`, выводит "Разработчик пишет код"
   и добавляет метод `writeCode()`, который выводит "Пишет Java-код".
3. `Tester` — переопределяет метод `work()`, выводит "Тестировщик проверяет продукт"
   и добавляет метод `testSoftware()`, который выводит "Тестирует приложение".

В методе `main`:
1. Создай массив `Employee[] employees`, содержащий по одному объекту каждого типа.
2. Пройди по массиву и вызови метод `work()` для каждого элемента.
3. Затем с помощью оператора `instanceof` выполни нисходящее преобразование (downcasting)
   и вызови уникальные методы (`holdMeeting`, `writeCode`, `testSoftware`) для соответствующих типов.
*/

//    class Employee {
//        protected String name;
//
//        public Employee(String name) {
//            this.name = name;
//        }
//
//        void work() {
//            System.out.println("Сотрудник работает");
//        }
//    }
//
//    class Manager extends Employee {
//        public Manager(String name) {
//            super(name);
//        }
//
//        @Override
//        void work() {
//            System.out.println("Менеджер руководит командой");
//        }
//
//        void holdMeeting() {
//            System.out.println("Проводит совещание");
//        }
//    }
//
//    class Developer extends Employee {
//        public Developer(String name) {
//            super(name);
//        }
//
//        @Override
//        void work() {
//            System.out.println("Разработчик пишет код");
//        }
//
//        void writeCode() {
//            System.out.println("Пишет Java-код");
//        }
//    }
//
//    class Tester extends Employee {
//        public Tester(String name) {
//            super(name);
//        }
//
//        @Override
//        void work() {
//            System.out.println("Тестировщик проверяет продукт");
//        }
//
//        void testSoftware() {
//            System.out.println("Тестирует приложение");
//        }
//    }
//
//            Employee[] employees = {
//                    new Manager("Андрей"),
//                    new Developer("Мария"),
//                    new Tester("Игорь")
//            };
//
//            for (Employee e : employees) {
//                e.work();
//
//                if (e instanceof Manager m) {
//                    m.holdMeeting();
//                } else if (e instanceof Developer d) {
//                    d.writeCode();
//                } else if (e instanceof Tester t) {
//                    t.testSoftware();
//                }
//
//                System.out.println();
//            }

        /*
Задача 2. Тема: Иерархия наследования и преобразование типов

Создай класс `Person`, который содержит:
- поле `String name`
- конструктор для инициализации имени
- метод `void introduce()` — выводит "Я человек, меня зовут <имя>"

Создай подкласс `Student`, который содержит:
- поле `String university`
- конструктор для инициализации имени и университета
- переопределяет метод `introduce()` — выводит "Я студент, меня зовут <имя>, я учусь в <университет>"
- метод `study()` — выводит "Я изучаю Java"

Создай подкласс `Teacher`, который содержит:
- поле `String subject`
- конструктор для инициализации имени и предмета
- переопределяет метод `introduce()` — выводит "Я преподаватель, меня зовут <имя>, я преподаю <предмет>"
- метод `teach()` — выводит "Объясняю новую тему"

В методе `main`:
1. Создай массив `Person[] people`, содержащий объекты `Person`, `Student` и `Teacher`.
2. Пройди по массиву и вызови метод `introduce()` для каждого.
3. С помощью `instanceof` сделай нисходящее преобразование и вызови уникальные методы (`study()` или `teach()`).
*/

//        class Person {
//            protected String name;
//
//            public Person(String name) {
//                this.name = name;
//            }
//
//            void introduce() {
//                System.out.println("Я человек, меня зовут " + name);
//            }
//        }
//
//        class Student extends Person {
//            private String university;
//
//            public Student(String name, String university) {
//                super(name);
//                this.university = university;
//            }
//
//            @Override
//            void introduce() {
//                System.out.println("Я студент, меня зовут " + name + ", я учусь в " + university);
//            }
//
//            void study() {
//                System.out.println("Я изучаю Java");
//            }
//        }
//
//        class Teacher extends Person {
//            private String subject;
//
//            public Teacher(String name, String subject) {
//                super(name);
//                this.subject = subject;
//            }
//
//            @Override
//            void introduce() {
//                System.out.println("Я преподаватель, меня зовут " + name + ", я преподаю " + subject);
//            }
//
//            void teach() {
//                System.out.println("Объясняю новую тему");
//            }
//        }
//
//
//                Person[] people = {
//                        new Person("Алексей"),
//                        new Student("Ирина", "БГУ"),
//                        new Teacher("Сергей", "Информатика")
//                };
//
//                for (Person p : people) {
//                    p.introduce();
//
//                    if (p instanceof Student s) {
//                        s.study();
//                    } else if (p instanceof Teacher t) {
//                        t.teach();
//                    }
//
//                    System.out.println();
//                }

        // Задача: Иерархия наследования и преобразование типов
// Создайте классы Animal (животное) и Dog (собака), где Dog наследует Animal.
// В классе Animal создайте метод makeSound(), который выводит "Some sound".
// В классе Dog переопределите метод makeSound(), чтобы он выводил "Bark".
// В main создайте объект Animal, присвойте ему ссылку на объект Dog и вызовите makeSound().
// Затем выполните приведение типов и вызовите метод Dog-specific (например, fetch()).

//        class Animal {
//            void makeSound() {
//                System.out.println("Some sound");
//            }
//        }
//
//        class Dog extends Animal {
//            @Override
//            void makeSound() {
//                System.out.println("Bark");
//            }
//
//            void fetch() {
//                System.out.println("Dog is fetching the ball!");
//            }
//        }
//
//                Animal myAnimal = new Dog();
//                myAnimal.makeSound();
//
//
//                if (myAnimal instanceof Dog) {
//                    Dog myDog = (Dog) myAnimal;
//                    myDog.fetch();
//                }
            }
        }



