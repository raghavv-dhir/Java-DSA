package oops;

public class privateConstructor {
    public static void main(String[] args) {
        //MyClass r = new MyClass(); //Not allowed outside class definition because constructor is private
        MyClass ref = MyClass.createInstance();
    }
}
class MyClass{
    private MyClass(){
        System.out.println("Private constructor called");
    }

    //static method to create object
    public static MyClass createInstance(){
        return new MyClass();
    }
}

/*
Private Constructor
Definition: A constructor declared with the private access modifier.

Purpose:

To restrict object creation from outside the class.

Often used in Singleton Design Pattern, Factory methods, or utility classes where you don’t want direct instantiation.

Key Points
Only accessible inside the same class.

If you try new from another class, you’ll get a compile-time error.

Usually paired with:

Static methods to create objects.

Static members (e.g., in Singleton).
 */
