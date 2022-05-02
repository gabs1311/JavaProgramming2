package day05_StringConcatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Gabriela";
        String lastName = "Antonovici";
        int age = 45;

        System.out.println(firstName + " " +  lastName);

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        String jobTitle = "SDET";
        String companyName = " Aplle Inc";
        double salary = 100000.58;

        // full name of the person is...
        System.out.println("Full name of the person is "+ fullName + ".");

        //...is...years old.

        System.out.println("Full name if the person is " + fullName + " and is " + age + " years old.");

        // full name is..jib title..works at
        System.out.println( fullName + " is " + jobTitle + " at " + companyName + ".");
        // full name is...job title..works at..and full name's salary is..
        System.out.println(fullName + " is " + jobTitle + " at " + companyName + " and " + fullName +"'s salary is " + " $"  + salary + ".");


    }

}
