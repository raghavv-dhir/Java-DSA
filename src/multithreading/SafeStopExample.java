package multithreading;

public class SafeStopExample {
    public static void main(String[] args) throws InterruptedException {
        SafeThread t = new SafeThread();
        t.start();

        Thread.sleep(2000);
        t.stopThread();
    }
}

class SafeThread extends Thread{
    private volatile boolean running = true;

    @Override
    public void run() {
        while (running){
            System.out.println("Thread running...");
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
        System.out.println("Thread stopped safely");
    }
    public void stopThread(){
        running = false;
    }
}
