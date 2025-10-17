package ParametrsOfMethods;
//🧩 Задача 1. Метод с одним параметром
//
//Условие:
//Создай класс Person с методом say, который принимает строку message и выводит её в консоль.
public class ParametrsOfMethods {
    public static void main(String[] args) {
//            Person tom = new Person(); //первая задача
//            tom.say("Hello world");
//            tom.say("Java-сила!");

//        🧩 Задача 2. Метод с двумя параметрами
//
//        Условие:
//        Создай класс Calculator с методом sum, который принимает два числа и выводит их сумму.
        Calculator calc = new Calculator(); //вторая задача
        calc.sum(3, 7);
        calc.sum(10, 25);
        calc.sum(10,25);

//        🧩 Задача 3. Параметры переменной длины
//
//        Условие:
//        Создай метод sum, который принимает любое количество чисел и выводит их сумму.
//        Если чисел нет — выводи 0.

//        Calculator calc = new Calculator(); третья задача
//        calc.sum(1, 2, 3);
//        calc.sum(5, 5, 5, 5);
//        calc.sum();
    }
}

//class Calculator { //третья задача
//    void sum(int ...nums) {
//        int result = 0;
//        for(int n : nums)
//            result += n;
//        System.out.println(result);
//    }
//}

class Calculator {  //вторая задача
    void sum(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }
}

//class Person{ //первая задача
//    void say(String message) {
//        System.out.println(message);
//    }
//}