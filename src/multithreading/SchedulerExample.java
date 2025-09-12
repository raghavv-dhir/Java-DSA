package multithreading;

public class SchedulerExample {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2("Thread-1");
        MyThread2 t2 = new MyThread2("Thread-2");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}

/*
You might expect Thread-2 to always finish first (higher priority),
but in reality, the output order may vary depending on OS + JVM scheduling.
 */

class MyThread2 extends Thread {
    public MyThread2(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - iteration " + i);
        }
    }
}
