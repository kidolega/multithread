package pl.dolega.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExample {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(ThreadExample::loop);
        executorService.submit(ThreadExample::loop);
//        executorService.submit(ThreadExample::loop);
//        executorService.shutdownNow();
        executorService.shutdown();

    }

    private static void loop() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
