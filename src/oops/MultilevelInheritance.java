package oops;

public class MultilevelInheritance {
    public static void main(String[] args) {
        Child2 obj = new Child2();
        obj.methodGrandparent(); // from Grandparent
        obj.methodParent();      // from Parent
        obj.methodChild();       // from Child
    }
}
class Grandparent {
    void methodGrandparent() {
        System.out.println("This is the Grandparent class");
    }
}

class Parent2 extends Grandparent {
    void methodParent() {
        System.out.println("This is the Parent class");
    }
}

class Child2 extends Parent2 {
    void methodChild() {
        System.out.println("This is the Child class");
    }
}

/*
Multilevel Inheritance
Definition:
A type of inheritance where a class inherits from another class, and then another class inherits from that derived class.
(Grandparent → Parent → Child chain)

Purpose:
To build classes in layers, reusing features from multiple ancestor levels.
 */