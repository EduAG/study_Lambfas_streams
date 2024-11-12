package com.debuggeando_ideas.ReflectionUsage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class testReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> cls = Class.forName("com.debuggeando_ideas.ReflectionUsage.Persona");
        for(Method methods: cls.getDeclaredMethods()){
            System.out.println(methods);
        }

        Method privateMethod = cls.getDeclaredMethod("hello");
        privateMethod.setAccessible(true);

        Constructor<?> constructor = cls.getDeclaredConstructor(String.class, int.class);
        Object newInstance = constructor.newInstance("hello", 1);

        privateMethod.invoke(newInstance);

        Persona.helloStatic();

        Persona p = new Persona();

        p.helloStatic();


    }


}


