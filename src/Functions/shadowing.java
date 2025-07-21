package Functions;

public class shadowing {
    static int x = 50; // class-level (global) variable (shadowed by narrower scope variable)
    public static void main(String[] args) {
        int x = 20; // local variable shadows the class-level x
        System.out.println(x); // prints 20, not 50
    }
}
