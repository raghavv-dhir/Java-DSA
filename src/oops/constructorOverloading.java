package oops;

public class constructorOverloading {
    public static void main(String[] args) {
        Car2 r1 = new Car2();
        Car2 r2 = new Car2("Red",150);
        Car2 r3 = new Car2(r2);
        r1.disp();
        r2.disp();
        r3.disp();
    }
}

class Car2 {
    int speed;
    String color;

    Car2(){
        speed = 100;
        color = "White";
    }
    Car2(String c, int s){
        color = c;
        speed = s;
    }
    Car2(Car2 other){
        speed = other.speed;
        color = other.color;
    }
    void disp(){
        System.out.println("Speed: "+speed+", Color: "+color);
    }
}

/*
Constructor Overloading
Definition: Having multiple constructors in the same class with different parameter lists (number, type, or order of parameters).

Purpose:

To allow different ways of creating an object.

Improves flexibility in object initialization.

Key Rules
Must have different parameter lists (cannot differ only by return type — constructors don’t even have one).

Can mix default, parameterized, and copy constructors in the same class.

Uses compile-time polymorphism (method overloading concept).
 */
