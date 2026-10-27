import java.util.Scanner;

public class Task5 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            printMenu();
            String choice = in.nextLine();
            if (choice.equals("1")) {
                double[] params = readParams();
                if (params != null) {
                    printResult(params, calculate(params));
                }
            } else if (choice.equals("2")) {
                printAbout();
            } else if (choice.equals("3")) {
                printAuthor();
            } else if (choice.equals("0")) {
                running = false;
            } else {
                System.out.println("Нет такого пункта");
            }
        }
    }

    static void printMenu() {
        System.out.println("1 - Расчёт");
        System.out.println("2 - О программе");
        System.out.println("3 - О разработчике");
        System.out.println("0 - Выход");
    }

    static void printAbout() {
        System.out.println("Программа считает кинетическую энергию E = m * v * v / 2");
    }

    static void printAuthor() {
        System.out.println("Разработчик: Беспамятных Евгений");
    }

    // ввод: params[0] - масса, params[1] - скорость; null - выход в меню
    static double[] readParams() {
        String[] names = {"массу (кг)", "скорость (м/с)"};
        double[] params = new double[2];
        for (int i = 0; i < params.length; i++) {
            double x = readNumber("Введите " + names[i] + ": ");
            if (x == -1) {
                return null;
            }
            params[i] = x;
        }
        return params;
    }

    // повторяет ввод, пока не введут корректное число; q - выход в меню
    static double readNumber(String text) {
        while (true) {
            System.out.print(text);
            String s = in.nextLine();
            if (s.equals("q")) {
                return -1;
            }
            try {
                double x = Double.parseDouble(s);
                if (isValid(x)) {
                    return x;
                }
                System.out.println("Число не может быть отрицательным, введите ещё раз (q - выход)");
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода, введите ещё раз (q - выход)");
            }
        }
    }

    // проверка
    static boolean isValid(double x) {
        return x >= 0;
    }

    // вычисление
    static double calculate(double[] params) {
        double m = params[0];
        double v = params[1];
        return m * v * v / 2;
    }

    // вывод
    static void printResult(double[] params, double e) {
        System.out.println("m = " + params[0] + " кг, v = " + params[1] + " м/с");
        System.out.println("E = " + e + " Дж");
    }
}
