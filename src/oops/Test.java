package oops;

public class Test {
    public static void main(String[] args) {
        Demo r = new Demo(); //r = object reference
        r.show();
    }
}
class Demo{
    int a = 10; //variable
    String b = "raghav"; //variable

    void show(){ //method
        System.out.println(a+" "+b);
    }
}
