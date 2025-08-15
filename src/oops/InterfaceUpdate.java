package oops;

public class InterfaceUpdate {
    public static void main(String[] args) {
        car c = new car();
        c.start(); // Calls the start method from the vehicle interface
        c.stop();  // Calls the default stop method from the vehicle interface
        // The stop method is not overridden, so it uses the default implementation
        // from the vehicle interface.
        // If you want to override the stop method, you can do so in the car class
        // like this:
        // class car implements vehicle {
        //     public void start() {
        //         System.out.println("Car started.");
        //     }
        //     @Override
        //     public void stop() {
        //         System.out.println("Car stopped.");
        //     }
        // }
        // This will provide a custom implementation for the stop method in the car class.
    }
}

interface vehicle {
    void start(); //public abstract by default
    default void stop(){
        System.out.println("Default interface implementation of stop method.");
    }
}
class car implements vehicle {
    public void start() {
        System.out.println("Car started.");
    }
}