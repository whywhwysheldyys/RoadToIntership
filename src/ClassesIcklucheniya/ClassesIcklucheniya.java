package ClassesIcklucheniya;

// 🧩 Тема 2: Классы исключений
// Задание 1:
// Создай собственное исключение NegativeNumberException, которое выбрасывается, если в метод setAge(int age) передано отрицательное число.
// Перехвати это исключение в main и выведи сообщение "Возраст не может быть отрицательным!".

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class Person {
    private int age;

    public void setAge(int age) throws NegativeNumberException {
        if (age < 0) {
            throw new NegativeNumberException("Возраст не может быть отрицательным!");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

// Задание 2:
// Создай класс BankAccount с методом withdraw(double amount).
// Если сумма снятия превышает баланс — выбрасывай собственное исключение InsufficientFundsException.
// Перехвати его в main и выведи сообщение "Недостаточно средств!".

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Недостаточно средств!");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

// Задание 3:
// Создай иерархию исключений:
// AppException (базовое),
// FileException,
// NetworkException.
// В методе runApp() случайным образом выбрасывай одно из этих исключений и обрабатывай их по-разному в main:
// для FileException — вывести "Ошибка файла",
// для NetworkException — "Ошибка сети",
// для всех остальных — "Неизвестная ошибка".

class AppException extends Exception {
    public AppException(String message) {
        super(message);
    }
}

class FileException extends AppException {
    public FileException(String message) {
        super(message);
    }
}

class NetworkException extends AppException {
    public NetworkException(String message) {
        super(message);
    }
}

class Application {
    public void runApp() throws AppException {
        double random = Math.random();
        if (random < 0.33) {
            throw new FileException("Ошибка при работе с файлом");
        } else if (random < 0.66) {
            throw new NetworkException("Ошибка сетевого соединения");
        } else {
            throw new AppException("Неизвестная ошибка приложения");
        }
    }
}

public class ClassesIcklucheniya {
    public static void main(String[] args) {

        Person person = new Person();
        try {
            person.setAge(-5);
        } catch (NegativeNumberException e) {
            System.out.println("Возраст не может быть отрицательным!");
        }


        BankAccount account = new BankAccount(1000);
        try {
            account.withdraw(1500);
        } catch (InsufficientFundsException e) {
            System.out.println("Недостаточно средств!");
        }


        Application app = new Application();
        try {
            app.runApp();
        } catch (FileException e) {
            System.out.println("Ошибка файла");
        } catch (NetworkException e) {
            System.out.println("Ошибка сети");
        } catch (AppException e) {
            System.out.println("Неизвестная ошибка");
        }
    }
}
