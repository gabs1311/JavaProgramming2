package Utilities;

import java.util.Arrays;

public class ArraysUtility {
    // prints each integer from an integer array in separate lines
    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }


    // prints each double from a double array in separate lines
    public static void printEachElement(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }

    // prints each char from a char array in separate lines
    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }


    // prints each String from a String  array in separate lines
    public static void printEachElement(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }

    // returns the max number from an integer array
    public static int max(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];

    }

    // returns the max number from a double array
    public static double max(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];

    }
    // returns the max number from an integer array
    public static int MaxNumber(int[]arr){
        int max = arr[0];
        for (int each: arr){
            if (each>max){
                max=each;
            }
        }
        System.out.println(max);
        return max;

    }

    // returns the max number from double array
    public static double MaxNumber(double[]arr){
        double max = arr[0];
        for (double each: arr){
            if (each>max){
                max=each;
            }
        }
        System.out.println(max);
        return max;

    }

    // returns the max number from long array
    public static long MaxNumber(long []arr){
        long max = arr[0];
        for (long each: arr){
            if (each>max){
                max=each;
            }
        }
        System.out.println(max);
        return max;

    }

    //returns the max number from short array
    public static short MaxNumber(short[]arr){
        short max = arr[0];
        for (int each: arr){
            if (each>max){
                max= (short) each;
            }
        }
        System.out.println(max);
        return max;

    }

    // returns the max number from float array
    public static float MaxNumber(float[]arr){
        float max = arr[0];
        for (float each: arr){
            if (each>max){
                max=each;
            }
        }
        System.out.println(max);
        return max;

    }

    // returns the max number from byte array
    public static byte MaxNumber(byte[]arr){
        int max = arr[0];
        for (int each: arr){
            if (each>max){
                max=each;
            }
        }
        System.out.println(max);
        return (byte) max;

    }

    // returns the min number from an integer array
    public static int min(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    // returns the min number from a double array
    public static double min(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];

    }

    // returns the min number from an integer array
    public static int MinNumber(int[]arr){
        int min = arr[0];
        for (int each:arr){
            if (each<min){
                min=each;
            }
        }
        System.out.println(min);
        return min;
    }

    //returns the min number from double array
    public static double MinNumber(double[]arr){
        double min = arr[0];
        for (double each:arr){
            if (each<min){
                min=each;
            }
        }
        System.out.println(min);
        return min;
    }

    // returns the min number from long array
    public static long MinNumber(long[]arr){
        long min = arr[0];
        for (long each:arr){
            if (each<min){
                min=each;
            }
        }
        System.out.println(min);
        return min;
    }


    //returns the min number from short array
    public static short MinNumber(short[]arr){
        short min = arr[0];
        for (short each:arr){
            if (each<min){
                min=each;
            }
        }
        System.out.println(min);
        return min;
    }


    //	returns the min number from float array
    public static float MinNumber(float[]arr){
        float min = arr[0];
        for (float each:arr){
            if (each<min){
                min=each;
            }
        }
        System.out.println(min);
        return min;
    }


    // returns the min number from byte array
    public static byte MinNumber(byte[]arr){
        byte min = arr[0];
        for (byte each:arr){
            if (each<min){
                min=each;
            }
        }
        System.out.println(min);
        return min;
    }

    // checks if a given integer is contained in the given array, it returns boolean. contains(int[], int)
    public static boolean contains(int[] array, int element) {
        boolean result = false;
        for (int each : array) {
            if (each == element) ;
            result = true;
        }

        return result;
    }


    // checks if a given double  is contained in the given array, it returns boolean. contains(int[], int)
    public static boolean contains(double[] array, double element) {
        boolean result = false;
        for (double each : array) {
            if (each == element) ;
            result = true;
        }

        return result;
    }


    // checks if a given char is contained in the given array, it returns boolean. contains(int[], int)
    public static boolean contains(char[] array, char element) {
        boolean result = false;
        for (char each : array) {
            if (each == element) ;
            result = true;
        }

        return result;
    }


    // checks if a given String is contained in the given array, it returns boolean. contains(String[], String)
    public static boolean contains(String[] array, String element) {
        boolean result = false;
        for (String each : array) {
            if (each == element) ;
            result = true;
        }

        return result;
    }


    //  adds the given element to array , returns a new array
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }

    // adds the given element to array , returns a new array
    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }

    //  adds the given element to array , returns a new array
    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }

    //  adds the given element to array , returns a new array
    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array, int element) {
        //  for ex the given array is [1,1,1,2,3,4,5] and 1 is the given element
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array, double element) {
        //  for ex the given array is [1,1,1,2,3,4,5] and 1 is the given element
        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }


    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] array, char element) {
        //  for ex the given array is [1,1,1,2,3,4,5] and 1 is the given element
        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }


    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] array, String element) {
        //  for ex the given array is [1,1,1,2,3,4,5] and 1 is the given element
        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }
        return count;
    }


    // returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array) {
        int[] result = {}; //new int[0]

        for (int each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }


    // returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array) {
        double[] result = {}; //new int[0]

        for (double each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }


    // returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[] array) {
        char[] result = {}; //new int[0]

        for (char each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // returns the unique elements of the array as a new array
    public static String[] uniqueElements(String[] array) {
        String[] result = {}; //new int[0]

        for (String each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }


    //removes the index from the array, returns new array
    public static int[] removeElement(int[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        int[] result = new int[array.length - 1]; //1,2

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //removes the index from the array, returns new array
    public static double[] removeElement(double[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        double[] result = new double[array.length - 1]; //1,2

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //removes the index from the array, returns new array
    public static char[] removeElement(char[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        char[] result = new char[array.length - 1]; //1,2

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //removes the index from the array, returns new array
    public static String[] removeElement(String[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        String[] result = new String[array.length - 1]; //1,2

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    // merge the given two arrays and returns the new array
    public static int[]merge(int[]arr1 , int []arr2){
        int []result = {};


        for (int each:arr1){
            result =   ArraysUtility.addElement(result, each);
        }

        for (int each:arr2){
            result = ArraysUtility.addElement(result,each);
        }
        return result;

    }
    
    // merge the given two arrays and returns the new array
    public static double []merge(double[]arr1 , double []arr2){
        double []result = {};


        for (double each:arr1){
            result =   ArraysUtility.addElement(result, each);
        }

        for (double each:arr2){
            result = ArraysUtility.addElement(result,each);
        }
        return result;

    }


    // merge the given two arrays and returns the new array
    public static char[]merge(char[]arr1 , char []arr2){
        char []result = {};


        for (char each:arr1){
            result =   ArraysUtility.addElement(result, each);
        }

        for (char each:arr2){
            result = ArraysUtility.addElement(result,each);
        }
        return result;

    }
    
    
    
    // merge the given two arrays and returns the new array
    public static String[]merge(String[]arr1 , String []arr2){
        String []result = {};


        for (String each:arr1){
            result =   ArraysUtility.addElement(result, each);
        }

        for (String each:arr2){
            result = ArraysUtility.addElement(result,each);
        }
        return result;

    }


    //reverses the given array, returns a new array
    public static int[] reverse(int[] array){
        int[] result = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }


    //reverses the given array, returns a new array
    public static double[] reverse(double[] array){

        double[] result = new double[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }


    //reverses the given array, returns a new array
    public static char[] reverse(char[] array){

        char[] result = new char[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }


    //reverses the given array, returns a new array
    public static String[] reverse(String[] array){

        String[] result = new String[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }


    //replace the element of the array at the given index with the new element
    public static int[] replace( int[] array, int index, int newElement){
        if (index<0 ||index> array.length-1){// if this condition is true, the index is invalid
            System.err.println("Invalid index:"+ index);
            System.exit(0);
        }
        array[index]= newElement;
        return array;

    }

    //replace the element of the array at the given index with the new element
    public static double[] replace( double[] array, int index, double newElement){
        if (index<0 ||index> array.length-1){// if this condition is true, the index is invalid
            System.err.println("Invalid index:"+ index);
            System.exit(0);
        }
        array[index]= newElement;
        return array;

    }

    //replace the element of the array at the given index with the new element
    public static char[] replace( char[] array, int index, char newElement){
        if (index<0 ||index> array.length-1){// if this condition is true, the index is invalid
            System.err.println("Invalid index:"+ index);
            System.exit(0);
        }
        array[index]= newElement;
        return array;

    }

    //replace the element of the array at the given index with the new element
    public static String[] replace( String[] array, int index, String newElement){
        if (index<0 ||index> array.length-1){// if this condition is true, the index is invalid
            System.err.println("Invalid index:"+ index);
            System.exit(0);
        }
        array[index]= newElement;
        return array;

    }



    // replaces all the matching old value of the array  with the new value
    public static int[]replaceElements( int[]array, int oldlValue, int newValue){

        for (int i = 0; i < array.length; i++) {// i: represents each element of array
            if (array[i]==oldlValue){
                array[i]=newValue;
            }
        }
        return array;

    }

    // replaces all the matching old value of the array  with the new value
    public static double []replaceElements( double []array, double oldlValue, double newValue){

        for (int i = 0; i < array.length; i++) {// i: represents each element of array
            if (array[i]==oldlValue){
                array[i]=newValue;
            }
        }
        return array;

    }

    // replaces all the matching old value of the array  with the new value
    public static char []replaceElements( char[]array, char oldlValue, char  newValue){

        for (int i = 0; i < array.length; i++) {// i: represents each element of array
            if (array[i]==oldlValue){
                array[i]=newValue;
            }
        }
        return array;

    }

    // replaces all the matching old value of the array  with the new value
    public static String []replaceElements( String[]array,String  oldlValue, String newValue){

        for (int i = 0; i < array.length; i++) {// i: represents each element of array
            if (array[i]==oldlValue){
                array[i]=newValue;
            }
        }
        return array;

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

















