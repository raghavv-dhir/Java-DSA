package multithreading;

public class IsAliveExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread4 t1 = new MyThread4();

        System.out.println("Before start: " + t1.isAlive()); // false

        t1.start();
        System.out.println("After start: " + t1.isAlive());  // true (likely)

        Thread.sleep(1500); // wait for t1 to finish
        System.out.println("After completion: " + t1.isAlive()); // false
    }
}

class MyThread4 extends Thread {
    public void run() {
        System.out.println(getName() + " is running...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        System.out.println(getName() + " finished.");
    }
}
