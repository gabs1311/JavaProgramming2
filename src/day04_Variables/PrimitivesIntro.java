package day04_Variables;

public class PrimitivesIntro {


    public static void main(String[] args) {

    //age:38 years old
        byte age = 38;
    //weight:160
        //byte weight  = 160;//160 is out of byte' range
       // byte num = -129;// -129 is ut of byte's range
      short weight = 160;// because 160 is within the range of short
      // salary:100000 $
       // short salary =100000;//because 100000 it is out of short range
      //  int salary = 100_000;//preferred data type for the integer numbers
       // int asset = 3_333_333_333// because 3_333_333_333 is not within int range
        // because the compiler takes int by default, I need to let the compiler know that it is a long type integer, so I type L orl at the end of the line

       long asset = 3_333_333_333L;

        //tax 0.26  out of flot and double, the double is the preffered one
        float tax = 0.26F;

      //#
      char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 35000;
        System.out.println("ch3 = " + ch3);

        char gender = 'F';
        System.out.println("gender = " + gender);

        String name = "Wooden Spoon";
        String city = "Oradea";
        System.out.println("city = " + city);



        long a=30L;
        long b = (short)a;
        System.out.println(b);
        System.out.println("---------------------");







        long x=3_000L;
        double z = (float)x;
        int c=(short)z;
        System.out.println(c%1000);


        System.out.println ( 10/3 );

      System.out.println (  10/3.0  );
      System.out.println (  (int)(10.0/3)   );





    }

}
