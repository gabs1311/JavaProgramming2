package day14_String;

public class EmailDomain_Substring {

    public static void main(String[] args) {

        String email = "Cydeo.School@gmail.com";
        // domain:
        int beginningIndex = email.indexOf("@")+1;// I add 1 because I need to create a new string AFTER @
        int endingIndex = email.lastIndexOf(".");
        String domain=email.substring(beginningIndex,endingIndex);
        System.out.println(domain);


        System.out.println("---------------------------------");

        String str1 = "Java is fun, Java is cool, I love Java";
        //             0123456789
      // Java is fun
  String s1 =  str1.substring(0,10+1);
        System.out.println(s1);

        int beg = str1.indexOf(" J")+1;
        int end = str1.lastIndexOf(",");
        String str2 = str1.substring(beg, end);
        System.out.println(str2);

       /* int beg1 = str1.indexOf("I");      // the more complicated method
        int end2 = str1.lastIndexOf("a")+1;
        String s3  = str1.substring(beg1, end2);// I love Java*/
        String s3 = str1.substring(str1.lastIndexOf("I") );// the easier methd

        System.out.println(s3);


    }
}
