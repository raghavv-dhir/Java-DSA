package oops;

public class SimpleInheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display(); // inherited method from Parent
        obj.show(); // method from Child
    }
}

class Parent{
    void display(){
        System.out.println("This is Parent class");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("This is child class");
    }
}

/*
Simple Inheritance
Definition:
A type of inheritance where one subclass inherits from exactly one superclass.

Purpose:
To reuse code from the parent class and allow the child class to add or override functionality.
 */
