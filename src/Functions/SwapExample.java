package Functions;

public class SwapExample {
    public static void main(String[] args) {
        // Declare and initialize two integer variables
        int a = 10;
        int b = 20;

        // Call the swap method with a and b as arguments
        // This will not actually swap the values in main(), because Java passes by value
        swap(a, b);

        // Print the original values of a and b (unchanged)
        System.out.println("a: " + a + " b: " + b);
    }

    // Define a static method that attempts to swap two integers
    static void swap(int num1, int num2) {
        // Store the value of num1 in a temporary variable
        int temp = num1;

        // Assign the value of num2 to num1
        num1 = num2;

        // Assign the value stored in temp (original num1) to num2
        num2 = temp;

        // At this point, num1 and num2 are swapped,
        // BUT only inside this method's scope — the original 'a' and 'b' are unchanged in main()
    }
}
