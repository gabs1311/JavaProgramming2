package day43_Abstraction.EmployeeTask;

public abstract class Employee extends Person {
    public Employee(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);
        if (id<0){
            throw new RuntimeException(" Invalid id: "+ id);
        }
        this.id = id;
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    private final int id;
    private String JobTitle;
    private double salary;

    public int getId() {
        return id;
    }

    public String getJobTitle() {
        return JobTitle;
    }

    public void setJobTitle(String jobTitle) {
        JobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract  void work();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName()+ '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id=" + id +
                ", JobTitle='" + JobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
