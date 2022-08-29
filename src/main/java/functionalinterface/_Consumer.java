package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer alex = new Customer("Alex", "666999666");

        // Normal Java function
        greetCustomer(alex);
        greetCustomerV2(alex, false);

        // Consumer Functional interface
        greetCustomerConsumer.accept(alex);

        greetCustomerConsumerV2.accept(alex, false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 =
            (customer, showPhoneNumber) -> System.out.println("Hello " + customer.customerName
                    + (showPhoneNumber
                        ? ", thanks for registering phone number " + customer.customerPhoneNumber
                        : ""));

    static Consumer<Customer> greetCustomerConsumer =
            customer -> System.out.println("Hello " + customer.customerName
                    + ", thanks for registering phone number "
                    + customer.customerPhoneNumber);

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName
                + ", thanks for registering phone number "
                + customer.customerPhoneNumber);
    }
    static void greetCustomerV2(Customer customer, boolean showPhoneNumber) {
        System.out.println("Hello " + customer.customerName
                + (showPhoneNumber
                ? ", thanks for registering phone number " + customer.customerPhoneNumber
                : ""));
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
