package com.debuggeando_ideas.dependencyInjection;

import lombok.Data;

@Data
public class Coche {

    private String modelo;
    private Engine engine;

    public Coche(Engine engine, String modelo){
        this.engine = engine;
        this.modelo = modelo;
    }

    public void start(){
        engine.Start();
    }

}


