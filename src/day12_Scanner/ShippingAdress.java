package day12_Scanner;

import java.util.Scanner;

public class ShippingAdress {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" pls enter your full name");
       String fullName =scan.nextLine();

        System.out.println("pls enter your building nr");
        int buildingNr=scan.nextInt();
        scan.nextLine();

        System.out.println("pls enter your street name");
       String streetName= scan.next();
       scan.nextLine();

        System.out.println("pls enter your city  name");
        String cityName=scan.nextLine();

        System.out.println("pls enter your state");
        String stateName=scan.nextLine();

        System.out.println(" pls enter your zip code");
        int zipCode=scan.nextInt();


        System.out.println("fullName = " + fullName);
        System.out.println("buildingNr = " + buildingNr); System.out.println("streetName = " + streetName);
        System.out.println("streetName = " + streetName);
        System.out.println("cityName = " + cityName); System.out.println("stateName = " + stateName); System.out.println("zipCode = " + zipCode);




scan.close();

    }
}
/*
1. enter your full name
2. enter your building number
3. enter your street name
4. enter your city name
5. enter your state
6. enter your zip code

Display the shipping adress
John Smith
7925 Jones Branch Dr
McLean, VA 22012
 */