package org.learn.java8.streams;

import org.learn.java8.data.Student;
import org.learn.java8.data.StudentData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1,2,3,4);
        System.out.println(multiplyReduceTest(intList));
        System.out.println("================");
        System.out.println(studentGradeReduce());
        System.out.println("================");
        Optional<Integer> i = multiplyReduceWithoutIdentityEmptyList(new ArrayList<>());
        if(i.isPresent()) {
            System.out.println(i.get());
        }else {
            System.out.println("null values came");
        }
    }

    public static int multiplyReduceTest(List<Integer> i) {
        return i.stream().reduce(1,(i1,i2)->i1*i2);
    }

    public static int studentGradeReduce() {
        return StudentData.getStudentData().stream()
                .map(Student::getGradeLevel)
                .reduce(1,(i1,i2)->i1+i2);
    }

    public static int multiplyReduceWithoutIdentity(List<Integer> iList) {

        return iList.stream()
                .reduce((i1,i2)->i1*i2).get();
    }

    public static Optional<Integer> multiplyReduceWithoutIdentityEmptyList(List<Integer> iList) {

        return iList.stream()
                .reduce((i1,i2)->i1*i2);
    }

}
