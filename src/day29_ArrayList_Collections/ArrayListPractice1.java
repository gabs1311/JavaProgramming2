package day29_ArrayList_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {
        /* create an array of string called countries
        write a program that can remove all the country names that have length of 10 or greater
   */

        String[]countries = { "Japan", "Corea", "United States", "Turkey", "United Kingdom", "Canad"};
//  converting array to the arrayList

        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));
        list.removeIf(p ->  p.length()>=10);
        System.out.println(list);

        // converting array list back to array
       countries= list.toArray(new String[0]);
        System.out.println(Arrays.toString(countries));
    }

}
