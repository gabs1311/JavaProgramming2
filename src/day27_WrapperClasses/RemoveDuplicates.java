package day27_WrapperClasses;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4};

        arr = removeDuplicates(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println("-----------------------------------------");

        String[] words = {"Java", "Java", "Python", "C#", "Java", "Java"};

        words = removeDuplicates(words);

        System.out.println(Arrays.toString(words));

        System.out.println("-----------------------------------------");

        int[] numbers = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5};

        // numbers = Arrays.stream(numbers).distinct().toArray();

        // System.out.println(Arrays.toString(numbers));


    }


    //removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array) {

        int[] result = {};//{1,

        for (int each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }


    //removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array) {

        double[] result = {};//{1,

        for (double each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }


    //removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array) {

        char[] result = {};//{1,

        for (char each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }


    //removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array) {

        String[] result = {};//{1,

        for (String each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }
}


/*
// when the loop gets executed, the for loop is going to get each of the elements from array.
        // and then is going to check if the new array contains that element. So when the loop first gets
        //executed, the element is 1. So, if the array result does nt contain the element 1, then the
        // element 1 will be added to the new result array. When the loop gets executed for the 2nd time, the
        //element is also 1. But now, the condition I gave with if becomes false, because after the 1st
        // execution of the loop, 1 is already added into this new array result, so it is going to skip
        // adding it. So basically, if the element is already contained, it is going to be skipped. By
        //using this condition, we are eliminating the duplicated elements of the array


 */