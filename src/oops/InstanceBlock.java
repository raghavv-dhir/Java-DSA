package oops;

public class InstanceBlock {
    int x,y;

    //instance block
    {
        System.out.println("Instance Block executed");
        x = 10;
        y = 20;
        System.out.println(x+" "+y);
    }

    //constructor
    InstanceBlock(){
        System.out.println("Constructor executed");
        x = 30;
        y = 40;
        System.out.println(x+" "+y);
    }

    //show method
    void show(){
        System.out.println("Method executed");
        x = 50;
        y = 60;
        System.out.println(x+" "+y);
    }

    public static void main(String[] args) {
        InstanceBlock obj1 = new InstanceBlock();
        obj1.show();
    }
}

/*
Instance Block (a.k.a. Instance Initializer Block)
Definition: A block of code inside a class without any name or keyword that runs every time an object is created, before the constructor.

Purpose:

To initialize instance variables (non-static variables).

To run common code for all constructors without repeating it in each one.

Key Points
Runs before the constructor when you create an object.

Runs every time you create an object (unlike static blocks, which run once).

If multiple instance blocks exist, they run in the order they appear in the class.

Often used when you want shared setup logic for all constructors.
 */
