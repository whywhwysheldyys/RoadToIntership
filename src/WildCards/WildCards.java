package WildCards;


//🔹 ТЕМА 2: Wildcards (Подстановочные знаки)
//        🧩 Задача 1 — ? extends Number
//
//        Создай список чисел (List<Integer>) и передай его в переменную List<? extends Number>.
//
//        Требования:
//
//        Попробуй добавить элемент — посмотри, разрешает ли компилятор.
//
//        Попробуй прочитать элемент и вывести на экран.
//
//        Сделай вывод в комментарии: что можно, а что нельзя делать с ? extends.

//import java.util.List;
//import java.util.ArrayList;
//
//    public class WildCards {
//        public static void main(String[] args) {
//            List<Integer> intList = new ArrayList<>();
//            intList.add(1);
//            intList.add(2);
//
//            List<? extends Number> numbers = intList;
//
//            Number num = numbers.get(0);
//            System.out.println(num);
//
//            // numbers.add(3); // Эта строка не скомпилируется
//        }
//    }

//🧩 Задача 2 — ? super Integer
//
//Создай метод addToList, который принимает List<? super Integer> и добавляет туда числа.
//
//        Требования:
//
//Создай метод addToList(List<? super Integer> list).
//
//Добавь в список несколько чисел.
//
//Попробуй прочитать элемент из списка — объясни, почему нельзя напрямую присвоить Integer.
//
//Выведи элементы списка через цикл.


//import java.util.List;
//import java.util.ArrayList;
//
//public class WildCards {
//    public static void addToList(List<? super Integer> list) {
//        list.add(1);
//        list.add(2);
//        list.add(3);
//
//        Object element = list.get(0);
//        System.out.println(element);
//
//        for (Object item : list) {
//            System.out.println(item);
//        }
//    }
//
//    public static void main(String[] args) {
//        List<Number> numberList = new ArrayList<>();
//        addToList(numberList);
//
//        List<Object> objectList = new ArrayList<>();
//        addToList(objectList);
//    }
//}


//🧩 Задача 3 — Сумма списка чисел
//
//Напиши метод sumNumbers, который принимает список любых подтипов Number и возвращает сумму всех элементов.
//
//        Требования:
//
//Метод должен принимать параметр List<? extends Number>.
//
//Пройди циклом по элементам и посчитай сумму.
//
//В main протестируй с List<Integer> и List<Double>.

//import java.util.List;
//import java.util.ArrayList;
//
//public class WildCards {
//    public static double sumNumbers(List<? extends Number> numbers) {
//        double sum = 0.0;
//        for (Number number : numbers) {
//            sum += number.doubleValue();
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        List<Integer> intList = new ArrayList<>();
//        intList.add(1);
//        intList.add(2);
//        intList.add(3);
//
//        List<Double> doubleList = new ArrayList<>();
//        doubleList.add(1.5);
//        doubleList.add(2.5);
//        doubleList.add(3.5);
//
//        System.out.println(sumNumbers(intList));
//        System.out.println(sumNumbers(doubleList));
//    }
//}