package multithreading;

public class ThreadLifeCycleDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread3 t = new MyThread3();

        System.out.println("State after creation: " + t.getState()); // NEW

        t.start();
        System.out.println("State after start(): " + t.getState()); // RUNNABLE or RUNNING

        Thread.sleep(500);
        System.out.println("State while sleeping: " + t.getState()); // TIMED_WAITING

        t.join();
        System.out.println("State after completion: " + t.getState()); // TERMINATED
    }
}

class MyThread3 extends Thread {
    public void run() {
        try {
            System.out.println("Thread is running...");
            Thread.sleep(2000); // Timed Waiting
            System.out.println("Thread finished running.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
