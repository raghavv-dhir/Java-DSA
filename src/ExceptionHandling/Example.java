package ExceptionHandling;

public class Example {
    public static void main(String[] args) {
        int[] numerator = {10,200,30,40};
        int[] denominator = {1,2,0,4};
        for (int i = 0; i < numerator.length; i++) {
            System.out.println(divide(numerator[i],denominator[i]));
        }
        System.out.println("Good job...");
    }
    static int divide(int a, int b){
        return a/b;
    }
}
/*


Types of Errors:
1. Syntax error: Ex: missing semicolon, or return statement etc.
2. Logical error: Error in calculation/logic of the program
3. Runtime error: ArrayIndexOutOfBoundException, NullPointerException etc.


Here in this program, No compilation error, but will give runtime exception (ArithmeticException: Divide by zero). So, the program will crash during runtime.


*/