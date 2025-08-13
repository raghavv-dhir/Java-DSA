package oops;

public class CompiletimePolymorphism {
    void calc(){
        int a=10, b=20;
        int c = a+b;
        System.out.println(c);
    }
    void calc(int a, int b){
        int c = a+b;
        System.out.println(c);
    }
    void calc(int a, double b){
        double c = a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        CompiletimePolymorphism obj = new CompiletimePolymorphism();
        obj.calc();
        obj.calc(10,20);
        obj.calc(10,45.32);
    }
}
/*
Compile-time Polymorphism in Java
Also called Static Polymorphism or Early Binding.

Definition
A type of polymorphism where the method call is resolved at compile time rather than at runtime.
This is typically achieved through method overloading or operator overloading (but Java doesn’t support operator overloading, except + for strings).

Key Points
Happens before the program runs (at compile time).

Implemented mainly using method overloading.

Faster than runtime polymorphism because binding is done early.
 */
