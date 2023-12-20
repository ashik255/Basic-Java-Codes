package OOP.ClassObject;

/**
 * ClassObject
 **
 * Car
 */

class Car {
    String Brand;
    int Year;

    void start() {
        System.out.println("Car is starting");
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.Brand = "Toyota";
        myCar.Year = 2023;
        System.out.println("My car is " + myCar.Brand + " and it was made in " + myCar.Year);
        myCar.start();
    }

}