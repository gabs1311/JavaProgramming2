package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

/*  90~100   excellent
    80~89   great
    70~79   good
    60~69   passed
    50~59 failed
 */

  int score = 95;
  boolean TrueScore= score>=0 && score <=100;//this condition must be met, in order to have all the possible outputs
        //it basicly means I have 5 posibilities

  if (TrueScore){// if the score is valid
      if (score>=90 ){// it is enough score>=90
          System.out.println("Excellent");}
      else if (score>=80 ){
          System.out.println("Great");}
      else if (score>=70 ){
          System.out.println("Good");}
      else if (score>=60 ){
          System.out.println("Passed");}
      else if (score>=50 ){
          System.out.println("Failed");};}
  else{// if the score is not valid

      System.out.println(!TrueScore);};// if the score is not valid

        System.out.println("----------------------------------------");

        String result="";// temporary variable

        System.out.println(result);

        if (TrueScore){// if the score is valid
            if (score>=90 ){// it is enough score>=90
               result =("Excellent");}
            else if (score>=80 ){
               result=("Great");}
            else if (score>=70 ){
               result=("Good");}
            else if (score>=60 ){
                result=("Passed");}
            else if (score>=50 ){
                result=("Failed");};}
        else{// if the score is not valid

            System.out.println(!TrueScore);};// if the score is not valid

// so, whenever I want to use a single statemnt, assign a temporary varianble String result="";// temporary variable








        
    }
}
