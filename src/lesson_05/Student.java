package lesson_05;

public class Student {
    String studentID;
    String studentName;
    String studentSurname;
    double averageMath;
    double averageEcon;
    double averageForeign;
}

class StudentTest {
    double countAverage(Student student) {
        double average = (student.averageMath + student.averageEcon + student.averageForeign)/3;
        System.out.printf("середня оцінка студента %s %s %s: %.2f%n", student.studentID, student.studentName, student.studentSurname, average);
        return average;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.studentID = "S01";
        student1.studentName = "Julia㋛";
        student1.studentSurname = "Cat";
        student1.averageMath = 3.7;
        student1.averageEcon = 4.3;
        student1.averageForeign = 4.9;

        student2.studentID = "S02";
        student2.studentName = "Andriy☺";
        student2.studentSurname = "Track";
        student2.averageMath = 5.0;
        student2.averageEcon = 4.9;
        student2.averageForeign = 4.6;

        student3.studentID = "S03";
        student3.studentName = "Ludmyla㋡";
        student3.studentSurname = "Fish";
        student3.averageMath = 5.0;
        student3.averageEcon = 4.8;
        student3.averageForeign = 4.1;

        StudentTest rating = new StudentTest();
        rating.countAverage(student1);
        rating.countAverage(student2);
        rating.countAverage(student3);
    }
}

/*
output:
        середня оцінка студента S01 Julia㋛ Cat: 4,30
        середня оцінка студента S02 Andriy☺ Track: 4,83
        середня оцінка студента S03 Ludmyla㋡ Fish: 4,63  */
