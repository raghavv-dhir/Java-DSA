package oops;

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal2 a;
        a = new Dog2();
        a.sound();
        a = new Cat2();
        a.sound();
    }
}
class Animal2{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog2 extends Animal2{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat2 extends Animal2{
    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}

/*
Runtime Polymorphism in Java
Also called Dynamic Polymorphism or Late Binding.

Definition
A type of polymorphism where the method call is resolved at runtime rather than compile time.
Achieved through method overriding.

Key Points
Binding (deciding which method to call) happens while the program is running.

Requires inheritance.

Requires method overriding.

Accessed via parent class reference pointing to child class object.

Slower than compile-time polymorphism because of runtime decision-making.
 */
