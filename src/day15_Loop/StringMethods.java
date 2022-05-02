package day15_Loop;

public class StringMethods {
    public static void main(String[] args) {

        String str = "";
        boolean r = str.isEmpty();// if I turn "" into " ", the string is not empty anymore
        System.out.println(r);// because it has one space

        boolean r1= str.isBlank();// the blank means it has no characters, but it can have spaces
        System.out.println(r1);

        System.out.println("--------------------------------");
        String s1 = "CYDEO";
        String s2 = "cydeo";
        System.out.println(s1.equals(s2));// compare the words with case sensitivity
        System.out.println(s1.equalsIgnoreCase(s2));// compare the words without case sensitivity

        System.out.println("_____________________________________");
        String sentence = "My favourite programming language is Java";
        boolean hasCsharp=sentence.contains("Csharp");// it checks if the string contains the word
        // Csharp
        boolean hasJava = sentence.contains("Java");// checks it the string contains Java
        System.out.println(hasCsharp);
        System.out.println(hasJava);

        boolean hasJava3= sentence.toLowerCase().contains("java");//If I want to ignore contains method,
        //when I use case sensitivity, I call toLowercase first, and that returns me a string. Contain is a String method,
        // so I can call it, even it returns boolean. This is how I can ignore case sensitivity
        System.out.println(hasJava3);
        boolean r3 = sentence.contains("Java") || sentence.contains("java");


        System.out.println("_______________________________________");
        String input1 = " I love Java";
        String input2 = "Java";
        System.out.println(input1.equals(input2));//false, because it compares the whole string
        System.out.println(input1.equalsIgnoreCase(input2));// false, because they have different
        // nr of characters

        System.out.println(input1.contains(input2));// because it only compares that part of string
        // in the 2nd string
        System.out.println(input1.toLowerCase().contains(input2.toLowerCase()));
        System.out.println(input1.toLowerCase().contains("java"));// another way to get the same result
        System.out.println(input1.toUpperCase().contains("JAVA"));// another way to get the same result

        System.out.println("___________________________________");
        String a = "Wooden Spoon";
        boolean x = a.startsWith("Woo");
        boolean y = a.endsWith("poon");
        boolean z = a.startsWith("wooden");// if I want to ignore case sensitivities, I just use
        // .toLowerCase or .toUpperCase, because I do not have the ignore method



        System.out.println(x);
        System.out.println(y);
    }
}
