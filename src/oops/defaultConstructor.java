package oops;

public class defaultConstructor {
    public static void main(String[] args) {
        A r = new A();
        r.show();
    }
}
class A{
    int a;
    String b;

//    A(){  //Default constructor automatically present
//        a = 10;
//        b = "Manav";
//    }

    void show(){
        System.out.println(a+" "+b);
    }
}

/*
Default Constructor in Java
Definition: A constructor automatically provided by Java when you don’t explicitly write any constructor in a class.

Purpose:

Initializes the object with default values (0, null, false, etc.).

Allows object creation without arguments.

Key Points
If you don’t write any constructor, Java automatically creates one for you.

The default constructor:

Has no parameters.

Has the same name as the class.

Has no return type (not even void).

Once you define any constructor (parameterized or not), Java will not create the default one automatically.
 */
