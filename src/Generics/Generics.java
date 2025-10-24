package Generics;


//    🔹 Задача 1 — Простая
//
//    Создай обобщённый класс Box<T>, который хранит один объект любого типа.
//    Требования:
//
//    Конструктор принимает значение T value.
//
//            Методы:
//
//    public T getValue();
//    public void setValue(T value);
//
//
//    В main() создай:
//
//    Box<Integer> с числом 10
//
//    Box<String> со строкой "Hello"
//
//    Выведи содержимое обоих объектов.
//
//    Пример вывода:
//
//    Integer Box содержит: 10
//    String Box содержит: Hello

//    public class Generics {
//
//        static class Box<T> {
//            private T value;
//
//            public Box(T value) {
//                this.value = value;
//            }
//
//            public T getValue() {
//                return value;
//            }
//
//            public void setValue(T value) {
//                this.value = value;
//            }
//        }
//
//        public static void main(String[] args) {
//
//            Box<Integer> integerBox = new Box<>(10);
//
//            Box<String> stringBox = new Box<>("Hello");
//
//            System.out.println("Integer Box содержит: " + integerBox.getValue());
//            System.out.println("String Box содержит: " + stringBox.getValue());
//        }
//    }


//    🔹 Задача 2 — Средняя
//
//    Создай обобщённый метод countGreaterThan():
//
//    public static <T extends Comparable<T>> int countGreaterThan(T[] array, T element)
//
//
//    Метод должен возвращать количество элементов массива, которые строго больше переданного element.
//
//    Пример:
//
//    Integer[] nums = {1, 5, 7, 3, 9};
//System.out.println(countGreaterThan(nums, 4)); // 3
//
//
//    Требования:
//
//    Работает для любых типов, реализующих Comparable (например, Integer, String, Double).
//
//    Не использовать Stream API (только циклы).


//public class Generics {
//
//    public static <T extends Comparable<T>> int countGreaterThan(T[] array, T element) {
//        int count = 0;
//        for (T item : array) {
//            if (item.compareTo(element) > 0) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        Integer[] nums = {1, 5, 7, 3, 9};
//        System.out.println(countGreaterThan(nums, 4));
//    }
//}

//🔹 Задача 3 — Сложная
//
//Создай обобщённый класс хранилища Pair<K, V> (ключ + значение).
//Требования:
//
//Поля private K key; private V value;
//
//Конструктор Pair(K key, V value)
//
//Геттеры getKey(), getValue()
//
//Переопредели toString() так, чтобы результат выглядел как:
//
//Pair{key=1, value=One}
//
//
//В main() создай:
//
//Pair<Integer, String> pair1 = new Pair<>(1, "One");
//Pair<String, Double> pair2 = new Pair<>("Pi", 3.14);
//
//
//и выведи оба объекта.

//public class Generics {
//
//
//        static class Pair<K, V> {
//            private K key;
//            private V value;
//
//            public Pair(K key, V value) {
//                this.key = key;
//                this.value = value;
//            }
//
//            public K getKey() {
//                return key;
//            }
//
//            public V getValue() {
//                return value;
//            }
//
//            @Override
//            public String toString() {
//                return "Pair{key=" + key + ", value=" + value + "}";
//            }
//        }
//
//        public static void main (String[]args){
//            Pair<Integer, String> pair1 = new Pair<>(1, "One");
//            Pair<String, Double> pair2 = new Pair<>("Pi", 3.14);
//
//            System.out.println(pair1);
//            System.out.println(pair2);
//        }
//    }

