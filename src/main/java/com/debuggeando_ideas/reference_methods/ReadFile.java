package com.debuggeando_ideas.reference_methods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFile {

    public static void main(String[] args) {
        Path file = Paths.get("src/main/resources/lambdas.txt");
        try(Stream<String> line = Files.lines(file).onClose(()-> System.out.println("Closing reader"))) {
            line.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
