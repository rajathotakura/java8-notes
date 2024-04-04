package org.learn.java8.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DefaultMethodExample {

    public static void main(String[] args) {
        //sort the names in alphabetical order

        List<String> nameList = Arrays.asList("Raja","Amar","Bunny","Sunny");

        //approach - 1 , before java 8
        Collections.sort(nameList);
        System.out.println("Using Collections.sort(): "+nameList);
        System.out.println("-----------------------------");
        //approach - 2, using List default method sort()
        //nameList.sort(Comparator.comparing(Function.identity()));
        //or
        nameList.sort(Comparator.naturalOrder());
        System.out.println(nameList);
        System.out.println("-----------------------------");
        //from java8
       List<String> sortedList = nameList.stream()
                .sorted((i1,i2)->i1.compareTo(i2))
                .collect(Collectors.toList());
        System.out.println(sortedList);
        System.out.println("----------------------");

        //to reverse the order

        nameList.sort(Comparator.reverseOrder());
        System.out.println("reverse order: "+nameList);
    }
}
