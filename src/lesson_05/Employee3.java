package lesson_05;

// зробила форматування виводу так, щоб виводилась табличка

public class Employee3 {
    String id;
    String surname;
    int age;
    double salary;
    String department;

    Employee3(String id, String surname, int age, double salary, String department) {
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
        System.out.printf("%9s%6s%5d%15s%10.2f%9.2f%n", surname, id, age, department, salary, increaseSalary());
    }
}

class EmployeeTest3 {
    public static void main(String[] args) {

        Employee3 employee1 = new Employee3("A01", "Smith", 21, 300, "Chemistry");
        Employee3 employee2 = new Employee3("A05", "Schubert", 38, 800, "Architecture");

        System.out.println(" Робітник    ID  вік    департамент  стара ЗП  нова ЗП");
        System.out.println(" -----------------------------------------------------");
        employee1.showSalary();
        employee2.showSalary();
    }
}

/*
output:
        Робітник    ID  вік    департамент  стара ЗП  нова ЗП
        -----------------------------------------------------
           Smith   A01   21      Chemistry    300,00   600,00
        Schubert   A05   38   Architecture    800,00  1600,00
*/
