package dev.sabri;

import java.util.Set;

public class StreamDistinctChallenge {

    public static void main(String... args) {
        Set<Person> people = Set.of(new Person("John"), new Person("John"),
                new Person("Jane"), new Person("Jenny"), new Person("Jessy"));
        people.stream().distinct().forEach(p -> System.out.println("p.name = " + p.name));

    }

    static class Person {
        private String name;

        Person(String name) {
            this.name = name;
        }

        public int hashCode() {
            return this.name.length();
        }

        public boolean equals(Object obj) {
            return obj instanceof Person && this.name.equals(((Person) obj).name);
        }
    }
}
