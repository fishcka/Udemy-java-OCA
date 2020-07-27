package lesson_05;

//змінила метод showSalary щоб не виводити дані робітника двічі

public class Employee2 {
    String id;
    String surname;
    int age;
    double salary;
    String department;

    Employee2(String id, String surname, int age, double salary, String department) {
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
        System.out.printf("Робітник %s %s, вік %d, департамент %s:%n стара ЗП %.2f,%n нова ЗП %.2f %n",
                id, surname, age, department, salary, increaseSalary());
        System.out.println();
    }
}

class EmployeeTest2 {
    public static void main(String[] args) {
        Employee2 employee1 = new Employee2("A01", "Smith", 21, 300, "Chemistry");
        Employee2 employee2 = new Employee2("A05", "Schubert", 38, 800, "Architecture");

        employee1.showSalary();
        employee2.showSalary();
    }
}

/*
output:
        Робітник A01 Smith, вік 21, департамент Chemistry:
         стара ЗП 300,00,
         нова ЗП 600,00
        Робітник A05 Schubert, вік 38, департамент Architecture:
         стара ЗП 800,00,
         нова ЗП 1600,00  */
