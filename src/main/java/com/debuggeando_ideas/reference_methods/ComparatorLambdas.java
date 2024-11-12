package com.debuggeando_ideas.reference_methods;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class ComparatorLambdas {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,3,9,7,6,1,4,2,8);
        numbers.sort((a,b) -> a-b);
        System.out.println(numbers);

        List<String> names = Arrays.asList("Max","Alex","opal");
        names.sort(String::compareTo);
        names.sort(Comparator.reverseOrder());
        System.out.println(names);

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Eduardo", 28));
        personas.add(new Persona("Frank", 22));
        personas.add(new Persona("Alex", 16));
        personas.add(new Persona("Zandy", 15));

        //personas.sort(Comparator.comparingInt(Persona::getAge).thenComparing(Persona::getName));
        personas.sort(Comparator.comparing(Persona::getName));
        System.out.println(personas);


        A.num = 20;
        System.out.println(B.num);

    }
}

@Data
@AllArgsConstructor
class Persona{
    private String name;
    private Integer age;
}

class A{
    static int num = 10;
}

class B extends A{}
class C extends A{}