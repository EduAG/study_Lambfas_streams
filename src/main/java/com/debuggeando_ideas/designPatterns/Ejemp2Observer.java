package com.debuggeando_ideas.designPatterns;

public class Ejemp2Observer implements Observer{
    @Override
    public void update() {
        System.out.println("Se ha llamado a Ejemplo 2");
    }
}