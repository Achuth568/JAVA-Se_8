package javase_8;



@FunctionalInterface
interface Operations {
    void add(int num1, int num2); // Abstract method for performing addition
}

public class LambdaEx2 {

    public static void main(String[] args) {
        // Create a lambda expression for the add method of the Operations interface
        Operations op = (num1, num2) -> System.out.println(num1 + num2);

        // Call the add method using the lambda expression
        op.add(10, 20); // This will print the result of adding 10 and 20

        // Create another lambda expression
        Operations op1 = (num1, num2) -> System.out.println(num1 + num2);

        // Call the add method using the second lambda expression
        op1.add(100, 20); // This will print the result of adding 100 and 20
        
        op1.add(200, 400);
    }
}

