package day41_Exceptions;

import day29_ArrayList_Collections.day39_EncapsulationAndInheritancePractice.CydeoTask.Student;

public class CheckedVsUnchecked {

    public static void main(String[] args) {


        // unchecked exception:
        int a = 10;
        int b = 0;
        //  System.out.println(a/b);

        //    System.out.println("WoodenSpoon");


        //  char[] characters = {'A','B','C'};
        //    System.out.println(characters[99]);// If I cannot handle this error, I cannot run the next line of code
        // the next line


        Student student = null;
        // System.out.println(student.getName()); the student object being null, I get the exception
        //  student.study();


       final String str = "WoodenSpoon";
       // str = null;// str being null, Wooden Spoon  object is collected by Garbage collector
        System.out.println(str.toUpperCase());// instance I must call through an object, so null does not exist

   // I must have an object, because that is where instance belong
        // In order to make sure the data will not reach the garbage collector, I can use the final keyword
        // so , if I put the final keyword in front of String, the object WoodenSpoon cannot be reassigned

        String str2 = "";// object !=null
        System.out.println(str2.isEmpty());



        // checked exceptions

        System.out.println("Hello");
      //  Thread.sleep(3000);// a method that can pause the code to be run for an amount of sec

        System.out.println("Cydeo");



    }
}
