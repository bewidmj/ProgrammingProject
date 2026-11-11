package new_prep;

public class EvenOdd {

    public static void main(String[] args) {

        Thread t1 = new T1();
        Thread t2 = new T2();

        t1.start();
        t2.start();
        
    }
    
}
class T1 extends Thread {

    public void run() {
        int i = 0;
        while(i % 2 == 0) {
            System.out.println(i);
            i++;
        }
    }
}

class T2 extends  Thread {

    public void run() {
        int i = 0;
        while(i % 2 != 0) {
            System.out.println(i);
            i++;
        }
    }

}
