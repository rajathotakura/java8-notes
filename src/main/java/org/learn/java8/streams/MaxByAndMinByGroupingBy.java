package org.learn.java8.streams;

import org.learn.java8.data.Student;
import org.learn.java8.data.StudentData;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxByAndMinByGroupingBy {

    public static void main(String[] args) {
        maxBy();
        minBy();
    }
    public static void maxBy() {

        Map<Integer,Optional<Student>> collect = StudentData.getStudentData()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.maxBy(Comparator.comparing(Student::getGpa))));

                System.out.println(collect);
    }
    public static void minBy() {
        Map<Integer,Student> student = StudentData.getStudentData()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)),Optional::get)));
        System.out.println(student);
    }
}
