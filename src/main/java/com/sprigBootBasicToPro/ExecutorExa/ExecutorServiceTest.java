package com.sprigBootBasicToPro.ExecutorExa;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceTest {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 1; i < 10; i++) {
            final int j = i;
            executor.submit(() -> {
                long result = factorial(j);
                System.out.println(result);

            });
        }
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        }catch (InterruptedException e){
            throw new InterruptedException();
        }

        System.out.println("TotalTime::" + (System.currentTimeMillis() - startTime));
    }

    private static long factorial(int n){

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        long result =1;

        for(int i = 1;i<=n; i++){
            result *=i;
        }
        return result;
    }
}
