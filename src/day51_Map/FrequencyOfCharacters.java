package day51_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

      /*  Write a program that can return the frequency of characters
        Not: MUST use map
        Ex: str = "bbcccaaaaa"
        output:
        {b=2, c=3, a=5}
        */


      String str = "bbcccaaaaa";
        //           bca
        //           235
        //Collections.frequency()
        
      String []arr = str.split(" ");

        Map<String, Integer> result = new LinkedHashMap<>();// if I use something else, I will not be
        // getting this order   {b=2, c=3, a=5}

        for (String each : arr) { // each: a,b,c  characters of string
           int frequency =  Collections.frequency(Arrays.asList(arr), each);
            result.put(each,frequency);
        }

        System.out.println(result);

    }
}
