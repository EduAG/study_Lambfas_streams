package com.debuggeando_ideas.designPatterns;

public class main {

    public static void main(String[] args) {
        EjemploObservable observable = new EjemploObservable();
        observable.addObserver(new Ejemp1Observer());
        observable.addObserver(new Ejemp2Observer());

        observable.notifyObserver();
    }

}
