package Week02;

public class CarInfo {
    public static void main(String[] args) {

        // I want you to give example of the car that you will buy after you find a well paid job.
        int year = 2022;
        String make = "Volvo";
        String model = "xc90";
        // automatic= true  ; manual = false
        boolean transmision = true;
        String colour = "red";
        int mileage = 25;
        int price = 100_000;// for Europe
        System.out.println("The care I want is " +make +" "+  model +"\n "  + colour + "\n" + mileage + price);
// let's turn this prince into TL  1 euro =15,5 TL
        double priceInTl = price * 15.5;

        double taxRate = 1.88; // for this kind of cars
        System.out.println(priceInTl);
        double priceAfterTaxInTl = priceInTl +(priceInTl*1.88);
        System.out.println(priceAfterTaxInTl);

// variables are used because it makes pur data reusable and maintainable
    }
}
