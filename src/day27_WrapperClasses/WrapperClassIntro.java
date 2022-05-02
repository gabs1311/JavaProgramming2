package day27_WrapperClasses;

public class WrapperClassIntro {
    public static void main(String[] args) {
        int num1=200;
        // Long n1 = num1; = must be converted to the same type, int --> Integer


        Integer n1 = num1;// Autoboxing
        int num2= n1; // unboxing
        // they are done implicitly

        System.out.println("---------------------------");
            Integer integerValue = 100;
            long longValue = integerValue;
        System.out.println("-------------------");

        int num3 = 200;
       // Long l2 = num3;
        Integer num4 = num3;
    }


}
