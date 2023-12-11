package dev.sabri;

import java.util.List;
import java.util.stream.Stream;

public class OfNullableChallenge {

    public static void main(String... args) {
        Person person = null;
        Stream.ofNullable(person)
                .filter(p -> p.cars.get(0) == null)
                .forEach(System.out::println);
    }


    static class Person {
        List<String> cars;

        public Person(List<String> cars) {
            this.cars = cars;
        }
    }
}
