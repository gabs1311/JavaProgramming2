package day10_NestedIf;

public class CharacterIdentity {

    public static void main(String[] args) {

        /*

4. Create a class called Character Identity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table

         */

 char ch='@';

 if (ch>=0 && ch<=9){System.out.println("Digit");

 }else if (ch>='A'&& ch<='Z'||(ch>='a' && ch<='z')){
     System.out.println("Alphabetic");}else {
        System.out.println("Special character");};

        System.out.println("------------------");
        // I  might as well replace all values with the corespondents from the
        //Ascii table

        char ch1=64;

        if (ch1>=48 && ch1<=57){System.out.println("Digit");

        }else if (ch1>=65&& ch1<=90||(ch1>=97 && ch1<=122)){
            System.out.println("Alphabetic");}else {
            System.out.println("Special character");};












    }
}
