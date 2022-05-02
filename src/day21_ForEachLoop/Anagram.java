package day21_ForEachLoop;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        // write a program that can check if these two strings are anagrams

        String str1 ="acdb";
        String str2 = "dbca";
      // first I have to sort it, and then check if they are equal. If they are equal,
        // it means they are anagram. If they are not equal, they are not anagram

         char[] ch1=str1.toCharArray();
         char[] ch2 = str2.toCharArray();

        //System.out.println(Arrays.toString(ch1));// not needed, wrote so that I can see how it happens
        //System.out.println(Arrays.toString(ch2));

        Arrays.sort(ch1);
        Arrays.sort(ch2);

       // System.out.println();
       // System.out.println(Arrays.toString(ch1));
       // System.out.println(Arrays.toString(ch2));

        boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println("anagram = " + anagram);


    }
}
