package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {

        //index of the elements   0 1 2
        int [][]arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12} };
//  index of the array:     0      1           2

        for (int i = 0; i < arr2D.length; i++) {//i: index numbers of each dimensional arrays
              System.out.println(Arrays.toString(arr2D[i]));


            for (int j = 0; j < arr2D.length; j++) {//j: index number of elements

                System.out.print(arr2D[i][j]+"");// +"" to print in the same line

            }
            System.out.println();// this is to give an extra line

        }



    }
}
