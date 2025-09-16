package multithreading;

public class StartThreadExample2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new My_Runnable());
        t1.setName("Raghav's Thread");
        t1.start();
    }
}

class My_Runnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is running...");
    }
}
