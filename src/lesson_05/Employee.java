package lesson_05;

public class Employee {
    String id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(String id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    double increaseSalary() {
        salary *= 2;
        return salary;
    }

    void showSalary() {
        System.out.printf("Стара зарплатня робітника %s %s, вік %d, департамент %s - %.2f %n", id, surname, age, department, salary);
        System.out.printf("Нова зарплатня робітника %s %s, вік %d, департамент %s - %.2f %n", id, surname, age, department, increaseSalary());
        System.out.println();
    }
}

class EmployeeTest {
    public static void main(String[] args) {

        Employee2 employee1 = new Employee2("A01", "Smith", 21, 300, "Chemistry");
        Employee2 employee2 = new Employee2("A05", "Schubert", 38, 800, "Architecture");

        employee1.showSalary();
        employee2.showSalary();
    }
}

/*
output:
        Стара зарплатня робітника A01 Smith, вік 21, департамент Chemistry - 300,00
        Нова зарплатня робітника A01 Smith, вік 21, департамент Chemistry - 600,00

        Стара зарплатня робітника A05 Schubert, вік 38, департамент Architecture - 800,00
        Нова зарплатня робітника A05 Schubert, вік 38, департамент Architecture - 1600,00  */
