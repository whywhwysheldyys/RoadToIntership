package Loops;

import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
//        🧩 Задача №1 — Сумма чисел от 1 до N
//
//        Условие:
//        Пользователь вводит число N.
//        Программа должна посчитать и вывести сумму всех чисел от 1 до N включительно.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите число");
//        int n = sc.nextInt();
//        System.out.println("Ваше число " + n);

//        🧩 Задача №2 — Таблица умножения для числа 5
//
//        Условие:
//        Выведи в консоль таблицу умножения для числа 5 от 1 до 10.

//        for(int i = 1; i <= 10; i++) {
//            System.out.println("5 x " + i + " = " + (5 * i));
//        }

//        🧩 Задача №3 — Факториал числа
//
//        Условие:
//        Пользователь вводит число n.
//        Программа должна вычислить факториал числа n (n! = 1 × 2 × 3 × ... × n) и вывести результат.
//          Scanner sc = new Scanner(System.in);
//          System.out.println("Введите число:");
//          int n = sc.nextInt();
//          long factorial = 1;
//          for(int i = 1; i <= 1; i++) {
//              factorial *= i;
//          }
//          System.out.println("Факториал числа " + n + " = " + factorial);
//          sc.close();

//        🧩 Задача №4 — Счётчик вниз
//
//        Условие:
//        С помощью цикла while выведи числа от 10 до 1 включительно.

//        int i = 10;
//        while(i >= 1) {
//            System.out.println(i);
//            i--;
//        }

//        🧩 Задача №5 — Сумма цифр числа
//
//        Условие:
//        Пользователь вводит целое число n.
//                Программа должна вычислить сумму всех цифр числа.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите число:");
//        int n = sc.nextInt();
//        int sum = 0;
//        while(n > 0) {
//            int digit = n % 10;
//            sum += digit;
//            n = n / 10;
//        }
//        System.out.println("Сумма цифр: " + sum);
//        sc.close();


//        🧩 Задача №6 — Количество цифр числа
//
//        Условие:
//        Пользователь вводит целое число n.
//                Программа должна посчитать количество цифр в этом числе.

//

//        🧩 Задача №7 — Ввод положительного числа
//
//        Условие:
//        Программа должна запрашивать у пользователя число до тех пор, пока он не введёт положительное число (> 0).

//        Scanner sc = new Scanner(System.in);
//        int n;
//        do {
//            System.out.println("Введите положительное число");
//            n = sc.nextInt();
//            if(n <= 0) {
//                System.out.println("Число должно быть положительным");
//            }
//        }while(n <= 0);
//        System.out.println("Вы ввели положительное число: " + n);
//        sc.close();

//        🧩 Задача №8 — Угадай число
//
//        Условие:
//        Программа "задумывает" число от 1 до 10 (можно просто выбрать его в коде, например, int secret = 7).
//        Пользователь вводит числа, пока не угадает задуманное.

//        Scanner sc = new Scanner(System.in);
//        int secret = 7;
//        int n;
//
//        System.out.println("Угадайте число от 1 до 10");
//
//        do {
//            System.out.println("Введите число ");
//            n = sc.nextInt();
//            if(n != secret) {
//                System.out.println("Неверно!Попробуйте еще раз");
//            }
//        }while (n != secret);
//            System.out.println("Вы угадали!");
//            sc.close();



   }
}
