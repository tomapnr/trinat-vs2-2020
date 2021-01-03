package Ex7;

public class Worker extends Thread {
    Counter counter;
    Worker(Counter counter) {
        this.counter = counter;
    }
    public void run() {
        System.out.println("Thread " + this.getName() + " started!");
        while (true) {
            for (int i = 0; i <= Counter.LIMIT; i++)
                counter.up();
            for (int i = 0; i < Counter.LIMIT; i++)
                counter.down();
        }
    }
}
