package Lesson4;

public class Car  {
    public String name;
    public String color;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public Car(){
        name = "def";
        color = "-";

    }

    public void printInfo() {
        System.out.println("name: " + name + ",  color: "+ color);


    }
}
