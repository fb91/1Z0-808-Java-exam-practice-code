package concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ConcurrentBlockingQueue {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();
        queue.offer("Tomás");
        queue.offer("Domingo");
        queue.offer("Guadalupe");
        queue.offer("Paz");

        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.size() = " + queue.size());
        System.out.println("queue.contains(\"Domingo\") = " + queue.contains("Domingo"));
        System.out.println("queue.contains(\"Tomás\") = " + queue.contains("Tomás"));
        System.out.println("queue = " + queue);

        // Concurrent queues:
        try {
            queue.offer("Bianchi", 200, TimeUnit.MILLISECONDS);
            queue.poll(300, TimeUnit.MILLISECONDS);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("queue = " + queue);
    }
}
