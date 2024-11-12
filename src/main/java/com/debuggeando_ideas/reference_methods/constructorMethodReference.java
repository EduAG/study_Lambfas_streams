package com.debuggeando_ideas.reference_methods;

import lombok.ToString;

import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;

public class constructorMethodReference {
    public static void main(String[] args) {
        //Supplier<MyObject> newMyObject =  () -> new MyObject();
        Supplier<MyObject> newMyObject = MyObject::new;

        System.out.println(newMyObject.get());
    }
}

@ToString
class MyObject{
    private String str;
    private Integer num;

    MyObject(){
        this.str = UUID.randomUUID().toString();
        this.num = new Random().nextInt();
    }
}