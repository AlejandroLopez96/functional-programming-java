package combinatorpattern;

import java.time.LocalDate;
import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alex",
                "alex@test.com",
                "+34666999666",
                LocalDate.of(1996, 10, 30)
        );

        // System.out.println(new CustomerValidatorService().isValid(customer));

        // if valid we can store customer in db

        // Using combinator pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);

        if(result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }
}
