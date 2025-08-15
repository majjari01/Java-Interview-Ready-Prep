package java8.allinone;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@FunctionalInterface
interface MyFunctionalInterface {
    void greet(String name);

    // Default method
    default void defaultMethod() {
        System.out.println("Default method in interface");
    }

    // Static method
    static void staticMethod() {
        System.out.println("Static method in interface");
    }
}