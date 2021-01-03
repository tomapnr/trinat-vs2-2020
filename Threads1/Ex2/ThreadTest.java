package Ex2;

public class ThreadTest {
    public static void main(String[] args) {
        Runnable threadJob = new MyRunnable();
        Thread meinThread = new Thread(threadJob);
        meinThread.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Back in main");
    }
}
