package day16_ForLoopAndStringPractices;

public class ReverseAString {
    public static void main(String[] args) {
    String str = "Java is a cool programming language";

    String result= "";// the reversed string I want to get will be a data,right?
        // So, I can use a String to declare it, with the purpose of containing this
        // result at the end. At this moment, it is an empty string. So it's purpose
        // is to contain the reversed string

   str.charAt(str.length()-1);// First I need to find out the index numbers.
        // it will return the last character, that is n
       // noopS nedooW

// this is one method I could use, it is going to take longer, because I have to
// write all the codes , one by one
   /*     result+=str.charAt(11);//n // I use + because I need to concatenate each rseult
        result+= str.charAt(10);//o// back to the string
        result+= str.charAt(9);//o// I use this method only for checking, but DO NOT
        result+= str.charAt(8);//p// use it for interview
        result+= str.charAt(7);//s
        result+= str.charAt(6);//" "
        result+= str.charAt(5);//n
        result+= str.charAt(4);//e
        result+= str.charAt(3);//d
        result+= str.charAt(2);//o
        result+= str.charAt(1);//o
        result+= str.charAt(0);//w

        System.out.println(result);*/

        for(int i=str.length()-1; i>=0; i--){//i:index nr of str, starting from last index to index 0
           result+= str.charAt(i);// adding each character to result


        }   System.out.println(result);

// println gives a new line every single time
     //   print





    }
}
/*1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW

 */