package ExceptionHandling;

public class BasicExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // risky code
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
        System.out.println("Program continues...");
    }
}
