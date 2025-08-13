package oops;

public class superKeyword {
    public static void main(String[] args) {
        Y obj = new Y();
        obj.show();
    }
}
class X{
    int a = 10;
    void show(){
        System.out.println("Parent class method");
    }
}
class Y extends X{
    int a = 20;
    void show(){

        super.show(); //Parent class method

        System.out.println(a); //Priority will be given to this class variable only (without using "super")

        System.out.println(super.a); //now it will use parent class variable
    }
}

/*
super Keyword in Java
Definition:
super is a reference variable in Java that refers to the immediate parent class object.

Purpose:

Access parent class variables when they are hidden by child variables.

Call parent class methods when overridden in the child.

Invoke parent class constructors.
 */
