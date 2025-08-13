package oops;

public class thisKeyword {
    public static void main(String[] args) {
        P obj = new P(100);
    }
}
class P{
    int x;

    P(){
        System.out.println("Default constructor called");
    }

    P(int x){
        this();
        this.x = x;
        System.out.println(x);
    }
}

/*
this Keyword
Definition:
In Java, this is a reference variable that refers to the current object (the object whose method or constructor is being executed).

Purpose:

Differentiate between instance variables and parameters when they have the same name.

Call other constructors in the same class.

Pass the current object as a parameter.

Return the current object from a method.
 */
