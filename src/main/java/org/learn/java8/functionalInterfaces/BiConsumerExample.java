package org.learn.java8.functionalInterfaces;

import org.learn.java8.data.Student;
import org.learn.java8.data.StudentData;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {


        BiConsumer<Integer,Integer> multiply = (i1,i2) -> {
            System.out.println("Multiplication of ("+ i1+","+i2+") is: "+(i1*i2));
        };

        BiConsumer<Integer,Integer> division = (i1,i2) -> {
            System.out.println("Division of ("+i1+","+i2+") is: "+(i1/i2));
        };

        BiConsumer<Integer,Integer> addition = (i1,i2) -> {
            System.out.println("Addition of ("+i1+","+i2+") is: "+(i1+i2));
        };

        BiConsumer<Integer,Integer> subtraction = (i1,i2) -> {
            System.out.println("Subtraction of ("+i1+","+i2+") is: "+(i1-i2));
        };

        subtraction.accept(10,20);

        subtraction.andThen(addition).accept(20,30);

        addition.andThen(subtraction).accept(30,30);

        addition.andThen(multiply).accept(50,100);


//        BiConsumer<String,String> bi = (s1,s2) -> System.out.println(s1+"-------"+s2);
//        bi.accept("Raja","Rohan");
    }

    public void studentDetails() {

        List<Student> allStudentInfo = new StudentData().getStudentData();



    }
}
