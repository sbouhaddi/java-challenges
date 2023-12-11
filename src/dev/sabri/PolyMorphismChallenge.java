package dev.sabri;

public class PolyMorphismChallenge {
    public static void main(String... args) {
        Person person = new Student();
        System.out.println(person.name + " " + person.getName());
        System.out.println(person.imHere());

    }

    static class Person {
        String name = "person";

        static String imHere() {
            return "Im a Person";
        }

        String getName() {
            return this.name;
        }
    }

    static class Student extends Person {
        String name = "student";
        static String imHere() {
            return "Im a Student";
        }
        String getName() {
            return this.name;
        }
    }
}
