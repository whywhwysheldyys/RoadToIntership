//// Условие: Создать класс, реализующий Iterable<Integer>, и вывести элементы массива.
//import java.util.*;
//import java.io.*;
//
//class MyArray implements Iterable<Integer> {
//    private int[] data;
//
//    public MyArray(int[] data) {
//        this.data = data;
//    }
//
//    @Override
//    public Iterator<Integer> iterator() {
//        return new Iterator<Integer>() {
//            int index = 0;
//            @Override
//            public boolean hasNext() {
//                return index < data.length;
//            }
//            @Override
//            public Integer next() {
//                return data[index++];
//            }
//        };
//    }
//}
//
//// Условие: Используя Iterator, удалить из списка строки длиннее 3 символов.
//class Task2 {
//    public static void run() {
//        List<String> list = new ArrayList<>(Arrays.asList("hi", "test", "ok", "yes", "long"));
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            if (it.next().length() > 3) it.remove();
//        }
//        System.out.println(list);
//    }
//}
//
//// Условие: Создать итератор, перебирающий чётные числа от 0 до N.
//class EvenIterator implements Iterator<Integer> {
//    private int current = 0;
//    private int max;
//
//    public EvenIterator(int max) {
//        this.max = max;
//    }
//
//    @Override
//    public boolean hasNext() {
//        return current <= max;
//    }
//
//    @Override
//    public Integer next() {
//        int val = current;
//        current += 2;
//        return val;
//    }
//}
//
//public class Iterator{
//    public static void main(String[] args) {
//
//        MyArray arr = new MyArray(new int[]{1,2,3,4,5});
//        for (int x : arr) System.out.println(x);
//
//        Task2.run();
//
//        Iterator<Integer> it = new EvenIterator(10);
//        while (it.hasNext()) System.out.println(it.next());
//    }
//}

