public class StartThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("Raghav's Thread");
        t1.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(getName()+" is running...");
    }
}
