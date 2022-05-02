package day19_RecapLoopAndString;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aabccdeef";
        String result = "";// a variable where I can store the final result

        for (int j = 0; j < str.length(); j++) {


            char ch = str.charAt(j);// by using charAt method and j, I get oll the characters

            // if this is a char that I need to find the frequency of, I need to compare this char
            // with every single character of the string"aabccdeef"
            int count = 0;// I am also going to need a variable that helps me count kow many times the char is
            // matching the characters of the string. So, represents the frequency of the variable ch

            // so, the variable char contains the character and count it contains the frequency of that
            // character in the string "aabccdeef"

// in order to find the frequency of the character stored in ch, I need to compare this character with
// every single character that I have in the String  "aabccdeef". And charAt method can get me every
// single character. And, instead of calling this charAt method 9 times ( one time for each character),
// I create a loop to do that for me. The loop can get me the characters starting from index 0 till the last index

            for (int i = 0; i < str.length(); i++) {// compared the character the outer loop picked with
                // each character of the string
                char each = str.charAt(i);//Within this loop, by using i as the index number, I am able
                // to get each character of the string .And now I have this variable each that is representing each character
                // of the string. So if I want to find the frequency of this char ch all I have to do is compare
                // it with char each .whenever this character is matching with the ch character of the
                // string, I need to increase the frequency by one, so I create a condition for it

                if (ch == each) {
                    count++;
                }
            }

         /*   if (count == 1) {// if the frequency of the character is one, then the character is unique
                result += ch;
            }*/

            if (count != 1) {// this will skip the characters that do not match
                continue;
            }
            result += ch;
        }
        System.out.println(result);
    }
}

// this is how I can find the frequency of one character
        // so, in order to complete the task, I need to check every character in my String, meaning I have
        // to repeat the code nine times, since I have 9 characters in my string. I will use a loop instead
        // so I create a loop and place everything inside the loop


        // another way to solve this would be to ignore the characters that are not unique.
// also, if I want to print the duplicateded characters, all I have to do is increase the nr in count



/*

	2. Write a program that can find the unique characters from a string without
	using indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

 */