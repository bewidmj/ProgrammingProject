package concurrency;

public class ThreadMonitorWaitDemo {

    public static void main(String[] args) {

        FirstThreadWorker a = new FirstThreadWorker();
        SecondThreadWorker b = new SecondThreadWorker();

        a.start();
        a.start();
        b.start();
    }

    
}

class FirstThreadWorker extends Thread {

    public void run() {
        SecondThreadWorker b = new SecondThreadWorker();
        try {
            b.wait();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class SecondThreadWorker extends Thread {

    public void run () {
        FirstThreadWorker a = new FirstThreadWorker();
        try {
            a.wait();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

}

