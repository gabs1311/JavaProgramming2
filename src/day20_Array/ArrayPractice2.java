package day20_Array;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        char[]letters= new char [26];

        for (char i = 'A', j=0; i <='Z'&& j< letters.length; i++, j++) {// i: index numbers from `- last index
           // in Java, can I use this data char to create multiple variables? Can the multiples variables
            // with the same data type be created back to back? YES.  for (char i = 'A'; i <='Z'; i++) All
            // I have to do is create a kama, and give a
            // second variable ==>for (char i = 'A', j=0; i <='Z'&& j< letters.length; i++, j++)
            letters[j]=(char)i;

        }
        System.out.println(Arrays.toString(letters));// A~Z

     /*   for (char i = 'A', j=0; i <='Z'&& j< letters.length; i++, j++) {
            letters[j]=(char)i;}*/ // the way with more than 1 variable in loop

// another way, with just one variable

        char ch ='A';
        for (int i = 0; i < letters.length ; i++, ch++) {
           letters[i]=ch;
        }

        System.out.println(Arrays.toString(letters));


        System.out.println("------------------------------------");
        char[]letters2 = new char[26];

            char cha ='A';
        for (int i = 0; i < letters.length ; i++) {
            letters2[i]=cha++;
        }
        char chaz = 'Z';
        for (int i = 0; i < letters.length; i--) {
            letters2[i]=chaz--;
        }

        System.out.println(Arrays.toString(letters2));
        }
    }




