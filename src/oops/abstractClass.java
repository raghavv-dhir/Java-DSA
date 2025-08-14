package oops;

public class abstractClass {
    public static void main(String[] args) {
        dog d = new dog();
        d.sound(); // Dog barks
        d.eat();   // This animal eats food.

        lion l = new lion();
        l.sound(); // Lion roars
        l.eat();   // This animal eats food.
    }
}

abstract class animal {
    abstract void sound(); // Abstract method (does not have a body)

    void eat() { // Regular method
        System.out.println("This animal eats food.");
    }
}

class dog extends animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class lion extends animal{
    void sound(){
        System.out.println("Lion roars");
    }
}
/*
Abstract Class — What It Is

A class that can’t be instantiated (you can’t create objects of it directly).

It can have:

Abstract methods (no body, just declaration)

Normal methods (with body)

Declared using the keyword: abstract

Key Rules

Cannot create an object of an abstract class.

Must be extended by a subclass.

If a class has at least one abstract method, the class must be declared abstract.

Subclasses must implement all abstract methods unless they are also abstract.
 */
