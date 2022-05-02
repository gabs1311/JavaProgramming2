package day34_StaticContinueGarbageCollectionAccesModifier;

import static  day34_StaticContinueGarbageCollectionAccesModifier.Circle.*;
import static Utilities.MathUtility.*;

public class Test {
    public static void main(String[] args) {
        System.out.println(Circle.pi);
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);

        System.out.println("-----------------");
        //find the sum of 10 and 20
        int r1 = sum(10,20);

        //find the sum of 100, 200

        int r2v= sum(100,200);
        System.out.println("r2v = " + r2v);
        System.out.println("r1 = " + r1);


        int r3 = subtract(100,50);
        int r4 = max(100, 245);
        System.out.println("r4 = " + r4);
        System.out.println("r3 = " + r3);
    }
}
