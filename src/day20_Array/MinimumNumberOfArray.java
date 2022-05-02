package day20_Array;

public class MinimumNumberOfArray {
    public static void main(String[] args) {
        int[] numbers = {100,500,30,40,600,80,90};
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<min){// if this condition is true, then the new number will have to be reassigned
                // to min, in order to find the minimum number
                min=numbers[i];
            }

        }
        System.out.println(min);

    }
}
