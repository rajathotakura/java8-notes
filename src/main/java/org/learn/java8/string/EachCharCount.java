package org.learn.java8.string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EachCharCount {
    public static void main(String[] args) {

        String name = "Rajaram Mohanarao Rajaram Totakura Rajaram Totakura";
        
        Map<String,Long> countMap = Arrays.stream(name.split(" "))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

        System.out.println(countMap);
    }
}
