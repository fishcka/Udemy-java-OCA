package lesson_13;

public class HowManyDaysInAMonth {
    int numberOfMonth;

    static void findOutTheNumberOfDaysInAMonth(int numberOfMonth) {
        switch (numberOfMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(numberOfMonth + "-й місяць має 31 день");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(numberOfMonth + "-й місяць має 30 днів");
                break;
            case 2:
                System.out.println(numberOfMonth + "-й місяць має 29 днів");
                break;
            default:
                System.out.println(numberOfMonth + "-го місяця не існує");
        }
        /* switch (numberOfMonth) { //варіант синтаксису switch для коротких значень в case
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(numberOfMonth + "-й місяць має 31 день");
            case 4, 6, 9, 11 -> System.out.println(numberOfMonth + "-й місяць має 30 днів");
            case 2 -> System.out.println(numberOfMonth + "-й місяць має 29 днів");
            default -> System.out.println(numberOfMonth + "-го місяця не існує");
        } */
    }

    public static void main(String[] args) {
        HowManyDaysInAMonth.findOutTheNumberOfDaysInAMonth(4);
        findOutTheNumberOfDaysInAMonth(7); //якщо статичний метод викликається в цьому ж класі
                                                        // то клас на початку можна не писати
        HowManyDaysInAMonth.findOutTheNumberOfDaysInAMonth(2);
        findOutTheNumberOfDaysInAMonth(19);
    }
}

/*
output:
        4-й місяць має 30 днів
        7-й місяць має 31 день
        2-й місяць має 29 днів
        19-го місяця не існує  */
