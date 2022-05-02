package Week02;

public class PrimitivesExample {
    public static void main(String[] args) {

        /*
        Data variable names= Value; Declare and initialize at the same line
        DatType variableName;
        variableName = value

         */
        byte num1;// declaring a variable
         num1 = 123;//Initilizing a variable, assigning a value
         num1 = (byte) 132; // re-assign a value
        short num2 = 12398;//   declare and initialize in the same line;
        int distance = 1_000_000_000;
        long distanceMore = 3_000_000_000L;// we do not have to put the
        // L to define the variable
        long distanceShorter = 1_000_000_000;// if it does not pass the limit , then we don't have to give
        float rate = 1000.5F;
        double number = 123.6;
        System.out.println("...Castings....");
        System.out.println("Before Swapping Values");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);// a ma assigning  the right numbers

        System.out.println("After Swaping Values");
        num2 = num1;// I am assigning num1 value ti num2

        System.out.println("num2 = " + num2);

        System.out.println("num2 = " + num2);


        /*
        implicit - is done by the computer
        explicit - you do it yourself
         */





    }
}
