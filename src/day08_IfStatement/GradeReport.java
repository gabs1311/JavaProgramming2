package day08_IfStatement;

public class GradeReport {

    public static void main(String[] args) {
/*      System.out.println(true==!false);// it means true
        System.out.println(!true!= false);// false
        System.out.println(!false== true);// true
        System.out.println(!!false);// false
        System.out.println(!!!true);// false

 */
        int score = 85;// 0~100. If the score is valid, I have 5 possible outcomes. so first I need to
        //create de condition

        boolean a = score>=90;
        boolean b =score>+80 && score<=89;
       // boolean b =score>+80 && !a;// se poate formula si asa is not a, but is greater than 80
        boolean c = score>+70 && score<=79;
       // boolean c = !a && !b && score>+70;// it is not a, not b, but greater than 70

        boolean d = score>=60 & score<=69;
      //  boolean d = !a && !b && !c && score >=60;

        boolean f = score>=0 && score<=59;
       // boolean f = !a && !b && !c && !d;
        if (a){// if the student made A
            System.out.println("Excellent");
        }
        if (b){
            System.out.println("Great");
        }
        if (c){
        System.out.println("Good");}
        if (d){
        System.out.println("Passed");}
        if (f){
        System.out.println("Failed");}






       // 90~`100 ==> Excellent
       // 80~89   ==>Great
        // 70~79 ==> Good
      //  60~69 ==> Passed
     //   0~59 ==> Failed








    }
}
