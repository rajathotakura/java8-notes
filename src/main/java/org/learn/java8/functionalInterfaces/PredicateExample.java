package org.learn.java8.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        /*Predicate<Integer> intPredicate = (i)->{

            if(i%2==0) {
                return true;
            }else
                return false;
        };*/

//        Predicate<Integer> intPredicate = (i)->{ return i%2==0;};
        Predicate<Integer> intPredicate = (i)-> i%2==0;
        boolean result = intPredicate.test(20);
        System.out.println(result);

        System.out.println(intPredicate.test(5));

        Predicate<String> strPredicate = (i) -> i.length()>3;
        Predicate<String> namePredicate = (i) -> i.equals("Raja");
        boolean b = strPredicate.and(namePredicate).test("Rohan");
        System.out.println(b);
        System.out.println(strPredicate.or(namePredicate).test("Rohan"));

        System.out.println(strPredicate.and(namePredicate).negate().test("Rohan")); // negate will reverse the result. if actual result is true, then negate method will return false.
    }
}
