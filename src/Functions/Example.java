package Functions;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        System.out.println("The sum is: "+ sum(num1, num2));
    }
    public static int sum(int num1, int num2){
        return num1 + num2;
    }
}
