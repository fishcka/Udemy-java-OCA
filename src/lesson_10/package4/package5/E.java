package lesson_10.package4.package5;


public class E {
    public String name;
    public String department;
    public double salary;

    public E(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void mE1() {
        System.out.println("Ім'я: " + name + ", Департамент: " + department + ", Зарплата: " + salary);
    }
}
