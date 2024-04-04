package org.learn.java8.data;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StudentData {

    public static List<Student> getStudentData() {

        Bike b = new Bike();
        b.setName("KTM");
        b.setModel("RC200");
        Student s1 = new Student("Raja",10,9.5,"male",Arrays.asList("Cricket","Hockey"));
        s1.setBike(Optional.ofNullable(b));
        Student s2 = new Student("Rohan",8,10,"male",Arrays.asList("Charams","Chess"));
        Student s3 = new Student("Suman",9,6,"male",Arrays.asList("Running","Batminton"));
        Student s4 = new Student("Madhu",7,8,"male",Arrays.asList("Running","Chess"));
        s4.setBike(Optional.ofNullable(b));
        Student s5 = new Student("Amar",8,9,"male",Arrays.asList("Charams","Cricket"));
        return Arrays.asList(s1,s2,s3,s4,s5,null);


    }
}
