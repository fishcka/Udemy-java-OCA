package lesson_19;

public class Foreach1_zaur {
    public static void main(String[] args) {
        int[] array = {0, 6, 4, 1};
        int summa = 0;
        for (int a : array) {
            summa += a;
        }
        System.out.println(summa);
    }
}


/*
output
    11 */
