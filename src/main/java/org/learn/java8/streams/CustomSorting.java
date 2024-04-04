package org.learn.java8.streams;

import org.learn.java8.data.Student;
import org.learn.java8.data.StudentData;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomSorting {

    public static void main(String[] args) {

        //List<String> strings = CustomSorting.customSorting();
        //System.out.println(strings);
        //customSorting().forEach(System.out::println);
        sortByGPA().forEach(System.out::println);
    }

    public static List<Student> customSorting() {

       return StudentData.getStudentData().stream()
               // .map(Student::getName)
                .sorted((i1,i2)->-i1.getName().compareTo(i2.getName()))
               //.sorted(Comparator.comparing(Student::getName).reversed())
                .collect(Collectors.toList());
    }

    public static List<Student> sortByGPA() {

        return StudentData.getStudentData().stream()
                //.sorted(Comparator.comparing(Student::getGpa))
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());

    }
}
