package ModificatorAccess;

//public class PublicExample {

//    Задача 1 (простая):
//            📘 Условие: Создай класс с public полем и выведи его в другом классе.

//    public class PublicExample {
//        public String name = "Java";
//    }
//    class Main {
//        public static void main(String[] args) {
//            PublicExample obj = new PublicExample();
//            System.out.println(obj.name);
//        }
//    }
//}


//Задача 2 (средняя):
//        📘 Условие: Создай класс с private полем и public методом-геттером, возвращающим его значение.

//public class SecretCode {
//    private int code = 1234;
//    public int getCode() {
//        return code;
//    }
//}
//class Main {
//    public static void main(String[] args) {
//        SecretCode obj = new SecretCode();
//        System.out.println(obj.getCode());
//    }
//}

//Задача 3 (сложная):
//        📘 Условие: Создай класс BankAccount с private балансом и методами deposit, withdraw, getBalance. Запрети прямой доступ к полю.

//public class BankAccount {
//    private double balance = 0;
//
//    public void deposit(double amount) {
//        balance += amount;
//    }
//
//    public void withdraw(double amount) {
//        if (amount <= balance) balance -= amount;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public static void main(String[] args) {
//        BankAccount acc = new BankAccount();
//        acc.deposit(1000);
//        acc.withdraw(300);
//        System.out.println(acc.getBalance());
//    }
//}



