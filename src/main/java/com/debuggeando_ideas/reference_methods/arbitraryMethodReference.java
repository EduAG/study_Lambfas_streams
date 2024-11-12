package com.debuggeando_ideas.reference_methods;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class arbitraryMethodReference {
    public static void main(String[] args) {
        //BiPredicate<String,String> equals = (s1,s2) -> s1.equals(s2);
        BiPredicate<String,String> equals = String::equals;
        boolean result = equals.test("1","1");
        System.out.println(result);

        Predicate<String> simplePRedicate = String::isEmpty;
        boolean predicate = simplePRedicate.test("");
        System.out.println(predicate);

    }
}
