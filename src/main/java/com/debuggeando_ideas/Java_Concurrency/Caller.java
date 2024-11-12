package com.debuggeando_ideas.Java_Concurrency;

import java.util.concurrent.Executor;

public class Caller implements Executor {
    @Override
    public void execute(Runnable command) {
        command.run();
    }
}
