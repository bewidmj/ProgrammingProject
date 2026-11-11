package concurrency;

public class ProducerConsumer {

    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        buffer.produce(20);
        System.out.println(buffer.consume());
    }

}

class SharedBuffer {

    private int item;
    private boolean hasItem = false;

    public synchronized void produce(int value) {

        while (hasItem) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.item = value;
        this.hasItem = true;
        notify();
    }

    public synchronized int consume() {
        while(!hasItem) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int value = this.item;
        this.hasItem = false;
        notify();
        return value;
    }
}
