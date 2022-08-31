package lambdas;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, String> upperCaseName = name -> {
            // logic
            if(name.isBlank()) throw new IllegalArgumentException("");
            return name.toUpperCase(Locale.ROOT);
        };

        System.out.println(upperCaseName.apply("Alejandro"));

        BiFunction<String, Integer, String> upperCaseName2 = (name, age) -> {
            // logic
            if(name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase(Locale.ROOT);
        };

        System.out.println(upperCaseName2.apply("Alejandro", 25));
    }
}
