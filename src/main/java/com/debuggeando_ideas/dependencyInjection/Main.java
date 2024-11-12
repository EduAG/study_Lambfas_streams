package com.debuggeando_ideas.dependencyInjection;

public class Main {
    public static void main(String[] args) {
        Coche c = new Coche(new Gas(), "Mercedes");

        System.out.println(c.getModelo());
        c.start();
    }
}
