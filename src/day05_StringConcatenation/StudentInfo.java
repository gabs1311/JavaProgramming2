package day05_StringConcatenation;

public class StudentInfo {
    public static void main(String[] args) {
       /*
         2. Create a class called StudentInfo, and declare variables for the followings:
    			1. student name (String)
    			2. age (int)
    			3. gender (char)
    			4. school name (String)
    			5. phone number (String) (###)-###-####
    			6. full time (boolean)
        */

String name = "Gabriela";
int age = 42;
char gender = 'F';
String schoolName = " Alaya school";
String phoneNumber = "(004) - 074 - 193 -5070";
Boolean fullTime = true;
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("schoolName = " + schoolName);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("fullTime = " + fullTime);

    }

}
