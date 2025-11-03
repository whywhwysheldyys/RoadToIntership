package Comparable;



import java.util.*;

// 🧠 Задача 1. Сортировка студентов по возрасту
//class Student implements Comparable<Student>
//    String name;
//    int age;
//
//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public int compareTo(Student other) {
//        return this.age - other.age;
//    }
//
//    @Override
//    public String toString() {
//        return name + " (" + age + ")";
//    }
//}
//
//public class Comparable {
//    public static void main(String[] args) {
//        // Задача 1
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("Алексей", 20));
//        students.add(new Student("Мария", 19));
//        students.add(new Student("Иван", 22));
//        students.add(new Student("Ольга", 19));
//
//        Collections.sort(students);
//        System.out.println("Сортировка по возрасту: " + students);

        // 🧠 Задача 2. Сортировка по имени с Comparator
//        Comparator<Student> nameComparator = (s1, s2) -> s1.name.compareTo(s2.name);
//        students.sort(nameComparator);
//        System.out.println("Сортировка по имени: " + students);
//
//        // 🧠 Задача 3. Комбинированная сортировка
//        List<Student> students2 = new ArrayList<>();
//        students2.add(new Student("Алексей", 20));
//        students2.add(new Student("Мария", 19));
//        students2.add(new Student("Иван", 22));
//        students2.add(new Student("Ольга", 19));
//        students2.add(new Student("Борис", 20));
//
//        students2.sort(Comparator.comparing((Student s) -> s.age)
//                .thenComparing(s -> s.name));
//        System.out.println("Комбинированная сортировка: " + students2);
//    }
//}
