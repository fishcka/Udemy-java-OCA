package lesson_06;

public class Student {
    String studentID;
    String studentName;
    String studentSurname;
    int yearStudy;
    double averageMath;
    double averageEcon;
    double averageForeign;

    public Student(String studentID, String studentName, String studentSurname, int yearStudy,
                   double averageMath, double averageEcon, double averageForeign) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.yearStudy = yearStudy;
        this.averageMath = averageMath;
        this.averageEcon = averageEcon;
        this.averageForeign = averageForeign;
    }

    public Student(String studentID, String studentName, String studentSurname, int yearStudy) {
        this(studentID, studentName, studentSurname, yearStudy, 0, 0, 0);
    }

    public Student() {
    }
}

class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student("S01", "Julia㋛", "Cat", 2, 3.7, 4.3, 4.9);
        System.out.println("Студент " + "ID: " + student1.studentID + ", " + student1.studentName + " " + student1.studentSurname +
                ", рік навчання: " + student1.yearStudy + ", середня оцінка з математики: " + student1.averageMath +
                ", з економіки: " + student1.averageEcon + ", з іноземної мови: " + student1.averageForeign);

        Student student2 = new Student("S02", "Andriy☺", "Track", 5);
        student2.averageMath = 5.0;
        student2.averageEcon = 4.9;
        student2.averageForeign = 4.6;
        System.out.println("Студент " + "ID: " + student2.studentID + ", " + student2.studentName + " " + student2.studentSurname +
                ", рік навчання: " + student2.yearStudy + ", середня оцінка з математики: " + student2.averageMath +
                ", з економіки: " + student2.averageEcon + ", з іноземної мови: " + student2.averageForeign);

        Student student3 = new Student();
        student3.studentID = "S03";
        student3.studentName = "Ludmyla㋡";
        student3.studentSurname = "Fish";
        student3.yearStudy = 4;
        student3.averageMath = 5.0;
        student3.averageEcon = 4.8;
        student3.averageForeign = 4.1;
        System.out.println("Студент " + "ID: " + student3.studentID + ", " + student3.studentName + " " + student3.studentSurname +
                ", рік навчання: " + student3.yearStudy + ", середня оцінка з математики: " + student3.averageMath +
                ", з економіки: " + student3.averageEcon + ", з іноземної мови: " + student3.averageForeign);
    }
}

/*output:
        Студент ID: S01, Julia㋛ Cat, рік навчання: 2, середня оцінка з математики: 3.7, з економіки: 4.3, з іноземної мови: 4.9
        Студент ID: S02, Andriy☺ Track, рік навчання: 5, середня оцінка з математики: 5.0, з економіки: 4.9, з іноземної мови: 4.6
        Студент ID: S03, Ludmyla㋡ Fish, рік навчання: 4, середня оцінка з математики: 5.0, з економіки: 4.8, з іноземної мови: 4.1  */
