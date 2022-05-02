package day09_IfStatements;

public class PozNegZero {
    public static void main(String[] args) {
      int n =100;
      if (n>0){System.out.println("Positive");};
      if (n<0){System.out.println("Negative");};
      if (n==0){System.out.println("Zero");};
      // this was the hard way, because the compiler has to check each condition.
        // We can also use the easy and productive way, that is multi-branch if
        //
        if (n>0){System.out.println("Positive");}else if (n<0){System.out.println("Negative");}
        else if(n==0){System.out.println("Zero");};







    }
}
