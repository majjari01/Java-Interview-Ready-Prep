package java8.optionaljava8;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args){
        withJava8();
    }

    public static void withJava8() {
        String[] arr = new String[5];//this is an empty array of type string
        String[] str = {"YamaHa", null, "GostRider", "PainKiller"};//this is not an empty array, by default it's value is 4
        //here empty variable has a null value , but to avoid the nullPointerException we are using Optional class that wrap's the variable empty with option around it.
        Optional<String> empty = Optional.empty();//we are creating an optional variable with no value and wrapping it with optional using optional.empty().
        Optional<String> optioanlVariable= Optional.of("India");
        System.out.println(empty);

        //now we are using an array with known values in it so we will be using .of() method
        Optional<String> value= Optional.of(str[2]);
        System.out.println(value.get());

        Optional<String> data= Optional.ofNullable(str[1]);
        data.ifPresent(System.out::println);
        System.out.println(data.orElse("not present"));
    }
}
