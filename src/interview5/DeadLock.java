package interview5;

import java.util.concurrent.CountDownLatch;

public class DeadLock {

    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(2);

        Object a = new Object();
        Object b = new Object();

        Thread t1 = new Thread(() -> {
            synchronized(a) {
                System.out.println("T1 Acuiring lock on a");

                try {
                    latch.countDown();
                    latch.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                synchronized(b) {
                    System.out.println("T1 Acuiring lock on b");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized(b) {
                System.out.println("T2 Acuiring lock on b");

                try {
                    latch.countDown();
                    latch.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                synchronized(a) {
                    System.out.println("T2 ßAcuiring lock on a");
                }
            }
        });

        t1.start();
        t2.start();
        
    }
}
