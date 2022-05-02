package day35_Encapsulation.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Joshua", 'M', 23, 145000);
        System.out.println(employee1);

        employee1.setAge(32);

Employee employee2 = new Employee("Jenny", 'F', 36,123590);
employee2.setSalary(employee2.getSalary()+15000);



    }
}
