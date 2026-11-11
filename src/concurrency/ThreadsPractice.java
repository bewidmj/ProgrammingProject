package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadsPractice {

    public static void main(String[] args) throws InterruptedException{

        AtomicInteger counter = new AtomicInteger();
        
        Thread t1 = new Thread(()-> {
            int i = 0;
                while(i < 100000) {
                    counter.incrementAndGet();
                    i++;
                }
            }, "Thread-A");

        Thread t2 = new Thread(()-> {
            int i = 0;
                while(i < 100000) {
                    counter.incrementAndGet();
                    i++;
                }
            }, "Thread-B");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: "+ counter.get());

    }
}
