package org.learn.java8.streams;

import org.learn.java8.data.Student;
import org.learn.java8.data.StudentData;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ParticianingByEx {
    public static void main(String[] args) {

        particianingByEx_1();
        particianBy_2();
    }
    public static void particianingByEx_1() {
        Predicate<Student> studentPredicate = s->s.getGpa()>8;
        Map<Boolean, List<Student>> mapPartician = StudentData.getStudentData()
                .stream()
                .collect(Collectors.partitioningBy(studentPredicate));

        System.out.println(mapPartician);
    }

    public static void particianBy_2() {
        Predicate<Student> stuPredicate = s->s.getGpa()>8;
        Map<Boolean, Set<Student>> stuSet = StudentData.getStudentData()
                .stream()
                .collect(Collectors.partitioningBy(stuPredicate,Collectors.toSet()));
        System.out.println(stuSet);
    }
}
