package concurrency;

import java.util.concurrent.*;

public class SchedulePoolExample {
    private static ScheduledExecutorService executorService = Executors.newScheduledThreadPool(50);

    public static void main(String[] args) throws InterruptedException {
       executorService.scheduleWithFixedDelay(
               () ->
               {
                   System.out.println(1 + " Thread id: " + Thread.currentThread().getId());
                   try {
                       Thread.sleep(200);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               },
               2000,
               100,
               TimeUnit.MILLISECONDS
       );
        executorService.awaitTermination(100, TimeUnit.MILLISECONDS);
    }
}
