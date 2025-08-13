package java8.lamdaexpression;

public class LamdaExpressionClass {
    public static void main(String[] args){
        LamdaExpression impl1=(input)->System.out.println("Hi from Lamda Expression to:"+ input);
        impl1.abstractMethod("Maheshwari");
        LamdaExpression impl2=(input)->System.out.println("this is another impkementation without using @override say hii:"+input);
        impl2.abstractMethod("Maheshwari");
    }
}
