package multithreading;

public class ThreadExample {
    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3();
        MyThread3 t2 = new MyThread3();

        t1.start(); // start() calls run() in a new thread
        t2.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        // Task for the thread
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
        }
    }
}
