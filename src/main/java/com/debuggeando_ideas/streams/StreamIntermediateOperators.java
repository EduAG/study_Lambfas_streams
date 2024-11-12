package com.debuggeando_ideas.streams;

import com.debuggeando_ideas.util.BasicVideogame;
import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Review;
import com.debuggeando_ideas.util.Videogame;

import javax.xml.crypto.Data;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntermediateOperators {

    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();
        takeWhileOperator(videogames);
    }

    static void distinctOperation(Stream<Videogame> stream){
        Stream<Videogame> r = stream.distinct();
        r.forEach(System.out::println);
    }

    static void limitOperation(Stream<Videogame> stream){
        //Optional<Videogame> r = stream.limit(2).min((a,b) -> a.getTotalSold().compareTo(b.getTotalSold()));
        //r.forEach(System.out::println);
        //System.out.println(r.get().getTotalSold() + " " + r.get().getName());
        List<Videogame> r = stream.limit(2).collect(Collectors.toList());
        r.forEach(System.out::println);
    }

    static void skipOperator(Stream<Videogame> stream){
        Stream<Videogame> r = stream.skip(15);
        r.forEach(System.out::println);
    }

    static void filterOperator(Stream<Videogame> stream){
        List<Videogame> basicVideoGames = stream
                .filter(Videogame::getIsDiscount)
                .filter(v -> v.getTotalSold() > 10)
                .collect(Collectors.toList());
        basicVideoGames.forEach(v -> System.out.println(v.getName() + " " + v.getIsDiscount() + " " + v.getTotalSold()));
    }

    static void mapOperator(Stream<Videogame> stream){
        List<BasicVideogame> basicVideoGames = stream
                .map(v -> {
                return BasicVideogame.builder()
                        .name(v.getName())
                        .price(v.getPrice())
                        .console(v.getConsole())
                        .build();
            }).collect(Collectors.toList());

        basicVideoGames.forEach(System.out::println);
        List<String> titles = basicVideoGames.stream().map(BasicVideogame::getName).collect(Collectors.toList());
        titles.forEach(System.out::println);
    }

    static void flatMapOperator(Stream<Videogame> stream){
        //var r
        List<Review> r = stream.flatMap(v -> v.getReviews().stream()).collect(Collectors.toList());
        System.out.println(r.size());
    }

    static void flatMapVSMap(Stream<Videogame> stream){
        //var r = stream.map(v -> v.getReviews().stream()).collect(Collectors.toList());
        //System.out.println(r.size());
        Long r = stream.flatMap(v -> v.getReviews().stream()).count();
        System.out.println(r);
    }

    static void peekOperator(Stream<Videogame> stream){
        /*
        Difference Between peek() and map()
        peek(): Used for side-effects like logging or inspecting elements. It doesn't modify or collect data from the stream.
        map(): Used to transform elements in the stream. You can return and collect the transformed elements.
        * */
        List<Videogame> r = stream.peek(v -> System.out.println(v.getName())).collect(Collectors.toList());
    }

    /*static void testingIntermediateMethods(Stream<Videogame> stream){
        var t = stream.map(Videogame::getConsole);
        Stream<String> names = Stream.of("John", "Alex", "Karen").filter(s -> s.startsWith("J"));
        Stream<String> data = Stream.of("Luis", "Eduardo", "Karen").sort()
        System.out.println(names);
        System.out.println(t);

        Stream<String> namess = Stream.of("John", "Jane", "Jack").filter(s -> s.startsWith("J"));
        // Intermediate operation, nothing happens yet.

        namess.forEach(System.out::println);
        // Terminal operation, now the stream is processed, and filtered elements are printed.

    }*/

    static void finalTestOperations(Stream<Videogame> stream){
        //Reduce
        /*var r = stream.map(Videogame::getTotalSold).reduce(Integer::sum);
        System.out.println(r.get());
        //limit
        Stream<Videogame> t2 = Database.videogames.stream();
        t2.map(Videogame::getName).limit(5).forEach(System.out::println);
        //System.out.println(r2);*/

        //Campechano1
        stream.forEach(System.out::println);
        System.out.println("----");
        Stream<Videogame> C1 = Database.videogames.stream();
        var r3 = C1.filter(v -> v.getPrice() > 20 && v.getIsDiscount()).limit(2).collect(Collectors.toList());
        r3.forEach(System.out::println);

    }

    static void sortOperator(Stream<Videogame> stream){
        Comparator<Videogame> multipleComparator = Comparator.comparing(Videogame::getName).thenComparing(Comparator.comparing(Videogame::getPrice)).thenComparing(Comparator.comparingInt(v -> v.getReviews().size()));
        //Comparator.comparingInt(v -> v.getReviews().size())
        List<Videogame> r = stream.sorted(multipleComparator).collect(Collectors.toList());
        r.forEach(System.out::println);
    }

    static void takeWhileOperator(Stream<Videogame> stream){
          var t = stream.filter(v -> v.getName().contains("Mario"));
        System.out.println(t);
//        List<Videogame> takeWhile = stream
//                .sorted(Comparator.comparing(Videogame::getName))
//                .takeWhile(v -> !v.getName().contains("Mario"))
//                .collect(Collectors.toList());
//        takeWhile.forEach(System.out::println);
    }
}
