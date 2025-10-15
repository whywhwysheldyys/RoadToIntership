package CountEnum;


//    🔹 Задача 1 — Простая
//
//    Создай перечисление DayOfWeek, содержащее 7 дней недели (MONDAY, TUESDAY, …, SUNDAY).
//
//    В Main напиши метод:
//
//    public static boolean isWeekend(DayOfWeek day)
//
//
//    который возвращает true, если день — выходной (SATURDAY или SUNDAY), и false иначе.
//
//    Пример вывода:
//
//    MONDAY → Рабочий день
//    SUNDAY → Выходной

//    enum DayOfWeek {
//        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
//    }
//
//    public class CountEnum {
//        public static boolean isWeekend(DayOfWeek day) {
//            return day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY;
//        }
//
//        public static void main(String[] args) {
//            DayOfWeek[] days = DayOfWeek.values();
//
//            for (DayOfWeek day : days) {
//                if (isWeekend(day)) {
//                    System.out.println(day + " → Выходной");
//                } else {
//                    System.out.println(day + " → Рабочий день");
//                }
//            }
//        }
//    }

//🔹 Задача 2 — Средняя
//
//Создай перечисление CoffeeSize со значениями:
//
//SMALL(200 мл), MEDIUM(300 мл), LARGE(400 мл)
//
//
//Каждое значение должно хранить объём (в миллилитрах).
//Добавь:
//
//конструктор, принимающий объём,
//
//метод getVolume(),
//
//метод toString(), возвращающий, например:
//        "LARGE (400 мл)".
//
//В Main создай массив из всех размеров и выведи их с помощью цикла for (CoffeeSize size : CoffeeSize.values()).

//enum CoffeeSize {
//    SMALL(200),
//    MEDIUM(300),
//    LARGE(400);
//
//    private final int volume;
//
//    CoffeeSize(int volume) {
//        this.volume = volume;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    @Override
//    public String toString() {
//        return this.name() + " (" + volume + " мл)";
//    }
//}
//
//public class CountEnum {
//    public static void main(String[] args) {
//        for (CoffeeSize size : CoffeeSize.values()) {
//            System.out.println(size);
//        }
//    }
//}

//🔹 Задача 3 — Сложная
//
//Создай перечисление Operation для базовых арифметических операций:
//
//ADD(+), SUBTRACT(-), MULTIPLY(*), DIVIDE(/)
//
//
//Каждый элемент должен реализовать абстрактный метод:
//
//public abstract double apply(double a, double b);
//
//
//Пример использования:
//
//        System.out.println(Operation.ADD.apply(5, 3));       // 8
//        System.out.println(Operation.MULTIPLY.apply(2, 4));  // 8
//
//
//        ⚙️ Усложнение:
//
//        Сделай так, чтобы при выводе (toString()) операция показывала символ (+, -, *, /).
//
//При делении на ноль метод apply() должен бросать ArithmeticException.

//enum Operation {
//    ADD('+') {
//        @Override
//        public double apply(double a, double b) {
//            return a + b;
//        }
//    },
//    SUBTRACT('-') {
//        @Override
//        public double apply(double a, double b) {
//            return a - b;
//        }
//    },
//    MULTIPLY('*') {
//        @Override
//        public double apply(double a, double b) {
//            return a * b;
//        }
//    },
//    DIVIDE('/') {
//        @Override
//        public double apply(double a, double b) {
//            if (b == 0) throw new ArithmeticException("Деление на ноль!");
//            return a / b;
//        }
//    };
//
//    private final char symbol;
//
//    Operation(char symbol) {
//        this.symbol = symbol;
//    }
//
//    public abstract double apply(double a, double b);
//
//    @Override
//    public String toString() {
//        return String.valueOf(symbol);
//    }
//}
//
//public class CountEnum {
//    public static void main(String[] args) {
//        double a = 5, b = 3;
//        System.out.println("ADD: " + Operation.ADD.apply(a, b));
//        System.out.println("SUBTRACT: " + Operation.SUBTRACT.apply(a, b));
//        System.out.println("MULTIPLY: " + Operation.MULTIPLY.apply(2, 4));
//
//        try {
//            System.out.println("DIVIDE: " + Operation.DIVIDE.apply(6, 0));
//        } catch (ArithmeticException e) {
//            System.out.println("Ошибка: " + e.getMessage());
//        }
//    }
//}
