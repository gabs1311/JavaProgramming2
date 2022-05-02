package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {


        String str = "123";
      int num =   Integer.parseInt(str);// int
        System.out.println(num+1);// 124, because it added 1 to the value
        System.out.println(str+1);// 1231, because it concatenated 1 to the number




        String str2 = "10.5";
       double str3 =Double.parseDouble(str2);// double
        System.out.println(str3);
        System.out.println(str3+2);//12.5= addition
        System.out.println(str2+2);//10.52= concatenation

int min = Integer.MIN_VALUE;// the min int nr in Java

        System.out.println("min = " + min);
int max = Integer.MAX_VALUE;// the max int nr in Java
        System.out.println("max = " + max);

  long min1 =  Long.MIN_VALUE;
        System.out.println("min1 = " + min1);
        long max1 = Long.MAX_VALUE;
        System.out.println("max1 = " + max1);


        String s1 = "true";// if I give maybe instead, it will return false
        boolean r1 = Boolean.parseBoolean(s1);
        System.out.println(r1);

        System.out.println("-------------");
        String s2 = "123";
     Integer x  = Integer.valueOf(s2);// it returns int
        int y = Integer.valueOf(s2);
        System.out.println(x);
        System.out.println(y);
        
        String s3 = "1.5";
            Double z = Double.valueOf(s3);// double

        System.out.println(z);

        System.out.println("------------------------------");

        char ch1 = 'a';
        // isDigit();
        boolean r2 = Character.isDigit(ch1);
        // isLetter();
        boolean r3 =Character.isLetter(ch1);
        //isLetterOrDigit()   -  for special characters
        boolean r4 = !Character.isLetterOrDigit(ch1);
        //isUppercase()  returns boolean
        boolean r5 = Character.isUpperCase(ch1);
        //toLowercase()   returns boolean
        boolean r6 = Character.isLowerCase(ch1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);


        System.out.println("------------------------");
        String s = "ab1cde2efg3hi4";
        int sum = 0;
        for (char each : s.toCharArray()) {
            if (Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
        }
            
        }

        System.out.println("sum = " + sum);



    }
}