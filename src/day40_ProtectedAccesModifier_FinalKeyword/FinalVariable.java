package day40_ProtectedAccesModifier_FinalKeyword;

public class FinalVariable {


    final String birthday;
  final static String name;// if I assign teh variable, the compile error dissapears

  static{
      name= " batch25";
  }


    public FinalVariable(String birthday) {
        this.birthday = birthday;
    }

    public static void main(String[] args) {
       final double pi =3.14;


      //  pi = 4.14;// I added final, final variables cannot be changed
      //  pi = 5.14;// the same


        final String name;
        name = "Java";
       // name= "WoodenSpoon";// I can not change the variable, because I have initialized it already, and used final keyword

        System.out.println(name);


        System.out.println("-----------------------------------------");

        FinalVariable obj = new FinalVariable("may/01");

       // obj.birthday = "June/01";//final variables cannot be reassigned

        System.out.println(obj.birthday);

        System.out.println("====================");
        System.out.println(FinalVariable.name);






    }

}
