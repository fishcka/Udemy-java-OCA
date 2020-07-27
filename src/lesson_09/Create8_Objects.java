package lesson_09;

public class Create8_Objects {

    public static void creatingObjects() {
        Create8_Objects obj1 = new Create8_Objects();
        String obj2 = "Object1";
    }

    public static void main(String[] args) {
        creatingObjects();
        creatingObjects();
        Create8_Objects obj4 = new Create8_Objects();
        obj4 = new Create8_Objects();
        obj4 = null;
        Create8_Objects obj5 = new Create8_Objects();
        Create8_Objects obj6 = new Create8_Objects();
    }
}
