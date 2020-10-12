package by.epam.pia.learning.fundamentals.cycles;

//3. Найти сумму квадратов первых ста чисел.

public class Task3 {
    public static void main(String[] args) {
        int summ;
        summ = 1;

        for (int i = 2; i <= 100; i++) {
            summ += i * i;
        }
        System.out.println("Сумма квадратов чисел от 1 до 100="+summ);
    }


}
