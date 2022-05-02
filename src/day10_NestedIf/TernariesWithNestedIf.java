package day10_NestedIf;

public class TernariesWithNestedIf {

    public static void main(String[] args) {
// check if the student passed or failed the exam
        int score = 85;
    if (score>=0&& score <=100){
        if (score>=60){
            System.out.println("Passed");}else if (score<=59) {
            System.out.println("Failed");
        }}else {
        System.out.println("Invalid score");}

// they are all string and they all return the same data value. I can convert it to ternary
    String result   = (score>=0&& score <=100)?score>=60?"Passed":"Failed":"Invalid score";

        System.out.println(result);
// the number of colons and the number of question marks must always be the same- that means
        //the ternary is correct
    }





}
