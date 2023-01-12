package thread;

public class ThreadTypes {
    public static void main(String[] args) {
        MyThreads t1 = new MyThreads("USer Thread", ThreadColor.Green,5);
        t1.start();

        MyThreads t2 = new MyThreads("Daemon Thread", ThreadColor.Blue,20);
        t2.setDaemon(true);
        t2.start();

    }
}

class MyThreads extends Thread {

    private String color;
    private int sleepTime;

    public MyThreads(String name, String color, int sleepTime) {
        super(name);
        this.color = color;
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        System.out.println(color + "10 Seconds Threads Start  " + "Thread Name: " + Thread.currentThread().getName());
        try {

            Thread.sleep(sleepTime * 1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(color + "10 Seconds Threads finish " + "Thread Name: " + Thread.currentThread().getName());
    }
}
