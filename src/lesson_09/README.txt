Урок 9. Разновидности переменных и пределы их видимости (ст 120-126)
Object's life cycle, scope of variables, this statement

1. Напишите программу, в которой будет созданно 8 объектов,
   но к последней строке метода main останется всего 2.
2. Вычислите устно output-ы данных программ, а затем проверьте в NetBeans:
A) public class Task1 {
    int a = 1;
    static int a=2;

    void abc(int a) {
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        Task1 t = new Task1();
        t.abc(3);
    }
}
B) public class Task2 {
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

C) public class Task3 {
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

Create8_Objects.java - створюється 8 об'єктів, в кінці main метода залишається 2