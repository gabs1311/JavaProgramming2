package day29_ArrayList_Collections.day39_EncapsulationAndInheritancePractice.CydeoTask;

public class Teacher extends Employee{
    public Teacher(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    public void work(){
        System.out.println(getJobTitle() + getName()+" is working.");
    }


}
/*
   5. Create a sub class of Employee named Teacher

            Override the work method

 */