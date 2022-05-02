package day11_Switch_Scanner;

public class NumbersToWords {

    public static void main(String[] args) {
     /*
	2. Write a program that can convert numbers 0~9 to words.

		NOTE: MUST use ternary
      */
        int nr = 7;
        String result = (nr >= 0 && nr <= 9) ?


                (nr == 0) ? "zero" : (nr == 1) ? "one" : (nr == 2) ? "two" : (nr == 3) ? "three" : (nr == 4) ? "four" : (nr == 5) ? "five" : (nr == 6) ? "six" :
                        (nr == 7) ? "seven" : (nr == 8) ? "eight" : "nine" : "Invalid nr";
        System.out.println(result);




    }
}
