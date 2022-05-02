package day19_RecapLoopAndString;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aabcccd";
        String result = ""; // in the end, I should have this output   a2b1c3d1

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);// each character from the string
            int count = 0;// it will count how many times the characters in the string are matching with character "a"


            for (int i = 0; i < str.length(); i++) {// to find the frequency of each character
                char each = str.charAt(i);// each character of the string str
                if (ch == each) {
                    count++;
                }
            }
            if (result.contains(""+ch)){
                continue;
            }
            result += ch;
            result += count;

        }
        System.out.println(result);
    }
}

/*
1. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
 */