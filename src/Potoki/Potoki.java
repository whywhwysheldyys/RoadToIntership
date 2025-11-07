//// Условие: Записать строку в файл test.txt и затем прочитать её.
//import java.io.*;
//import java.util.*;
//
//class IO1 {
//    public static void run() throws Exception {
//        FileWriter writer = new FileWriter("test.txt");
//        writer.write("Hello IO");
//        writer.close();
//
//        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
//        System.out.println(br.readLine());
//        br.close();
//    }
//}

//// Условие: Прочитать файл numbers.txt и вывести сумму всех чисел.
//class IO2 {
//    public static void run() throws Exception {
//        BufferedReader br = new BufferedReader(new FileReader("numbers.txt"));
//        String line;
//        int sum = 0;
//        while ((line = br.readLine()) != null) {
//            sum += Integer.parseInt(line);
//        }
//        br.close();
//        System.out.println(sum);
//    }
//}

//// Условие: Скопировать содержимое файла input.txt в output.txt.
//class IO3 {
//    public static void run() throws Exception {
//        FileInputStream in = new FileInputStream("input.txt");
//        FileOutputStream out = new FileOutputStream("output.txt");
//        int b;
//        while ((b = in.read()) != -1) {
//            out.write(b);
//        }
//        in.close();
//        out.close();
//    }
//}
//
//public class IOTasks {
//    public static void main(String[] args) throws Exception {
//        IO1.run();
//        IO2.run();
//        IO3.run();
//    }
//}
