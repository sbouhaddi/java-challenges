package dev.sabri;

import java.util.List;

public class ParallelChallenge {
    public static void main(String... args) {
        var persons = List.of(new Person(10), new Person(15), new Person(11), new Person(20), new Person(22));
        persons.stream()
                .parallel()
                .filter(p -> p.age > 10)
                .map(p -> p + ",")
                .forEachOrdered(System.out::println);

        persons.stream()
                .parallel()
                .filter(p -> p.age > 10)
                .map(p -> p + ",")
                .forEach(System.out::println);

    }
    static class Person {
        int age;

        public Person(int age) {
            this.age = age;
        }

        public String toString() {
            return " " + this.age;
        }
    }
}
