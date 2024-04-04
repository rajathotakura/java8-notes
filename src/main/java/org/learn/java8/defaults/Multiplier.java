package org.learn.java8.defaults;

import java.util.List;

public interface Multiplier {

    int mulitply(List<Integer> intList);

    default int size(List<Integer> iList) {
        System.out.println("Multiplier interface size()");
        return iList.size();
    }
    static boolean isEmpty(List<Integer> intList) {
        return intList==null && intList.size()==0;
    }
}
