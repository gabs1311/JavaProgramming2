package day33_CustomClassStatics.day33_CustomClassStatics;

public class Iphone {

    public static String  brand= "Apple";
    public String model;
    public double price;
    public static  String OS = "IOS";
    public String colour;
    public String size;
    public static String madeIn= "China";
    public static boolean hasBattery = true;
    public static boolean hasTouchscreen =true;
    public static boolean hasFaceTime =true;

    public static void printOperatingSystem(){// If I create the method static, I consume less space,
        // because it does not need me to create an object,I can just call the method through the
        // class name
        System.out.println(OS);

    }


}
