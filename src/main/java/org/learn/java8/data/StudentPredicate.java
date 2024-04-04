package org.learn.java8.data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentPredicate {


    public static void main(String[] args) {

        Predicate<Student> studentPredicate = (i)->i.getName().length()>4;
        Predicate<Student> studentPredicate1 = (i)-> i.getGradeLevel()>8;
        Predicate<Student> studentPredicate2 = (i)->i.getGpa()>8;

        List<Student> studentData = new StudentData().getStudentData();

        studentData.forEach((i)->{
            if(studentPredicate.test(i)) {
                System.out.println(i);
            }
        });

     }
}
