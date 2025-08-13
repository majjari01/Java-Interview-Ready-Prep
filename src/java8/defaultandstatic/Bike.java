package java8.defaultandstatic;

public class Bike implements Vehicle{

    @Override
    public int getspeed() {
        return 100;
    }

    @Override
    public void applyBreak() {
        System.out.println("Breaks applied");
    }

//    @Override
//    public void speedAlert() {
//        System.out.println("this is override method of default method for speed alret");
//    }
//=============================================================================================
//    @Override
//    public static void color(){
//        System.out.println("we cannot override a staic method , weather it be from interface or abstract class or from a concreate method");
//        System.out.println("it will simply say static methods cannot be annotate with @override ");
//    }

    public static void color(){
        System.out.println("this is color method in implementaion classs we can have a staic method with same method defination and signature in implementaion class and it is  not considered as method overriding");
    }
    public static void welcome(){
        System.out.println("Welcome to Yamaha Bikes showroom");
    }

    public static void main(String[] args){
        Vehicle yamaha=  new Bike();
        Bike.welcome();
        yamaha.getspeed();
        yamaha.applyBreak();
        yamaha.speedAlert();
        Vehicle.color();
        Bike.color();
    }

}
