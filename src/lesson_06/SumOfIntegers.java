package lesson_06;

public class SumOfIntegers {

    int summarizeNumbers() {
        int amount1 = 0;
        System.out.println(amount1);
        return amount1;
    }

    int summarizeNumbers(int a1) {
        int amount2 = a1;
        System.out.println(amount2);
        return amount2;
    }

    int summarizeNumbers(int a1, int b1) {
        int amount3 = a1 + b1;
        System.out.println(amount3);
        return amount3;
    }

    int summarizeNumbers(int a1, int b1, int c1) {
        int amount4 = a1 + b1 + c1;
        System.out.println(amount4);
        return amount4;
    }

    int summarizeNumbers(int a1, int b1, int c1, int d1) {
        int amount5 = a1 + b1 + c1 + d1;
        System.out.println(amount5);
        return amount5;
    }
}

class SumOfIntegersTest {
    public static void main(String[] args) {

        SumOfIntegers totalAmount = new SumOfIntegers();
        totalAmount.summarizeNumbers();
        totalAmount.summarizeNumbers(1);
        totalAmount.summarizeNumbers(1, 2);
        totalAmount.summarizeNumbers(1, 2, 3);
        totalAmount.summarizeNumbers(1, 2, 3, 4);
    }
}

/*
output:
        0
        1
        3
        6
        10 */
