package day37_Inheritance.PhoneTask;

public class Samsung extends Phone {
    public Samsung( String model, String size, long price, String color) {
        super("Samsung", model, size, price, color);
    }


public void freeze(){
    System.out.println(brand + model + " is freezing");
}


}
/*
1.3 Create a sub class of Phone named Samsung:
				Variables:
					brand, model, size, price, color
                Add Constructor to set all the fields
				Methods:

					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString()
 */