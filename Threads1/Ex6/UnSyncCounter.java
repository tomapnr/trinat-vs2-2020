package Ex6;

public class UnSyncCounter {
    public static void main(String... args) {
        Counter counter = new Counter();
        for (int i = 0; i < 10; i++)
            new Worker(counter).start();
    }
}
