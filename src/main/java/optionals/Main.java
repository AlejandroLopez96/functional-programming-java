package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Object value = Optional.ofNullable(null)
                .orElseGet(() -> "default value");
        System.out.println(value);

        Object value2 = Optional.ofNullable("Hello")
                .orElseThrow(() -> new IllegalStateException("Exception"));
        System.out.println(value2);

        Optional.ofNullable("Alex@EMAIL.COM")
                .ifPresent(email -> System.out.println("Sending an email " + email));

        Optional.ofNullable(null)
                .ifPresentOrElse(
                        email -> System.out.println("Sending an email " + email),
                        () -> System.out.println("Cannot send email "));


    }
}
