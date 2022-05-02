package day10_NestedIf;

public class FieldTrip {
    public static void main(String[] args) {
/*8. Create a class called FieldTrip. Your school goes on a Field trip each year.
 The place you go will be based on your grade. Given a variable gradeNumber (1-6)
  figure out the details of your field trip. Print the information at the end.

    Data based on grade:

        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee

        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson

        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes

        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela

        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt

 */
        int grade = 2;// 1~6
        if (grade >= 1 && grade <= 6) {
            if (grade == 1) {
                System.out.println(" location -  Apple orchard\n" +
                        "number of groups - 3\n" +
                        "teacher in charge - Ms. Smith  ");
            } else if (grade == 2) {
                System.out.println(" location - Zoo\n" +
                        "number of groups - 7\n" +
                        "teacher in charge - Mr. Lee ");

            } else if (grade == 3) {
                System.out.println("location - Aquarium\n" +
                        "number of groups - 5\n" +
                        "teacher in charge - Ms. Wilson ");

            } else if (grade == 4) {
                System.out.println(" location - Movie theater  \n" +
                        "number of groups - 2\n" +
                        "teacher in charge - Ms. Reyes ");
            } else if (grade == 5) {
                System.out.println("location - Museum \n" +
                        "number of groups - 5\n" +
                        "teacher in charge - Ms. Lela ");
            } else {
                System.out.println(" location - Six Flags\n" +
                        "number of groups - 8\n" +
                        " teacher in charge - Mr. Watt");
            }

        }else{
            System.out.println("Invalid grade");}

        System.out.println("-------------------------------");
        // an easier way to solve this


        int Grade = 2;
        String location="";
        int numOfGroup = 0;
        String teacher = "";
        if (Grade>=1 && Grade<=6){
            if (grade==1){
            location="Apple Orcahrd";
            numOfGroup=3;
            teacher="Mr Smith";}
        else if (grade==2){
            location="zoo";
            numOfGroup = 7;
            teacher="Mr Leee";}
        else if (grade==3){
            location="Aquarium";
            numOfGroup=5;
            teacher="Mr Wilson";}
        else if (grade==4){
            location="Movie Theatre";
            numOfGroup=2;
            teacher="Mr Reyes";
            }
        else if (grade==5){
            location="Museum";
            numOfGroup = 5;
            teacher="Ms Lela";}
        else{
            location="Six Flags";
            numOfGroup = 6;
            teacher="Mr Wat";}


        }else{
            System.out.println("Invalid Grade");
        }


        System.out.println("location = " + location);
        System.out.println("numOfGroup = " + numOfGroup);;
        System.out.println("teacher = " + teacher);

//or
        System.out.println("location = " + location+"   \nnumOfGroup = " + numOfGroup+" \nteacher = " + teacher );







        int number=9;
        if(number++==10){
            System.out.println("Hello world"+ number);
        }else{
            System.out.println("Hello univers"+number);}

int score=0;
        if (score==0){score+=50;}
        if (score!=0){score+=50;}
        System.out.println(score);

        char grede='A';
        boolean passed =grede=='A'|| grede=='B';
        boolean passed2 = grede=='C'|| grede=='D';
        if (passed||passed2){
            System.out.println("Youve passed the exam");}else
        {
            System.out.println("you failed");}











    }
}
