package org.learn.java8.streams;

import org.learn.java8.data.Student;
import org.learn.java8.data.StudentData;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionMethodEx {

    public static void main(String[] args) {

        filterDemo().forEach(System.out::println);
        filterMaleStudents().forEach(System.out::println);
        System.out.println("-------------------------");
        filterStudentGPA().forEach(System.out::println);
    }

    public static List<Student> filterDemo() {

        return StudentData.getStudentData().stream()
                .filter(i->i.getName().equals("Amar"))
                .collect(Collectors.toList());

    }
    public static List<Student> filterMaleStudents() {

        return StudentData.getStudentData().stream()
                .filter(student -> student.getGender().equalsIgnoreCase("Male"))
                .collect(Collectors.toList());
    }

    public static List<Student> filterStudentGPA(){

        return StudentData.getStudentData().stream()
                .filter(s -> s.getGpa()>9)
                .collect(Collectors.toList());
    }
}
