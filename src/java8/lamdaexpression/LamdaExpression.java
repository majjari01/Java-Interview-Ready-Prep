package java8.lamdaexpression;

//Lambda expression helps or plays major role in impementaing a functional interface
@FunctionalInterface
public interface LamdaExpression {
    //In a functional interface, e can only have ine and only one abstract method.
    void abstractMethod(String input);

    //but can have any number of default or static methods
    default void defaultMethod(String input){
        System.out.println(input);
    }

   static void staticMethd(){
        System.out.println("This ia a static method");
    }



}
