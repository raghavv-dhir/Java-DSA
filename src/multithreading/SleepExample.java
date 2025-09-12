package multithreading;

public class SleepExample {
    public static void main(String[] args) {
        new SleepDemo().start();
        new SleepDemo().start();
    }
}

class SleepDemo extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " - iteration " + i);
            try {
                Thread.sleep(1000); // pauses for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
