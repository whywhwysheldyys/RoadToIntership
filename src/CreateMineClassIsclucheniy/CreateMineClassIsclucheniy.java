package CreateMineClassIsclucheniy;


// 🔹 Тема 2: Создание своих классов исключений
// Задание 1:
// Создай собственное исключение TooHighTemperatureException.
// Метод checkTemperature(double temp) должен выбрасывать это исключение, если температура больше 100 °C.
// Перехвати исключение и выведи "Температура слишком высокая!".

//class TooHighTemperatureException extends Exception {
//    public TooHighTemperatureException(String message) {
//        super(message);
//    }
//}

// Задание 2:
// Создай класс LoginException, который выбрасывается, если пользователь ввёл неверный пароль.
// Метод login(String password) должен сравнивать пароль с "1234".
// Если не совпадает — выбрасывай LoginException.

//class LoginException extends Exception {
//    public LoginException(String message) {
//        super(message);
//    }
//}

// Задание 3:
// Создай класс Product и собственное исключение OutOfStockException.
// Если при попытке купить товар его количество меньше 1, выбрасывай исключение.
// Перехвати и выведи "Товар закончился!".

//class OutOfStockException extends Exception {
//    public OutOfStockException(String message) {
//        super(message);
//    }
//}
//
//class Product {
//    private String name;
//    private int quantity;
//
//    public Product(String name, int quantity) {
//        this.name = name;
//        this.quantity = quantity;
//    }
//
//    public void buy() throws OutOfStockException {
//        if (quantity < 1) {
//            throw new OutOfStockException("Товар закончился!");
//        }
//        quantity--;
//        System.out.println("Товар " + name + " куплен. Осталось: " + quantity);
//    }
//}
//
//public class CreateMineClassIsclucheniy {
//    public static void checkTemperature(double temp) throws TooHighTemperatureException {
//        if (temp > 100) {
//            throw new TooHighTemperatureException("Температура слишком высокая!");
//        }
//        System.out.println("Температура в норме: " + temp + " °C");
//    }
//
//    public static void login(String password) throws LoginException {
//        if (!"1234".equals(password)) {
//            throw new LoginException("Неверный пароль!");
//        }
//        System.out.println("Успешный вход в систему");
//    }
//
//    public static void main(String[] args) {
//        try {
//            checkTemperature(150);
//        } catch (TooHighTemperatureException e) {
//            System.out.println("Температура слишком высокая!");
//        }
//
//        try {
//            login("wrong");
//        } catch (LoginException e) {
//            System.out.println("Ошибка входа: " + e.getMessage());
//        }
//
//        Product product = new Product("Телефон", 0);
//        try {
//            product.buy();
//        } catch (OutOfStockException e) {
//            System.out.println("Товар закончился!");
//        }
//    }
//}
