package oops;

public class staticBlock {
    static int count;

    //static block
    static { //Executes even before main method(doesn't depend upon object creation)
        System.out.println("Static Block executed");
        count = 10;
    }
    public static void main(String[] args) {
        System.out.println("Main method executed");
        System.out.println("Count: "+count);
    }
}

/*
Static Block
Definition: A block of code inside a class, marked with the static keyword, that runs only once when the class is loaded into memory.

Purpose:

To initialize static variables.

To run setup code before any object is created or any static method is called.

Key Points
Executes before the main method (when the class is first loaded by the JVM).

Runs only once per class loader.

Can be multiple static blocks; they run in the order they appear.

No need to create an object for it to run.
 */
