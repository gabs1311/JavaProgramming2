package day29_ArrayList_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {
       // I want to find every uniqee characters from this string
        String str = "aaabcccdeeef";// in order to use the frequency method that is
        // already build in java, I need to have an array list. If I have a string, how
        // can I create am array list from this string? I cannot create it directly.BUT
        // if can create a non primitive array from the string, I can create the array
        // list from the non primitive array. I cannot use charAt, because it gives me
        // primitives, but I can use split method, that will turn the characters into
        // single characters, forming an array

       /* String[]arr= str.split("");  //this is one way
        ArrayList<String>list = new ArrayList<>(Arrays.asList(arr));*/

        ArrayList<String>list = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println("list = " + list);// now I have all characters in an array
        String unique = "";
        for (String each:list){
            int frequency = Collections.frequency(list, each);
            if (frequency==1){
                unique+=each;// String does not have add method, I do concatenation
            }

        }

        System.out.println("unique = " + unique);


    }
}
