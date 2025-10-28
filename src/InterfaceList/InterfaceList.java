package InterfaceList;

import java.util.ArrayList;
import java.util.List;

//public class InterfaceList {
//    public static void main(String[] args) {

        // 🧩 Класс ArrayList и интерфейс List
        // Задача 1:
        // Создай List<Integer>, добавь числа от 1 до 10.
        // Удали элементы с нечётными индексами и выведи результат.

//        List<Integer> list1 = new ArrayList<>();
//        for (int i = 1; i <= 10; i++) {
//            list1.add(i);
//        }
//
//        for (int i = list1.size() - 1; i >= 0; i--) {
//            if (i % 2 != 0) {
//                list1.remove(i);
//            }
//        }
//        System.out.println("После удаления нечётных индексов: " + list1);

        // Задача 2:
        // Напиши метод, который принимает List<String> и возвращает новый список, где все строки длиннее 5 символов.

//        List<String> originalList = List.of("apple", "cat", "banana", "dog", "elephant");
//        List<String> filteredList = filterStringsByLength(originalList);
//        System.out.println("Строки длиннее 5 символов: " + filteredList);

        // Задача 3:
        // Создай List<String> и продемонстрируй использование методов add(), get(), set(), remove(), subList().

//        List<String> list3 = new ArrayList<>();
//
//        // add()
//        list3.add("первый");
//        list3.add("второй");
//        list3.add("третий");
//        list3.add(1, "новый второй");
//
//        // get()
//        System.out.println("Элемент по индексу 2: " + list3.get(2));
//
//        // set()
//        list3.set(0, "измененный первый");
//
//        // remove()
//        list3.remove("третий");
//
//        // subList()
//        List<String> subList = list3.subList(0, 2);
//
//        System.out.println("Итоговый список: " + list3);
//        System.out.println("Подсписок: " + subList);
//    }
//
//    public static List<String> filterStringsByLength(List<String> inputList) {
//        List<String> result = new ArrayList<>();
//        for (String str : inputList) {
//            if (str.length() > 5) {
//                result.add(str);
//            }
//        }
//        return result;
//    }
//}
