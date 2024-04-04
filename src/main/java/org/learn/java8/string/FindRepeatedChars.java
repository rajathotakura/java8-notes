package org.learn.java8.string;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindRepeatedChars {
    public static void main(String[] args) {

        String name = "RajaramMohanarao";
        String[] nameArray = name.split("");
        Set<Map.Entry<String,Long>> nameSet = Arrays.stream(nameArray)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet();

        System.out.println(nameSet);
    }
}
