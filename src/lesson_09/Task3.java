package lesson_09;

public class Task3 {
    int a = 1;
    static int b = 2;

    void abc(int a) {
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Task3.b);
    }

    public static void main(String[] args) {
        Task3 t = new Task3();
        t.abc(4);
    }
}

/*
output:
        2
        4
        1
        2  */
