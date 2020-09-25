package lesson_19;

public class Foreach2_zaur {
    public static void main(String[] args) {
        String[] students = {"Julia", "Andriy", "Anna"};
        String[] exams = {"мат аналіз", "філософія"};
        for (String s1 : students) {
            for (String s2 : exams) {
                System.out.println(s1 + " " + s2);
            }
        }
    }
}


/*output
        Julia мат аналіз
        Julia філософія
        Andriy мат аналіз
        Andriy філософія
        Anna мат аналіз
        Anna філософія  */
