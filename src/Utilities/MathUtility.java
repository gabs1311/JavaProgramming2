package Utilities;

public class MathUtility {

    // odd of even int
    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }

    }

    // area of a circle
    public static void AreaOfCircle(double radius) {

        double area = radius * radius * 3.14;
        System.out.println("area = " + area);
    }

    //area of Square

    public static void AreaOfSquare(double side) {
        double squareArea = side * side;
        System.out.println("squareArea = " + squareArea);
    }

    // positive negative, or zero int
    public static void PositiveNegativeOrZero(int number) {

        if (number > 0) {
            System.out.println(number + " is positive");
        } else if (number < 0) {
            System.out.println(number + " is negative");
        } else {
            System.out.println(number + " is zero");
        }
    }

    // calculator +; - ; / ; *
    public static void Calculator(double nr1, double nr2, char operator) {

        String result = " Invalid";
        if (operator == '-' || operator == '+' || operator == '/' || operator == '*') {
            if (operator == '-') {

                result = "Subtraction :" + (nr1 - nr2);

            } else if (operator == '+') {
                result = "Additon: " + (nr1 + nr2);

            } else if (operator == '/') {
                result = "Division:" + (nr1 / nr2);
            } else {
                result = "Multiplication: " + (nr1 * nr2);
            }

        }
        System.out.println(result);

    }


    // return the sum of two integers
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    //return the sum of two decimal numbers
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    // return the subtraction of two integers
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // return the subtraction of two decimals
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // return the multiplication of two integers
    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    // return the multiplication of two decimals
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }


    //passes two double parameters and return the division result
    public static double division(double num1, double num2) {
        return num1 / num2;
    }


    //checks if an integer is even number

    public static boolean isEven(int num){
        return (num%2==0)? true: false;
    }

    //checks if an integer is odd number
    public static boolean isOdd(int num){
        return (num%2!=0)? true: false;
    }

    // returns the maximum number between two integers
    public static int max(int num1, int num2){
        return (num1>num2) ? num1 : num2;
    }

    //returns the maximum number between two decimal numbers
    public static double max(double num1, double num2){
        return (num1>num2) ? num1 : num2;
    }

    // returns the minimum number between two integers
    public static int min(int num1, int num2){
        return (num1<num2) ? num1 : num2;
    }

    // returns the minimum number between two decimal numbers
    public static double min(double num1, double num2)
    {
        return (num1<num2) ? num1 : num2;
    }

    // returns the square of an integer
    public static int square(int num){
        return num * num;
    }

    //returns the square of a double
    public static double square(double num){
        return num * num;
    }

    //returns the cube of an integer
    public static int cube(int num){
        return num * num * num;
    }

    // returns the cube of a double
    public static double cube(double num){
        return num * num * num;
    }

}
