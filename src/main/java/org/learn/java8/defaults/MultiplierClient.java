package org.learn.java8.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

    public static void main(String[] args) {

        Multiplier multiplier = new MultiplierImpl();
        List<Integer> iList = Arrays.asList(1,3,5);
        System.out.println("Multipling result is: "+multiplier.mulitply(iList)); //15
        System.out.println("size is: "+multiplier.size(iList)); //MultiplierImpl class size()

        System.out.println("is the List empty: "+Multiplier.isEmpty(iList)); // false
    }
}
