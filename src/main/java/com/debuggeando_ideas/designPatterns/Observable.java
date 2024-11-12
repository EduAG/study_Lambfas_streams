package com.debuggeando_ideas.designPatterns;

public interface Observable {

    void addObserver(Observer o);

    void deleteObserver(Observer o);

    void notifyObserver();
}
