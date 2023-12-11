package dev.sabri;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaChallenge {
    static int x = 0;

    public static void main(String... args) {
        Supplier<Integer> supplier = () -> x++;
        Consumer<Integer> consumer = y -> System.out.println(y + x++);
        System.out.println(x + supplier.get());
        consumer.accept(1);
    }
}
