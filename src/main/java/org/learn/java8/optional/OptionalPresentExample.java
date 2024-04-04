package org.learn.java8.optional;

import java.util.Optional;

public class OptionalPresentExample {
    public static void main(String[] args) {

       Optional<String> optional =  Optional.ofNullable("Hello");
       Optional<String> optionalNull =  Optional.ofNullable(null);
        //isPresent()
        System.out.println("is Optional object having data? "+optional.isPresent()); //true
        System.out.println("is Optional object having data? "+optionalNull.isPresent()); //false
        System.out.println("===============");
        //ifPresent()
        optional.ifPresent(s-> System.out.println("if Optional obj having data then do another operation: "+s)); // output will print
        optionalNull.ifPresent(s-> System.out.println("if Optional obj having data then do another operation: "+s)); // no output
    }
}
