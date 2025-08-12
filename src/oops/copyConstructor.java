package oops;

public class copyConstructor {
    public static void main(String[] args) {
        Car1 r1 = new Car1("Red",150);
        Car1 r2 = new Car1(r1);
        r1.show();
        r2.show();
    }
}
class Car1{
    String color;
    int speed;

    Car1(String c, int s){
        color = c;
        speed = s;
    }

    Car1(Car1 other){
        color = other.color;
        speed = other.speed;
    }
    void show(){
        System.out.println("Color: " + color + ", Speed: " + speed);
    }
}

/*
Copy Constructor
Definition: A constructor that creates a new object by copying the values of another object of the same class.

Purpose:

To duplicate an object’s state.

Useful when you want a separate copy but with the same initial values.

Key Points
Java does not provide a built-in copy constructor like C++.

You write it manually.

The parameter is an object of the same class.

Copies field values from the existing object.
 */