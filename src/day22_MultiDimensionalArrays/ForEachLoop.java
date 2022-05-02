package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        //index of the elements   0 1 2
        int [][]arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12} };
//  index of the array:     0      1           2


for (int [] each1Darray:arr2D){
    System.out.println(Arrays.toString(each1Darray));
        }




    }
}
