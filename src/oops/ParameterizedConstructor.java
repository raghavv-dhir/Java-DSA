package oops;

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Car r1 = new Car("Red",120);
        Car r2 = new Car("Blue", 150);
        r1.show();
        r2.show();
    }
}
class Car{
    String color;
    int speed;

    Car(String c, int s){
        color = c;
        speed = s;
    }
    void show(){
        System.out.println("Color: "+color+", Speed: "+speed);
    }
}

/*
Parameterized Constructor in Java
Definition: A constructor that takes arguments (parameters) to initialize an object with specific values during creation.

Purpose:

To set object properties at the time of creation instead of using setters later.

Gives more control over object initialization.

Key Points
Has parameters inside parentheses.

Same name as the class.

No return type (not even void).

If you create a parameterized constructor, Java won’t give you a default constructor automatically — you must define it if needed.
 */
