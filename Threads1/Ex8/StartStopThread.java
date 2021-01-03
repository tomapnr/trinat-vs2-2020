package Ex8;

public class StartStopThread {

    public static void main(String[] args) {
        StopThread st = new StopThread();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {

        }

        System.out.println("Main task sleep over");
        st.stopThread();
        System.out.println("Main task ends now");
    }

}

class StopThread extends Thread {
    private boolean stopped = false;

    public StopThread() {
        start();
    }

    public synchronized void stopThread() {
        stopped = true;
    }

    public synchronized boolean isStopped() {
        return stopped;
    }

    public void run() {
        int i = 0;
        while (!isStopped()) {
            i++;
            System.out.println("Hello World (" + i + ")");
        }
        System.out.println("Thread is stopped");
    }

}
