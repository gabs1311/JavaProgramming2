package day29_ArrayList_Collections.day39_EncapsulationAndInheritancePractice.CydeoTask;

public class Tester extends Employee{
    public Tester(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    public void work(){
        System.out.println(getJobTitle() + getName()+" is working.");
    }

    public void createTicket(){
        System.out.println(getJobTitle()+ getName()+ " is creating a ticket");
    }


}
/*
 3. Create a sub class of Employee named Tester

            Override the work method

            Extra methods:
                createTicket()
 */