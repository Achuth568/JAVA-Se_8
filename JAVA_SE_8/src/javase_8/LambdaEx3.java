package javase_8;

@FunctionalInterface
interface Service {
    String login(String username, String password); // Abstract method for performing login
}

public class LambdaEx3 {

    public static void main(String[] args) {
        // Create a lambda expression for the login method of the Service interface
        Service op = (username, password) -> {
            // Check if the provided username and password match specific values
            return username.equalsIgnoreCase("achuth") && password.equals("achuth1234") ? "Login successfully" : "Login failed";
        };
        
        // Call the login method using the lambda expression
        String res = op.login("achuth", "achuth1234");

        // Print the result of the login attempt
        System.out.println(res); // This will print either "Login successfully" or "Login failed"
    }
}

