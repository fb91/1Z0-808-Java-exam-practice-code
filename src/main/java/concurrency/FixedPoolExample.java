package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FixedPoolExample {
    private static ExecutorService executorService = Executors.newFixedThreadPool(25);

    public static Future<Double> getRandom(int i) {
        return executorService.submit(() -> {
            Thread.sleep((int)(Math.random() * 1500));
            System.out.println(i + " Thread id: " + Thread.currentThread().getId());
            return Math.random();
        });
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            getRandom(i);
        }
        executorService.shutdown();
    }
}
