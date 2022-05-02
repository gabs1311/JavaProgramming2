package day17_WhileAndDoWhileLoops;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str= "AABBCC";// remove the duplicates from the string and store
        // the result in the result string
        String result="";

        for (int i = 0; i < str.length(); i++) {
           // char ch = str.charAt();
           String ch = "" +str.charAt(i);// "A", A, B, B, C,C. This characters I need to add into the result//
// it is best to use the String version, because char is a String method,

            if (result.contains(ch)) {// if the rsult already contains the character
                //break;// exit
                continue;// skip
            }
            result+=ch;

        }

        System.out.println(result);
    }
}
