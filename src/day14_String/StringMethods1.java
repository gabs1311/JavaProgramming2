package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {
            //trim

        String str1 = "     batch25     ";
        str1=str1.trim();// it will eliminate the empty spaces: "batch25"
        System.out.println("str1 = " + str1);
        System.out.println("---------------------------------");

            //indexOf

        String str2 = "Cydeo School";
         int n1    =  str2.indexOf("h");//8
        System.out.println("n1 = " + n1);
        int n2 = str2.indexOf("ool");//9
        System.out.println("n2 = " + n2);
        String str3 = "Java Programming Language";
       int n3 =  str3.indexOf("amm");// if I give a space after a, it will
        // give me the index nr of the 2nd a in Java Programming LAnguage. If I want to
        // find the 3rd a, I have to add the next or the next 2 character after a, in this
        // case amm. The added characters have to be aftre the character I want to find the
        // index of, because Java is reading from left to right. If I want to find the 4th a,
        // I have to adn n, si an in this case, just make sure it is the first combination of
        // that king in this string
        System.out.println("n3 = " + n3);
        int n4 = str3.indexOf("g");
        System.out.println("n4 = " + n4);
        int n5=str3.lastIndexOf("g");// it does the opposite of indexOf, meaning it reads
        // the string from the right to the left


        System.out.println("-------------------------------------");

        String s = "Java Nova Cava Wawa Orange";
        int firstA = s.indexOf("a");
        System.out.println("firstA = " + firstA);
        int lastA = s.lastIndexOf("a");
        System.out.println("lastA = " + lastA);
        int secondA = s.indexOf("a ");
        System.out.println("secondA = " + secondA);
        int thirdA = s.indexOf("a C");
        System.out.println("thirdA = " + thirdA);
        int forthA =s.indexOf("ava W");// different method to find the same thing
        int fortAaa= s.indexOf("Ca")+1;
        System.out.println("fortAaa = " + fortAaa);
        int forthAa = s.lastIndexOf("av");// different method to find the same thing
        System.out.println("forthA = " + forthA);
        int fifthA = s.lastIndexOf("a W");
        System.out.println("fifthA = " + fifthA);
        int sixthA = s.lastIndexOf("aw");
        System.out.println("sixthA = " + sixthA);
        int seventhA = s.lastIndexOf("a ");
        System.out.println("seventhA = " + seventhA);



    }
}
