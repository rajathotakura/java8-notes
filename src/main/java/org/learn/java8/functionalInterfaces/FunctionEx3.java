package org.learn.java8.functionalInterfaces;

import org.learn.java8.data.Student;
import org.learn.java8.data.StudentData;

import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class FunctionEx3 {

    public static Function<List<Student>, HashMap<String,Double>> sFun = students -> {
        HashMap<String,Double> hMap = new HashMap<>();
        /*for (Student s : students) {

            if(s.getName().length()>4&s.getGpa()>8) {
                hMap.put(s.getName(),s.getGpa());
                return hMap;
            }
        }
        return null;*/

        students.forEach(
                student -> {
                    if(student.getName().length()>4&student.getGpa()>8)
                        hMap.put(student.getName(),student.getGpa());
                }
        );
        return hMap;
    };

    public static void main(String[] args) {

        List<Student> studentData = new StudentData().getStudentData();

        HashMap<String, Double> apply = sFun.apply(studentData);
        System.out.println(apply);
    }
}
