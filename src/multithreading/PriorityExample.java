package multithreading;

public class PriorityExample {
    public static void main(String[] args) {
        MyThread5 t1 = new MyThread5();
        MyThread5 t2 = new MyThread5();
        MyThread5 t3 = new MyThread5();

        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.NORM_PRIORITY); // 5
        t3.setPriority(Thread.MAX_PRIORITY); // 10

        t1.start();
        t2.start();
        t3.start();
    }
}
/*
Note: The order is not guaranteed. Even if Thread-3 has the highest priority, it may not run first — depends on the OS thread scheduler.
 */
class MyThread5 extends Thread {
    public void run() {
        System.out.println(getName() + " running with priority " + getPriority());
    }
}
