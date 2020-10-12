package by.epam.pia.learning.fundamentals.cycles;

//Вычислить значения функции на отрезке [а,b] c шагом h:
// y=x, x>2
// y=-x, x<=2

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        int a;
        int b;
        int h;

        do {
            a = input("Введите начало отрезка:");
            b = input("Введите конец отрезка:");
            if (a>=b){
                System.out.println("Начало должно быть меньше конца");
            }
        } while ( a>=b);
        h = input("Введите шаг:");

        for (int i = a; i <= b; i+=h) {
            if (i>2){
                System.out.println("x=" + i + " y=" + i);
            }else {
                System.out.println("x=" + i + " y=" + -i);
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
