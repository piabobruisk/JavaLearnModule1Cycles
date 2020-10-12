package by.epam.pia.learning.fundamentals.cycles;

//7. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        String a;
        String b;

        a = input("Введите первое число:");
        b = input("Введите второе число:");

        for (int i = 0; i < 10; i++) {
            if (isNumberPresent(i, a) && isNumberPresent(i, b)) {
                System.out.println("Цифра " + i + " входит в оба числа");
            }
        }
    }

    private static boolean isNumberPresent(int digit, String str) {

        int tmp;

        for (int i = 0; i < str.length(); i++) {
            tmp = Integer.parseInt(str.substring(i, i + 1));
            if (digit == tmp) {
                return true;
            }
        }
        return false;
    }

    private static String input(String prompt) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print(prompt);

        while (!scanner.hasNextLong()) {
            scanner.nextLine();
        }

        return Long.toString(scanner.nextLong());
    }
}
