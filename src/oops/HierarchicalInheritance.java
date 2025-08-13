package oops;


public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog d = new Dog(); //Dog can use Animal's and own class methods
        d.eat();
        d.bark();

        Cat c = new Cat(); //Cat can use Animal's and own class methods
        c.eat();
        c.meow();
    }
}
class Animal{
    void eat(){
        System.out.println("Animal eats");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Cat meows");
    }
}

/*
Hierarchical Inheritance
Definition:
A type of inheritance where multiple subclasses inherit from the same superclass.

Purpose:
To allow different child classes to share common code from a single parent while also having their own unique features.
 */