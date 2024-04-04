package org.learn.java8.string;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintSecondRepeatedChar {

    public static void main(String[] args) {

        String name = printSecondRepeatedChar("sathish");
        System.out.println(name);
    }
    public static String printSecondRepeatedChar(String name) {

        return Arrays.stream(name.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .peek((i)-> System.out.println(i))
                .filter(i -> i.getValue()>1)
                .skip(1)
                .findFirst().get().getKey();
    }
}
