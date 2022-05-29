package day29_ArrayList_Collections.day39_EncapsulationAndInheritancePractice.CydeoTask;

public class Developer extends Employee{
    public Developer(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }


    public void work(){
        System.out.println(getJobTitle()+ getName()+" is working.");
    }

public void fixingBugs(){
    System.out.println(getJobTitle()+ getName()+ " is fixing bugs");
}
}
/*

    4. Create a sub class of Employee named Developer

            Override the work method

            Extra methods:
                fixingBugs()
 */