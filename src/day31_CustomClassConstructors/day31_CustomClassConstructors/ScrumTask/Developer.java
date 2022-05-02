package day31_CustomClassConstructors.day31_CustomClassConstructors.ScrumTask;

public class Developer {
    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;

    public Developer(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Developers{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=  $" + salary +
                '}';
    }


    public void coding(){
        System.out.println(name + " is coding");
    }
    public void uniTesting(){
        System.out.println(name + " is uniTesting");
    }void fixingBug(){
        System.out.println(name + " is fixing bugs");
    }


}
/*
create a class called Developer
	          Attributes:
	            name, employeeID, JobTitle, Salary

	          Add A constructor that can set all the fileds

	          Actions:
	            coding(), unitTesting(), fixingBug(), toString()
 */