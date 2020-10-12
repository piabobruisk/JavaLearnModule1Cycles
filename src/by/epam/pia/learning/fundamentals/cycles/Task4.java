package by.epam.pia.learning.fundamentals.cycles;

//4. Составить программу нахождения произведения квадратов первых двухсот чисел.

import java.math.BigInteger;

public class Task4 {

    public static void main(String[] args) {
        BigInteger result;
        result = new BigInteger("1");

        for (int i = 2; i <= 200; i++) {
            BigInteger square = BigInteger.valueOf(i * i);
            result = result.multiply(square);
        }
        System.out.println("Произведение квадратов чисел от 1 до 200=" + result);
    }
}
