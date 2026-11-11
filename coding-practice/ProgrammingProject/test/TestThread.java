package test;

public class TestThread {
    public static void main(String[] args) {

        var obj = new EvenOddThread(10);
        Thread thread = new Thread( ()-> obj.printOdd());
        Thread thread2 = new Thread(() -> obj.printEven());
        
        thread.start();
        thread2.start();
    }
    
}

class EvenOddThread {
    private int limit;
    private int count = 1;
    EvenOddThread(int limit) {
        this.limit = limit;
    }

    public synchronized void printOdd() {
         while (count <= limit) {
            while (count % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (count <= limit) {
                System.out.println("Odd: "+ count++);
                notify();
            }

        }
    }

      public synchronized void printEven() {
        while (count <= limit) {
            while (count % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }  
            if (count <= limit) {
                System.out.println("Even: "+ count++);
                notify();            
            }
        }
    }
}
