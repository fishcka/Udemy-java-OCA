package lesson_07.Employee_3;

public class Employee {
    public static void main(String[] args) {
        System.out.println("-----------------");

        lesson_07.Employee_1.Employee employee1 = new lesson_07.Employee_1.Employee("A01", "Smith", 300, 21, "Chemistry");
        System.out.println(employee1.surname);
        System.out.println(employee1.salary); //'salary' has private access in 'Employee_1.Employee'
        System.out.println(employee1.id); //'id' is not public in 'Employee_1.Employee'. Cannot be accessed from outside package
        employee1.showSurname();
        employee1.showSalary();
        employee1.showID();
        System.out.println("-----------------");

        lesson_07.Employee_1.Employee employee2 = new lesson_07.Employee_1.Employee("A02", "Track", 500, 28); //'Employee(java.lang.String, java.lang.String, double, int)' is not public in 'Employee_1.Employee'. Cannot be accessed from outside package
        System.out.println(employee2.surname);
        System.out.println(employee2.salary); //'salary' has private access in 'Employee_1.Employee'
        System.out.println(employee2.id); //'id' is not public in 'Employee_1.Employee'. Cannot be accessed from outside package
        employee2.showSurname();
        employee2.showSalary();
        employee2.showID();
        System.out.println("-----------------");

        lesson_07.Employee_1.Employee employee3 = new lesson_07.Employee_1.Employee("A03", "Cat", 890); //'Employee(java.lang.String, java.lang.String, double)' has private access in 'Employee_1.Employee'
        System.out.println(employee3.surname);
        System.out.println(employee3.salary); //'salary' has private access in 'Employee_1.Employee'
        System.out.println(employee3.id); //'id' is not public in 'Employee_1.Employee'. Cannot be accessed from outside package
        employee3.showSurname();
        employee3.showSalary();
        employee3.showID();
        System.out.println("-----------------");
    }
}
