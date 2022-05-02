package day10_NestedIf;

import java.beans.PropertyEditorSupport;

public class NameOfTheMonth {
    public static void main(String[] args) {

       // I need to print the name of then month

       int number=15;// so I should have 13 pre statements. But, If I use it all in a string, it
        // will be easier. So, in this case, I need to use a variable. Because all the months
        //names are string, I can declare  a string variable named result. But any variable that
        //is used within a block ({}) or within a main string, is called a local variable. And
        //these local variables must be initialised before they can be used.
        String result="";// in order to prevent errors, just use a temporary variable "", with a
                        // temporary value, in this case "" nothing



        if (number>=1 && number <=15){//if the number is valid (1~12)
            if (number==1){
                result="January";}
            else if (number==2){
                result="February";}
            else if (number==3){
                result = "March";}
            else if (number==4){
                result="April";}
            else if (number==5){
                result="May";}
            else if (number==6){
                result = "June";}
            else if (number==7){
                result = "July";}
            else if (number==8){
                result="August";}
            else if (number==9){
                result = "September";}
            else if (number==10){
                result="October";}
            else if (number==11){
                result="November";}
            else {
                result="December";}

    }else {// if the number is not valid
        result="Invalid number";}




        }


}
