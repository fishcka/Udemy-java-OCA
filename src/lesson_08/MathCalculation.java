package lesson_08;

public class MathCalculation {
    static int multResult;
    static int divResult;
    static int modulo;

    static int multiplyThreeNumbers(int a, int b, int c) {
        multResult = a * b * c;
        System.out.println("Результат множення: " + multResult);
        return multResult;
    }

    static void divideTwoNumbers(int d, int e) {
        divResult = d / e;
        modulo = d % e;
        System.out.println("Результат ділення: " + divResult + ", залишок: " + modulo);
    }
}

class MathTest {
    public static void main(String[] args) {
        MathCalculation math = new MathCalculation();

        MathCalculation.multiplyThreeNumbers(2, 8, 15);
        MathCalculation.divideTwoNumbers(17, 4);

        math.multiplyThreeNumbers(7, 13, 6);
        math.divideTwoNumbers(9, 6);
    }
}

/*
output:
        Результат множення: 240
        Результат ділення: 4, залишок: 1
        Результат множення: 546
        Результат ділення: 1, залишок: 3  */
