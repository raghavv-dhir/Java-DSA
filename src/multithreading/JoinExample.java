package multithreading;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        JoinDemo t1 = new JoinDemo();
        t1.setName("Thread 1");
        JoinDemo t2 = new JoinDemo();
        t2.setName("Thread 2");

        t1.start();
        t1.join(); // main waits until t1 finishes

        t2.start(); // only starts after t1 completes
    }
}

class JoinDemo extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " - iteration " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
