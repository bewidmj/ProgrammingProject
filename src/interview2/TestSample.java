package interview2;

public class TestSample {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        a.start();
        a.start();
        b.start();
    }

    
}

class A extends Thread {

    public void run() {
        B b = new B();
        try {
            b.wait();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class B extends  Thread {

    public void run () {
        A a = new A();
        try {
            a.wait();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

}



