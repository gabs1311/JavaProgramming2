package day29_ArrayList_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayAndArrayList {
    public static void main(String[] args) {
        // array reverse
        int[] array={1,2,3,4,5,6};
        int[]result = new int[array.length];// {6,5,4,3,2,1}
        int j=0;
        for (int i =  array.length-1;i>=0; i--, j++) {
                result[j]=array[i];
            
        }
        System.out.println(Arrays.toString(result));


        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        ArrayList<Integer>reversedList = new ArrayList<>();
        for (int i = list.size()-1; i >=0; i--) {
           int each =list.get(i);// we get each element, starting from index 0
            reversedList.add(each);
        }
        System.out.println(reversedList);
        }
    }
