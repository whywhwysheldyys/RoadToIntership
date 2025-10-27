package Assert;

// 🔹 Тема 3: assert
// Задание 1:
// Создай метод getSquareRoot(double number), который возвращает квадратный корень числа.
// Перед вычислением добавь assert number >= 0 : "Число не может быть отрицательным!";

//public class Assert{
//    public static double getSquareRoot(double number) {
//        assert number >= 0 : "Число не может быть отрицательным!";
//        return Math.sqrt(number);
//    }

// Задание 2:
// Создай массив из 5 элементов и добавь assert index >= 0 && index < array.length : "Индекс вне диапазона!";
// Затем выведи элемент с этим индексом.

//    public static void accessArrayElement(int index) {
//        int[] array = {10, 20, 30, 40, 50};
//        assert index >= 0 && index < array.length : "Индекс вне диапазона!";
//        System.out.println("Элемент с индексом " + index + ": " + array[index]);
//    }

// Задание 3:
// В методе calculateDiscount(double price, double discount) добавь assert discount >= 0 && discount <= 100 : "Некорректная скидка!";
// Метод должен возвращать цену со скидкой.
// Проверь несколько случаев, включая неправильные значения скидки.
//
//    public static double calculateDiscount(double price, double discount) {
//        assert discount >= 0 && discount <= 100 : "Некорректная скидка!";
//        return price * (1 - discount / 100);
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Корень из 16: " + getSquareRoot(16));
//        accessArrayElement(2);
//        System.out.println("Цена со скидкой 20%: " + calculateDiscount(1000, 20));
//    }
//}
