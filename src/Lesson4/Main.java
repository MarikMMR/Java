package Lesson4;

public class Main {
    public static void main (String[] args) {
        Car car = new Car();
        car.name = "Lada";
        car.color = "red";
        car.printInfo();

        {
            car.color = "black";
            car.printInfo();
            Integer i = 10;
            System.out.println(i);
        }
        Car carVolvo = new Car("Volvo", "red");
        carVolvo.printInfo();
        Car cardef = new Car();
        cardef.printInfo();

    }
}
