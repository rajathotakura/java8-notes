package org.learn.java8.functionalInterfaces;

import org.learn.java8.data.Student;
import org.learn.java8.data.StudentData;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class BiPredicateExample {

    private static BiPredicate<String,Double> biPre = (name,gpa) -> name.length()>4 & gpa>8;


    public static void main(String[] args) {

        List<Student> studentData = new StudentData().getStudentData();
        studentData.forEach(
                student -> {
                    if(biPre.test(student.getName(),student.getGpa())) {
                        System.out.println(student);
                    }
                }
        );
    }
}
