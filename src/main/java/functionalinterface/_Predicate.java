package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("Without predicate");
        System.out.println(isPhoneNumberValid("679999999"));
        System.out.println(isPhoneNumberValid("67999998"));
        System.out.println(isPhoneNumberValid("679999998"));

        System.out.println("With predicate");
        System.out.println(isPhoneNumberValidPredicate.test("679999999"));
        System.out.println(isPhoneNumberValidPredicate.test("67999998"));
        System.out.println(isPhoneNumberValidPredicate.test("679999998"));


        System.out.println(
                "Is phone number valid and contains number 3 = " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("679999938")
        );
        System.out.println(
                "Is phone number valid and contains number 3 = " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("679999908")
        );
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("67") && phoneNumber.length() == 9;
    }

    static Predicate<String> isPhoneNumberValidPredicate =
            phoneNumber -> phoneNumber.startsWith("67") && phoneNumber.length() == 9;

    static Predicate<String> containsNumber3 =
            phoneNumber -> phoneNumber.contains("3");
}
