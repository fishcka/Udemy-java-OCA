package lesson_09;

public class Task1 {
    int a = 1;
    //static int a=2;

    void abc(int a) {
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        Task1 t = new Task1();
        t.abc(3);
    }
}

/*
output:
        3
        1  */
