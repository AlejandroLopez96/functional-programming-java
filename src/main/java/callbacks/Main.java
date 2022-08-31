package callbacks;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        hello("Alex", null, val -> {
            System.out.println("Lastname not provided for " + val);
        });

        hello2("Alex", null, () -> System.out.println("Lastname not provided"));
    }

    static void hello(String name, String lastName, Consumer<String> callback) {
        System.out.println(name);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(name);
        }
    }
    static void hello2(String name, String lastName, Runnable callback) {
        System.out.println(name);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.run();
        }
    }
}
