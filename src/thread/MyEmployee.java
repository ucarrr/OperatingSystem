package thread;


//İŞÇİ
public class MyEmployee extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Employee class started.. " + "Thread Name: " + Thread.currentThread().getName());
            Thread.sleep(10000);
            System.out.println("Employee class Finish.. " + "Thread Name: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
