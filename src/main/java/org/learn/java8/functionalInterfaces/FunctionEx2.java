package org.learn.java8.functionalInterfaces;

import org.learn.java8.data.Student;
import org.learn.java8.data.StudentData;

import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class FunctionEx2 {

    static Function<Student, HashMap<String,Double>> sMap = student->{
      HashMap<String,Double> hMap = new HashMap<>();
      hMap.put(student.getName(), student.getGpa());
      return hMap;
    };

    public static void main(String[] args) {
        List<Student> studentData = new StudentData().getStudentData();

        studentData.forEach(
                student -> {
                    HashMap<String, Double> apply = sMap.apply(student);
                    System.out.println(apply);
                }
        );
       
    }
}
