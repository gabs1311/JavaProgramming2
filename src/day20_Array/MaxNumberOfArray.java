package day20_Array;

public class MaxNumberOfArray {
    public static void main(String[] args) {
        int []numbers = {10,5,4,20,1,0};// find the maximum number from this array
// first I am assuming that the first element is the max. nr, then I will compare it with each element
int max = numbers[0];
// shortcut for normal call first the array, then the fori==> numbers.fori
        // or, backwards==> numbers.forr from reverse
        for (int i = 0; i < numbers.length; i++) {
           if (numbers[i]>max){// if there is an element in the array that is
               // greater than the current maximum number
max = numbers[i];// assigning greater number to variable max
           }
        }

        System.out.println(max);
    }
}
