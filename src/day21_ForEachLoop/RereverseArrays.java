package day21_ForEachLoop;

import java.util.Arrays;

public class RereverseArrays {
    public static void main(String[] args) {
        int [] numbers ={10,20,30,40};
        // I have to reverse. Result should be {50,40,30,20,10};
      int[]reversed = new int [numbers.length]; // because array;s size is fixed, I have to make sure
        // the array numbers     and the array reversed have the same nr of elements
reversed[0]=numbers[numbers.length-1];// this is to make sure the 1st element printed in the 2nd array
// is the last element for the 1st array. This is what reversing means
 /*           j           i
   reversed[1]=numbers[2];
   reversed[2]=numbers[3];
   reversed[3]=numbers[4];
   // but is musch easier to this with a loop
        */

        for (int i = numbers.length - 1, j=0; i >= 0; i--, j++) {
            reversed[j]=numbers[i];

        }


        System.out.println(Arrays.toString(reversed));
    }
}
