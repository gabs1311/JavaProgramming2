package Utilities;

import java.util.Arrays;

public class StringUtility {




    // prints each character of the given string
    public static void printEachChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
// prints each character of the given String in a single line
public static void PrintEachCharSingleLine( String str){
    for (int i = 0; i <str.length() ; i++) {
        System.out.print(str.charAt(i));
    }
    }

    //  reverses any given string and returns the reversed string
    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;


    }
    // checks the frequency of word in a string and returns int frequency
    public static int FrequencyOfWord(String sentence,String word) {
        int frequency = 0;

        while (sentence.contains(word)) {// while loop will repeat until condition is false
            sentence = sentence.replaceFirst(word, "");// once found, the word will be replaced by "", to avoid reading the same condition over and over again
            frequency++;
        }

        return frequency;


    }


    //checks if the given string is palindrome, returns boolean

    public static boolean isPalindrome(String str) {
        return reverse(str).equalsIgnoreCase(str);
    }

    //check sif the given string is anagram, and returns boolean
    public static boolean isAnagram(String str1, String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);

    }


    // removes the duplicates from given string, returns String  "aaaaabbbccccc" --> "abc"
    public static String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if ((!result.contains("" + each))) {
                result += each;}
        }
        return result;
    }


}
