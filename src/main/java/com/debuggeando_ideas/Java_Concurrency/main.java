package com.debuggeando_ideas.Java_Concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
    public static void main(String[] args) {
        excecutorInvoke();
        executorServiceInvoke();
    }

    public static void excecutorInvoke(){
        Executor executor = new Caller();
        executor.execute(() ->{
            System.out.println("Executor example");
        });
    }

    public static void executorServiceInvoke(){
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(() ->{
            System.out.println("Executor service example");
        });
    }
}
