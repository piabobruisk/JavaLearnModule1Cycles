package by.epam.pia.learning.fundamentals.cycles;

// Для каждого натурального числа в промежутке от m до n вывести все делители,
// кроме единицы и самого числа. m и n вводятся с клавиатуры.

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        int m;
        int n;

        do {
            m = input("Введите начальное число:");
            n = input("Введите конечное число:");
            if (m >= n) {
                System.out.println("Начало должно быть меньше конца");
            }
        } while (m >= n);

        boolean found;

        for (int i = m; i <= n; i++) {
            System.out.print("Делители числа " + i + ": ");
            found = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    found = true;
                    System.out.print(j + " ");
                }
            }
            if (found) {
                System.out.println(" ");
            } else {
                System.out.println("отсутствуют");
            }
        }
    }

    private static int input(String prompt) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
        }
        return scanner.nextInt();
    }
}
