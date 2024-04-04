package org.learn.java8.defaults;

import java.util.List;

public class MultiplierImpl implements Multiplier{

    @Override
    public int mulitply(List<Integer> intList) {
        return intList.stream()
                .reduce(1,(a,b)->a*b);
    }
    public int size(List<Integer> iList) {
        System.out.println("MultiplierImpl class size()");
        return iList.size();
    }
}
