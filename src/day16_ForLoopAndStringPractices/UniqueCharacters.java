package day16_ForLoopAndStringPractices;

public class UniqueCharacters {
    public static void main(String[] args) {



        String str = "aaabccc";
        String result = "";

        for (int i = 0; i < str.length(); i++) {// i: index numbers of the string,starting from 0
            char ch = str.charAt(i);// ch: represents each character of the string


            if (str.indexOf(ch) == str.lastIndexOf(ch)) {// if the first and the last index numbers
                result += ch;                          // of the character are the same, the character is unique
            }
        }

        System.out.println(result);

    }
}
/*3. Write a program that can return the unique characters from a String
		Ex:
				input:
					AABCCD

				output:
					BD
			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique



				  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1


				  indexOf('B') ==>2
				  lastIndexOf('B') ==> 2




 */