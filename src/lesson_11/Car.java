package lesson_11;

public class Car {
    String color;
    String engine;
    int qtyOfDoors;

    public Car(String color, String engine, int qtyOfDoors) {
        this.color = color;
        this.engine = engine;
        this.qtyOfDoors = qtyOfDoors;
    }
}

class CarTest {

    void changingQtyOfDoors(Car abstractCar, int newQtyOfDoors) {
        abstractCar.qtyOfDoors = newQtyOfDoors;
    }

    void swappingColors(Car c1, Car c2) {
        String originalC1Color = c1.color; //використано String тому що аргумент, який змінюється, є String.
        //якби змінювали місцями кількість дверей то допоміжний параметр був би int
        c1.color = c2.color;
        c2.color = originalC1Color;
    }

    public static void main(String[] args) {
        Car car1 = new Car("orange", "z14xe", 4);
        Car car2 = new Car("green", "m50d", 4);

        CarTest doors = new CarTest();
        doors.changingQtyOfDoors(car1,5);
        doors.changingQtyOfDoors(car2,3);
        doors.swappingColors(car1, car2);

        System.out.println("Car1 color: " + car1.color + ", engine: " + car1.engine + ", quantity of doors: " + car1.qtyOfDoors);
        System.out.println("Car2 color: " + car2.color + ", engine: " + car2.engine + ", quantity of doors: " + car2.qtyOfDoors);
    }
}


/*
output:
        Car1 color: green, engine: z14xe, quantity of doors: 5
        Car2 color: orange, engine: m50d, quantity of doors: 3  */
