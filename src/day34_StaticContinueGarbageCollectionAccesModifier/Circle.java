package day34_StaticContinueGarbageCollectionAccesModifier;

import java.util.ArrayList;

public class Circle {
    public double radius;
    public static double pi= 3.14;// the easiest way-
    // set the static variables within one step
    public static String name = "Circle";

public static ArrayList<Integer>numbers;





    // public static Sheet sheet

    public  Circle(double radius){

        this.radius=radius;
    //    pi =3.14; I should never use a static in an instance method
    }

 /*   static {
        //radius = 5;  static methods do not accept instance members
        pi =3.14;
        name="Circle";

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);*/

    public static void main(String[] args) {
        pi=3.14;
        name= "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);

    }



    }





