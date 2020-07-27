package lesson_10.package1.package2.package3;

import java.util.Scanner;

public class C {
    public String c01() {
        System.out.println("Введіть номер авто");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public boolean c02() {
        System.out.println("Чи світять ліхтарі? Варіанти відповіді: true - так, false - ні");
        Scanner sc = new Scanner(System.in);
        return sc.nextBoolean();
    }
}
