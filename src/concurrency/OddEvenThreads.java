package concurrency;

public class OddEvenThreads {

    public static void main(String[] args) {
        Printer pr = new Printer(10);

        Thread t1 = new Thread(() -> {
            pr.printEven();
        }, "EvenThread");

        Thread t2 = new Thread(() -> {
            pr.printOdd();
        }, "OddThread");

        t1.start();
        t2.start();
    }
    
}
class Printer {

    public int max;

    public int counter = 1;

    public Printer(int max) {
        this.max = max;
    }

    public synchronized void printOdd() {
        while(counter <= max) {
            while(counter <= max && counter % 2 == 0) {
                try {
                    wait();
                } catch(InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            if (counter <= max) {
                System.out.println(counter + " : " + Thread.currentThread().getName());
                counter ++;
                notify();
            }
        }

    }

    public synchronized void printEven() {
        while(counter <= max) { 
            while(counter <= max && counter % 2 != 0) {
                try {
                    wait();
                } catch(InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            if (counter <= max) {
                System.out.println(counter + " : " + Thread.currentThread().getName());
                counter ++;
                notify();
            }
        }
    }

}
