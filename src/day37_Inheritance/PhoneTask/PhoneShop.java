package day37_Inheritance.PhoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone= new Iphone("Iphone12", "Pro max", 2345, "black");


        Samsung samsung = new Samsung("S21", "S21 pro", 1267, "blue");

        Nokia nokia = new Nokia(" Brick", "4 inches", 978, "grey");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(123456);
        iphone.text(123345);
        iphone.faceTime("gabs@gmail.com");
        iphone.faceTime(132423513);
        System.out.println("==============================");

       samsung.call(1223345);
       samsung.text(1223455);
        samsung.freeze();
        System.out.println("============================");

        nokia.call(1232412);
        nokia.text(1424423423);
        nokia.selfDefence();
        System.out.println("===================");
        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);
    }
}
