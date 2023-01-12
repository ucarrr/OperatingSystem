package procuderconsumer;

public class Main {

    int mutex = 1;
    int full = 0;
    int empty = 10;
    int x = 0;
    int counter = 0;

    public static void main(String[] args) {
        int a=1;
        int b=2;
        System.out.println(a++);

    }
    public static void producer(){
        while(true){

        }

    }
    public static void consumer(){

    }
    public void wait(int S){
        while(S<=0);   // busy waiting
        S--;
    }
    public void signal(int S){
        S++;
    }

}
