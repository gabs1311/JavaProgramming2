package day13_String;

public class StringMethods {
    public static void main(String[] args) {

        String word = "Cydeo";// substract the 3rd character
// index -  the fist character is always 0, the last one depends on the length of the string
 // "Cydeo
 //  01234



        char thirdChar = word.charAt(2);// because the counting starts at 0, I need to
        //subtract 1 from the character number I want to print on the console
        System.out.println("thirdChar = " + thirdChar);

/*
        char tenthChar = word.charAt(9);
        System.out.println("tenthChar = " + tenthChar);// If I give a number that is out of range,
        // I will get StringIndexOutOfBoundsException, meaning String index is out of range.If
        //I have 5 characters , the maximum index I can get is 4, because the index starts counting
        // from 0
*/

        System.out.println("-------------------------");
        String s1 = "Batch 25 is the best batch";

int totalChar = s1.length();
        System.out.println("totalChar = " + totalChar);
char lastNr = s1.charAt(totalChar-1);
        System.out.println("lastNr = " + lastNr);
        char lastNrb = s1.charAt(  s1.length()-1);// same result but different way of writing it
                                                // last index number
        System.out.println("lastNrb = " + lastNrb);

        System.out.println("--------------------------------");

       String str = "wooden spoon";
       str.toUpperCase();//it creates a new string object "WOODEN SPOON"
        // right now I have 2 objects: wooden spoon and WOODEN SPOON, because de string is i
        //immutable. If I want is to be printed in upper cases, then I need to asign
        // the str.toUpperCase() back to the variable str in order to be printed in upper
        //cases. Why is that? because one variable can contain only one data, and in this
        // moment, str variable contains the data wooden spoon, so, if I want it to contain
        //the data WOODEN SPOON, I have to assign it back to the variable str
        str=str.toUpperCase();// now it will print WOODEN SPOON
        System.out.println(str);

        System.out.println("----------------------");
        //Today is a great day to learn Java Programming language.
        String sentence = " Today is a great day to learn Java Programming language. ";
        sentence=sentence.toUpperCase();// do not forget: string is immutable. So this method
        // will not change the the first object "Today is...", but it will create a new object
        // that is "TODAY IS..." . So if I want a new object to be assigned to my sentence variable,
        // I must assign it back
        System.out.println(sentence);





    }
}
