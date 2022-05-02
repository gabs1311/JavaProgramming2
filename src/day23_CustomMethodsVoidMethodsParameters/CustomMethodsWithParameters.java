package day23_CustomMethodsVoidMethodsParameters;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {
     // oddOrEven();// the methods demands additional info to complete its task

        oddOrEven(10);

        System.out.println("---");
        ageOfPerson(1956);

    }





    //create a function that can check if a number is odd or even number==> oddOrEven

    public static void oddOrEven(int number){
        if (number%2==0){
            System.out.println(number+ " is even number");
        }else{
            System.out.println(number+" is odd number");
        }

}

// create a function that can display the age of the person==>ageOfPerson
    public static void ageOfPerson(int birthYear){
        int age=2022-birthYear;
        System.out.println("age = " + age);
        System.out.println("your age is: "+ age);

    }


    // create a function that can print all the numbers between x and y==> printNumbers

    public static void prinNumbers(int x, int y){

        }

    }


