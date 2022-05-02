package day24_CustomMethodsReturnMethod;

public class ReturnMethodPractice {
    public static void main(String[] args) {
        // find the max between 100 ~200
 int maxNumber=max(100, 200);
        System.out.println(maxNumber);

        // multiply the max nr by 2

        int multiplication = maxNumber*2;
    }
    public static int max(int a,   int b) {
        int result = 0;// the variable where I am going to store then maximum number
        if (a > b) {
            result = a;
        } else {
            result = b;
        }
return result;
    }
}
// create a method that can return the maximum nr out of two numbers

