package day16_ForLoopAndStringPractices;

public class Palindrome {
    public static void main(String[] args) {

       // shortcuts on how to do reversing
       String word = "level";
       String reversed = "";// I want to store it here, so for now I just declare an empty string

        for (int i = word.length()-1; i >=0 ; i--) {
            reversed +=word.charAt(i);

        }

boolean isPalindrome = word.equalsIgnoreCase(reversed);
        System.out.println("isPalindrome = " + isPalindrome);



        /*
        "Java" = = "avaJ"== false = it is not a palindrome
        "Anna" = ="annA" = true =  this is a palindrome
        "level"
        "racecar"
        "mam
         */
    }
}
