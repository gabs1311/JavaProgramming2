package day15_Loop;

import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {

        System.out.println("enter a word");
        String word= new Scanner(System.in).next();// if I only use the scanner not morethan 1 time
        // , I do not have to call the scanner like the regular, I can use it like this
        // plus, if I do not open the scanner, I do not have to close, either
        // I can also add the .next, as the method I am going to use to call the next method,
        // so that i can use the

        // if the method is char, I get equal by using==. If the method is

        // string, I get equal by using the string method .equal


        if (word.charAt(0)=='x') { word = word.replaceFirst("x","a");
        }

        System.out.println(word);


    }
}
/*1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex


 */