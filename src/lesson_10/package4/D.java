package lesson_10.package4;

import lesson_10.package1.A;
import static lesson_10.package1.package2.B.*;
import lesson_10.package1.package2.package3.C;
import lesson_10.package4.package5.E;

public class D {
    public static void main(String[] args) {
        A a1 = new A("01A", "Julia", 9);
        System.out.printf("%s, %s, %d %n", a1.ID, a1.name, a1.age);

        System.out.printf("%d, %.2f %n", intB1, booB1);
        mB1(3, 8.01);

        C c1 = new C();
        if (c1.c02()) {
            System.out.println(c1.c01() + ", ліхтарі світять");
        } else System.out.println(c1.c01() + ", ліхтарі не світять");
        System.out.println("----------------------------");

        E e1 = new E("Anna", "IT", 500);
        e1.mE1();
    }
}

/*
output:
    01A, Julia, 9
    9, 6,15
    11.01
    ----------------------------
    Чи світять ліхтарі? Варіанти відповіді: true - так, false - ні
    false
    Введіть номер авто
    CA7390BI
    CA7390BI, ліхтарі не світять
    ----------------------------
    Ім'я: Anna, Департамент: IT, Зарплата: 500.0 */
