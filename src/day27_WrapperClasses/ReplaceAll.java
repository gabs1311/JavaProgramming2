package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {

    public static void main(String[] args) {
       int[] arr = {10, 10, 20, 30, 40, 30, 30, 30};
       replace(arr,30, 300);
        System.out.println(Arrays.toString(arr));
        replace(arr,300, 500);

        System.out.println(Arrays.toString(arr));

    }




    // replaces all the matching old value of the array  with the new value
   public static int[]replace( int[]array, int oldlValue, int newValue){

       for (int i = 0; i < array.length; i++) {// i: represents each element of array
           if (array[i]==oldlValue){
               array[i]=newValue;
           }
       }
       return array;

   }



   // replaces all the matching old value of the array  with the new value
    public static double []replace( double []array, double oldlValue, double newValue){

        for (int i = 0; i < array.length; i++) {// i: represents each element of array
            if (array[i]==oldlValue){
                array[i]=newValue;
            }
        }
        return array;

    }

    // replaces all the matching old value of the array  with the new value
    public static char []replace( char[]array, char oldlValue, char  newValue){

        for (int i = 0; i < array.length; i++) {// i: represents each element of array
            if (array[i]==oldlValue){
                array[i]=newValue;
            }
        }
        return array;

    }

    // replaces all the matching old value of the array  with the new value
    public static String []replace( String[]array,String  oldlValue, String newValue){

        for (int i = 0; i < array.length; i++) {// i: represents each element of array
            if (array[i]==oldlValue){
                array[i]=newValue;
            }
        }
        return array;

    }



}
/*
2. RecplaceAll Task:
		2.1 Create a method named replaceAll that passes three parameters: integer array, integer oldElement, integer newElement. The method replaces all the element of the array that matching with the given old element with the given new element, and returns the new array.
			Ex:
				arr = {10, 10, 20, 30, 40, 30, 30, 30};

				replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}


		2.2 Create the same functions for double arrays, char arrays, and String arrays

 */