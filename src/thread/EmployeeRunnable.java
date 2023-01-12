package thread;

public class EmployeeRunnable implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("EmployeeRunnable class started.. " + "Thread Name: " + Thread.currentThread().getName());
            Thread.sleep(10000);
            System.out.println("EmployeeRunnable class Finish.. " + "Thread Name: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
