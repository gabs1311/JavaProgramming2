package day17_WhileAndDoWhileLoops;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

String str = "AAABBBC";
char ch = 'A';// the char that I need to find the frequency for
int frequency = 0;// I have to store it into an integer, because frequency is always an integer number,
// being a decimal//+1+1+1==>3

        for (int i = 0; i < str.length() ;i ++) {// i: indexes of str
           char eachChar = str.charAt(i);// eachChar: each character of str. If I do not declare
            // inside the loopd, I would have to declare for each statement. But if I write in
            // the loop, I don't have to write by my self, the loop is going to repeat it for me
        if (ch==eachChar){// if given ch is matching  with eachChar, then ch is appearing in the string
        frequency++;
        }
        }
        System.out.println(frequency);
    }


}
/*
1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3

 */