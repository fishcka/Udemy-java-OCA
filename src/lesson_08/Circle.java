package lesson_08;

public class Circle {
    public static final double Pi = 3.1415926536;

    public double calculateArea(double radius) {
        int exponent = 2;
        double area = Pi * Math.pow(radius, exponent); //Math.pow дозволяє звести значення першого аргументу в ступінь другого
        //double area = Math.PI * Math.pow(radius, exponent); //Math.PI - static final константа з класа Math ( http://developer.alexanderklimov.ru/android/java/math.php )
        System.out.printf("Площа круга з радіусом %.2f дорівнює %.2f%n", radius, area);
        return area;
    }

    public static double calculateCircle(double radius) {
        double circle = 2 * Pi * radius;
        System.out.printf("Довжина окружності круга з радіусом %.2f дорівнює %.2f%n", radius, circle);
        return circle;
    }

    public void calculateAreaCircle(double radius) {
        calculateArea(radius);
        calculateCircle(radius);
    }
}

class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();

        circle.calculateArea(12);
        System.out.println();
        circle.calculateCircle(5.3);
        System.out.println();
        circle.calculateAreaCircle(3);
        System.out.println();
        Circle.calculateCircle(8.8);
    }
}

/*
output:
        Площа круга з радіусом 12,00 дорівнює 452,39

        Довжина окружності круга з радіусом 5,30 дорівнює 33,30

        Площа круга з радіусом 3,00 дорівнює 28,27
        Довжина окружності круга з радіусом 3,00 дорівнює 18,85

        Довжина окружності круга з радіусом 8,80 дорівнює 55,29  */
