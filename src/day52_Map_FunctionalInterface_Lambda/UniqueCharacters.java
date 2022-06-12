package day52_Map_FunctionalInterface_Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {
    public static void main(String[] args) {

        /*
1. Write a program that can find the unique characters from a String
			Ex:
					str = "aabcccdeeeef";
			output:
					{b=1, d=1, f=1}
 */

        String str = "aabcccdeeeef";

        String []arr = str.split("");

        Map<String, Integer> result= new LinkedHashMap<>();
        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr),each );
            if (frequency==1){
                result.put(each, 1);// under these conditions, the frequency is always 1
            }
        }

        System.out.println(result);








    }
}
