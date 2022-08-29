package streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Alex", Gender.MALE),
                new Person("Francisco", Gender.MALE),
                new Person("Carlos", Gender.MALE),
                new Person("Anna", Gender.FEMALE),
                new Person("Teresa", Gender.FEMALE),
                new Person("Silvia", Gender.FEMALE)
        );

        //people.stream()
        //        .map(person -> person.name)
        //        .mapToInt(String::length)
        //       .forEach(System.out::println);

        Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);
        boolean containsOnlyFemales = people.stream()
                .noneMatch(personPredicate);
        System.out.println(containsOnlyFemales);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
