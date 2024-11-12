package com.debuggeando_ideas.util_function;

import java.util.function.Function;

public class ExamFunction1 {

    static Function<Integer, Integer> multiply = n->n*10;
    static Function<Integer, Integer> sumar = n -> n+10;
    static Function<Integer, Integer> addThenMultiply = multiply.andThen(sumar);
    static Function <Integer, Integer> composeMultiply = multiply.compose(sumar);

    public static void main(String[] args) {
        System.out.println(multiply.apply(5));
        System.out.println(sumar.apply(5));
        System.out.println(addThenMultiply.apply(6));
        System.out.println(composeMultiply.apply(6));
    }
}
