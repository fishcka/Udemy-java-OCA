package lesson_12.StudentComparison;

import lesson_12.Student.Student;

public class StudentComparison {

    static void compareStudentsWithOneIF(Student s1, Student s2) {
        if (s1.name.equals(s2.name) && s1.course == s2.course && s1.grade == s2.grade) {
            System.out.printf("Студенти %s та %s однакові %n", s1.name, s2.name);
        } else {
            System.out.printf("Студенти %s та %s різні %n", s1.name, s2.name);
        }
    }

    static void compareStudentsWithNestedIF(Student s1, Student s2) {
        if (s1.name.equals(s2.name)) {
            if (s1.course == s2.course) {
                if (s1.grade == s2.grade) {
                    System.out.printf("Студенти %s та %s однакові %n", s1.name, s2.name);
                } else {
                    System.out.printf("У студентів %s та %s різні оцінки: %.1f і %.1f %n", s1.name, s2.name, s1.grade, s2.grade);
                }
            } else {
                System.out.printf("У студентів %s та %s різний курс: %d і %d %n", s1.name, s2.name, s1.course, s2.course);
            }
        } else {
            System.out.printf("У студентів %s та %s різні імена %n", s1.name, s2.name);
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Julia", 5, 4.8);
        Student st2 = new Student("Julia", 5, 4.8);
        Student st3 = new Student("Andriy", 3, 4.6);

        StudentComparison.compareStudentsWithOneIF(st1, st2);
        StudentComparison.compareStudentsWithOneIF(st1, st3);
        StudentComparison.compareStudentsWithOneIF(st3, st2);

        System.out.println("-------------------------------------------------");

        Student st4 = new Student("Anna", 2, 4.5);
        Student st5 = new Student("Anna", 2, 4.5);
        Student st6 = new Student("Anna", 2, 4.8);
        Student st7 = new Student("Anna", 4, 4.5);
        Student st8 = new Student("George", 2, 4.5);

        StudentComparison.compareStudentsWithNestedIF(st4, st5);
        StudentComparison.compareStudentsWithNestedIF(st5, st6);
        StudentComparison.compareStudentsWithNestedIF(st6, st7);
        StudentComparison.compareStudentsWithNestedIF(st7, st8);
    }
}

/*
output:
        Студенти Julia та Julia однакові
        Студенти Julia та Andriy різні
        Студенти Andriy та Julia різні
        -------------------------------------------------
        Студенти Anna та Anna однакові
        У студентів Anna та Anna різні оцінки: 4,5 і 4,8
        У студентів Anna та Anna різний курс: 2 і 4
        У студентів Anna та George різні імена  */
