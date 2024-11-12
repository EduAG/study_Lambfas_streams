package com.debuggeando_ideas.ReflectionUsage;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Persona {

    private String name;

    private int edad;

    public Persona(){

    }

    public Persona(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    private void hello(){
        System.out.println("Private method hello");
    }

    static void helloStatic(){
        String a = "Hello static";
        System.out.println(a);
    }

    // Static variable
    static int staticValue = 10;

    // Instance variable
    int instanceValue = 20;

    // Static method to change the static variable
    static void changeStaticValue(int newValue) {
        staticValue = newValue;  // This is allowed
    }

    // Static method to try changing the instance variable (not allowed)
    static void changeInstanceValue(int newValue) {
        // instanceValue = newValue;  // This would cause an error
        System.out.println("Cannot change instance variables from static methods!");
    }

    // Non-static method to change the instance variable
    void changeInstanceValueNonStatic(int newValue) {
        instanceValue = newValue;  // This is allowed
    }
}
