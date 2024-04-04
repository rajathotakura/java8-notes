package org.learn.java8.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String,String> nameFunction = name-> name.toUpperCase();
//    static Function<String,Integer> lenFunction = name->name.length();
    //static Function<String,String> lenFunction = name->name.concat("active");
static Function<String,String> lenFunction = name->name+name.length();
    static Function<String,String> sFunction = name->name.toUpperCase().concat("Smart");
    public static void main(String[] args) {

        String raja = nameFunction.apply("Raja");
        System.out.println(raja);
        System.out.println(nameFunction.andThen(lenFunction).apply("rohan"));
        System.out.println(nameFunction.andThen(sFunction).apply("thotakura"));

        System.out.println(nameFunction.compose(sFunction).apply("thotakura"));
    }
}
