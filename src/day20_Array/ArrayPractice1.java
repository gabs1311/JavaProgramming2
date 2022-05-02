package day20_Array;

import java.util.Arrays;

public class ArrayPractice1 {
    public static void main(String[] args) {

        // store the elements:10;20;50;70

        int[] numbers = {10, 20, 50, 70};/// size:4
        System.out.println(Arrays.toString(numbers));

        System.out.println("----------------------------");
        // create a variable that can contains five scores
        int[] scores = new int[5];// since I do not know the scores yest, I initialize it this way
        scores[1] = 80;// I need to assign this number as the second score in the line
        scores[scores.length - 1] = 95;
        scores[3] = 75;
        scores[0] = 65;
        scores[2] = 55;
        System.out.println(Arrays.toString(scores));
        System.out.println("--------------------------------------------");
        String[] month = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};// 1~11 ( length-1)
      /*  System.out.println(month[0]);
        System.out.println(month[1]);
        System.out.println(month[2]);
        System.out.println(month[3]);
        System.out.println(month[4]);
        System.out.println(month[5]);
        System.out.println(month[6]);
        System.out.println(month[7]);
        System.out.println(month[8]);
        System.out.println(month[9]);
        System.out.println(month[10]);
        System.out.println(month[11]);
        System.out.println(month[12]);*/

        for (int i = 0; i < month.length; i++) {//i: represents the index numbers of array starting from 0

            System.out.println(month[i]);// the loop will repeat all the index numbers of this array, starting from 0
        }

        System.out.println("--------------------------------------");
        // what if I want to print it from the last to the first?
        for (int i = month.length-1; i >=0 ; i--) {// the last index is always.length-1
// i represents the index number of array starting from last index
            System.out.println(month[i]);
        }
    }
}
