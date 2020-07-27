package lesson_07.Employee_1;

public class Employee {
    String id;
    public String surname;
    int age;
    private double salary;
    String department;

    public void showSurname() {
        System.out.println("Прізвище: " + surname);
    }

    public void showSalary() {
        System.out.println("Зарплата: " + salary);
    }

    public void showID() {
        System.out.println("ID: " + id);
    }

    public Employee(String id, String surname, double salary, int age, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    Employee(String id, String surname, double salary, int age) {
        this(id,surname, salary,age, null);
    }

    private Employee(String id, String surname, double salary) {
        this(id, surname, salary, 0, null);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        System.out.println("-----------------");

        Employee employee1 = new Employee("A01", "Smith", 300, 21, "Chemistry");
        System.out.println(employee1.surname);
        System.out.println(employee1.salary); //'salary' has private access in 'Employee_1.Employee'
        System.out.println(employee1.id);
        employee1.showSurname();
        employee1.showSalary();
        employee1.showID();
        System.out.println("-----------------");

        Employee employee2 = new Employee("A02", "Track", 500, 28);
        System.out.println(employee2.surname);
        System.out.println(employee2.salary); //'salary' has private access in 'Employee_1.Employee'
        System.out.println(employee2.id);
        employee2.showSurname();
        employee2.showSalary();
        employee2.showID();
        System.out.println("-----------------");

        Employee employee3 = new Employee("A03", "Cat", 890); //'Employee(java.lang.String, java.lang.String, double)' has private access in 'Employee_1.Employee'
        System.out.println(employee3.surname);
        System.out.println(employee3.salary); //'salary' has private access in 'Employee_1.Employee'
        System.out.println(employee3.id);
        employee3.showSurname();
        employee3.showSalary();
        employee3.showID();
        System.out.println("-----------------");
    }
}

/*
output:
Error:(55, 30) java: Employee(java.lang.String,java.lang.String,double) has private access in Employee_1.Employee */

/*
output without third object:
        -----------------
        Прізвище: Smith
        Зарплата: 300.0
        ID: A01
        -----------------
        Прізвище: Track
        Зарплата: 500.0
        ID: A02
        ----------------- */
