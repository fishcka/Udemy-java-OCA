package lesson_19;

public class Varargs_zaur {
    static void summa(String s, int... a) {
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println(summa);
        System.out.println(s);
    }

    public static void main(String[] args) {
        summa("flower", 6, 3, 10, 1);
        summa("sun", new int[]{2, 4, 8});
    }
}


/*
output:
        20
        flower
        14
        sun  */
