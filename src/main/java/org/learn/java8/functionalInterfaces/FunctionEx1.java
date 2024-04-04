package org.learn.java8.functionalInterfaces;

public class FunctionEx1 {

    public static String addText(String name) {

        return FunctionExample.sFunction.apply(name);
    }

    public static void main(String[] args) {

        String conc = addText("RohanRaja");
        System.out.println(conc);
    }
}
