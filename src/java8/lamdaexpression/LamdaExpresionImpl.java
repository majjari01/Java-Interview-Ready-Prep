package java8.lamdaexpression;

public class LamdaExpresionImpl implements LamdaExpression{
//    @Override
//    public void abstractMethod(String input) {
//        System.out.println("this is traditional way of implementing the abstract methods of interface");
//    }

    @Override
    public void abstractMethod(String input) {
        System.out.println("Traditional way: " + input);
    }

    public static void main(String[] args) {
        // 1️⃣ Traditional approach using class implementation
        LamdaExpresionImpl obj = new LamdaExpresionImpl();
        obj.abstractMethod("Hello from traditional implementation");

        // 2️⃣ Lambda expression implementation
        LamdaExpression method = (input) -> {
            System.out.println("Lambda way: " + input);
        };
        method.abstractMethod("Hello from lambda");

        // 3️⃣ Method reference implementation
        LamdaExpression method1 = System.out::println;
        method1.abstractMethod("Hello from method reference");

        LamdaExpression.staticMethd();
        obj.defaultMethod("This is default method in funvtional interface");
        //the below can not be done because only one abstract method is implemented. If it has more than one abstract method then it will not be consider as functional interface. Since functional interface must have only one abstract method.
//        LamdaExpression val = obj.defaultMethod((String input)->System.out.println("this is a overriden default method using lamnda dunction in a function interfcae"));
//        obj.defaultMethod(val);

    }
}








