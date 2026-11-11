package concurrency;

import concurrency.Item;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerProblem {
    public static void main(String[] args) throws  Exception {


        BlockingQueue blockingQueue = new ArrayBlockingQueue(10);

        Runnable producer = new Runnable() {
            @Override
            public void run() {
                while(true) {
                    try {
                        blockingQueue.put(Item.createItem());
                        System.out.println("Producer Dumped Data");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        new Thread(producer).start();
        new Thread(producer).start();

        Runnable consumer = new Runnable() {
            @Override
            public void run() {
                while(true) {
                    try {
                        blockingQueue.take();
                        System.out.println("Consumer took Data");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        new Thread(consumer).start();
        new Thread(consumer).start();

        Thread.sleep(1000);

    }
}
