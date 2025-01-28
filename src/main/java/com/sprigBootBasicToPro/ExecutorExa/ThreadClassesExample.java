package com.sprigBootBasicToPro.ExecutorExa;

public class ThreadClassesExample {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Thread[] threads = new Thread[9];
        for (int i=1;i<10;i++){
            final int j = i;
            threads[j-1] = new Thread(
                    () ->{
                        long result = factorial(j);
                        System.out.println(result);
                    }
            );
            threads[j-1].start();

        }
        try{
            for(Thread thread:threads){
                thread.join();
            }

        }catch (InterruptedException e){
            throw new InterruptedException();

        }


        long endTime = System.currentTimeMillis();

        System.out.println("Total time in millis::::"+(endTime-startTime));

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
