package lesson_15;

public class ShowTime {

    static void timeShowing() {
        int hour = 0;
        OUTER:
        while (hour < 6) {
            int minute = -1;
            MIDDLE:
            do {
                minute++;
                if (hour > 1 && minute % 10 == 0) {
                    break OUTER;
                }
                int second = 0;
                INNER:
                while (second < 60) {
                    System.out.printf("%02d:%02d:%02d%n", hour, minute, second);
                    second++;
                    if (second * hour > minute) {
                        continue MIDDLE;
                    }
                }
            } while (minute < 59);
            hour++;
        }
    }

    public static void main(String[] args) {
        timeShowing();
    }
}

// output дуже великий, тому сюди не вставляю
