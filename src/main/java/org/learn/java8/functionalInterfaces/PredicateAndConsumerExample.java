package org.learn.java8.functionalInterfaces;

import org.learn.java8.data.Student;
import org.learn.java8.data.StudentData;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    private static Predicate<Integer> intPredicate = i->i%2==0;
    private static Predicate<String> strPredicate = s->s.length()>4;
    private static Consumer<Integer> intConsumer = i-> System.out.println(i+10);
    private static Consumer<String> strConsumer = s-> System.out.println(s.toUpperCase());

    private Predicate<Student> preStudent = student -> student.getName().length()>4;
    private BiConsumer<String,Double> strCon = (name,gpa) -> System.out.println(name+" ---- "+gpa);
    public void conPredEx() {
        List<Student> sData = new StudentData().getStudentData();
        sData.forEach(
                student-> {
                    if(preStudent.test(student)) {
                       strCon.accept(student.getName(),student.getGpa());
                    }
                }
        );
    }

    public static void main(String[] args) {

        new PredicateAndConsumerExample().conPredEx();

    }
}
