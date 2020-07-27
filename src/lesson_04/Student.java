package lesson_04;

public class Student {
    String studentID;
    String studentName;
    String studentSurname;
    int yearStudy;
    double averageMath;
    double averageEcon;
    double averageForeign;
    String average;
}

class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.studentID = "S01";
        student1.studentName = "Julia";
        student1.studentSurname = "Cat";
        student1.yearStudy = 1;
        student1.averageMath = 3.7;
        student1.averageEcon = 4.3;
        student1.averageForeign = 4.9;
        double avg1 = student1.averageMath + student1.averageEcon + student1.averageForeign;
        student1.average = String.format("%.2f", avg1 /3);
        String name1 = student1.studentName + " " + student1.studentSurname;

        student2.studentID = "S02";
        student2.studentName = "Andriy";
        student2.studentSurname = "Track";
        student2.yearStudy = 5;
        student2.averageMath = 5.0;
        student2.averageEcon = 4.9;
        student2.averageForeign = 4.6;
        double avg2 = student2.averageMath + student2.averageEcon + student2.averageForeign;
        student2.average = String.format("%.2f", avg2 / 3);
        String name2 = student2.studentName + " " + student2.studentSurname;

        student3.studentID = "S03";
        student3.studentName = "Ludmyla";
        student3.studentSurname = "Fish";
        student3.yearStudy = 3;
        student3.averageMath = 5.0;
        student3.averageEcon = 4.8;
        student3.averageForeign = 4.1;
        double avg3 = student3.averageMath + student3.averageEcon + student3.averageForeign;
        student3.average = String.format("%.2f", avg3 /3);
        String name3 = student3.studentName + " " + student3.studentSurname;


        System.out.println("середня оцінка студента " + name1 + ":" + " " + student1.average);
        System.out.println("середня оцінка студента " + name2 + ":" + " " + student2.average);
        System.out.println("середня оцінка студента " + name3 + ":" + " " + student3.average);
    }
}

/*
output:
        середня оцінка студента Julia Cat: 4,30
        середня оцінка студента Andriy Track: 4,83
        середня оцінка студента Ludmyla Fish: 4,63  */
