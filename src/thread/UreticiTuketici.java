package thread;

public class UreticiTuketici {
    public static void main(String[] args) {
        OrtakAlan ortakAlan = new OrtakAlan();

        Uretici ureticiThread = new Uretici(ortakAlan);
        Tuketici tuketiciThread = new Tuketici(ortakAlan);

        ureticiThread.start();
        tuketiciThread.start();

    }
}

class OrtakAlan {
    private int veri;

    public int veriAl() {
        return veri;
    }

    public void veriYaz(int v) {
        this.veri = v;
    }


}

class Uretici extends Thread {

    private OrtakAlan ortakAlan;

    public Uretici(OrtakAlan ortakAlan) {
        this.ortakAlan = ortakAlan;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            ortakAlan.veriYaz(i);
            System.out.println(ThreadColor.Magenta + "Uretici thread konulan veri:" + i);
            try {
                sleep((int) Math.random() * 3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Tuketici extends Thread {
    private OrtakAlan ortakAlan;

    public Tuketici(OrtakAlan ortakAlan) {
        this.ortakAlan = ortakAlan;
    }

    @Override
    public void run() {
        int okunandeger = 0;
        for (int i = 1; i <= 10; i++) {
            okunandeger = ortakAlan.veriAl();
            System.out.println(ThreadColor.Blue + "Tuketici thread konulan veri:" + okunandeger);
            try {
                sleep((int) Math.random() * 3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
