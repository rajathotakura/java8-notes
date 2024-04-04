package org.learn.java8.optional;

import org.learn.java8.data.Student;
import org.learn.java8.data.StudentData;

import java.util.Optional;

public class OptionalOrElseExample {
    //orElse()
    public static String orElseOptional() {
        //Optional<Student> studentOptional = Optional.ofNullable(StudentData.getStudentData().get(0));
        Optional<Student> studentOptional = Optional.ofNullable(null);
        return studentOptional.map(Student::getName).orElse("default value");
    }
    //orElseGet()
    public static String orElseGetOptional() {
        //Optional<Student> stuOptional = Optional.ofNullable(StudentData.getStudentData().get(1));
        Optional<Student> stuOptional = Optional.ofNullable(null);
        return stuOptional.map(Student::getName).orElseGet(() -> "No data found");
    }
    //orElseThrow()
    public static String orElseThrowOptional() {
        //Optional<Student> stOptional = Optional.ofNullable(StudentData.getStudentData().get(1));
        Optional<Student> stOptional = Optional.ofNullable(null);
        return stOptional.map(Student::getName).orElseThrow(()->new RuntimeException("Invalid inputs"));
    }
    public static void main(String[] args) {
        String name = orElseOptional();
        //System.out.println("orElse with proper Output: "+name);
        System.out.println("orElse with out proper output: "+name);
        System.out.println("-----------------------");
        String name1 = orElseGetOptional();
        System.out.println("orElseGet() with proper output: "+name1);
       // System.out.println("orElseGet() with out proper output: "+name1);
        System.out.println("-----------------------");
        String name2 = orElseThrowOptional();
        System.out.println("orElseThrow() with proper output: "+name2);
    }

}
