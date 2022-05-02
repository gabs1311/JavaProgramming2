package day37_Inheritance.PhoneTask;

public final class Iphone extends Phone {
    public Iphone(  String model, String size, long price, String color) {
        super("Apple ", model, size, price, color);
    }

    // in this situation, where the brand is clearly Apple, I can replace the word brand in
    // super with Apple, so that I will have to set one less variable, one being directly assigned.


public void faceTime(long phoneNumber){
    System.out.println(brand + model + " is using Facetime to call " + phoneNumber);
}
public void faceTime(String email){
    System.out.println(brand + model + " is sending an email to "+ email + " using FaceTime");
}


}


/*
1.2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color
            Add  Constructor to set all the fields
				Methods:

					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()

 */