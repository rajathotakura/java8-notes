package org.learn.java8.optional;

import org.learn.java8.data.Student;
import org.learn.java8.data.StudentData;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        /*String name = getStudentData();
        if(name!=null) {
            System.out.println("Student name length is: "+name.length());
        }else
            System.out.println("Name not found");*/

        Optional<String> nameOptional = getStudentNameUsingOptional();
        if(nameOptional.isPresent()) {
            System.out.println("Student name length is: " + nameOptional.get().length());
        }else
            System.out.println("Name not found");
    }
    public static String getStudentData() {

        //Student student = StudentData.getStudentData().get(0);
        Student student = null;
        if(student!=null) {
            return student.getName();
        }else
            return null;
    }
    public static Optional<String> getStudentNameUsingOptional() {

        //Optional<Student> studentOptional = Optional.ofNullable(StudentData.getStudentData().get(1));
        Optional<Student> studentOptional = Optional.ofNullable(null);
        if(studentOptional.isPresent()) {
            //return studentOptional.get().getName();
            return studentOptional.map(Student::getName);
        }
        return Optional.empty(); // will return Optional object with no value // will return NoSuchElementException
    }
}
