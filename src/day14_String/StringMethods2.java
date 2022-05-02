package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {
        // Replace Method

        String str = "Java is fun, I love learning Java.";
        String str2 = str.replace("Java", "Python");// it cannot modify, but it creates
        // a new string. If I want the old string str to remain the same, I can assign the new
        // string to a new variable
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

String email="JohnSmith@yahoo.com";// change the yahoo domain to gmail domain
String gmail = email.replace("yahoo.com","gmail.com" );
        System.out.println("email = " + email);
        System.out.println("gmail = " + gmail);


        String sentence="Java Java Python Python C# C# C++ C++ Python Python Python Python";
       String sentence2 =  sentence.replace("Python", "");
       String sentence3 = sentence2.replace("  ", "");
        System.out.println("sentence = " + sentence);
        System.out.println("sentence2 = " + sentence2);

        System.out.println("sentence3 = " + sentence3);

String s ="dog dog dog dog dog dog";
String cat = s.replace("dog", "cat");
        System.out.println("s = " + s);
        System.out.println("cat = " + cat);


String result = "Java Java Java";
 String result2 = result.replaceFirst("Java", "Python");

        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);

        String result3 = "C# is fun, C# is cool";
     String result4  = result3.replaceFirst("C#", "Java");
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);




    }
}
