package org.learn.java8.optional;

import org.learn.java8.data.Bike;
import org.learn.java8.data.Student;
import org.learn.java8.data.StudentData;

import java.util.Optional;

public class OptionalMapFlatMapFilterExample {
    //filter
    public static void filterOptional() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentData.getStudentData().get(0));
        studentOptional.filter(s -> s.getGpa()>8)
                .ifPresent(st-> System.out.println(st));
    }
    //map
    public static void mapOptional() {
        Optional<Student> stuOptional = Optional.ofNullable(StudentData.getStudentData().get(1));
        //stuOptional.map(Student::getName)
        //        .ifPresent(s -> System.out.println(s));
        if(stuOptional.isPresent()) {
            Optional<String> sOptonal = stuOptional.filter(s->s.getGpa()>7)
                    .map(s->s.getName());
            System.out.println(sOptonal.get());
        }
    }
    //flatMap
    public static void flatMapOptional() {
        Optional<Student> stuOptional = Optional.ofNullable(StudentData.getStudentData().get(0));
        Optional<String> bikeName = stuOptional.filter(s->s.getGpa()>9)
                .flatMap(Student::getBike)
                .map(Bike::getName);
        //System.out.println("Bike Name: "+bikeName.get());
        bikeName.ifPresent(s-> System.out.println("Bike name: "+s));
    }
    public static void main(String[] args) {
        filterOptional();
        mapOptional();
        flatMapOptional();
    }
}
