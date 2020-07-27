package lesson_14;

public class ShowTime {

    static void timeShowing() {
        OUTER:
        for (int hour = 0; hour < 6; hour++) {
            INNER1:
            for (int minute = 0; minute < 60; minute++) {
                if (hour > 1 && minute%10 == 0) {
                    break OUTER;
                }
                INNER2:
                for (int second = 0; second < 60; second++) {
                    System.out.printf("%02d:%02d:%02d%n", hour, minute, second);
                    if (second * hour > minute) {
                        continue INNER1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        timeShowing();
    }
}

// output дуже великий, тому сюди не вставляю
