package oops;

public class MultipleInheritanceThroughInterface {
    public static void main(String[] args) {
        O obj = new O();
        obj.show(); // Calls show method from interface M
        obj.display(); // Calls display method from interface N
    }
}

interface M{
    void show();
}
interface N{
    void display();
}
class O implements M,N {
    public void show(){
        System.out.println("Show method from interface M");
    }
    public void display(){
        System.out.println("Display method from interface N");
    }
}
