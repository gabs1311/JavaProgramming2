package day11_Switch_Scanner;

public class Calculator {
    public static void main(String[] args) {
       /* given two double variables n1, n2 and a char variable named operator,
       use switch statement to calculate the result of n1& n2 based on the given operator
       valid operation are: -, +, *,/
        */
        double n1 = 200.5;
        double n2 = 10.5;
        char operator = '+';
        boolean valid = operator == '+' || operator == '-' || operator == '*' || operator == '/';

        if (valid) {// we have 4 possible operators:+,-,*,/.
            switch (operator) {
                case '+':
                    System.out.println(n1+n2);
                    break;
                case '-':
                    System.out.println(n1 - n2);
                    break;
                case '*':
                    System.out.println(n1 * n2);
                    break;
                default:
                    System.out.println(n1 / n2);

            }


        } else {
            System.err.println("Invalid operator" + operator);


        }

        System.out.println('*');
    }
}
