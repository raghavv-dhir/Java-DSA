package ExceptionHandling;

public class Example2 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[5] = 100; // risky
        } catch (ArithmeticException e) {
            System.out.println("Math error!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array access!");
        } catch (Exception e) {
            System.out.println("Generic exception caught.");
        }
    }
}
