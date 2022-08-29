package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());
    }

    static String getDBConnectionUrl() {
        return "jbdc://localhost:5432/users";
    }

    static Supplier<List<String>> getDBConnectionUrlSupplier =
            () -> List.of(
                    "jbdc://localhost:5432/users",
                    "jbdc://localhost:5432/customers"
            );
}
