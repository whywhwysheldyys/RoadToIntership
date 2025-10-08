package StaticComponents;


//✅ Задача 1 — Статическое поле
//
//Условие:
//Создай класс Person со статическим полем retirementAge = 65 и обычным полем age.
//Добавь метод checkAge(), который выводит:
//
//        "Уже на пенсии", если age >= retirementAge
//
//"До пенсии осталось X лет", если нет.
public class StaticComponents {
    public static void main(String[] args) {
//        Person tom = new Person(41); //первая задача
//        Person bob = new Person(70);
//
//        tom.checkAge();
//        bob.checkAge();

//        ✅ Задача 2 — Статический инициализатор
//
//        Условие:
//        Добавь в класс Person статический инициализатор, который выводит "Static block выполнен"
//        и устанавливает retirementAge = 67.

//        Person tom = new Person(45); //вторая задача
//        Person bob = new Person(70);
//
//        tom.checkAge();
//        bob.checkAge();

//        ✅ Задача 3 — Статический метод
//
//        Условие:
//        Создай класс MathOperation, в котором будут 3 статических метода:
//
//        sum(int a, int b)
//
//        subtract(int a, int b)
//
//        multiply(int a, int b)
//
//        В main() выведи результаты.

//        System.out.println(MathOperation.sum(10, 5)); //третья задача
//        System.out.println(MathOperation.subtract(10, 5));
//        System.out.println(MathOperation.multiply(10, 5));
    }
}


//class MathOperation { //третья задача
//    static int sum(int a, int b) {
//        return a + b;
//    }
//
//    static int subtract(int a, int b) {
//        return a - b;
//    }
//
//    static int multiply(int a, int b) {
//        return a * b;
//    }
//}
//class Person { //вторая задача
//    int age;
//    static int retirementAge;
//
//    static {
//        retirementAge = 67;
//        System.out.println("Static block выполнен");
//    }
//
//    Person(int age) {
//        this.age = age;
//    }
//
//    void checkAge() {
//        if (age >= retirementAge)
//            System.out.println("Уже на пенсии");
//        else
//            System.out.printf("До пенсии осталось %d лет\n", retirementAge - age);
//    }
//}
//class Person{ //первая задача
//    int age;
//    static int retrimentAge = 65;
//
//    Person(int age) {
//        this.age = age;
//    }
//
//    void checkAge() {
//        if(age >= retrimentAge)
//            System.out.println("Уже на пенсии");
//        else
//            System.out.println("До пенсии осталось %d лет \n ", retrimentAge - age);
//    }
