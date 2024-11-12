package com.debuggeando_ideas.reference_methods;

import java.util.concurrent.*;

public class ConcurrenceLambdasSSSSSSSS {

    static Runnable printSum = () -> {
        long r = 0;

        System.out.println(Thread.currentThread().getName());
        for (int i=0; i<1000000; i++){
            r += i;
        }
        System.out.println("Total : " + r);
    };

    static Callable<Long> getSum = () -> {
        long r = 0;

        System.out.println(Thread.currentThread().getName());
        for (int i=0; i<1000000; i++){
            r += i;
        }
        System.out.println("Total : " + r);

        return r;
    };

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var exec = Executors.newSingleThreadExecutor();
        exec.submit(printSum);

        var result = exec.submit(getSum);
        System.out.println("Result ; " +  result.get());
        exec.shutdown();
    }
}
