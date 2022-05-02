package day29_ArrayList_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {

    public static void main(String[] args) {
        /*
        1. write a program that can return the nth largest number from an arraylist

			arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
			n = 5

			output:
				4

         */

       ArrayList<Integer>list = new ArrayList<>();
       list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));


        System.out.println(list);
     /*   int max= Collections.max(list);// find the max nr
        System.out.println(max);
        list.removeIf(p -> Collections.max(list)==p);// removes the 1st max number
        System.out.println(list);
// i need to repead this statement as many times as n, so I should use a loop*/

       int n=3;
        for (int i = 1; i <n ; i++) {
            list.removeIf(p -> Collections.max(list)==p);// removes the 1st max number
        }

        int max= Collections.max(list);
        System.out.println(max);
    }
}
