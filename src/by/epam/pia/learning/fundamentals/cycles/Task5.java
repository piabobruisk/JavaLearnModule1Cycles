package by.epam.pia.learning.fundamentals.cycles;

//5. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class Task5 {
    public static void main(String[] args) {
        for (int i=32; i<127; i++){
            System.out.println(i+" -> "+ (char) i);
        }
    }
}
