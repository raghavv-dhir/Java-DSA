package Functions;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println(greet(name));
    }
    static String greet(String name){
        return ("Hello, "+name);
    }
}
