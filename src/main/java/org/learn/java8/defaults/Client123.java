package org.learn.java8.defaults;

public class Client123 implements Interface3{

   /* public void methodA() {
        System.out.println("Inside Method A "+Interface1.class);
    }*/
    public static void main(String[] args) {

        Client123 c = new Client123();
        c.methodA(); // result will print from child interface class Interface2. At runtime always will print child class methods in overridding.
        c.methodC();
    }

    @Override
    public void methodA() {

    }
}
