package java8.lamdaexpression;

//Lambda expression helps or plays major role in impementaing a functional interface
@FunctionalInterface
public interface LamdaExpression {
    //In a functional interface, e can only have ine and only one abstract method.
    public void abstractMethod();

    //but can have any number of default or static methods
    default void defaultMethod(){
        System.out.println("this is a default method");
    }

    public static void staticMethd(){
        System.out.println("This ia a static method");
    }

}
