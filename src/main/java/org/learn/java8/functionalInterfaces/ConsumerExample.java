package org.learn.java8.functionalInterfaces;

import org.learn.java8.data.Student;
import org.learn.java8.data.StudentData;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

//        Consumer<String> consumer = (name) -> System.out.println(name.toUpperCase());
//        consumer.accept("Raja");
        StudentData sdata = new StudentData();
        List<Student> studentList = sdata.getStudentData();

        Consumer<Student> studentConsumer = (student) -> System.out.println(student.getName());
        studentList.forEach(studentConsumer);
       // System.out.println(studentConsumer.accept());

        Consumer<Student> genderStudent = (student)-> System.out.println(student.getGender());

        studentList.forEach(studentConsumer.andThen(genderStudent));

        studentList.forEach((student)->{
            if(student.getGradeLevel()>8)
                System.out.println(student.getName());
        });

    }



}
