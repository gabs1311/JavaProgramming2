package day15_Loop;

public class ForLoopPractices {
    public static void main(String[] args) {

        //15 16 17 18....35

        /*sout System.out.println(15);
         System.out.println(16);
          System.out.println(17);

          ......
           System.out.println(45);
not smart, so will use loop

         */

        for (int i=15; i<=45; i++){//i:15,16,17...45
         //   System.out.println(i);// if I use the method system.out.println,
            // it will print them one below the next one
            System.out.print(i +" ");// if I use method system.out.print, the console will print
            // in a string




        }
        System.out.println();// this will give an empty space, so the next statement
        // starts from the next line
        System.out.println("Hello");


        System.out.println("________________________________________________");
        //100-50
        for (int ii=100; ii>=50; ii--){// ii=100,99,98...50. If it is 49, it is <50,
            // so it will take forever to run. How do i know if 50 is included ot not? By
            // checking the relational operators (>,<,<=>=..
            System.out.print(ii + " ");

        }
        System.out.println();

        System.out.println("-----------------------------------------");
      /*  // print all the even numbers 1~55;
        for(int i =1; i<=55; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");

            }
        }

        System.out.println();// extra line so that my next statement starts from the next line
        // another solution to this would be to work with the even numbers
        // so 1~55: 2,4,6...*/

        System.out.println("-----------------------------------------");
        System.out.println();
        for (int i =2; i<=54; i+=2){// i: 2,4,6,8...

            System.out.print(i+" ");
        }







    }
}
