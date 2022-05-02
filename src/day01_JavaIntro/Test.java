package day01_JavaIntro;



import Utilities.StringUtility;
// so, in order to import a method from utility class, first I write import, then Utility.
// and then select whatever method I need to use



public class Test {
    public static void main(String[] args) {



        System.out.println();
        String str = "Wooden Spoon";

        StringUtility.printEachChar(str);// so I called this method, and now I do not have to use a
        // loop, I can just get the characters and print them each in separate line just by using
        // this method, imported through the class name

    }
}
