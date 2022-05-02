package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class    MultiDimensionalArraysIntro {
    public static void main(String[] args) {
      // this is how I declare a multi dimension array if I know how many array there will be,
        // but I don't know the exact array


        String [] group1 = {"Ana", "Joes","Jamal"};
        String [] group2 = {"Gigi", "Joes","James"};
        String [] group3 = {"Jon", "Mira","James"};


        String [][]groups = new String[3][];// index 0,1,2
        groups[0] = group1;
        groups[1]=group2;
        groups[2]=group3;

        System.out.println(Arrays.toString(groups));// toString method is ONLY for one dimension array ONLY
        System.out.println(Arrays.deepToString(groups));


        System.out.println("--------------------------------------");
        // this is how I declare the multi dimension array if I know the array
        /* let's say I know these arrays:
        {1,2,3};
        {4,5,6,7};
        {8,9,10,11,12};
*/
//index of the elements   0 1 2
        int [][]arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12} };
//  index of the array:     0      1           2

        System.out.println(Arrays.deepToString(arr2D));
        //{4,5,6,7};
        System.out.println(Arrays.toString(arr2D[1]));

        //11
        System.out.println(arr2D[2][3]);
    }
}
