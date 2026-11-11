package concurrency;

public class ProducerConsumerMonitorDemo {

    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Thread thread1 = new Thread(() -> {
            var count = 1;
            while (true) {
                buffer.produce(count++);
            }
        });
        Thread thread2 = new Thread(() -> {
            while (true) {
                buffer.consume();
            }
        });

        thread1.start();
        thread2.start();

    }

}

class Buffer {
    int data;
    boolean hasData;

    public synchronized void produce(int data) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } 

        this.data = data;
        this.hasData  = true;
        System.out.println("Produced: "+ data);
        notifyAll();
    }

       public synchronized void consume() {
        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } 

        this.hasData = false;
        System.out.println("Consumed: "+ this.data);
        notifyAll();
    }


}
