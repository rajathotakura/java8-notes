package org.learn.java8.defaults;

public interface Interface3 extends Interface1, Interface2{
    default void methodC() {
        System.out.println("Inside Method C "+Interface3.class);
    }


}
