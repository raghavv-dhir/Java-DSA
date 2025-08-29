package Java8;

public class Main {
    public static void main(String[] args) {
        Sum obj1 = new Sum() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        }; //anonymous class implementation

        System.out.println(obj1.sum(2,5));

        Sum obj2 = (a,b) -> a + b;  //lambda expression

        System.out.println(obj2.sum(2,5));
    }
}
