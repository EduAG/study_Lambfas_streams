package com.debuggeando_ideas.util_function;

import lombok.ToString;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Function;

public class ExampleFunction2 {
    static Function<Person, ByteArrayOutputStream> serializer = p->{
        ByteArrayOutputStream inMemoryBytes = new ByteArrayOutputStream();
        try(ObjectOutputStream outputStream = new ObjectOutputStream(inMemoryBytes)){
            outputStream.writeObject(p);
            outputStream.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        return inMemoryBytes;
    };

    static Function<ByteArrayInputStream, Person> deserealizer = bais ->{

        try(ObjectInputStream objectInputStream = new ObjectInputStream(bais)){
            return (Person) objectInputStream.readObject();
        } catch (IOException |ClassNotFoundException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    };

    public static void main(String[] args) {

       ByteArrayOutputStream objectSerialized = serializer.apply(new Person("Edd", 27));
       System.out.println(Arrays.toString(objectSerialized.toByteArray()));

       Person objectDeserializer = deserealizer.apply(new ByteArrayInputStream(objectSerialized.toByteArray()));
        System.out.println(objectDeserializer);
    }
}

@ToString
class Person implements Serializable {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}