package org.learn.java8.streams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamEx {

    public static void main(String[] args) {

        long parallelTime = checkPerformance(ParallelStreamEx::sum_parallel_sum,20);
        long sequentialTime = checkPerformance(ParallelStreamEx::sum_sequential_stream,20);
        System.out.println("Sequential time: "+sequentialTime);
        System.out.println("Parallel Time: "+parallelTime);

        System.out.println(Runtime.getRuntime().availableProcessors());
    }
    public static long checkPerformance(Supplier<Integer> sup, int number) {

        long startTime = System.currentTimeMillis();
        for(int i=0;i<number;i++) {
            sup.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }
    public static int sum_sequential_stream() {
        int sequential = IntStream.rangeClosed(1,100000)
                .sum();
        return sequential;
    }
    public static int sum_parallel_sum() {
        int parallel = IntStream.rangeClosed(1,100000)
                .parallel()
                .sum();
        return parallel;
    }
}
