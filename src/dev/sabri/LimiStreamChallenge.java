package dev.sabri;

import java.util.stream.IntStream;

public class LimiStreamChallenge {

    public static void main(String... args) {
        IntStream.iterate(0 , i -> i+1)
                .limit(5)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

        IntStream.iterate(0, i -> i+1)
                .peek(System.out::println)
                .filter(i -> i % 2 == 0)
                .limit(3)
                .forEach(System.out::println);
    }
}
