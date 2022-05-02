package day08_IfStatement;

import java.sql.SQLOutput;

public class LogicalOperators {
    public static void main(String[] args) {
   String name = "Steven";
     int age = 19;
     String citizen = "UK";
     boolean isEligible = age>=18 && citizen=="USA";
     //                 19>19   &&   UK = USA
        //              true  &&     false ===> it is going to give false


        //HINT - If one of the expressions is false, I don't need to cehck the 2nd one, because
        // for the Logical and operator, both expressions must be true in order to work


        System.out.println(name+ " is eligible to vote: "+ isEligible);

        System.out.println("-------------------------------------------");
        //Apply for a loan
        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 23;
        int income = 40000;


        boolean isEligible2 = age2>=21 && creditScore >=700&& income>=60000;
        System.out.println(name2+ " is eligible for a loan: "+ isEligible2);

        System.out.println(" LOGICAL OR OPERATOR...................................");

        // or means either - so either of the conditions is met, we get true
        String name3 = "Shay";
                int age3 = 21;
                char gender ='F';
                boolean iseligigileToRegisterforService = age3>=18 && (gender== 'M'|| gender=='F');
                //                                          21>=18 && ('F"=='M'   ||'F'=='F'
                //                                          true  &&    false     || true
                //                                           true  &&      true
                //                                                   true
        System.out.println(name3 + " is eligible for service: "+ iseligigileToRegisterforService);
        System.out.println("---------------------------------------------------------");

        String name4 ="James";
        String countryOfBirth = "UK";
        boolean marriedToAUsCitizen = false;
        boolean canApplyForCitizenship = countryOfBirth=="USA" || marriedToAUsCitizen;//
        // only one condition must be met, since it is logical or operator
        System.out.println(name4 + " is eligible to apply for US citizenship: "+ canApplyForCitizenship);


        System.out.println("-------------------------------------------");
        String student="anna";
        double gpa = 3.5;
        int familyIncome = 100000;
        boolean applyForScholarship = gpa>=3.5 || familyIncome<= 60000;
        System.out.println(student+ " is eligible to apply for a scholarship: "+ applyForScholarship);


        System.out.println("--OPOSITE OPERATOR----------------------------");
        boolean result2 = true;
        System.out.println("result2 = " + result2);
        boolean result3 = !result2;
        System.out.println("result3 = " + result3);

        System.out.println("-----------------");
        int score = 85;
        boolean passed = score>=60;
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);



        //






    }
}
