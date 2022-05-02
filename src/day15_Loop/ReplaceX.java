package day15_Loop;

public class ReplaceX {
    public static void main(String[] args) {
String str = "xcodex";
String result=str.replaceAll("x", "a").replaceAll("X", "a");// I had to call
// the replace method twice, because I had both x and X to replace with a
        // when I use a back to back method, meaning calling the method twice, I have to make sure I am
        // using the string methd, otherwise it will not work
        System.out.println(result);



    }
}



/*
2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */