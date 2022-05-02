package day31_CustomClassConstructors.day31_CustomClassConstructors.ScrumTask;

public class Tester {

    public String name;
    public int  employeeID;
    public String jobTitle;
    public double salary;


    public Tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    public void smokeTesting(){
        System.out.println(name + " is smoke testing.");
    }

    public void createTicket(){
        System.out.println(name + " is creating a ticket");
    }

public void dailyStandUp(){
    System.out.println(name+ " is doing daily stand up");
}



}
/*
Create a class called Tester
	        Attributes:
	            name, employeeID, JobTitle, Salary

	        Add A constructor that can set all the fileds

	        Actions:
	           smokeTesting(),  creatingTicket(), dailyStandUp() toString()
 */