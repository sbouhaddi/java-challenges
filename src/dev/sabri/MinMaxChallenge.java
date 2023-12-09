package dev.sabri;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MinMaxChallenge {


    public static void main(String... args) {
        IntStream intstream = Stream.of(1, 2, 3, 4, 5, 6)
                .mapToInt(i -> i);
        IntStream instream2 = intstream;
        OptionalInt max = instream2.max();
        OptionalInt min = instream2.min();
        MinMaxChallenge minMaxChallenge = new MinMaxChallenge();
        int sum = minMaxChallenge.sum(max.orElse(5), min.orElse(5));
        System.out.println("sum = " + sum);

    }

    private int sum(int a, int b) {
        return a + b;
    }
}
