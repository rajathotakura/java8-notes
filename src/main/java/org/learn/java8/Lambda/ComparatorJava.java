package org.learn.java8.Lambda;

import java.util.Comparator;

public class ComparatorJava {
    // using traditional java - imparative style

    Comparator<Integer> comparator = new Comparator<Integer>() {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
        }
    };


    public static void main(String[] args) {

        Comparator<Integer> com = (i1,i2)->i1.compareTo(i2);

        System.out.println("Result of 10,12 is: "+com.compare(10,12));
    }
}
