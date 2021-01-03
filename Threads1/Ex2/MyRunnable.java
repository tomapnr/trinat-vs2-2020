package Ex2;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        los();
    }
    private void los() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tuNochMehr();
    }
    private void tuNochMehr() {
        System.out.println("On top of the Stack");
    }
}
