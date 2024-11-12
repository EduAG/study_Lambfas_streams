package com.debuggeando_ideas.streams;

import java.util.*;
import java.util.stream.Collectors;
import  java.util.Arrays;

public class Listas {

    public static void main(String[] args) {

        /*List<String> li = Arrays.asList("test","a","c","h");
        char[] letters = {'d','c','a','q'};

        List<String> l = new ArrayList<>();

        Arrays.binarySearch(letters,'a');
        Arrays.sort(letters);
        Collections.reverse(li);
        System.out.println(li);
        System.out.println(letters);
        //Arrays.sort(li);

*/
        //***************
        class Student {
            int roll;
            String name;
            String grade;
            long totalMarks;

            public Student(int roll, String name, String grade, long totalMarks) {
                this.roll = roll;
                this.name = name;
                this.grade = grade;
                this.totalMarks = totalMarks;
            }

            @Override
            public String toString() {
                return "Student [Roll=" + roll + ", Name=" + name + ", Grade=" + grade + ", Total Marks=" + totalMarks + "]";
            }
        }

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "John Doe", "A", 550));
        students.add(new Student(2, "Jane Smith", "B", 500));
        students.add(new Student(3, "James Brown", "A", 470));
        students.add(new Student(4, "Emily Davis", "C", 520));
        students.add(new Student(5, "Michael Johnson", "B", 390));
        students.add(new Student(6, "Sarah Wilson", "A", 480));
        students.add(new Student(7, "David Miller", "C", 310));
        students.add(new Student(8, "Sophia Anderson", "B", 420));
        students.add(new Student(9, "Liam Taylor", "A", 460));
        students.add(new Student(10, "Emma Thomas", "B", 430));
        students.add(new Student(11, "Olivia Harris", "A", 490));
        students.add(new Student(12, "Noah Moore", "C", 300));
        students.add(new Student(13, "William Clark", "B", 410));
        students.add(new Student(14, "Isabella Lewis", "A", 470));
        students.add(new Student(15, "Lucas Walker", "C", 320));
        students.add(new Student(16, "Mia Young", "B", 400));
        students.add(new Student(17, "Benjamin Hall", "A", 580));
        students.add(new Student(18, "Charlotte King", "C", 330));
        students.add(new Student(19, "Elijah Wright", "B", 440));
        students.add(new Student(20, "Amelia Scott", "A", 495));

        //students.stream().forEach(System.out::println);
//        List<Student> filteredStudents = students.stream()
//                .filter(s -> s.name.startsWith("J") || s.name.startsWith("E"))
//                .filter(s -> s.totalMarks > 500)
//                .collect(Collectors.toList());

        List<Student> filteredStudents = students.stream().sorted(Comparator.comparingLong(a -> a.totalMarks)).collect(Collectors.toList());

        filteredStudents.forEach(System.out::println);

        System.out.println("---------------------");

        Collections.reverse(filteredStudents);

        filteredStudents.forEach(System.out::println);

    }
}
