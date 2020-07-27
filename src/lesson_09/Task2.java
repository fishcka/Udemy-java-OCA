package lesson_09;

public class Task2 {
    int a = 1;
    static int b = 2;

    static void abc(final int a) {
        System.out.println(a);
        System.out.println(Task2.b);
    }

    public static void main(String[] args) {
        abc(5);
    }
}

/*
output:
        5
        2  */
