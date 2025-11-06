//import java.util.*;
//
//public class NavigableMap {
//    public static void main(String[] args) {
//
//        // 1. Поиск ближайшего ключа
//        NavigableMap<Integer, String> map = new TreeMap<>();
//        map.put(2, "A");
//        map.put(5, "B");
//        map.put(8, "C");
//        map.put(12, "D");
//
//        int x = 7;
//
//        Integer lower = map.floorKey(x);
//        Integer higher = map.ceilingKey(x);
//
//        System.out.println("lower = " + lower);
//        System.out.println("higher = " + higher);
//
//
//        // 2. Диапазон в обратном порядке
//        NavigableMap<Integer, String> orders = new TreeMap<>();
//        orders.put(10, "Order A");
//        orders.put(20, "Order B");
//        orders.put(30, "Order C");
//        orders.put(40, "Order D");
//
//        int start = 30;
//
//        NavigableMap<Integer, String> desc = orders.descendingMap();
//
//        for (var e : desc.entrySet()) {
//            if (e.getKey() <= start) {
//                System.out.println(e.getKey() + "=" + e.getValue());
//            }
//        }
//
//
//            // 3. Удаление элементов из диапазона (low, high]
//            NavigableMap<Integer, Double> transactions = new TreeMap<>();
//            transactions.put(1, 10.5);
//            transactions.put(3, 20.0);
//            transactions.put(5, 30.0);
//            transactions.put(7, 40.0);
//            transactions.put(9, 50.0);
//
//            int low = 3;
//            int high = 7;
//
//            NavigableMap<Integer, Double> toRemove =
//                    transactions.subMap(low, false, high, true);
//
//            Set<Integer> keys = new HashSet<>(toRemove.keySet());
//            for (Integer k : keys) {
//                transactions.remove(k);
//            }
//
//            System.out.println(transactions);
//        }
//    }
