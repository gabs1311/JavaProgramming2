package day21_ForEachLoop;

public class ForEachLoopIntro {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50,60,70};


        for (int i = 0; i < numbers.length; i++) {//i: indexes of the array
            int eachElement  =numbers[i];
            System.out.println(eachElement);
            // this regular loop is an ok way to get the elements, but not the fastest
        }
// !!!!! If I want to alter the indexes of the array, I can never use for each loop

        System.out.println("------------------------------------------------");
        for (int each:numbers){// each: elements of the array
            System.out.println(each);
        }// same task, but faster, because I used for each loop
    }

}
