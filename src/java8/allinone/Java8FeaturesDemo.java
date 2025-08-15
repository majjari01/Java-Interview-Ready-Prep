package java8.allinone;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8FeaturesDemo {
    public static void main(String[] args) {

        // 1️⃣ Lambda Expressions
        MyFunctionalInterface lambda = name -> System.out.println("Hello, " + name);
        lambda.greet("Maheshwari");

        // 2️⃣ Default and Static Methods in Interfaces
        lambda.defaultMethod();
        MyFunctionalInterface.staticMethod();

        // 3️⃣ Method Reference
        MyFunctionalInterface methodRef = System.out::println;
        methodRef.greet("Hi from Method Reference");

        // 4️⃣ Streams API
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill", "Maheshwari");
        List<String> filteredNames = names.stream()
                .filter(n -> n.startsWith("J"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Filtered Names: " + filteredNames);

        // 5️⃣ Predicate with Streams
        Predicate<String> startsWithJ = n -> n.startsWith("J");
        List<String> predicateResult = names.stream()
                .filter(startsWithJ)
                .collect(Collectors.toList());
        System.out.println("Names starting with J: " + predicateResult);

        // 6️⃣ Optional Class
        Optional<String> optionalName = Optional.of("Java 8");
        optionalName.ifPresent(val -> System.out.println("Optional contains: " + val));
        System.out.println(optionalName.orElse("Default Value"));
        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional.orElse("Empty Optional Handled"));

        // 7️⃣ Date and Time API
        LocalDate today = LocalDate.now();
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Today: " + today);
        System.out.println("Current DateTime: " + now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));

        // 8️⃣ Reduce in Streams
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum using reduce: " + sum);

        // 9️⃣ ForEach with Lambda
        names.forEach(n -> System.out.println("Name: " + n));
    }
}
