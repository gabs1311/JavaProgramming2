package day13_String;

import java.util.Scanner;

public class Myinfo {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter yor age");
            int age = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter your gender");
            String gender = scan.next();// because I only need ONE word
            scan.nextLine();
            System.out.println("enter your full name");
            String fullName = scan.nextLine();
            System.out.println("enter your phone number");
            long phoneNr = scan.nextLong();
            System.out.println("enter your zip code");
            int zipCode = scan.nextInt();
            scan.nextLine();
            System.out.println("enter your school name");
            String schoolName = scan.nextLine();
            System.out.println("enter your city name");
            String cityName = scan.nextLine();
            System.out.println("enter your state name");
            String stateName = scan.nextLine();
            System.out.println("enter your building nr");
            int buildingNr = scan.nextInt();
            scan.nextLine();
            System.out.println("enter your street");
            String street = scan.nextLine();

            scan.close();

            System.out.println("1. " + fullName);
            System.out.println("2. " + age);
            System.out.println("3. " + gender);
            System.out.println("4. " + phoneNr);
            System.out.println("5. " + buildingNr + " " + street + '\n' + cityName + ", " + stateName + " " + zipCode);
            System.out.println("6. " + schoolName);


        }
    }

