package day20_Array;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char []alphabets = new char[26];// Z-A
     /*   alphabets[0] = 'Z';//90// this is how I can assign specific element to the specific index of the array
alphabets[1] ='Y';//89
alphabets[2]='X';//88

        //System.out.println(alphabets); I cannot use it to print, it gives hashtag
        System.out.println(Arrays.toString(alphabets));// printing the whole Array
     //   System.out.println(alphabets[0]);//printing the element of Array

    // it is easier to write a loop than to keep on counting*/
/*char ch = 'Z';
    for (int i=0; i< alphabets.length; i++, ch--){
        alphabets[i]=ch;
    }*/
// there is also another solution

     /*   for(char i=0, j='Z'; i< alphabets.length; i++, j--){
            alphabets[i]=j;
        }*/  // this solution is more challenging, the first one is easier
        System.out.println(Arrays.toString(alphabets));



    }
}
