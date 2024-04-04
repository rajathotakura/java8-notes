package org.learn.java8.defaults;

import org.learn.java8.data.Student;
import org.learn.java8.data.StudentData;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class DefaultMethodsEx2 {
    static Consumer<Student> studentConsumer = student -> System.out.println(student);
    static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    public static void sortByName(List<Student> stuList) {
        System.out.println("After sorting :::::");
        Comparator<Student> studentComparator = Comparator.comparing(Student::getName);
        stuList.sort(studentComparator);
        //stuList.forEach(System.out::println);
        //or
        stuList.forEach(studentConsumer);
    }
    public static void sortByGPA(List<Student> stuList) {
        System.out.println("Sort by GPA ::::");
        //Consumer<Student> stuConsumer = Comparator.comparing((st1,st2)->st1.);
        stuList.sort(Comparator.comparingDouble(Student::getGpa));
        stuList.forEach(studentConsumer);
    }
    public static void comparingComparator(List<Student> stdList) {
        System.out.println(":::::::::: Comparator Comparing :::::::");
        stdList.sort(gradeComparator.thenComparing(nameComparator));
        stdList.forEach(studentConsumer);
    }
    public static void sortWithNullValues(List<Student> stList) {
        System.out.println("Sort with null values");
        Comparator<Student> stComp = Comparator.nullsFirst(nameComparator);
        stList.forEach(studentConsumer);
    }
    public static void main(String[] args) {
        System.out.println("Before Sorting ::::");
        List<Student> studentList = StudentData.getStudentData();
        //System.out.println(studentList);
        studentList.forEach(studentConsumer);

        //sortByName(studentList);
        //sortByGPA(studentList);
        //comparingComparator(studentList);
        sortWithNullValues(studentList);
    }
}
