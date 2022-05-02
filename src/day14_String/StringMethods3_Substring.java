package day14_String;

public class StringMethods3_Substring {
    public static void main(String[] args) {

        //substring(beginning index, ending index); method

        String word = "Cydeo school";
        //             01234...
        String brand = word.substring(0,4+1);
        System.out.println("brand = " + brand);

        String str1 = word.substring(5,10+2);
        System.out.println("str1 = " + str1);

        String word2 = "Java Programming Language";
     /* int str2 =word2.indexOf("Java");

   int str3= word2.indexOf("Programming");
   int str4 = word2.indexOf("Language");
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
        System.out.println("str4 = " + str4);

        String final1 = word2.substring(0,4);
        String final2 = word2.substring(5,16);
        String final3 = word2.substring(17);
        System.out.println("final1 = " + final1);
        System.out.println("final2 = " + final2);
        System.out.println("final3 = " + final3);*/



        String word5 = "Python C# Ruby";


        String s1 = word5.substring(0,word5.indexOf(" "));
        System.out.println(s1);
        String s2 = word5.substring(word5.indexOf(" ")+ 1, word5.lastIndexOf(" "));
        System.out.println(s2);
        String s3 = word5.substring(word5.lastIndexOf(" ")+1);
        System.out.println(s3);

    }
}
