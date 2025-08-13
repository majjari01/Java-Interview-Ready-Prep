package java8.defaultandstatic;

public interface Vehicle {
    public int getspeed();
    public void applyBreak();
    public default void speedAlert() {
        System.out.println("You are speeding the car");
    }
    public static void color(){
        System.out.println("this is a static color method no need to invoke through object and can be called directly using class name or interface name in this case");
    }
}