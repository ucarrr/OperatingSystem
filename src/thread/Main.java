package thread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program start. " + Thread.currentThread().getName());

//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        MyEmployee myEmployee = new MyEmployee();
        myEmployee.setName("Employee Class");

        //myEmployee.run();
        myEmployee.start();

        EmployeeRunnable employeeRunnable = new EmployeeRunnable();
        Thread threadRunnable = new Thread(employeeRunnable);
        threadRunnable.setName("employeeRunnable");
        threadRunnable.start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Runnable inner class started.. " + "Thread Name: " + Thread.currentThread().getName());
                    Thread.sleep(5000);
                    System.out.println("Runnable inner class Finish.. " + "Thread Name: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


        System.out.println("Program Finish..");
    }
}
