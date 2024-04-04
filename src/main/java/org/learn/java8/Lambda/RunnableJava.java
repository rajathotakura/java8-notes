package org.learn.java8.Lambda;

public class RunnableJava {

    public static void main(String[] args) {

        Runnable r = new Runnable() {

            @Override
            public void run() {
                System.out.println("Runnable");
            }
        };

        new Thread(r).start();

        System.out.println("-----------------------");

        Runnable runnable = ()->{
            System.out.println("Runnable interface implementation Using java8 ");
        };

        new Thread(runnable).start();

        new Thread(()-> System.out.println("Runnable implementation")).start();

    }
    //--------------------------


}
