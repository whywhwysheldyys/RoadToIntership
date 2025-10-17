package TypeErasure;

//    🔹 ТЕМА 1: Type Erasure
//🧩 Задача 1 — Сравнение классов generic-объектов
//
//    Создай класс Box<T> и проверь, будут ли Box<Integer> и Box<String> считаться одинаковыми классами во время выполнения.
//
//            Требования:
//
//    Создай два объекта: Box<Integer> и Box<String>.
//
//    Сравни их классы через getClass().
//
//    Выведи результат сравнения и объясни его в комментарии.
//
//    Пример шаблона:
//
//    public class ErasureTask1 {
//        public static void main(String[] args) {
//            // твой код здесь
//        }
//    }
//
//    class Box<T> {
//        // можно оставить пустым
//    }


//    public class TypeErasure {
//        public static void Erasure(String[] args) {
//            Box<Integer> integerBox = new Box<>();
//            Box<String> stringBox = new Box<>();
//
//            boolean classesAreEqual = integerBox.getClass() == stringBox.getClass();
//
//            System.out.println(classesAreEqual);
//        }
//    }
//
//    class Box<T> {
//    }

//🧩 Задача 2 — Универсальный метод печати списка
//
//Создай метод printList, который сможет принимать любой список (и List<String>, и List<Integer> и т.д.).
//
//Требования:
//
//Напиши метод printList(List<?> list).
//
//В main создай два списка — чисел и строк.
//
//Вызови метод для каждого.
//
//Проверь, что работает корректно.

//import java.util.List;
//import java.util.ArrayList;
//
//public class TypeErasure {
//    public static void printList(List<?> list) {
//        for (Object item : list) {
//            System.out.println(item);
//        }
//    }
//
//    public static void main(String[] args) {
//        List<String> stringList = new ArrayList<>();
//        stringList.add("Hello");
//        stringList.add("World");
//
//        List<Integer> intList = new ArrayList<>();
//        intList.add(1);
//        intList.add(2);
//        intList.add(3);
//
//        printList(stringList);
//        printList(intList);
//    }
//}


//🧩 Задача 3 — Демонстрация стирания типов
//
//Покажи, что тип T в generic-классе стирается до Object.
//
//Требования:
//
//Создай класс GenericBox<T> с полем T value.
//
//Добавь методы setValue() и getValue().
//
//Через Reflection (например getDeclaredFields()) выведи, какого типа реально поле value во время выполнения.
//
//Подсказка: должно показаться java.lang.Object.


//import java.lang.reflect.Field;
//
//public class TypeErasure {
//    public static void main(String[] args) {
//        GenericBox<Integer> box = new GenericBox<>();
//
//        Field[] fields = box.getClass().getDeclaredFields();
//        for (Field field : fields) {
//            System.out.println(field.getType());
//        }
//    }
//}
//
//class GenericBox<T> {
//    private T value;
//
//    public void setValue(T value) {
//        this.value = value;
//    }
//
//    public T getValue() {
//        return value;
//    }
//}