package day25_CustomMethods_MethodOverloadingRecaps;

import Utilities.ArraysUtility;

public class Test2 {

    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5};
        ArraysUtility.printEachElement(numbers);

        System.out.println("-----------------------");


        double[] nr2 = {1.5, 4.7, 5.8, 9.9};
        ArraysUtility.printEachElement(nr2);

        System.out.println("--------");

        char[] ch = {'a', 'b', 'c', 'd'};
        ArraysUtility.printEachElement(ch);

        System.out.println("-----");

        String[] names = {"Mary", "Cindy", "Jonathan", "Craig"};
        ArraysUtility.printEachElement(names);


        System.out.println("-------");
        int[] n1 = {1, 2, 3, 4, 5, 6};
        int max1 = ArraysUtility.max(n1);
        System.out.println("max1 = " + max1);


        System.out.println("----------------");

        double[] n2 = {1.5, 3.7, 7.9, 6.8};
        double max2 = ArraysUtility.max(n2);
        System.out.println(max2);

        System.out.println("-----");
        int[] n3 = {1, 2, 3, 4, 5, 6};
        int min1 = ArraysUtility.min(n3);
        System.out.println(min1);


        System.out.println("---------------------------------");
        int[] a1 = {1, 2, 3, 4, 5, 6, 7};//5
        boolean r1 = ArraysUtility.contains(a1, 5);
        System.out.println(r1);

    }
}
