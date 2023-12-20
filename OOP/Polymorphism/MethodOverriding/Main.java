package OOP.Polymorphism.MethodOverriding;

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Main {
    public static void main(String[] args) {
        // Shape myShape = new Shape();
        // myShape.draw();
        Circle myCircle = new Circle();
        myCircle.draw();
        
    }
    
}
