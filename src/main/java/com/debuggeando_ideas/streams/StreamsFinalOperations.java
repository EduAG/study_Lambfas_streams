package com.debuggeando_ideas.streams;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsFinalOperations {

    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();

        minOperator(videogames);
    }

    static void countOperator(Stream<Videogame> stream){

        System.out.println(stream.hashCode());
        System.out.println(stream.count());
    }

    static void anyMatch(Stream<Videogame> streamm){
        System.out.println(streamm.hashCode());
        //System.out.println(stream.anyMatch(v -> v.getTotalSold() > 1));
    }

    static void allMatchOperator(Stream<Videogame> stream){
        System.out.println(stream.allMatch(v -> v.getTotalSold() > 100));
    }

    static void noneMatchOperation(Stream<Videogame> stream){
        System.out.println(stream.noneMatch(v -> v.getReviews().isEmpty()));
    }

    static void findAny(Stream<Videogame> stream){
        Optional<Videogame> r = stream.findAny();
        System.out.println(r);
    }

    static void findFist(Stream<Videogame> stream){
        System.out.println(stream.findFirst());
    }

    static void totalGetDisccount(Stream<Videogame> stream){
        Optional<Integer> r = stream
                .filter(Videogame::getIsDiscount)
                .map(Videogame::getTotalSold)
                .reduce(Integer::sum);
        //.reduce((a,b) -> a+b);
            System.out.println(r.get());
    }

    static void maxOperator(Stream<Videogame> stream){
        Optional<Videogame> r = stream.max(Comparator.comparingInt(Videogame::getTotalSold));
        System.out.println(r);
    }

    static void minOperator(Stream<Videogame> stream){
        Optional<Videogame> r = stream.min(Comparator.comparingInt(Videogame::getTotalSold));
        System.out.println(r);
    }
}

