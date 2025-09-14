package ExceptionHandling;

public class FinallyBlock {
    public static void main(String[] args) {
        try{
            int data = 50/0;
            System.out.println(data);
        } catch (Exception e) {
            System.out.println("Exception: "+e);
        } finally {
            System.out.println("Finally block executed!");
        }
    }
}
