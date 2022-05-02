package day43_Abstraction.EmployeeTask;

public final class Developer extends Employee{
    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ "is developing an application");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+ " sleeps mostly during day");
    }



    public void unitTest(){
        System.out.println(getName()+ " is unit testing ");
    }
}
