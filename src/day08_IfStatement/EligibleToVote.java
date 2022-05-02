package day08_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {

        String name= "Josh";
        int age = 38;
        String citizen = "USA";
        // I can only have 2 ways: eligible or not eligible
        boolean isEligibleToVote = age>=21 && citizen=="USA";

        //eligile
        if (isEligibleToVote){// true
            System.out.println(name +" is eligible to vote");
        }
        //not eligible
        if (!isEligibleToVote){//!true=false, so it will not be printed
            System.out.println(name + " is not eligible to vote");
        }

    }
}
