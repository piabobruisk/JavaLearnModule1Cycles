package by.epam.pia.learning.fundamentals.cycles;

//1. Напишите программу, где пользователь вводит любое целое положительное число.
//А программа суммирует все числа от 1 до введенного пользователем числа.

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        int x;
        int summ;

        summ = 0;

        do {
            x = input("Введите целое положительное число=");
        } while (x < 1);

        for (int i = 1; i <= x; i++) {
            summ += i;
        }
        System.out.print("Cумма чисел от 1 до " + x + " (включительно) равна:" + summ);
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
