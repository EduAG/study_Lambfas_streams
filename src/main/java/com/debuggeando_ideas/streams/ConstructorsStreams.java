package com.debuggeando_ideas.streams;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;
import com.sun.source.doctree.SeeTree;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class ConstructorsStreams {

    public static void main(String[] args) {
        Stream<Videogame> myStream = Database.videogames.stream();
        myStream.forEach(System.out::println);

        System.out.println("------");

        int[] myArray = {1,2,3,4,5,6,7,8,9};

        Arrays.stream(myArray).forEach(System.out::println);

        System.out.println(Stream.of("Hola", "Mundo").collect(Collectors.joining(" ")));
        Stream.of("Hola", "Mundo").forEach(System.out::println);

        DoubleStream myDoubleStream = DoubleStream.of(2.0,2.1,2.3,3.33);
        myDoubleStream.forEach(System.out::println);
    }
}
