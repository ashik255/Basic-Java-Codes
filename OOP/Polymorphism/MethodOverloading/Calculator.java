package OOP.Polymorphism.MethodOverloading;

/**
 * InnerCalculator
 */
class InnerCalculator {
    int add(int a, int b) {
        return a + b;
    }

    double sub(double a, double b) {
        return a - b;
    }
}

public class Calculator {
    public static void main(String[] args) {
        InnerCalculator myCalculator = new InnerCalculator();
        System.out.println(myCalculator.add(1, 2));
        System.out.println(myCalculator.sub(6.2, 2.3));
    }

}
