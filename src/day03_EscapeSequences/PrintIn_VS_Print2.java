package day03_EscapeSequences;

public class PrintIn_VS_Print2 {

    public static void main(String[] args) {// this is the main method

        System.out.println("Knock Knock");// first it prints knock knock and then it appends a new line
        System.out.println("Who is this?");

        System.out.println("This is Java");
        System.out.println("----------------------------");// used to separate topics

        System.out.print("Knock Knock");//it prints knock knock, it DOES NOT append a new line
        System.out.print("");
        System.out.print("Who is this?");
        System.out.print("This is Java");
        System.out.println();// used to create an empty line in between two lines
        System.out.println("--------------------------");
        System.out.println("Hello everyone. how are you all today? Today we learn about escape sequences and tomorrow we will learn about Variables ");
        System.out.println("----------------------------");
        System.out.print("Hello everyone");
        System.out.print("How are you all today?" );
        System.out.print("Today we learn about escape sequences");
        System.out.print("and tomorrow we will learn about Variables");// if it is just prin, no ln, it will be written separately, but shown in the same line on the console
//the multiline comments are being started and ended with the symbols below
/* topics:
println method
print method
Comments*/


    }



}
