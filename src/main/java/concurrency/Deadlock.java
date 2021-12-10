package concurrency;

public class Deadlock {
    public static void run() {
        final String resource1 = "I'm resource 1";
        final String resource2 = "I'm resource 2";

        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread1 has a lock on resource1");
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (resource2) {
                    System.out.println("Thread1 has lock on resource2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            // Solution: access first resource1, it's synchronized so 1 thread at time will access it.
            synchronized (resource2) {
                System.out.println("Thread2 has a lock on resource2");
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (resource1) {
                    System.out.println("Thread2 has lock on resource1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }

    public static void main(String[] args) {
        run();
    }
}
