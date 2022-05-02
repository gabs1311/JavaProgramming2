package day21_ForEachLoop;

import java.util.Arrays;

public class        MergeTwoArrays {
    public static void main(String[] args) {
        String[] group1 = {"Ali", "Layan", "Aysenur" }; // 3
        String[] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"}; //5

// 1st thing I have to declare the3rd array, and declare the size
String[]students = new String [group1.length+ group2.length];// to make sure the 3rd array has enough
// capacity to contain the new group, that is made up of the two groups

        int i = 0;
        for (String each : group1) {
            students[i++]=each;
        }

        for (String each : group2) {
            students[i++]= each;
        }
        System.out.println(Arrays.toString(students));


        System.out.println("-----------------------");

        char[] ch1 = {'A','B','C'};
      char [] ch2 = {'D','E','F','G',};
      // the 3rd array length is 1st array's length + 2nd array's length
        char []chars = new char[ch1.length+ ch2.length];
            int j= 0;
        for (char ch : ch1) {
            chars[j]=ch;
                j++;
        }
        for (char ch : ch2) {
            chars[j]=ch;
            j++;
        }

        System.out.println(Arrays.toString(chars));

        }

    }



