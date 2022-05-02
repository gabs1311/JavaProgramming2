package day10_NestedIf;

public class NameOfMonths2 {
    public static void main(String[] args) {
        int number =5;
        // i need to print the months. so how many if blocks, how many else if blocks
        //and how many else blocks am I hgoing to need?
        //if blocks= 1    else if blocks  =10    else blocks=1


        String name  =(number==1)?"Jan":(number==2)?"Feb":(number==3)?"March":(number==4)?"Apr":
                (number==5)?"May":(number==6)?"June":(number==7)?"Juy":(number==8)?"Aug":(number==9)?"Sept":
                        (number==10)?"Oct":(number==11)?"Nov":"Dec";

        System.out.println(name);






    }



}
