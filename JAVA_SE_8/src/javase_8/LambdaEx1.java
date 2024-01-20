package javase_8;

@FunctionalInterface
interface Greeting {
    void greet(); // The abstract method that represents a greeting action
}

public class LambdaEx1 {

    public static void main(String[] args) {
        // Create a lambda expression for the Greeting interface
        Greeting g = () -> System.out.println("hi lambda working");

        // Invoke the greet() method using the lambda expression
        g.greet();

        // Create another lambda expression
        Greeting g1 = () -> {
            System.out.println("hi lambda second one working");
        };

        // Invoke the greet() method using the second lambda expression
        g1.greet();

        // Create a third lambda expression with multiple statements
        Greeting g2 = () -> {
            System.out.println("hi lambda third one working");
            System.out.println("hi lambda working");
        };

        // Invoke the greet() method using the third lambda expression
        g2.greet();
    }
}

