package ImportantQuestions;

public class FibonacciSequence {
    public static void main(String[] args) {
        int n = 10;
        sol(n);
    }
    static void sol(int n){
        int a = 0;
        int b = 1;
        System.out.print(a);
        while(b <= n){
            System.out.print(", "+b);
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
