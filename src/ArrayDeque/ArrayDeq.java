import java.util.*;

// ⚡ Задача 1. Очередь (FIFO) с ArrayDeque
//public class ArrayDeq {
//    public static void main(String[] args) {
//        // Задача 1
//        ArrayDeque<String> clientQueue = new ArrayDeque<>();
//        clientQueue.offer("Alex");
//        clientQueue.offer("Kate");
//        clientQueue.offer("John");
//        clientQueue.offer("Max");
//
//        System.out.println("Очередь клиентов:");
//        while (!clientQueue.isEmpty()) {
//            String client = clientQueue.poll();
//            System.out.println("Обслужен: " + client + ", Осталось: " + clientQueue);
//        }

        // ⚡ Задача 2. Стек (LIFO) с ArrayDeque
//        ArrayDeque<Integer> stack = new ArrayDeque<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//
//        System.out.println("\nСтек (LIFO):");
//        while (!stack.isEmpty()) {
//            System.out.println("Снято: " + stack.pop());
//        }

        // ⚡ Задача 3. Очередь с приоритетом заказов (PriorityQueue)
//        PriorityQueue<Task> taskQueue = new PriorityQueue<>();
//        taskQueue.offer(new Task("Низкий приоритет", 3));
//        taskQueue.offer(new Task("Высокий приоритет", 1));
//        taskQueue.offer(new Task("Средний приоритет", 2));
//        taskQueue.offer(new Task("Срочный заказ", 0));
//
//        System.out.println("\nОчередь задач по приоритету:");
//        while (!taskQueue.isEmpty()) {
//            System.out.println(taskQueue.poll());
//        }
//    }
//}
//
//class Task implements Comparable<Task> {
//    String name;
//    int priority;
//
//    public Task(String name, int priority) {
//        this.name = name;
//        this.priority = priority;
//    }
//
//    @Override
//    public int compareTo(Task other) {
//        return this.priority - other.priority;
//    }
//
//    @Override
//    public String toString() {
//        return name + " (приоритет: " + priority + ")";
//    }
//}