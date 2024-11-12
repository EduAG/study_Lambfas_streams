package com.debuggeando_ideas.dependencyInjection;

public class Gas implements Engine{

    @Override
    public void Start() {
        System.out.println("Start Gas engine");
    }
}
