package Week03;

import javax.lang.model.SourceVersion;

public class DifferenceBetweenAndOrBitwiseOperators {
    public static void main(String[] args) {

        int i1 = 5;
        int i2 = 10;
        System.out.println(true|false);// true
        System.out.println(true|| false);// true again, but it does not check the second statement

        System.out.println(i2>i1||i1>12);

        System.out.println(i2>i1||++i1>i1);
        System.out.println("i1="+i1);// we will get 5


        boolean a = i1>i2&&i2<i1;// true or false
        System.out.println("a = " + a);
        System.out.println("i1="+i1);


    }
}
