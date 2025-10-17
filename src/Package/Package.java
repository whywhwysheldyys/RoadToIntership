


//    Задача 1 (простая):
//            📘 Условие: Создай пакет mathutils и в нём класс Adder, который складывает два числа.

//public class Package {
//    public static int add(int a, int b) {
//        return a + b;
//    }
//}

//Задача 2 (средняя):
//        📘 Условие: Создай пакет app и класс Main, который импортирует класс Adder из пакета mathutils и выводит результат сложения.
//        package app;

//import mathutils.Adder;
//public class Main {
//    public static void main(String[] args) {
//        System.out.println(Adder.add(3, 7));
//    }
//}

//Задача 3 (сложная):
//        📘 Условие: Создай три пакета:

//mathutils — с классом Multiplier, умножающим два числа;

//printers — с классом Printer, выводящим результат;

//app — с классом Main, который связывает их.



//package mathutils;
//public class Multiplier {
//    public static int multiply(int a, int b) {
//        return a * b;
//    }
//}


//package printers;
//public class Printer {
//    public static void printResult(int result) {
//        System.out.println("Результат: " + result);
//    }
//}


//package app;
//import mathutils.Multiplier;
//import printers.Printer;
//public class Main {
//    public static void main(String[] args) {
//        int res = Multiplier.multiply(4, 5);
//        Printer.printResult(res);
//    }
//}




