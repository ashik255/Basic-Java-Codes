package OOP.Inheritance;

class Vehicle {
    String color;
    int maxSpeed;

    Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    void display() {
        System.out.println("Color: " + color);
        System.out.println("Max Speed: " + maxSpeed);
    }
}

class Car extends Vehicle {
    int numGears;
    boolean isConvertible;

    Car(int maxSpeed) {
        super(maxSpeed);
    }

    void display() {
        super.display();
        System.out.println("Number of Gears: " + numGears);
        System.out.println("Is Convertible: " + isConvertible);
    }
}

class Motorcycle extends Vehicle {
    int maxSpeed;

    Motorcycle(int maxSpeed) {
        super(maxSpeed);
    }

    void display() {
        super.display();
        System.out.println("Max Speed: " + maxSpeed);
    }
}


public class Main {
    public static void main(String[] args) {
        Car car = new Car(100);
        car.color = "Blue";
        car.numGears = 4;
        car.isConvertible = false;
        car.display();
        Motorcycle motorcycle = new Motorcycle(200);
        motorcycle.color = "Red";
        motorcycle.display();
    }
    
}
