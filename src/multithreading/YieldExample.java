package multithreading;

public class YieldExample {
    public static void main(String[] args) {
        YieldDemo t1 = new YieldDemo("Thread-1");
        YieldDemo t2 = new YieldDemo("Thread-2");

        t1.start();
        t2.start();
    }
}

class YieldDemo extends Thread {
    public YieldDemo(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - iteration " + i);
            Thread.yield(); // Hint scheduler
        }
    }
}
