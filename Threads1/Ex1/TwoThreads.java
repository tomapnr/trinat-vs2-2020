package Ex1;

public class TwoThreads {
    public static void main(String[] args) {
        new SimpleThread("Thomas").start();
        new SimpleThread("Matthieu").start();
        System.out.println("main exits " + Thread.currentThread().toString());
    }
}
class SimpleThread extends Thread {
    public SimpleThread(String str) {
        super(str);
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+1 + " " + getName());
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
            }
        }
        System.out.println("DONE! " + getName());
    }
}
