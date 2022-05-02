package day24_CustomMethodsReturnMethod;

public class ReturnMethodIntro {
    public static void main(String[] args) {
        String str = "Java";
     String result = reverse(str);
        System.out.println(result);

    if (str.equalsIgnoreCase(result)){
        System.out.println(str +" is palindrome");
    }else{
        System.out.println(str +" is not palindrome");
    }
    }

    public static String reverse(String str){// "Java"
        String reverse ="";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse +=str.charAt(i);
        }
       return reverse;


        // the only difference when I use return method is that it returns me the value,
        // so that I can reassign and use it. In this case, I could reassign it and use it
        // to find if java is a palindrome
    }


}
