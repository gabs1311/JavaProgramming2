package day32_CustomClassConstructors;

public class EmployeeObjects {
    public static void main(String[] args) {

   Employee employee1 = new Employee("Aaron");
        System.out.println(employee1);

        Employee employee2 = new Employee("Aaron",'M');
        System.out.println(employee2);

        Employee employee3;
        employee3 = new Employee("Jane",'F',"developer");
        System.out.println(employee3);


    }
}
